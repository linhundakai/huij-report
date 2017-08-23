package com.huij.report.back.mapper;

import java.util.List;

import com.huij.report.back.entity.LmAccount;
import com.huij.report.house.entity.LmAccountOldleaforg;

public interface LmAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LmAccount record);

    int insertSelective(LmAccount record);

    LmAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LmAccount record);

    int updateByPrimaryKey(LmAccount record);
    
    List<LmAccountOldleaforg> selectAccountOldleaforg();
}