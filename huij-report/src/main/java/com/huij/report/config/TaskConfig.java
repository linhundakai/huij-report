/**
 * 
 */
package com.huij.report.config;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

import com.huij.report.back.entity.BackM1Vintage;
import com.huij.report.back.mapper.BackM1VintageMapper;
import com.huij.report.house.entity.M1vintagehj;
import com.huij.report.house.entity.Vintagetask;
import com.huij.report.house.mapper.M1vintagehjMapper;
import com.huij.report.house.mapper.VintagetaskMapper;

/**
 * 定时任务，每天跑批，实现数据仓库中M1Vintage报表的更新操作
 * 
 * @author Administrator
 *
 */
@Configuration
@EnableScheduling // 启用定时任务
public class TaskConfig {

	private final Logger logger = LoggerFactory.getLogger(TaskConfig.class);

	@Autowired
	private BackM1VintageMapper backM1VintageMapper;

	@Autowired
	private M1vintagehjMapper m1vintagehjMapper;

	@Autowired
	private VintagetaskMapper vintagetaskMapper;

	/**
	 * 整体类型更新
	 */
	@Transactional(value = "houseTransactionManager")
	@Scheduled(cron = "${cron_schedule}") // 每小时秒执行一次
	public void allScheduler() {
		// mysql 8小时会自动关闭空闲连接，这里做一个心跳
		backM1VintageMapper.selecttest();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String today = format.format(cal.getTime());
		Vintagetask vintagetask = vintagetaskMapper.selectByTaskdate(today);
		if (null != vintagetask && "1".equals(vintagetask.getStatus())) {
			logger.info(today + ",已经完成跑批");
			return;
		}
		logger.info(today + ",Vintage跑批开始");
		try {
			List<BackM1Vintage> allBackList = backM1VintageMapper.selectAllM1Vintage();
			scheduler(allBackList, "整体");

			List<BackM1Vintage> normalBackList = backM1VintageMapper.selectNormalM1Vintage();
			scheduler(normalBackList, "常规");

			List<BackM1Vintage> cashBackList = backM1VintageMapper.selectCashM1Vintage();
			scheduler(cashBackList, "现金贷");

			List<BackM1Vintage> discountBackList = backM1VintageMapper.selectDiscountM1Vintage();
			scheduler(discountBackList, "10期优惠一点");

			List<BackM1Vintage> companyBackList = backM1VintageMapper.selectSubCompanyM1Vintage();
			companyScheduler(companyBackList, "分公司营销中心");
			
			// 处理excel颜色
			colorScheduler();
		} catch (Exception e) {
			logger.error(today + ",Vintage跑批异常", e);
			if (null != vintagetask) {
				vintagetask.setStatus("1");
				vintagetaskMapper.updateByPrimaryKeySelective(vintagetask);
			} else {
				vintagetask = new Vintagetask();
				vintagetask.setStatus("0");
				vintagetask.setTaskdate(today);
				vintagetaskMapper.insert(vintagetask);
			}
			throw new RuntimeException(e);
		}

		if (null != vintagetask) {
			vintagetask.setStatus("1");
			vintagetaskMapper.updateByPrimaryKeySelective(vintagetask);
		} else {
			vintagetask = new Vintagetask();
			vintagetask.setStatus("1");
			vintagetask.setTaskdate(today);
			vintagetaskMapper.insert(vintagetask);
		}
		logger.info(today + ",Vintage跑批结束");
	}

