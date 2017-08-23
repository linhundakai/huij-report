/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.huij.report.config
 *
 *    Filename:    OldleaforgTask.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     Digital Telemedia Co.,Ltd
 *
 *    @author:     linhong.li@5dhj.com
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年8月23日 上午9:34:44
 *
 *    Revision:
 *
 *    2017年8月23日 上午9:34:44
 *        - first revision
 *
 *****************************************************************/
package com.huij.report.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

import com.huij.report.back.mapper.LmAccountMapper;
import com.huij.report.house.entity.LmAccountOldleaforg;
import com.huij.report.house.mapper.LmAccountOldleaforgMapper;

/**
 * @ClassName OldleaforgTask
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author linhong.li@5dhj.com
 * @Date 2017年8月23日 上午9:34:44
 * @version 1.0.0
 */
@Configuration
@EnableScheduling // 启用定时任务
public class OldleaforgTask {

	private final Logger logger = LoggerFactory.getLogger(TaskConfig.class);

	@Autowired
	private LmAccountMapper lmAccountMapper;

	@Autowired
	private LmAccountOldleaforgMapper lmAccountOldleaforgMapper;

	@Transactional(value = "houseTransactionManager")
	@Scheduled(cron = "${org_schedule}")
	public void runTask() {
		logger.info("OldleaforgTask任务开始");
		try {
			List<LmAccountOldleaforg> orgList = lmAccountMapper.selectAccountOldleaforg();
			if (null != orgList && orgList.size() > 0) {
				List<Long> idList = new ArrayList<Long>();
				for (LmAccountOldleaforg org : orgList) {
					idList.add(org.getAccount_id());
				}
				List<Long> allIds = lmAccountOldleaforgMapper.selectAllIds();
				logger.info("lmAccount总共查询出记录:" + idList.size());
				logger.info("LmAccountOldleaforg总共查询出记录:" + allIds.size());
				Map<Long, Long> map = new HashMap<Long, Long>();
				for(Long id : allIds) {
					map.put(id, id);
				}
				List<LmAccountOldleaforg> resultList = new ArrayList<LmAccountOldleaforg>();
				for (int i = orgList.size() - 1; i >= 0; i--) {
					if(map.get(orgList.get(i).getAccount_id()) == null) {
						resultList.add(orgList.get(i));
					}
				}
				logger.info("剔除重复记录后剩余:" + resultList.size());
				if(orgList.size() > 0) {
					List<LmAccountOldleaforg> subList = new ArrayList<LmAccountOldleaforg>();
					for(int i=0; i < resultList.size(); i++) {
						subList.add(resultList.get(i));
						if(i%100 == 0 && i > 0) {
							logger.info("插入记录:" + i);
							lmAccountOldleaforgMapper.insertNewList(subList);
							subList = new ArrayList<LmAccountOldleaforg>();
						}
					}
					if(subList.size() > 0) {
						lmAccountOldleaforgMapper.insertNewList(subList);
					}
				}
			}
		} catch (Exception e) {
			logger.error("OldleaforgTask跑批异常", e);
			throw new RuntimeException(e);
		}
		logger.info("OldleaforgTask任务结束");
	}
	public static void main(String[] args) {
		List<Long> allIds = new ArrayList<Long>();
		allIds.add(1L);
		allIds.add(2L);
		allIds.add(3L);
		allIds.add(4L);
		allIds.add(6L);
		List<Long> allId1s = new ArrayList<Long>();
		allId1s.add(1L);
		allId1s.add(2L);
		allId1s.add(3L);
		allId1s.add(4L);
		allId1s.add(5L);
		for (int i = allIds.size() - 1; i >= 0; i--) {
			if (allId1s.contains(allIds.get(i))) {
				allIds.remove(i);
			}
		}
		System.err.println(allIds.size());
	}
}
