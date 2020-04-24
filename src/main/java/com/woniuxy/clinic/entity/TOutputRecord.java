package com.woniuxy.clinic.entity;

import java.util.Date;

public class TOutputRecord {
    private Integer outputId;

    private String outputSn;

    private Date outputDate;

    private String outputPerson;

    private String outputType;

    private String supplier;

    private Date tabulationDate;

    private String tabulationPerson;

    private String remarks;

    private String status;

    public Integer getOutputId() {
        return outputId;
    }

    public void setOutputId(Integer outputId) {
        this.outputId = outputId;
    }

    public String getOutputSn() {
        return outputSn;
    }

    public void setOutputSn(String outputSn) {
        this.outputSn = outputSn == null ? null : outputSn.trim();
    }

    public Date getOutputDate() {
        return outputDate;
    }

    public void setOutputDate(Date outputDate) {
        this.outputDate = outputDate;
    }

    public String getOutputPerson() {
        return outputPerson;
    }

    public void setOutputPerson(String outputPerson) {
        this.outputPerson = outputPerson == null ? null : outputPerson.trim();
    }

    public String getOutputType() {
        return outputType;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType == null ? null : outputType.trim();
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