package com.huij.report.house.entity;

import java.math.BigDecimal;

public class M1vintagehj {
    private Integer id;

    private Integer type_id;

    private String type_name;

    private String month;

    private BigDecimal total_principal;

    private String destmonth;

    private BigDecimal curr_principal;

    private Double proportion;

    private Double color1;

    private Double color2;

    private Double color3;

    private Double color4;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name == null ? null : type_name.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public BigDecimal getTotal_principal() {
        return total_principal;
    }

    public void setTotal_principal(BigDecimal total_principal) {
        this.total_principal = total_principal;
    }

    public String getDestmonth() {
        return destmonth;
    }

    public void setDestmonth(String destmonth) {
        this.destmonth = destmonth == null ? null : destmonth.trim();
    }

    public BigDecimal getCurr_principal() {
        return curr_principal;
    }

    public void setCurr_principal(BigDecimal curr_principal) {
        this.curr_principal = curr_principal;
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    public Double getColor1() {
        return color1;
    }

    public void setColor1(Double color1) {
        this.color1 = color1;
    }

    public Double getColor2() {
        return color2;
    }

    public void setColor2(Double color2) {
        this.color2 = color2;
    }

    public Double getColor3() {
        return color3;
    }

    public void setColor3(Double color3) {
        this.color3 = color3;
    }

    public Double getColor4() {
        return color4;
    }

    public void setColor4(Double color4) {
        this.color4 = color4;
    }
}