package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TDrug {
    private Integer drugId;

    private String drugSn;

    private String type;

    private String status;

    private String barCode;

    private String name;

    private String phoneticCode;

    private String specification;

    private String dosageForm;

    private Integer otc;

    private String invoice;

    private String approvalNumber;

    private String manufacturer;

    private String packingUnit;

    private String basicCoefficient;

    private String basicUnit;

    private String doseCoefficient;

    private String doseUnit;

    private BigDecimal purchaseAmount;

    private BigDecimal retailAmount;

    private Integer dismounted;

    private String drugUse;

    private String singleDosage;

    private String frequency;

    private Integer day;

    private Integer total;

    private String unit;

    private Integer minimumInventory;

    private Integer maximumInventory;

    private String goodsLocation;

    private Integer expirationDateWarning;

    private String instruction;

    private Date createTime;

    private String remarks;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugSn() {
        return drugSn;
    }

    public void setDrugSn(String drugSn) {
        this.drugSn = drugSn == null ? null : drugSn.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhoneticCode() {
        return phoneticCode;
    }

    public void setPhoneticCode(String phoneticCode) {
        this.phoneticCode = phoneticCode == null ? null : phoneticCode.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm == null ? null : dosageForm.trim();
    }

    public Integer getOtc() {
        return otc;
    }

    public void setOtc(Integer otc) {
        this.otc = otc;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit == null ? null : packingUnit.trim();
    }

    public String getBasicCoefficient() {
        return basicCoefficient;
    }

    public void setBasicCoefficient(String basicCoefficient) {
        this.basicCoefficient = basicCoefficient == null ? null : basicCoefficient.trim();
    }

    public String getBasicUnit() {
        return basicUnit;
    }

    public void setBasicUnit(String basicUnit) {
        this.basicUnit = basicUnit == null ? null : basicUnit.trim();
    }

    public String getDoseCoefficient() {
        return doseCoefficient;
    }

    public void setDoseCoefficient(String doseCoefficient) {
        this.doseCoefficient = doseCoefficient == null ? null : doseCoefficient.trim();
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit == null ? null : doseUnit.trim();
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

    public Integer getDismounted() {
        return dismounted;
    }

    public void setDismounted(Integer dismounted) {
        this.dismounted = dismounted;
    }

    public String getDrugUse() {
        return drugUse;
    }

    public void setDrugUse(String drugUse) {
        this.drugUse = drugUse == null ? null : drugUse.trim();
    }

    public String getSingleDosage() {
        return singleDosage;
    }

    public void setSingleDosage(String singleDosage) {
        this.singleDosage = singleDosage == null ? null : singleDosage.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getMinimumInventory() {
        return minimumInventory;
    }

    public void setMinimumInventory(Integer minimumInventory) {
        this.minimumInventory = minimumInventory;
    }

    public Integer getMaximumInventory() {
        return maximumInventory;
    }

    public void setMaximumInventory(Integer maximumInventory) {
        this.maximumInventory = maximumInventory;
    }

    public String getGoodsLocation() {
        return goodsLocation;
    }

    public void setGoodsLocation(String goodsLocation) {
        this.goodsLocation = goodsLocation == null ? null : goodsLocation.trim();
    }

    public Integer getExpirationDateWarning() {
        return expirationDateWarning;
    }

    public void setExpirationDateWarning(Integer expirationDateWarning) {
        this.expirationDateWarning = expirationDateWarning;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}