	private void scheduler(List<BackM1Vintage> backList, String batch_name) {
		logger.info(batch_name + "类型开始跑批");
		List<Integer> type_ids = new ArrayList<Integer>();
		Set set = new HashSet(type_ids);
		for (BackM1Vintage backM1Vintage : backList) {
			set.add(backM1Vintage.getType_id());
		}
		type_ids.addAll(set);

		// 从后端查询所有整体类型统计信息
		// 从后端查询出来的最大月份至即为当前月份
		int length = backList.size();
		String curr_month = backList.get(length - 1).getMonth();
		logger.info("当前月份:" + curr_month);

		// 查询当前月份数仓中所有统计记录
		List<M1vintagehj> vintageList = m1vintagehjMapper.selectByType(type_ids, curr_month);
		Map<String, M1vintagehj> vintageMap = new HashMap<String, M1vintagehj>();
		if (null != vintageList) {
			for (M1vintagehj vintage : vintageList) {
				vintageMap.put(vintage.getType_id() + "_" + vintage.getMonth() + "_" + vintage.getDestmonth(), vintage);
			}
		}

		// 开始更新和插入操作
		for (int i = 0; i < length; i++) {
			BackM1Vintage backM1Vintage = backList.get(i);
			String key = backM1Vintage.getType_id() + "_" + backM1Vintage.getMonth() + "_" + curr_month;
			M1vintagehj m1vintagehj = vintageMap.get(key);

			if (null == m1vintagehj) {
				logger.info(backM1Vintage.getType_name() + "插入month：" + backM1Vintage.getMonth() + ",destmonth:"
						+ curr_month);
				m1vintagehj = new M1vintagehj();
				m1vintagehj.setMonth(backM1Vintage.getMonth());
				m1vintagehj.setTotal_principal(backM1Vintage.getTotal_principal());
				m1vintagehj.setDestmonth(curr_month);
				m1vintagehj.setType_id(backM1Vintage.getType_id());
				m1vintagehj.setType_name(backM1Vintage.getType_name());
				m1vintagehj.setCurr_principal(backM1Vintage.getCurr_principal());
				m1vintagehj.setProportion(backM1Vintage.getProportion());
				m1vintagehjMapper.insertSelective(m1vintagehj);
				// 更新所有total_principal
				m1vintagehjMapper.updateTotalPrincipal(backM1Vintage.getMonth(), backM1Vintage.getType_id(),
						backM1Vintage.getTotal_principal());
			} else {
				logger.info(
						backM1Vintage.getType_name() + "更新：" + backM1Vintage.getMonth() + ",destmonth:" + curr_month);
				// 当前月份为最后一个或上一个月则更新total_principal字段
				if (compareMonth(backM1Vintage.getMonth(), curr_month)) {
					logger.info("最后两月更新total_principal:" + i);
					// 更新total_principal和accum_principal
					// 这里将total_principal放入实体中，防止后续更新的时候又将数据更新回去
					m1vintagehj.setTotal_principal(backM1Vintage.getTotal_principal());
					m1vintagehjMapper.updateTotalPrincipal(backM1Vintage.getMonth(), backM1Vintage.getType_id(),
							backM1Vintage.getTotal_principal());
				}
				m1vintagehj.setCurr_principal(backM1Vintage.getCurr_principal());
				m1vintagehj.setProportion(backM1Vintage.getProportion());
				m1vintagehjMapper.updateByPrimaryKeySelective(m1vintagehj);
			}
		}
		logger.info(batch_name + "类型结束跑批");
	}

	private void companyScheduler(List<BackM1Vintage> backList, String batch_name) {
		logger.info(batch_name + "类型开始跑批");
		List<Integer> type_ids = new ArrayList<Integer>();
		Set set = new HashSet(type_ids);
		for (BackM1Vintage backM1Vintage : backList) {
			set.add(backM1Vintage.getType_id());
		}
		type_ids.addAll(set);

		// 从后端查询所有整体类型统计信息
		// 从后端查询出来的最大月份至即为当前月份
		int length = backList.size();
		String curr_month = backList.get(length - 1).getMonth();
		logger.info("当前月份:" + curr_month);

		// 查询当前月份数仓中所有统计记录
		List<M1vintagehj> vintageList = m1vintagehjMapper.selectByType(type_ids, curr_month);
		Map<String, M1vintagehj> vintageMap = new HashMap<String, M1vintagehj>();
		if (null != vintageList) {
			for (M1vintagehj vintage : vintageList) {
				vintageMap.put(vintage.getType_id() + "_" + vintage.getMonth() + "_" + vintage.getDestmonth(), vintage);
			}
		}

		// 开始更新和插入操作
		for (int i = 0; i < length; i++) {
			BackM1Vintage backM1Vintage = backList.get(i);
			String key = backM1Vintage.getType_id() + "_" + backM1Vintage.getMonth() + "_" + curr_month;
			M1vintagehj m1vintagehj = vintageMap.get(key);

			if (2104 == backM1Vintage.getType_id() && ("2016-01".equals(backM1Vintage.getMonth())
					|| "2016-02".equals(backM1Vintage.getMonth()) || "2016-03".equals(backM1Vintage.getMonth())
					|| "2016-04".equals(backM1Vintage.getMonth()))) {
				logger.info(backList.get(i).getType_name() + "," + backM1Vintage.getMonth() + ",不做更新");
				continue;
			}
			if (null == m1vintagehj) {
				logger.info(backM1Vintage.getType_name() + "插入month：" + backM1Vintage.getMonth() + ",destmonth:"
						+ curr_month);
				m1vintagehj = new M1vintagehj();
				m1vintagehj.setMonth(backM1Vintage.getMonth());
				m1vintagehj.setTotal_principal(backM1Vintage.getTotal_principal());
				m1vintagehj.setDestmonth(curr_month);
				m1vintagehj.setType_id(backM1Vintage.getType_id());
				m1vintagehj.setType_name(backM1Vintage.getType_name());
				m1vintagehj.setCurr_principal(backM1Vintage.getCurr_principal());
				m1vintagehj.setProportion(backM1Vintage.getProportion());
				m1vintagehjMapper.insertSelective(m1vintagehj);
				// 更新所有total_principal
				m1vintagehjMapper.updateTotalPrincipal(backM1Vintage.getMonth(), backM1Vintage.getType_id(),
						backM1Vintage.getTotal_principal());
			} else {
				logger.info(
						backM1Vintage.getType_name() + "更新：" + backM1Vintage.getMonth() + ",destmonth:" + curr_month);
				// 当前月份为最后一个或上一个月则更新total_principal字段
				if (compareMonth(backM1Vintage.getMonth(), curr_month)) {
					logger.info("最后两月更新total_principal:" + i);
					// 更新total_principal和accum_principal
					// 这里将total_principal放入实体中，防止后续更新的时候又将数据更新回去
					m1vintagehj.setTotal_principal(backM1Vintage.getTotal_principal());
					m1vintagehjMapper.updateTotalPrincipal(backM1Vintage.getMonth(), backM1Vintage.getType_id(),
							backM1Vintage.getTotal_principal());
				}
				m1vintagehj.setCurr_principal(backM1Vintage.getCurr_principal());
				m1vintagehj.setProportion(backM1Vintage.getProportion());
				m1vintagehjMapper.updateByPrimaryKeySelective(m1vintagehj);
			}
		}
		logger.info(batch_name + "类型结束跑批");
	}

