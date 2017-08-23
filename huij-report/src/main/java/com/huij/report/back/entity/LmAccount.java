package com.huij.report.back.entity;

import java.math.BigDecimal;
import java.util.Date;

public class LmAccount {
    private Long id;

    private Long contract_id;

    private Integer organization;

    private Integer type;

    private String status;

    private String description;

    private Date creation_date;

    private Date pre_termination_date;

    private Date last_active_date;

    private Date close_date;

    private Date last_payment_date;

    private String application_number;

    private Long customer_id;

    private Long product_id;

    private Long pricing_id;

    private Long repayment_plan;

    private Integer scycle;

    private Date due_date;

    private Date grace_date;

    private Date act_payment_date;

    private Date next_payment_date;

    private Date final_payment_date;

    private BigDecimal final_payment_amount;

    private Integer dd_day;

    private Integer dd_method;

    private Integer cycle_due;

    private Integer cycle_due_count_1;

    private Integer cycle_due_count_2;

    private Integer cycle_due_count_3;

    private Integer cycle_due_count_4;

    private Integer cycle_due_count_5;

    private Integer cycle_due_count_6;

    private Integer cycle_due_count_7;

    private Integer cycle_due_count_8;

    private Integer cycle_due_count_9;

    private Integer cycle_due_count_10;

    private BigDecimal cycle_amount_principal_1;

    private BigDecimal cycle_amount_interest_1;

    private BigDecimal cycle_amount_service_fee_1;

    private BigDecimal cycle_amount_penalty_fee_1;

    private BigDecimal cycle_amount_misc_fee_1;

    private BigDecimal cycle_amount_principal_2;

    private BigDecimal cycle_amount_interest_2;

    private BigDecimal cycle_amount_service_fee_2;

    private BigDecimal cycle_amount_penalty_fee_2;

    private BigDecimal cycle_amount_misc_fee_2;

    private BigDecimal cycle_amount_principal_3;

    private BigDecimal cycle_amount_interest_3;

    private BigDecimal cycle_amount_service_fee_3;

    private BigDecimal cycle_amount_penalty_fee_3;

    private BigDecimal cycle_amount_misc_fee_3;

    private BigDecimal cycle_amount_principal_4;

    private BigDecimal cycle_amount_interest_4;

    private BigDecimal cycle_amount_service_fee_4;

    private BigDecimal cycle_amount_penalty_fee_4;

    private BigDecimal cycle_amount_misc_fee_4;

    private BigDecimal cycle_amount_principal_5;

    private BigDecimal cycle_amount_interest_5;

    private BigDecimal cycle_amount_service_fee_5;

    private BigDecimal cycle_amount_penalty_fee_5;

    private BigDecimal cycle_amount_misc_fee_5;

    private BigDecimal cycle_amount_principal_6;

    private BigDecimal cycle_amount_interest_6;

    private BigDecimal cycle_amount_service_fee_6;

    private BigDecimal cycle_amount_penalty_fee_6;

    private BigDecimal cycle_amount_misc_fee_6;

    private BigDecimal cycle_amount_principal_7;

    private BigDecimal cycle_amount_interest_7;

    private BigDecimal cycle_amount_service_fee_7;

    private BigDecimal cycle_amount_penalty_fee_7;

    private BigDecimal cycle_amount_misc_fee_7;

    private BigDecimal cycle_amount_principal_8;

    private BigDecimal cycle_amount_interest_8;

    private BigDecimal cycle_amount_service_fee_8;

    private BigDecimal cycle_amount_penalty_fee_8;

    private BigDecimal cycle_amount_misc_fee_8;

    private BigDecimal cycle_amount_principal_9;

    private BigDecimal cycle_amount_interest_9;

    private BigDecimal cycle_amount_service_fee_9;

    private BigDecimal cycle_amount_penalty_fee_9;

    private BigDecimal cycle_amount_misc_fee_9;

    private BigDecimal cycle_amount_principal_10;

    private BigDecimal cycle_amount_interest_10;

    private BigDecimal cycle_amount_service_fee_10;

    private BigDecimal cycle_amount_penalty_fee_10;

    private BigDecimal cycle_amount_misc_fee_10;

    private String block_code;

    private Long credit_limit;

    private BigDecimal balance;

    private BigDecimal principal;

    private BigDecimal interest;

    private BigDecimal service_fee;

    private BigDecimal penalty_fee;

    private BigDecimal misc_fee;

    private BigDecimal os_balance;

    private BigDecimal os_principal;

    private BigDecimal os_interest;

    private BigDecimal os_service_fee;

    private BigDecimal os_penalty_fee;

    private BigDecimal os_misc_fee;

    private BigDecimal total_balance;

    private BigDecimal total_principal;

    private BigDecimal total_interest;

    private BigDecimal total_service_fee;

    private BigDecimal total_penalty_fee;

    private BigDecimal total_misc_fee;

    private BigDecimal accum_balance;

    private BigDecimal accum_principal;

    private BigDecimal accum_interest;

    private BigDecimal accum_service_fee;

    private BigDecimal accum_penalty_fee;

    private BigDecimal accum_misc_fee;

    private BigDecimal waive_balance;

    private BigDecimal waive_principal;

    private BigDecimal waive_interest;

    private BigDecimal waive_service_fee;

    private BigDecimal waive_penalty_fee;

    private BigDecimal waive_misc_fee;

    private Integer tenor;

    private Integer curr_tenor;

    private String frequency;

    private BigDecimal downpayment;

    private BigDecimal last_payment;

    private BigDecimal fisrt_payment;

    private Date swoff_date;

    private String swoff_status;

    private BigDecimal swoff_amount;

    private Date chargeoff_date;

    private String chargeoff_status;

    private BigDecimal chargeoff_amount;

    private Date delinquency_date;

    private Integer delinquency_day;

    private BigDecimal delinquency_balance;

    private BigDecimal delinquency_principal;

    private BigDecimal delinquency_interest;

    private BigDecimal delinquency_service_fee;

    private BigDecimal delinquency_penalty_fee;

    private BigDecimal delinquency_misc_fee;

    private BigDecimal monthly_payment;

    private BigDecimal monthly_payment_min;

    private String direct_debit_card_number;

    private String direct_debit_card_name;

    private String direct_debit_card_bank;

    private String direct_debit_card_branch;

    private String last_dd_status;

    private BigDecimal pre_termination_amount;

    private String reschedule_flag;

    private Date reschedule_date;

    private BigDecimal reschedule_amount;

    private Long reschedule_account_id;

    private String waive_service_fee_flag;

    private String waive_penalty_fee_flag;

    private String waive_misc_fee_flag;

    private Long gl_account_number;

    private BigDecimal debit_amount;

    private String partition_indicator;

    private Date last_update;

    private String last_update_id;

    private BigDecimal waive_service_fee_hj;

    private BigDecimal accum_service_fee_hj;

    private BigDecimal total_service_fee_hj;

    private BigDecimal os_service_fee_hj;

    private BigDecimal service_fee_hj;

    private BigDecimal waive_penalty_fee_hj;

    private BigDecimal accum_penalty_fee_hj;

    private BigDecimal total_penalty_fee_hj;

    private BigDecimal os_penalty_fee_hj;

    private BigDecimal penalty_fee_hj;

    private BigDecimal waive_misc_fee_hj;

    private BigDecimal accum_misc_fee_hj;

    private BigDecimal total_misc_fee_hj;

    private BigDecimal os_misc_fee_hj;

    private BigDecimal misc_fee_hj;

    private String firstDelayFlag;

