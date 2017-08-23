package com.huij.report.house.entity;

import java.util.Date;

public class LmAccountOldleaforg {
    private Long account_id;

    private String leafOrg;

    private Integer organization;

    private Date creation_date;

    private Long product_id;

    private String org_name;

    private Integer org_manage_id;

    private String org_manage_name;

    private Integer parant_org_id;

    private String parant_org_name;

    private Integer company_id;

    private String company_name;

    private Integer is_used;

    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public String getLeafOrg() {
        return leafOrg;
    }

    public void setLeafOrg(String leafOrg) {
        this.leafOrg = leafOrg == null ? null : leafOrg.trim();
    }

    public Integer getOrganization() {
        return organization;
    }

    public void setOrganization(Integer organization) {
        this.organization = organization;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name == null ? null : org_name.trim();
    }

    public Integer getOrg_manage_id() {
        return org_manage_id;
    }

    public void setOrg_manage_id(Integer org_manage_id) {
        this.org_manage_id = org_manage_id;
    }

    public String getOrg_manage_name() {
        return org_manage_name;
    }

    public void setOrg_manage_name(String org_manage_name) {
        this.org_manage_name = org_manage_name == null ? null : org_manage_name.trim();
    }

    public Integer getParant_org_id() {
        return parant_org_id;
    }

    public void setParant_org_id(Integer parant_org_id) {
        this.parant_org_id = parant_org_id;
    }

    public String getParant_org_name() {
        return parant_org_name;
    }

    public void setParant_org_name(String parant_org_name) {
        this.parant_org_name = parant_org_name == null ? null : parant_org_name.trim();
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name == null ? null : company_name.trim();
    }

    public Integer getIs_used() {
        return is_used;
    }

    public void setIs_used(Integer is_used) {
        this.is_used = is_used;
    }
}