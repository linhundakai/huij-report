/**
 * 
 */
package com.huij.report.back.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Administrator
 *
 */
public class BackM1Vintage implements Serializable {

	private static final long serialVersionUID = 7566690283565689984L;

	private Integer type_id;;
	
	private String type_name;
	
	private String month;
	
	private BigDecimal total_principal;
	
	private BigDecimal curr_principal;
	
	private Double proportion;
	
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
		this.type_name = type_name;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public BigDecimal getTotal_principal() {
		return total_principal;
	}

	public void setTotal_principal(BigDecimal total_principal) {
		this.total_principal = total_principal;
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
}
