package com.woniuxy.clinic.entity;

import java.util.Date;

public class TInventory {
    private Integer inventoryId;

    private String inventorySn;

    private Date inventoryDate;

    private String tabulationPerson;

    private String status;

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getInventorySn() {
        return inventorySn;
    }

    public void setInventorySn(String inventorySn) {
        this.inventorySn = inventorySn == null ? null : inventorySn.trim();
    }

    public Date getInventoryDate() {
        return inventoryDate;
    }

    public void setInventoryDate(Date inventoryDate) {
        this.inventoryDate = inventoryDate;
    }

    public String getTabulationPerson() {
        return tabulationPerson;
    }

    public void setTabulationPerson(String tabulationPerson) {
        this.tabulationPerson = tabulationPerson == null ? null : tabulationPerson.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}