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
    private Integer regisId;

    private String regisName;

    private BigDecimal regisFee;

    private BigDecimal regisCost;

    private Date regisDate;

    private String regisFounder;

    private String regisState;

    public Integer getRegisId() {
        return regisId;
    }

    public void setRegisId(Integer regisId) {
        this.regisId = regisId;
    }

    public String getRegisName() {
        return regisName;
    }

    public void setRegisName(String regisName) {
        this.regisName = regisName == null ? null : regisName.trim();
    }

    public BigDecimal getRegisFee() {
        return regisFee;
    }

    public void setRegisFee(BigDecimal regisFee) {
        this.regisFee = regisFee;
    }

    public BigDecimal getRegisCost() {
        return regisCost;
    }

    public void setRegisCost(BigDecimal regisCost) {
        this.regisCost = regisCost;
    }

    public Date getRegisDate() {
        return regisDate;
    }

    public void setRegisDate(Date regisDate) {
        this.regisDate = regisDate;
    }

    public String getRegisFounder() {
        return regisFounder;
    }

    public void setRegisFounder(String regisFounder) {
        this.regisFounder = regisFounder == null ? null : regisFounder.trim();
    }

    public String getRegisState() {
        return regisState;
    }

    public void setRegisState(String regisState) {
        this.regisState = regisState == null ? null : regisState.trim();
    }
}