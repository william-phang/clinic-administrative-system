package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TRegistrationFee {
    private Integer regis_id;

    private String regis_name;

    private BigDecimal regis_fee;

    private BigDecimal regis_cost;

    private Date regis_date;

    private String regis_founder;

    private String regis_state;

    public Integer getRegis_id() {
        return regis_id;
    }

    public void setRegis_id(Integer regis_id) {
        this.regis_id = regis_id;
    }

    public String getRegis_name() {
        return regis_name;
    }

    public void setRegis_name(String regis_name) {
        this.regis_name = regis_name == null ? null : regis_name.trim();
    }

    public BigDecimal getRegis_fee() {
        return regis_fee;
    }

    public void setRegis_fee(BigDecimal regis_fee) {
        this.regis_fee = regis_fee;
    }

    public BigDecimal getRegis_cost() {
        return regis_cost;
    }

    public void setRegis_cost(BigDecimal regis_cost) {
        this.regis_cost = regis_cost;
    }

    public Date getRegis_date() {
        return regis_date;
    }

    public void setRegis_date(Date regis_date) {
        this.regis_date = regis_date;
    }

    public String getRegis_founder() {
        return regis_founder;
    }

    public void setRegis_founder(String regis_founder) {
        this.regis_founder = regis_founder == null ? null : regis_founder.trim();
    }

    public String getRegis_state() {
        return regis_state;
    }

    public void setRegis_state(String regis_state) {
        this.regis_state = regis_state == null ? null : regis_state.trim();
    }
}