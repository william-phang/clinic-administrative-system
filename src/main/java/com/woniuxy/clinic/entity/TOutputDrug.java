package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TOutputDrug {
    private Integer outputDrugId;

    private String drugSn;

    private String outputSn;

    private Integer outputNumber;

    private Date expirationDate;

    private BigDecimal purchaseAmount;

    private BigDecimal retailAmount;

    public Integer getOutputDrugId() {
        return outputDrugId;
    }

    public void setOutputDrugId(Integer outputDrugId) {
        this.outputDrugId = outputDrugId;
    }

    public String getDrugSn() {
        return drugSn;
    }

    public void setDrugSn(String drugSn) {
        this.drugSn = drugSn == null ? null : drugSn.trim();
    }

    public String getOutputSn() {
        return outputSn;
    }

    public void setOutputSn(String outputSn) {
        this.outputSn = outputSn == null ? null : outputSn.trim();
    }

    public Integer getOutputNumber() {
        return outputNumber;
    }

    public void setOutputNumber(Integer outputNumber) {
        this.outputNumber = outputNumber;
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