package com.huij.report.house.mapper;

import org.apache.ibatis.annotations.Param;

import com.huij.report.house.entity.Vintagetask;

public interface VintagetaskMapper {
	int insert(Vintagetask record);

	int insertSelective(Vintagetask record);

	int updateByPrimaryKeySelective(Vintagetask record);

	Vintagetask selectByTaskdate(@Param("taskdate") String taskdate);
}