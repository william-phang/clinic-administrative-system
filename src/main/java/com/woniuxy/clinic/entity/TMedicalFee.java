package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TMedicalFee {
    private Integer medical_id;

    private String medical_name;

    private BigDecimal medical_fee;

    private BigDecimal medical_cost;

    private Date medical_date;

    private String medical_founder;

    private String medical_state;

    public Integer getMedical_id() {
        return medical_id;
    }

    public void setMedical_id(Integer medical_id) {
        this.medical_id = medical_id;
    }

    public String getMedical_name() {
        return medical_name;
    }

    public void setMedical_name(String medical_name) {
        this.medical_name = medical_name == null ? null : medical_name.trim();
    }

    public BigDecimal getMedical_fee() {
        return medical_fee;
    }

    public void setMedical_fee(BigDecimal medical_fee) {
        this.medical_fee = medical_fee;
    }

    public BigDecimal getMedical_cost() {
        return medical_cost;
    }

    public void setMedical_cost(BigDecimal medical_cost) {
        this.medical_cost = medical_cost;
    }

    public Date getMedical_date() {
        return medical_date;
    }

    public void setMedical_date(Date medical_date) {
        this.medical_date = medical_date;
    }

    public String getMedical_founder() {
        return medical_founder;
    }

    public void setMedical_founder(String medical_founder) {
        this.medical_founder = medical_founder == null ? null : medical_founder.trim();
    }

    public String getMedical_state() {
        return medical_state;
    }

    public void setMedical_state(String medical_state) {
        this.medical_state = medical_state == null ? null : medical_state.trim();
    }
}