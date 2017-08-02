package com.huij.report.house.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huij.report.house.entity.M1vintagehj;

public interface M1vintagehjMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(M1vintagehj record);

    int insertSelective(M1vintagehj record);

    M1vintagehj selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(M1vintagehj record);

    int updateByPrimaryKey(M1vintagehj record);
    
	List<M1vintagehj> selectByType(@Param("type_ids") List<Integer> type_ids, @Param("destmonth") String destmonth);

	int updateTotalPrincipal(@Param("month") String month, @Param("type_id") Integer type_id,
			@Param("total_principal") BigDecimal total_principal);
	
	List<M1vintagehj> selectAll();
}