    private BigDecimal loanAmt;

    private BigDecimal loanReqFeeAmt;

    private String BELONG_ORG;

    private String yjf_contractNo;

    private String preferentialFlag;

    private String insuranceFlag;

    private String merchantName;

    private String merchantBankName;

    private String merchantBank;

    private String merchantBankCardNbr;

    private String isreducemechantfee;

    private String isReductLodgingFee;

    private String merchantBankDesc;

    private String otherContractNo;

    private String leafOrg;

    private String CUSTOMER_BANK_PROVINCE;

    private String CUSTOMER_BANK_CITY;

    private String CUSTOMER_BANK_COUNTY;

    private Integer delinquency_times;

    private String reject_flag_l;

    private String reject_revive_man;

    private Integer CUSTOMER_TYPE;

    private Integer insurance_id;

    private String monetary_flag;

    private Integer preferential_id;

    private Integer yxt_deductNumber;

    private Integer yxt_enableDeductFlag;

    private Integer repayFlag;

    private String customer_bank_code;

    private String agent_name;

    private String agent_id_card;

    private String agent_mobile;

    private String agent_house_name;

    private String agent_bank_account;

    private String agent_bank;

    private Integer specialChannelCde;

    private BigDecimal addLoanAmt;

    private String cash_Re_Merchant;

    private String cash_Re_Store;

    private Integer statusZj;

    private String zjzf_bmd_batchno;

    private String kab_Purchase_Flag;

    private String kab_Id;

    private String use_Kab;

    private String kab_Order;

    private Integer disaccountType;

    private Integer disaccountPayType;

    private BigDecimal disaccountAmount;

    private Integer MERCHANT;

    private String STORE_CDE;

    private String SALE_PERSON;

    private BigDecimal kabfee;

    private BigDecimal disacount_fee_HJ;

    private BigDecimal disacount_fee_merchant_fund;

    private BigDecimal disacount_fee_merchant_hj;

    private Integer disacount_pay_type_hj;

    private Integer disacount_type_hj;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContract_id() {
        return contract_id;
    }

    public void setContract_id(Long contract_id) {
        this.contract_id = contract_id;
    }

    public Integer getOrganization() {
        return organization;
    }