	private boolean compareMonth(String month, String destmonth) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");

			Calendar cal = Calendar.getInstance();
			cal.setTime(format.parse(month));

			Calendar destCal = Calendar.getInstance();
			destCal.setTime(format.parse(destmonth));
			if (cal.getTime().compareTo(destCal.getTime()) == 0) {
				return true;
			}
			destCal.add(Calendar.MONTH, -1);
			if (cal.getTime().compareTo(destCal.getTime()) == 0) {
				return true;
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return false;
	}

	private void colorScheduler() {
		logger.info("开始更新颜色方案");
		List<M1vintagehj> hjList = m1vintagehjMapper.selectAll();
		Map<String, List<M1vintagehj>> map = new HashMap<String, List<M1vintagehj>>();
		String key;
		for (M1vintagehj m1vintagehj : hjList) {
			key = m1vintagehj.getType_id() + "_" + m1vintagehj.getMonth();
			List<M1vintagehj> subList = map.get(key);
			if (null == subList) {
				subList = new ArrayList<M1vintagehj>();
				map.put(key, subList);
			}
			subList.add(m1vintagehj);
		}
		Set<String> set = map.keySet();
		logger.info(set.toString());
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			List<M1vintagehj> subList = map.get(it.next());
			int count = 0;
			for (int i = 0; i < subList.size(); i++) {
				M1vintagehj m1vintagehj = subList.get(i);
				if (m1vintagehj.getProportion() == 0d) {
					continue;
				}
				count++;
				if (count == 1 && !m1vintagehj.getProportion().equals(m1vintagehj.getColor1())) {
					logger.info(m1vintagehj.getType_name() + "_" + m1vintagehj.getMonth() + "_"
							+ m1vintagehj.getDestmonth() + "_color1");
					m1vintagehj.setColor1(m1vintagehj.getProportion());
				} else if (count == 2 && !m1vintagehj.getProportion().equals(m1vintagehj.getColor2())) {
					logger.info(m1vintagehj.getType_name() + "_" + m1vintagehj.getMonth() + "_"
							+ m1vintagehj.getDestmonth() + "_color2");
					m1vintagehj.setColor2(m1vintagehj.getProportion());
				} else if (count == 3 && !m1vintagehj.getProportion().equals(m1vintagehj.getColor3())) {
					logger.info(m1vintagehj.getType_name() + "_" + m1vintagehj.getMonth() + "_"
							+ m1vintagehj.getDestmonth() + "_color3");
					m1vintagehj.setColor3(m1vintagehj.getProportion());
				} else if (count == 4 && !m1vintagehj.getProportion().equals(m1vintagehj.getColor4())) {
					logger.info(m1vintagehj.getType_name() + "_" + m1vintagehj.getMonth() + "_"
							+ m1vintagehj.getDestmonth() + "_color4");
					m1vintagehj.setColor4(m1vintagehj.getProportion());
				} else {
					break;
				}
				m1vintagehjMapper.updateByPrimaryKeySelective(m1vintagehj);
			}
		}
		logger.info("结束更新颜色方案");
	}
}
