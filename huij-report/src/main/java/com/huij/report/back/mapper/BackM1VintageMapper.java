package com.huij.report.back.mapper;

import java.util.List;

import com.huij.report.back.entity.BackM1Vintage;

public interface BackM1VintageMapper {
    List<BackM1Vintage> selectAllM1Vintage();
    
    List<BackM1Vintage> selectNormalM1Vintage();
    
    List<BackM1Vintage> selectCashM1Vintage();
    
    List<BackM1Vintage> selectDiscountM1Vintage();
    
    List<BackM1Vintage> selectSubCompanyM1Vintage();
    
    Integer selecttest();
}