    public void setOrganization(Integer organization) {
        this.organization = organization;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Date getPre_termination_date() {
        return pre_termination_date;
    }

    public void setPre_termination_date(Date pre_termination_date) {
        this.pre_termination_date = pre_termination_date;
    }

    public Date getLast_active_date() {
        return last_active_date;
    }

    public void setLast_active_date(Date last_active_date) {
        this.last_active_date = last_active_date;
    }

    public Date getClose_date() {
        return close_date;
    }

    public void setClose_date(Date close_date) {
        this.close_date = close_date;
    }

    public Date getLast_payment_date() {
        return last_payment_date;
    }

    public void setLast_payment_date(Date last_payment_date) {
        this.last_payment_date = last_payment_date;
    }

    public String getApplication_number() {
        return application_number;
    }

    public void setApplication_number(String application_number) {
        this.application_number = application_number == null ? null : application_number.trim();
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getPricing_id() {
        return pricing_id;
    }

    public void setPricing_id(Long pricing_id) {
        this.pricing_id = pricing_id;
    }

    public Long getRepayment_plan() {
        return repayment_plan;
    }

    public void setRepayment_plan(Long repayment_plan) {
        this.repayment_plan = repayment_plan;
    }

    public Integer getScycle() {
        return scycle;
    }

    public void setScycle(Integer scycle) {
        this.scycle = scycle;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public Date getGrace_date() {
        return grace_date;
    }

    public void setGrace_date(Date grace_date) {
        this.grace_date = grace_date;
    }

    public Date getAct_payment_date() {
        return act_payment_date;
    }

    public void setAct_payment_date(Date act_payment_date) {
        this.act_payment_date = act_payment_date;
    }

    public Date getNext_payment_date() {
        return next_payment_date;
    }

    public void setNext_payment_date(Date next_payment_date) {
        this.next_payment_date = next_payment_date;
    }

    public Date getFinal_payment_date() {
        return final_payment_date;
    }

    public void setFinal_payment_date(Date final_payment_date) {
        this.final_payment_date = final_payment_date;
    }

    public BigDecimal getFinal_payment_amount() {
        return final_payment_amount;
    }

    public void setFinal_payment_amount(BigDecimal final_payment_amount) {
        this.final_payment_amount = final_payment_amount;
    }

    public Integer getDd_day() {
        return dd_day;
    }

    public void setDd_day(Integer dd_day) {
        this.dd_day = dd_day;
    }

    public Integer getDd_method() {
        return dd_method;
    }

    public void setDd_method(Integer dd_method) {
        this.dd_method = dd_method;
    }

    public Integer getCycle_due() {
        return cycle_due;
    }

    public void setCycle_due(Integer cycle_due) {
        this.cycle_due = cycle_due;
    }

    public Integer getCycle_due_count_1() {
        return cycle_due_count_1;
    }

    public void setCycle_due_count_1(Integer cycle_due_count_1) {
        this.cycle_due_count_1 = cycle_due_count_1;
    }

    public Integer getCycle_due_count_2() {
        return cycle_due_count_2;
    }

    public void setCycle_due_count_2(Integer cycle_due_count_2) {
        this.cycle_due_count_2 = cycle_due_count_2;
    }

    public Integer getCycle_due_count_3() {
        return cycle_due_count_3;
    }

    public void setCycle_due_count_3(Integer cycle_due_count_3) {
        this.cycle_due_count_3 = cycle_due_count_3;
    }

    public Integer getCycle_due_count_4() {
        return cycle_due_count_4;
    }

    public void setCycle_due_count_4(Integer cycle_due_count_4) {
        this.cycle_due_count_4 = cycle_due_count_4;
    }

    public Integer getCycle_due_count_5() {
        return cycle_due_count_5;
    }

    public void setCycle_due_count_5(Integer cycle_due_count_5) {
        this.cycle_due_count_5 = cycle_due_count_5;
    }

    public Integer getCycle_due_count_6() {
        return cycle_due_count_6;
    }

    public void setCycle_due_count_6(Integer cycle_due_count_6) {
        this.cycle_due_count_6 = cycle_due_count_6;
    }

    public Integer getCycle_due_count_7() {
        return cycle_due_count_7;
    }

    public void setCycle_due_count_7(Integer cycle_due_count_7) {
        this.cycle_due_count_7 = cycle_due_count_7;
    }

    public Integer getCycle_due_count_8() {
        return cycle_due_count_8;
    }

    public void setCycle_due_count_8(Integer cycle_due_count_8) {
        this.cycle_due_count_8 = cycle_due_count_8;
    }

    public Integer getCycle_due_count_9() {
        return cycle_due_count_9;
    }

    public void setCycle_due_count_9(Integer cycle_due_count_9) {
        this.cycle_due_count_9 = cycle_due_count_9;
    }

    public Integer getCycle_due_count_10() {
        return cycle_due_count_10;
    }

    public void setCycle_due_count_10(Integer cycle_due_count_10) {
        this.cycle_due_count_10 = cycle_due_count_10;
    }

    public BigDecimal getCycle_amount_principal_1() {
        return cycle_amount_principal_1;
    }

    public void setCycle_amount_principal_1(BigDecimal cycle_amount_principal_1) {
        this.cycle_amount_principal_1 = cycle_amount_principal_1;
    }

    public BigDecimal getCycle_amount_interest_1() {
        return cycle_amount_interest_1;
    }

    public void setCycle_amount_interest_1(BigDecimal cycle_amount_interest_1) {
        this.cycle_amount_interest_1 = cycle_amount_interest_1;
    }

    public BigDecimal getCycle_amount_service_fee_1() {
        return cycle_amount_service_fee_1;
    }

    public void setCycle_amount_service_fee_1(BigDecimal cycle_amount_service_fee_1) {
        this.cycle_amount_service_fee_1 = cycle_amount_service_fee_1;
    }

    public BigDecimal getCycle_amount_penalty_fee_1() {
        return cycle_amount_penalty_fee_1;
    }

    public void setCycle_amount_penalty_fee_1(BigDecimal cycle_amount_penalty_fee_1) {
        this.cycle_amount_penalty_fee_1 = cycle_amount_penalty_fee_1;
    }

    public BigDecimal getCycle_amount_misc_fee_1() {
        return cycle_amount_misc_fee_1;
    }

    public void setCycle_amount_misc_fee_1(BigDecimal cycle_amount_misc_fee_1) {
        this.cycle_amount_misc_fee_1 = cycle_amount_misc_fee_1;
    }

    public BigDecimal getCycle_amount_principal_2() {
        return cycle_amount_principal_2;
    }

    public void setCycle_amount_principal_2(BigDecimal cycle_amount_principal_2) {
        this.cycle_amount_principal_2 = cycle_amount_principal_2;
    }

    public BigDecimal getCycle_amount_interest_2() {
        return cycle_amount_interest_2;
    }

    public void setCycle_amount_interest_2(BigDecimal cycle_amount_interest_2) {
        this.cycle_amount_interest_2 = cycle_amount_interest_2;
    }

    public BigDecimal getCycle_amount_service_fee_2() {
        return cycle_amount_service_fee_2;
    }

    public void setCycle_amount_service_fee_2(BigDecimal cycle_amount_service_fee_2) {
        this.cycle_amount_service_fee_2 = cycle_amount_service_fee_2;
    }

    public BigDecimal getCycle_amount_penalty_fee_2() {
        return cycle_amount_penalty_fee_2;
    }

    public void setCycle_amount_penalty_fee_2(BigDecimal cycle_amount_penalty_fee_2) {
        this.cycle_amount_penalty_fee_2 = cycle_amount_penalty_fee_2;
    }

    public BigDecimal getCycle_amount_misc_fee_2() {
        return cycle_amount_misc_fee_2;
    }

    public void setCycle_amount_misc_fee_2(BigDecimal cycle_amount_misc_fee_2) {
        this.cycle_amount_misc_fee_2 = cycle_amount_misc_fee_2;
    }

    public BigDecimal getCycle_amount_principal_3() {
        return cycle_amount_principal_3;
    }

    public void setCycle_amount_principal_3(BigDecimal cycle_amount_principal_3) {
        this.cycle_amount_principal_3 = cycle_amount_principal_3;
    }

    public BigDecimal getCycle_amount_interest_3() {
        return cycle_amount_interest_3;
    }

    public void setCycle_amount_interest_3(BigDecimal cycle_amount_interest_3) {
        this.cycle_amount_interest_3 = cycle_amount_interest_3;
    }

    public BigDecimal getCycle_amount_service_fee_3() {
        return cycle_amount_service_fee_3;
    }

    public void setCycle_amount_service_fee_3(BigDecimal cycle_amount_service_fee_3) {
        this.cycle_amount_service_fee_3 = cycle_amount_service_fee_3;
    }

    public BigDecimal getCycle_amount_penalty_fee_3() {
        return cycle_amount_penalty_fee_3;
    }

    public void setCycle_amount_penalty_fee_3(BigDecimal cycle_amount_penalty_fee_3) {
        this.cycle_amount_penalty_fee_3 = cycle_amount_penalty_fee_3;
    }

    public BigDecimal getCycle_amount_misc_fee_3() {
        return cycle_amount_misc_fee_3;
    }

    public void setCycle_amount_misc_fee_3(BigDecimal cycle_amount_misc_fee_3) {
        this.cycle_amount_misc_fee_3 = cycle_amount_misc_fee_3;
    }

    public BigDecimal getCycle_amount_principal_4() {
        return cycle_amount_principal_4;
    }

    public void setCycle_amount_principal_4(BigDecimal cycle_amount_principal_4) {
        this.cycle_amount_principal_4 = cycle_amount_principal_4;
    }

    public BigDecimal getCycle_amount_interest_4() {
        return cycle_amount_interest_4;
    }

    public void setCycle_amount_interest_4(BigDecimal cycle_amount_interest_4) {
        this.cycle_amount_interest_4 = cycle_amount_interest_4;
    }

    public BigDecimal getCycle_amount_service_fee_4() {
        return cycle_amount_service_fee_4;
    }

    public void setCycle_amount_service_fee_4(BigDecimal cycle_amount_service_fee_4) {
        this.cycle_amount_service_fee_4 = cycle_amount_service_fee_4;
    }

    public BigDecimal getCycle_amount_penalty_fee_4() {
        return cycle_amount_penalty_fee_4;
    }

    public void setCycle_amount_penalty_fee_4(BigDecimal cycle_amount_penalty_fee_4) {
        this.cycle_amount_penalty_fee_4 = cycle_amount_penalty_fee_4;
    }

    public BigDecimal getCycle_amount_misc_fee_4() {
        return cycle_amount_misc_fee_4;
    }

    public void setCycle_amount_misc_fee_4(BigDecimal cycle_amount_misc_fee_4) {
        this.cycle_amount_misc_fee_4 = cycle_amount_misc_fee_4;
    }

    public BigDecimal getCycle_amount_principal_5() {
        return cycle_amount_principal_5;
    }

    public void setCycle_amount_principal_5(BigDecimal cycle_amount_principal_5) {
        this.cycle_amount_principal_5 = cycle_amount_principal_5;
    }

    public BigDecimal getCycle_amount_interest_5() {
        return cycle_amount_interest_5;
    }

    public void setCycle_amount_interest_5(BigDecimal cycle_amount_interest_5) {
        this.cycle_amount_interest_5 = cycle_amount_interest_5;
    }

    public BigDecimal getCycle_amount_service_fee_5() {
        return cycle_amount_service_fee_5;
    }

    public void setCycle_amount_service_fee_5(BigDecimal cycle_amount_service_fee_5) {
        this.cycle_amount_service_fee_5 = cycle_amount_service_fee_5;
    }

    public BigDecimal getCycle_amount_penalty_fee_5() {
        return cycle_amount_penalty_fee_5;
    }

    public void setCycle_amount_penalty_fee_5(BigDecimal cycle_amount_penalty_fee_5) {
        this.cycle_amount_penalty_fee_5 = cycle_amount_penalty_fee_5;
    }

    public BigDecimal getCycle_amount_misc_fee_5() {
        return cycle_amount_misc_fee_5;
    }

    public void setCycle_amount_misc_fee_5(BigDecimal cycle_amount_misc_fee_5) {
        this.cycle_amount_misc_fee_5 = cycle_amount_misc_fee_5;
    }

    public BigDecimal getCycle_amount_principal_6() {
        return cycle_amount_principal_6;
    }

    public void setCycle_amount_principal_6(BigDecimal cycle_amount_principal_6) {
        this.cycle_amount_principal_6 = cycle_amount_principal_6;
    }

    public BigDecimal getCycle_amount_interest_6() {
        return cycle_amount_interest_6;
    }

    public void setCycle_amount_interest_6(BigDecimal cycle_amount_interest_6) {
        this.cycle_amount_interest_6 = cycle_amount_interest_6;
    }

    public BigDecimal getCycle_amount_service_fee_6() {
        return cycle_amount_service_fee_6;
    }

    public void setCycle_amount_service_fee_6(BigDecimal cycle_amount_service_fee_6) {
        this.cycle_amount_service_fee_6 = cycle_amount_service_fee_6;
    }

    public BigDecimal getCycle_amount_penalty_fee_6() {
        return cycle_amount_penalty_fee_6;
    }

    public void setCycle_amount_penalty_fee_6(BigDecimal cycle_amount_penalty_fee_6) {
        this.cycle_amount_penalty_fee_6 = cycle_amount_penalty_fee_6;
    }

    public BigDecimal getCycle_amount_misc_fee_6() {
        return cycle_amount_misc_fee_6;
    }

    public void setCycle_amount_misc_fee_6(BigDecimal cycle_amount_misc_fee_6) {
        this.cycle_amount_misc_fee_6 = cycle_amount_misc_fee_6;
    }

    public BigDecimal getCycle_amount_principal_7() {
        return cycle_amount_principal_7;
    }

    public void setCycle_amount_principal_7(BigDecimal cycle_amount_principal_7) {
        this.cycle_amount_principal_7 = cycle_amount_principal_7;
    }

    public BigDecimal getCycle_amount_interest_7() {
        return cycle_amount_interest_7;
    }

    public void setCycle_amount_interest_7(BigDecimal cycle_amount_interest_7) {
        this.cycle_amount_interest_7 = cycle_amount_interest_7;
    }

    public BigDecimal getCycle_amount_service_fee_7() {
        return cycle_amount_service_fee_7;
    }

    public void setCycle_amount_service_fee_7(BigDecimal cycle_amount_service_fee_7) {
        this.cycle_amount_service_fee_7 = cycle_amount_service_fee_7;
    }

    public BigDecimal getCycle_amount_penalty_fee_7() {
        return cycle_amount_penalty_fee_7;
    }

    public void setCycle_amount_penalty_fee_7(BigDecimal cycle_amount_penalty_fee_7) {
        this.cycle_amount_penalty_fee_7 = cycle_amount_penalty_fee_7;
    }

    public BigDecimal getCycle_amount_misc_fee_7() {
        return cycle_amount_misc_fee_7;
    }

    public void setCycle_amount_misc_fee_7(BigDecimal cycle_amount_misc_fee_7) {
        this.cycle_amount_misc_fee_7 = cycle_amount_misc_fee_7;
    }

    public BigDecimal getCycle_amount_principal_8() {
        return cycle_amount_principal_8;
    }

    public void setCycle_amount_principal_8(BigDecimal cycle_amount_principal_8) {
        this.cycle_amount_principal_8 = cycle_amount_principal_8;
    }

    public BigDecimal getCycle_amount_interest_8() {
        return cycle_amount_interest_8;
    }

    public void setCycle_amount_interest_8(BigDecimal cycle_amount_interest_8) {
        this.cycle_amount_interest_8 = cycle_amount_interest_8;
    }

    public BigDecimal getCycle_amount_service_fee_8() {
        return cycle_amount_service_fee_8;
    }

    public void setCycle_amount_service_fee_8(BigDecimal cycle_amount_service_fee_8) {
        this.cycle_amount_service_fee_8 = cycle_amount_service_fee_8;
    }

    public BigDecimal getCycle_amount_penalty_fee_8() {
        return cycle_amount_penalty_fee_8;
    }

    public void setCycle_amount_penalty_fee_8(BigDecimal cycle_amount_penalty_fee_8) {
        this.cycle_amount_penalty_fee_8 = cycle_amount_penalty_fee_8;
    }

    public BigDecimal getCycle_amount_misc_fee_8() {
        return cycle_amount_misc_fee_8;
    }

    public void setCycle_amount_misc_fee_8(BigDecimal cycle_amount_misc_fee_8) {
        this.cycle_amount_misc_fee_8 = cycle_amount_misc_fee_8;
    }

    public BigDecimal getCycle_amount_principal_9() {
        return cycle_amount_principal_9;
    }

    public void setCycle_amount_principal_9(BigDecimal cycle_amount_principal_9) {
        this.cycle_amount_principal_9 = cycle_amount_principal_9;
    }

    public BigDecimal getCycle_amount_interest_9() {
        return cycle_amount_interest_9;
    }

    public void setCycle_amount_interest_9(BigDecimal cycle_amount_interest_9) {
        this.cycle_amount_interest_9 = cycle_amount_interest_9;
    }

    public BigDecimal getCycle_amount_service_fee_9() {
        return cycle_amount_service_fee_9;
    }

    public void setCycle_amount_service_fee_9(BigDecimal cycle_amount_service_fee_9) {
        this.cycle_amount_service_fee_9 = cycle_amount_service_fee_9;
    }

    public BigDecimal getCycle_amount_penalty_fee_9() {
        return cycle_amount_penalty_fee_9;
    }

    public void setCycle_amount_penalty_fee_9(BigDecimal cycle_amount_penalty_fee_9) {
        this.cycle_amount_penalty_fee_9 = cycle_amount_penalty_fee_9;
    }

    public BigDecimal getCycle_amount_misc_fee_9() {
        return cycle_amount_misc_fee_9;
    }

    public void setCycle_amount_misc_fee_9(BigDecimal cycle_amount_misc_fee_9) {
        this.cycle_amount_misc_fee_9 = cycle_amount_misc_fee_9;
    }

    public BigDecimal getCycle_amount_principal_10() {
        return cycle_amount_principal_10;
    }

    public void setCycle_amount_principal_10(BigDecimal cycle_amount_principal_10) {
        this.cycle_amount_principal_10 = cycle_amount_principal_10;
    }

    public BigDecimal getCycle_amount_interest_10() {
        return cycle_amount_interest_10;
    }

    public void setCycle_amount_interest_10(BigDecimal cycle_amount_interest_10) {
        this.cycle_amount_interest_10 = cycle_amount_interest_10;
    }

    public BigDecimal getCycle_amount_service_fee_10() {
        return cycle_amount_service_fee_10;
    }

    public void setCycle_amount_service_fee_10(BigDecimal cycle_amount_service_fee_10) {
        this.cycle_amount_service_fee_10 = cycle_amount_service_fee_10;
    }

    public BigDecimal getCycle_amount_penalty_fee_10() {
        return cycle_amount_penalty_fee_10;
    }

    public void setCycle_amount_penalty_fee_10(BigDecimal cycle_amount_penalty_fee_10) {
        this.cycle_amount_penalty_fee_10 = cycle_amount_penalty_fee_10;
    }

    public BigDecimal getCycle_amount_misc_fee_10() {
        return cycle_amount_misc_fee_10;
    }

    public void setCycle_amount_misc_fee_10(BigDecimal cycle_amount_misc_fee_10) {
        this.cycle_amount_misc_fee_10 = cycle_amount_misc_fee_10;
    }

    public String getBlock_code() {
        return block_code;
    }

    public void setBlock_code(String block_code) {
        this.block_code = block_code == null ? null : block_code.trim();
    }

    public Long getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(Long credit_limit) {
        this.credit_limit = credit_limit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getService_fee() {
        return service_fee;
    }

    public void setService_fee(BigDecimal service_fee) {
        this.service_fee = service_fee;
    }

    public BigDecimal getPenalty_fee() {
        return penalty_fee;
    }

    public void setPenalty_fee(BigDecimal penalty_fee) {
        this.penalty_fee = penalty_fee;
    }

    public BigDecimal getMisc_fee() {
        return misc_fee;
    }

    public void setMisc_fee(BigDecimal misc_fee) {
        this.misc_fee = misc_fee;
    }

    public BigDecimal getOs_balance() {
        return os_balance;
    }

    public void setOs_balance(BigDecimal os_balance) {
        this.os_balance = os_balance;
    }

    public BigDecimal getOs_principal() {
        return os_principal;
    }

    public void setOs_principal(BigDecimal os_principal) {
        this.os_principal = os_principal;
    }

    public BigDecimal getOs_interest() {
        return os_interest;
    }

    public void setOs_interest(BigDecimal os_interest) {
        this.os_interest = os_interest;
    }

    public BigDecimal getOs_service_fee() {
        return os_service_fee;
    }

    public void setOs_service_fee(BigDecimal os_service_fee) {
        this.os_service_fee = os_service_fee;
    }

    public BigDecimal getOs_penalty_fee() {
        return os_penalty_fee;
    }

    public void setOs_penalty_fee(BigDecimal os_penalty_fee) {
        this.os_penalty_fee = os_penalty_fee;
    }

    public BigDecimal getOs_misc_fee() {
        return os_misc_fee;
    }

    public void setOs_misc_fee(BigDecimal os_misc_fee) {
        this.os_misc_fee = os_misc_fee;
    }

    public BigDecimal getTotal_balance() {
        return total_balance;
    }

    public void setTotal_balance(BigDecimal total_balance) {
        this.total_balance = total_balance;
    }

    public BigDecimal getTotal_principal() {
        return total_principal;
    }

    public void setTotal_principal(BigDecimal total_principal) {
        this.total_principal = total_principal;
    }

    public BigDecimal getTotal_interest() {
        return total_interest;
    }

    public void setTotal_interest(BigDecimal total_interest) {
        this.total_interest = total_interest;
    }

    public BigDecimal getTotal_service_fee() {
        return total_service_fee;
    }

    public void setTotal_service_fee(BigDecimal total_service_fee) {
        this.total_service_fee = total_service_fee;
    }

    public BigDecimal getTotal_penalty_fee() {
        return total_penalty_fee;
    }

    public void setTotal_penalty_fee(BigDecimal total_penalty_fee) {
        this.total_penalty_fee = total_penalty_fee;
    }

    public BigDecimal getTotal_misc_fee() {
        return total_misc_fee;
    }

    public void setTotal_misc_fee(BigDecimal total_misc_fee) {
        this.total_misc_fee = total_misc_fee;
    }

    public BigDecimal getAccum_balance() {
        return accum_balance;
    }

    public void setAccum_balance(BigDecimal accum_balance) {
        this.accum_balance = accum_balance;
    }

    public BigDecimal getAccum_principal() {
        return accum_principal;
    }

    public void setAccum_principal(BigDecimal accum_principal) {
        this.accum_principal = accum_principal;
    }

    public BigDecimal getAccum_interest() {
        return accum_interest;
    }

    public void setAccum_interest(BigDecimal accum_interest) {
        this.accum_interest = accum_interest;
    }

    public BigDecimal getAccum_service_fee() {
        return accum_service_fee;
    }

    public void setAccum_service_fee(BigDecimal accum_service_fee) {
        this.accum_service_fee = accum_service_fee;
    }

    public BigDecimal getAccum_penalty_fee() {
        return accum_penalty_fee;
    }

    public void setAccum_penalty_fee(BigDecimal accum_penalty_fee) {
        this.accum_penalty_fee = accum_penalty_fee;
    }

    public BigDecimal getAccum_misc_fee() {
        return accum_misc_fee;
    }

    public void setAccum_misc_fee(BigDecimal accum_misc_fee) {
        this.accum_misc_fee = accum_misc_fee;
    }

    public BigDecimal getWaive_balance() {
        return waive_balance;
    }

    public void setWaive_balance(BigDecimal waive_balance) {
        this.waive_balance = waive_balance;
    }

    public BigDecimal getWaive_principal() {
        return waive_principal;
    }

    public void setWaive_principal(BigDecimal waive_principal) {
        this.waive_principal = waive_principal;
    }

    public BigDecimal getWaive_interest() {
        return waive_interest;
    }

    public void setWaive_interest(BigDecimal waive_interest) {
        this.waive_interest = waive_interest;
    }

    public BigDecimal getWaive_service_fee() {
        return waive_service_fee;
    }

    public void setWaive_service_fee(BigDecimal waive_service_fee) {
        this.waive_service_fee = waive_service_fee;
    }

    public BigDecimal getWaive_penalty_fee() {
        return waive_penalty_fee;
    }

    public void setWaive_penalty_fee(BigDecimal waive_penalty_fee) {
        this.waive_penalty_fee = waive_penalty_fee;
    }

    public BigDecimal getWaive_misc_fee() {
        return waive_misc_fee;
    }

    public void setWaive_misc_fee(BigDecimal waive_misc_fee) {
        this.waive_misc_fee = waive_misc_fee;
    }

    public Integer getTenor() {
        return tenor;
    }

    public void setTenor(Integer tenor) {
        this.tenor = tenor;
    }

    public Integer getCurr_tenor() {
        return curr_tenor;
    }

    public void setCurr_tenor(Integer curr_tenor) {
        this.curr_tenor = curr_tenor;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public BigDecimal getDownpayment() {
        return downpayment;
    }

    public void setDownpayment(BigDecimal downpayment) {
        this.downpayment = downpayment;
    }

    public BigDecimal getLast_payment() {
        return last_payment;
    }

    public void setLast_payment(BigDecimal last_payment) {
        this.last_payment = last_payment;
    }

    public BigDecimal getFisrt_payment() {
        return fisrt_payment;
    }

    public void setFisrt_payment(BigDecimal fisrt_payment) {
        this.fisrt_payment = fisrt_payment;
    }

    public Date getSwoff_date() {
        return swoff_date;
    }

    public void setSwoff_date(Date swoff_date) {
        this.swoff_date = swoff_date;
    }

    public String getSwoff_status() {
        return swoff_status;
    }

    public void setSwoff_status(String swoff_status) {
        this.swoff_status = swoff_status == null ? null : swoff_status.trim();
    }

    public BigDecimal getSwoff_amount() {
        return swoff_amount;
    }

    public void setSwoff_amount(BigDecimal swoff_amount) {
        this.swoff_amount = swoff_amount;
    }

    public Date getChargeoff_date() {
        return chargeoff_date;
    }

    public void setChargeoff_date(Date chargeoff_date) {
        this.chargeoff_date = chargeoff_date;
    }

    public String getChargeoff_status() {
        return chargeoff_status;
    }

    public void setChargeoff_status(String chargeoff_status) {
        this.chargeoff_status = chargeoff_status == null ? null : chargeoff_status.trim();
    }

    public BigDecimal getChargeoff_amount() {
        return chargeoff_amount;
    }

    public void setChargeoff_amount(BigDecimal chargeoff_amount) {
        this.chargeoff_amount = chargeoff_amount;
    }

    public Date getDelinquency_date() {
        return delinquency_date;
    }

    public void setDelinquency_date(Date delinquency_date) {
        this.delinquency_date = delinquency_date;
    }

    public Integer getDelinquency_day() {
        return delinquency_day;
    }

    public void setDelinquency_day(Integer delinquency_day) {
        this.delinquency_day = delinquency_day;
    }

    public BigDecimal getDelinquency_balance() {
        return delinquency_balance;
    }

    public void setDelinquency_balance(BigDecimal delinquency_balance) {
        this.delinquency_balance = delinquency_balance;
    }

    public BigDecimal getDelinquency_principal() {
        return delinquency_principal;
    }

    public void setDelinquency_principal(BigDecimal delinquency_principal) {
        this.delinquency_principal = delinquency_principal;
    }

    public BigDecimal getDelinquency_interest() {
        return delinquency_interest;
    }

    public void setDelinquency_interest(BigDecimal delinquency_interest) {
        this.delinquency_interest = delinquency_interest;
    }

    public BigDecimal getDelinquency_service_fee() {
        return delinquency_service_fee;
    }

    public void setDelinquency_service_fee(BigDecimal delinquency_service_fee) {
        this.delinquency_service_fee = delinquency_service_fee;
    }

    public BigDecimal getDelinquency_penalty_fee() {
        return delinquency_penalty_fee;
    }

    public void setDelinquency_penalty_fee(BigDecimal delinquency_penalty_fee) {
        this.delinquency_penalty_fee = delinquency_penalty_fee;
    }

    public BigDecimal getDelinquency_misc_fee() {
        return delinquency_misc_fee;
    }

    public void setDelinquency_misc_fee(BigDecimal delinquency_misc_fee) {
        this.delinquency_misc_fee = delinquency_misc_fee;
    }

    public BigDecimal getMonthly_payment() {
        return monthly_payment;
    }

    public void setMonthly_payment(BigDecimal monthly_payment) {
        this.monthly_payment = monthly_payment;
    }

    public BigDecimal getMonthly_payment_min() {
        return monthly_payment_min;
    }

    public void setMonthly_payment_min(BigDecimal monthly_payment_min) {
        this.monthly_payment_min = monthly_payment_min;
    }

    public String getDirect_debit_card_number() {
        return direct_debit_card_number;
    }

    public void setDirect_debit_card_number(String direct_debit_card_number) {
        this.direct_debit_card_number = direct_debit_card_number == null ? null : direct_debit_card_number.trim();
    }

    public String getDirect_debit_card_name() {
        return direct_debit_card_name;
    }

    public void setDirect_debit_card_name(String direct_debit_card_name) {
        this.direct_debit_card_name = direct_debit_card_name == null ? null : direct_debit_card_name.trim();
    }

    public String getDirect_debit_card_bank() {
        return direct_debit_card_bank;
    }

    public void setDirect_debit_card_bank(String direct_debit_card_bank) {
        this.direct_debit_card_bank = direct_debit_card_bank == null ? null : direct_debit_card_bank.trim();
    }

    public String getDirect_debit_card_branch() {
        return direct_debit_card_branch;
    }

    public void setDirect_debit_card_branch(String direct_debit_card_branch) {
        this.direct_debit_card_branch = direct_debit_card_branch == null ? null : direct_debit_card_branch.trim();
    }

    public String getLast_dd_status() {
        return last_dd_status;
    }

    public void setLast_dd_status(String last_dd_status) {
        this.last_dd_status = last_dd_status == null ? null : last_dd_status.trim();
    }

    public BigDecimal getPre_termination_amount() {
        return pre_termination_amount;
    }

    public void setPre_termination_amount(BigDecimal pre_termination_amount) {
        this.pre_termination_amount = pre_termination_amount;
    }

    public String getReschedule_flag() {
        return reschedule_flag;
    }

    public void setReschedule_flag(String reschedule_flag) {
        this.reschedule_flag = reschedule_flag == null ? null : reschedule_flag.trim();
    }

    public Date getReschedule_date() {
        return reschedule_date;
    }

    public void setReschedule_date(Date reschedule_date) {
        this.reschedule_date = reschedule_date;
    }

    public BigDecimal getReschedule_amount() {
        return reschedule_amount;
    }

    public void setReschedule_amount(BigDecimal reschedule_amount) {
        this.reschedule_amount = reschedule_amount;
    }

    public Long getReschedule_account_id() {
        return reschedule_account_id;
    }

    public void setReschedule_account_id(Long reschedule_account_id) {
        this.reschedule_account_id = reschedule_account_id;
    }

    public String getWaive_service_fee_flag() {
        return waive_service_fee_flag;
    }

    public void setWaive_service_fee_flag(String waive_service_fee_flag) {
        this.waive_service_fee_flag = waive_service_fee_flag == null ? null : waive_service_fee_flag.trim();
    }

    public String getWaive_penalty_fee_flag() {
        return waive_penalty_fee_flag;
    }

    public void setWaive_penalty_fee_flag(String waive_penalty_fee_flag) {
        this.waive_penalty_fee_flag = waive_penalty_fee_flag == null ? null : waive_penalty_fee_flag.trim();
    }

    public String getWaive_misc_fee_flag() {
        return waive_misc_fee_flag;
    }

    public void setWaive_misc_fee_flag(String waive_misc_fee_flag) {
        this.waive_misc_fee_flag = waive_misc_fee_flag == null ? null : waive_misc_fee_flag.trim();
    }

    public Long getGl_account_number() {
        return gl_account_number;
    }

    public void setGl_account_number(Long gl_account_number) {
        this.gl_account_number = gl_account_number;
    }

    public BigDecimal getDebit_amount() {
        return debit_amount;
    }

    public void setDebit_amount(BigDecimal debit_amount) {
        this.debit_amount = debit_amount;
    }

    public String getPartition_indicator() {
        return partition_indicator;
    }

    public void setPartition_indicator(String partition_indicator) {
        this.partition_indicator = partition_indicator == null ? null : partition_indicator.trim();
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public String getLast_update_id() {
        return last_update_id;
    }

    public void setLast_update_id(String last_update_id) {
        this.last_update_id = last_update_id == null ? null : last_update_id.trim();
    }

    public BigDecimal getWaive_service_fee_hj() {
        return waive_service_fee_hj;
    }

    public void setWaive_service_fee_hj(BigDecimal waive_service_fee_hj) {
        this.waive_service_fee_hj = waive_service_fee_hj;
    }

    public BigDecimal getAccum_service_fee_hj() {
        return accum_service_fee_hj;
    }

    public void setAccum_service_fee_hj(BigDecimal accum_service_fee_hj) {
        this.accum_service_fee_hj = accum_service_fee_hj;
    }

    public BigDecimal getTotal_service_fee_hj() {
        return total_service_fee_hj;
    }

    public void setTotal_service_fee_hj(BigDecimal total_service_fee_hj) {
        this.total_service_fee_hj = total_service_fee_hj;
    }

    public BigDecimal getOs_service_fee_hj() {
        return os_service_fee_hj;
    }

    public void setOs_service_fee_hj(BigDecimal os_service_fee_hj) {
        this.os_service_fee_hj = os_service_fee_hj;
    }

    public BigDecimal getService_fee_hj() {
        return service_fee_hj;
    }

    public void setService_fee_hj(BigDecimal service_fee_hj) {
        this.service_fee_hj = service_fee_hj;
    }

    public BigDecimal getWaive_penalty_fee_hj() {
        return waive_penalty_fee_hj;
    }

    public void setWaive_penalty_fee_hj(BigDecimal waive_penalty_fee_hj) {
        this.waive_penalty_fee_hj = waive_penalty_fee_hj;
    }

    public BigDecimal getAccum_penalty_fee_hj() {
        return accum_penalty_fee_hj;
    }

    public void setAccum_penalty_fee_hj(BigDecimal accum_penalty_fee_hj) {
        this.accum_penalty_fee_hj = accum_penalty_fee_hj;
    }

    public BigDecimal getTotal_penalty_fee_hj() {
        return total_penalty_fee_hj;
    }

    public void setTotal_penalty_fee_hj(BigDecimal total_penalty_fee_hj) {
        this.total_penalty_fee_hj = total_penalty_fee_hj;
    }

    public BigDecimal getOs_penalty_fee_hj() {
        return os_penalty_fee_hj;
    }

    public void setOs_penalty_fee_hj(BigDecimal os_penalty_fee_hj) {
        this.os_penalty_fee_hj = os_penalty_fee_hj;
    }

    public BigDecimal getPenalty_fee_hj() {
        return penalty_fee_hj;
    }

    public void setPenalty_fee_hj(BigDecimal penalty_fee_hj) {
        this.penalty_fee_hj = penalty_fee_hj;
    }

    public BigDecimal getWaive_misc_fee_hj() {
        return waive_misc_fee_hj;
    }

    public void setWaive_misc_fee_hj(BigDecimal waive_misc_fee_hj) {
        this.waive_misc_fee_hj = waive_misc_fee_hj;
    }

    public BigDecimal getAccum_misc_fee_hj() {
        return accum_misc_fee_hj;
    }

    public void setAccum_misc_fee_hj(BigDecimal accum_misc_fee_hj) {
        this.accum_misc_fee_hj = accum_misc_fee_hj;
    }

    public BigDecimal getTotal_misc_fee_hj() {
        return total_misc_fee_hj;
    }

    public void setTotal_misc_fee_hj(BigDecimal total_misc_fee_hj) {
        this.total_misc_fee_hj = total_misc_fee_hj;
    }

    public BigDecimal getOs_misc_fee_hj() {
        return os_misc_fee_hj;
    }

    public void setOs_misc_fee_hj(BigDecimal os_misc_fee_hj) {
        this.os_misc_fee_hj = os_misc_fee_hj;
    }

    public BigDecimal getMisc_fee_hj() {
        return misc_fee_hj;
    }

    public void setMisc_fee_hj(BigDecimal misc_fee_hj) {
        this.misc_fee_hj = misc_fee_hj;
    }

    public String getFirstDelayFlag() {
        return firstDelayFlag;
    }

    public void setFirstDelayFlag(String firstDelayFlag) {
        this.firstDelayFlag = firstDelayFlag == null ? null : firstDelayFlag.trim();
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public BigDecimal getLoanReqFeeAmt() {
        return loanReqFeeAmt;
    }

    public void setLoanReqFeeAmt(BigDecimal loanReqFeeAmt) {
        this.loanReqFeeAmt = loanReqFeeAmt;
    }

    public String getBELONG_ORG() {
        return BELONG_ORG;
    }

    public void setBELONG_ORG(String BELONG_ORG) {
        this.BELONG_ORG = BELONG_ORG == null ? null : BELONG_ORG.trim();
    }

    public String getYjf_contractNo() {
        return yjf_contractNo;
    }

    public void setYjf_contractNo(String yjf_contractNo) {
        this.yjf_contractNo = yjf_contractNo == null ? null : yjf_contractNo.trim();
    }

    public String getPreferentialFlag() {
        return preferentialFlag;
    }

    public void setPreferentialFlag(String preferentialFlag) {
        this.preferentialFlag = preferentialFlag == null ? null : preferentialFlag.trim();
    }

    public String getInsuranceFlag() {
        return insuranceFlag;
    }

    public void setInsuranceFlag(String insuranceFlag) {
        this.insuranceFlag = insuranceFlag == null ? null : insuranceFlag.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantBankName() {
        return merchantBankName;
    }

    public void setMerchantBankName(String merchantBankName) {
        this.merchantBankName = merchantBankName == null ? null : merchantBankName.trim();
    }

    public String getMerchantBank() {
        return merchantBank;
    }

    public void setMerchantBank(String merchantBank) {
        this.merchantBank = merchantBank == null ? null : merchantBank.trim();
    }

    public String getMerchantBankCardNbr() {
        return merchantBankCardNbr;
    }

    public void setMerchantBankCardNbr(String merchantBankCardNbr) {
        this.merchantBankCardNbr = merchantBankCardNbr == null ? null : merchantBankCardNbr.trim();
    }

    public String getIsreducemechantfee() {
        return isreducemechantfee;
    }

    public void setIsreducemechantfee(String isreducemechantfee) {
        this.isreducemechantfee = isreducemechantfee == null ? null : isreducemechantfee.trim();
    }

    public String getIsReductLodgingFee() {
        return isReductLodgingFee;
    }

    public void setIsReductLodgingFee(String isReductLodgingFee) {
        this.isReductLodgingFee = isReductLodgingFee == null ? null : isReductLodgingFee.trim();
    }

    public String getMerchantBankDesc() {
        return merchantBankDesc;
    }

    public void setMerchantBankDesc(String merchantBankDesc) {
        this.merchantBankDesc = merchantBankDesc == null ? null : merchantBankDesc.trim();
    }

    public String getOtherContractNo() {
        return otherContractNo;
    }

    public void setOtherContractNo(String otherContractNo) {
        this.otherContractNo = otherContractNo == null ? null : otherContractNo.trim();
    }

    public String getLeafOrg() {
        return leafOrg;
    }

    public void setLeafOrg(String leafOrg) {
        this.leafOrg = leafOrg == null ? null : leafOrg.trim();
    }

    public String getCUSTOMER_BANK_PROVINCE() {
        return CUSTOMER_BANK_PROVINCE;
    }

    public void setCUSTOMER_BANK_PROVINCE(String CUSTOMER_BANK_PROVINCE) {
        this.CUSTOMER_BANK_PROVINCE = CUSTOMER_BANK_PROVINCE == null ? null : CUSTOMER_BANK_PROVINCE.trim();
    }

    public String getCUSTOMER_BANK_CITY() {
        return CUSTOMER_BANK_CITY;
    }

    public void setCUSTOMER_BANK_CITY(String CUSTOMER_BANK_CITY) {
        this.CUSTOMER_BANK_CITY = CUSTOMER_BANK_CITY == null ? null : CUSTOMER_BANK_CITY.trim();
    }

    public String getCUSTOMER_BANK_COUNTY() {
        return CUSTOMER_BANK_COUNTY;
    }

    public void setCUSTOMER_BANK_COUNTY(String CUSTOMER_BANK_COUNTY) {
        this.CUSTOMER_BANK_COUNTY = CUSTOMER_BANK_COUNTY == null ? null : CUSTOMER_BANK_COUNTY.trim();
    }

    public Integer getDelinquency_times() {
        return delinquency_times;
    }

    public void setDelinquency_times(Integer delinquency_times) {
        this.delinquency_times = delinquency_times;
    }

    public String getReject_flag_l() {
        return reject_flag_l;
    }

    public void setReject_flag_l(String reject_flag_l) {
        this.reject_flag_l = reject_flag_l == null ? null : reject_flag_l.trim();
    }

    public String getReject_revive_man() {
        return reject_revive_man;
    }

    public void setReject_revive_man(String reject_revive_man) {
        this.reject_revive_man = reject_revive_man == null ? null : reject_revive_man.trim();
    }

    public Integer getCUSTOMER_TYPE() {
        return CUSTOMER_TYPE;
    }

    public void setCUSTOMER_TYPE(Integer CUSTOMER_TYPE) {
        this.CUSTOMER_TYPE = CUSTOMER_TYPE;
    }

    public Integer getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(Integer insurance_id) {
        this.insurance_id = insurance_id;
    }

    public String getMonetary_flag() {
        return monetary_flag;
    }

    public void setMonetary_flag(String monetary_flag) {
        this.monetary_flag = monetary_flag == null ? null : monetary_flag.trim();
    }

    public Integer getPreferential_id() {
        return preferential_id;
    }

    public void setPreferential_id(Integer preferential_id) {
        this.preferential_id = preferential_id;
    }

    public Integer getYxt_deductNumber() {
        return yxt_deductNumber;
    }

    public void setYxt_deductNumber(Integer yxt_deductNumber) {
        this.yxt_deductNumber = yxt_deductNumber;
    }

    public Integer getYxt_enableDeductFlag() {
        return yxt_enableDeductFlag;
    }

    public void setYxt_enableDeductFlag(Integer yxt_enableDeductFlag) {
        this.yxt_enableDeductFlag = yxt_enableDeductFlag;
    }

    public Integer getRepayFlag() {
        return repayFlag;
    }

    public void setRepayFlag(Integer repayFlag) {
        this.repayFlag = repayFlag;
    }

    public String getCustomer_bank_code() {
        return customer_bank_code;
    }

    public void setCustomer_bank_code(String customer_bank_code) {
        this.customer_bank_code = customer_bank_code == null ? null : customer_bank_code.trim();
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name == null ? null : agent_name.trim();
    }

    public String getAgent_id_card() {
        return agent_id_card;
    }

    public void setAgent_id_card(String agent_id_card) {
        this.agent_id_card = agent_id_card == null ? null : agent_id_card.trim();
    }

    public String getAgent_mobile() {
        return agent_mobile;
    }

    public void setAgent_mobile(String agent_mobile) {
        this.agent_mobile = agent_mobile == null ? null : agent_mobile.trim();
    }

    public String getAgent_house_name() {
        return agent_house_name;
    }

    public void setAgent_house_name(String agent_house_name) {
        this.agent_house_name = agent_house_name == null ? null : agent_house_name.trim();
    }

    public String getAgent_bank_account() {
        return agent_bank_account;
    }

    public void setAgent_bank_account(String agent_bank_account) {
        this.agent_bank_account = agent_bank_account == null ? null : agent_bank_account.trim();
    }

    public String getAgent_bank() {
        return agent_bank;
    }

    public void setAgent_bank(String agent_bank) {
        this.agent_bank = agent_bank == null ? null : agent_bank.trim();
    }

    public Integer getSpecialChannelCde() {
        return specialChannelCde;
    }

    public void setSpecialChannelCde(Integer specialChannelCde) {
        this.specialChannelCde = specialChannelCde;
    }

    public BigDecimal getAddLoanAmt() {
        return addLoanAmt;
    }

    public void setAddLoanAmt(BigDecimal addLoanAmt) {
        this.addLoanAmt = addLoanAmt;
    }

    public String getCash_Re_Merchant() {
        return cash_Re_Merchant;
    }

    public void setCash_Re_Merchant(String cash_Re_Merchant) {
        this.cash_Re_Merchant = cash_Re_Merchant == null ? null : cash_Re_Merchant.trim();
    }

    public String getCash_Re_Store() {
        return cash_Re_Store;
    }

    public void setCash_Re_Store(String cash_Re_Store) {
        this.cash_Re_Store = cash_Re_Store == null ? null : cash_Re_Store.trim();
    }

    public Integer getStatusZj() {
        return statusZj;
    }

    public void setStatusZj(Integer statusZj) {
        this.statusZj = statusZj;
    }

    public String getZjzf_bmd_batchno() {
        return zjzf_bmd_batchno;
    }

    public void setZjzf_bmd_batchno(String zjzf_bmd_batchno) {
        this.zjzf_bmd_batchno = zjzf_bmd_batchno == null ? null : zjzf_bmd_batchno.trim();
    }

    public String getKab_Purchase_Flag() {
        return kab_Purchase_Flag;
    }

    public void setKab_Purchase_Flag(String kab_Purchase_Flag) {
        this.kab_Purchase_Flag = kab_Purchase_Flag == null ? null : kab_Purchase_Flag.trim();
    }

    public String getKab_Id() {
        return kab_Id;
    }

    public void setKab_Id(String kab_Id) {
        this.kab_Id = kab_Id == null ? null : kab_Id.trim();
    }

    public String getUse_Kab() {
        return use_Kab;
    }

    public void setUse_Kab(String use_Kab) {
        this.use_Kab = use_Kab == null ? null : use_Kab.trim();
    }

    public String getKab_Order() {
        return kab_Order;
    }

    public void setKab_Order(String kab_Order) {
        this.kab_Order = kab_Order == null ? null : kab_Order.trim();
    }

    public Integer getDisaccountType() {
        return disaccountType;
    }

    public void setDisaccountType(Integer disaccountType) {
        this.disaccountType = disaccountType;
    }

    public Integer getDisaccountPayType() {
        return disaccountPayType;
    }

    public void setDisaccountPayType(Integer disaccountPayType) {
        this.disaccountPayType = disaccountPayType;
    }

    public BigDecimal getDisaccountAmount() {
        return disaccountAmount;
    }

    public void setDisaccountAmount(BigDecimal disaccountAmount) {
        this.disaccountAmount = disaccountAmount;
    }

    public Integer getMERCHANT() {
        return MERCHANT;
    }

    public void setMERCHANT(Integer MERCHANT) {
        this.MERCHANT = MERCHANT;
    }

    public String getSTORE_CDE() {
        return STORE_CDE;
    }

    public void setSTORE_CDE(String STORE_CDE) {
        this.STORE_CDE = STORE_CDE == null ? null : STORE_CDE.trim();
    }

    public String getSALE_PERSON() {
        return SALE_PERSON;
    }

    public void setSALE_PERSON(String SALE_PERSON) {
        this.SALE_PERSON = SALE_PERSON == null ? null : SALE_PERSON.trim();
    }

    public BigDecimal getKabfee() {
        return kabfee;
    }

    public void setKabfee(BigDecimal kabfee) {
        this.kabfee = kabfee;
    }

    public BigDecimal getDisacount_fee_HJ() {
        return disacount_fee_HJ;
    }

    public void setDisacount_fee_HJ(BigDecimal disacount_fee_HJ) {
        this.disacount_fee_HJ = disacount_fee_HJ;
    }

    public BigDecimal getDisacount_fee_merchant_fund() {
        return disacount_fee_merchant_fund;
    }

    public void setDisacount_fee_merchant_fund(BigDecimal disacount_fee_merchant_fund) {
        this.disacount_fee_merchant_fund = disacount_fee_merchant_fund;
    }

    public BigDecimal getDisacount_fee_merchant_hj() {
        return disacount_fee_merchant_hj;
    }

    public void setDisacount_fee_merchant_hj(BigDecimal disacount_fee_merchant_hj) {
        this.disacount_fee_merchant_hj = disacount_fee_merchant_hj;
    }

    public Integer getDisacount_pay_type_hj() {
        return disacount_pay_type_hj;
    }

    public void setDisacount_pay_type_hj(Integer disacount_pay_type_hj) {
        this.disacount_pay_type_hj = disacount_pay_type_hj;
    }

    public Integer getDisacount_type_hj() {
        return disacount_type_hj;
    }

    public void setDisacount_type_hj(Integer disacount_type_hj) {
        this.disacount_type_hj = disacount_type_hj;
    }
}