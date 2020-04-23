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
    private Integer medicalId;

    private String medicalName;

    private BigDecimal medicalFee;

    private BigDecimal medicalCost;

    private Date medicalDate;

    private String medicalFounder;

    private String medicalState;

    public Integer getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Integer medicalId) {
        this.medicalId = medicalId;
    }

    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName == null ? null : medicalName.trim();
    }

    public BigDecimal getMedicalFee() {
        return medicalFee;
    }

    public void setMedicalFee(BigDecimal medicalFee) {
        this.medicalFee = medicalFee;
    }

    public BigDecimal getMedicalCost() {
        return medicalCost;
    }

    public void setMedicalCost(BigDecimal medicalCost) {
        this.medicalCost = medicalCost;
    }

    public Date getMedicalDate() {
        return medicalDate;
    }

    public void setMedicalDate(Date medicalDate) {
        this.medicalDate = medicalDate;
    }

    public String getMedicalFounder() {
        return medicalFounder;
    }

    public void setMedicalFounder(String medicalFounder) {
        this.medicalFounder = medicalFounder == null ? null : medicalFounder.trim();
    }

    public String getMedicalState() {
        return medicalState;
    }

    public void setMedicalState(String medicalState) {
        this.medicalState = medicalState == null ? null : medicalState.trim();
    }
}