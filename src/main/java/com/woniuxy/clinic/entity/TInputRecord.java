package com.woniuxy.clinic.entity;

import java.util.Date;

public class TInputRecord {
    private Integer inputId;

    private String inputSn;

    private Date inputDate;

    private String inputPerson;

    private String inputType;

    private String supplier;

    private Date tabulationDate;

    private String tabulationPerson;

    private String remarks;

    private String status;

    public Integer getInputId() {
        return inputId;
    }

    public void setInputId(Integer inputId) {
        this.inputId = inputId;
    }

    public String getInputSn() {
        return inputSn;
    }

    public void setInputSn(String inputSn) {
        this.inputSn = inputSn == null ? null : inputSn.trim();
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public String getInputPerson() {
        return inputPerson;
    }

    public void setInputPerson(String inputPerson) {
        this.inputPerson = inputPerson == null ? null : inputPerson.trim();
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType == null ? null : inputType.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public Date getTabulationDate() {
        return tabulationDate;
    }

    public void setTabulationDate(Date tabulationDate) {
        this.tabulationDate = tabulationDate;
    }

    public String getTabulationPerson() {
        return tabulationPerson;
    }

    public void setTabulationPerson(String tabulationPerson) {
        this.tabulationPerson = tabulationPerson == null ? null : tabulationPerson.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}