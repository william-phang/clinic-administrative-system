package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TInputDrug {
    private Integer inputDrugId;

    private String drugSn;

    private String inputSn;

    private Integer inputNumber;

    private Date expirationDate;

    private BigDecimal purchaseAmount;

    private BigDecimal retailAmount;

    public Integer getInputDrugId() {
        return inputDrugId;
    }

    public void setInputDrugId(Integer inputDrugId) {
        this.inputDrugId = inputDrugId;
    }

    public String getDrugSn() {
        return drugSn;
    }

    public void setDrugSn(String drugSn) {
        this.drugSn = drugSn == null ? null : drugSn.trim();
    }

    public String getInputSn() {
        return inputSn;
    }

    public void setInputSn(String inputSn) {
        this.inputSn = inputSn == null ? null : inputSn.trim();
    }

    public Integer getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(Integer inputNumber) {
        this.inputNumber = inputNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public BigDecimal getRetailAmount() {
        return retailAmount;
    }

    public void setRetailAmount(BigDecimal retailAmount) {
        this.retailAmount = retailAmount;
    }
}