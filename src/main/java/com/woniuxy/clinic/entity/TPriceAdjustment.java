package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TPriceAdjustment {
    private Integer priceAdjustmentId;

    private String drugSn;

    private BigDecimal originalPrice;

    private BigDecimal currentPrice;

    private Date priceAdjustmentDate;

    private String remarks;

    public Integer getPriceAdjustmentId() {
        return priceAdjustmentId;
    }

    public void setPriceAdjustmentId(Integer priceAdjustmentId) {
        this.priceAdjustmentId = priceAdjustmentId;
    }

    public String getDrugSn() {
        return drugSn;
    }

    public void setDrugSn(String drugSn) {
        this.drugSn = drugSn == null ? null : drugSn.trim();
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Date getPriceAdjustmentDate() {
        return priceAdjustmentDate;
    }

    public void setPriceAdjustmentDate(Date priceAdjustmentDate) {
        this.priceAdjustmentDate = priceAdjustmentDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}