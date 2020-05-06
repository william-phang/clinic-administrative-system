package com.woniuxy.clinic.entity;

public class TInventoryResult {
    private Integer inventoryResultId;

    private String drugSn;

    private String inventorySn;

    private Integer stockAmount;

    private Integer inventoryAmount;

    private Integer resultAmount;

    private String remarks;

    public Integer getInventoryResultId() {
        return inventoryResultId;
    }

    public void setInventoryResultId(Integer inventoryResultId) {
        this.inventoryResultId = inventoryResultId;
    }

    public String getDrugSn() {
        return drugSn;
    }

    public void setDrugSn(String drugSn) {
        this.drugSn = drugSn == null ? null : drugSn.trim();
    }

    public String getInventorySn() {
        return inventorySn;
    }

    public void setInventorySn(String inventorySn) {
        this.inventorySn = inventorySn == null ? null : inventorySn.trim();
    }

    public Integer getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }

    public Integer getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(Integer inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    public Integer getResultAmount() {
        return resultAmount;
    }

    public void setResultAmount(Integer resultAmount) {
        this.resultAmount = resultAmount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}