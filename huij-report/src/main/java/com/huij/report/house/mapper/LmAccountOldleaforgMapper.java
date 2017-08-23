package com.huij.report.house.mapper;

import java.util.List;

import com.huij.report.house.entity.LmAccountOldleaforg;

public interface LmAccountOldleaforgMapper {
    int deleteByPrimaryKey(Long account_id);

    int insert(LmAccountOldleaforg record);

    int insertSelective(LmAccountOldleaforg record);

    LmAccountOldleaforg selectByPrimaryKey(Long account_id);

    int updateByPrimaryKeySelective(LmAccountOldleaforg record);

    int updateByPrimaryKey(LmAccountOldleaforg record);
    
    List<Long> selectAllIds();
    
    int insertNewList(List<LmAccountOldleaforg> list);
}