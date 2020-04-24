package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDrugExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDrugIdIsNull() {
            addCriterion("drug_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugIdIsNotNull() {
            addCriterion("drug_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugIdEqualTo(Integer value) {
            addCriterion("drug_id =", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotEqualTo(Integer value) {
            addCriterion("drug_id <>", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdGreaterThan(Integer value) {
            addCriterion("drug_id >", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_id >=", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLessThan(Integer value) {
            addCriterion("drug_id <", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_id <=", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdIn(List<Integer> values) {
            addCriterion("drug_id in", values, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotIn(List<Integer> values) {
            addCriterion("drug_id not in", values, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_id between", value1, value2, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_id not between", value1, value2, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugSnIsNull() {
            addCriterion("drug_sn is null");
            return (Criteria) this;
        }

        public Criteria andDrugSnIsNotNull() {
            addCriterion("drug_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDrugSnEqualTo(String value) {
            addCriterion("drug_sn =", value, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnNotEqualTo(String value) {
            addCriterion("drug_sn <>", value, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnGreaterThan(String value) {
            addCriterion("drug_sn >", value, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnGreaterThanOrEqualTo(String value) {
            addCriterion("drug_sn >=", value, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnLessThan(String value) {
            addCriterion("drug_sn <", value, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnLessThanOrEqualTo(String value) {
            addCriterion("drug_sn <=", value, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnLike(String value) {
            addCriterion("drug_sn like", value, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnNotLike(String value) {
            addCriterion("drug_sn not like", value, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnIn(List<String> values) {
            addCriterion("drug_sn in", values, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnNotIn(List<String> values) {
            addCriterion("drug_sn not in", values, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnBetween(String value1, String value2) {
            addCriterion("drug_sn between", value1, value2, "drugSn");
            return (Criteria) this;
        }

        public Criteria andDrugSnNotBetween(String value1, String value2) {
            addCriterion("drug_sn not between", value1, value2, "drugSn");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeIsNull() {
            addCriterion("phonetic_code is null");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeIsNotNull() {
            addCriterion("phonetic_code is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeEqualTo(String value) {
            addCriterion("phonetic_code =", value, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeNotEqualTo(String value) {
            addCriterion("phonetic_code <>", value, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeGreaterThan(String value) {
            addCriterion("phonetic_code >", value, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeGreaterThanOrEqualTo(String value) {
            addCriterion("phonetic_code >=", value, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeLessThan(String value) {
            addCriterion("phonetic_code <", value, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeLessThanOrEqualTo(String value) {
            addCriterion("phonetic_code <=", value, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeLike(String value) {
            addCriterion("phonetic_code like", value, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeNotLike(String value) {
            addCriterion("phonetic_code not like", value, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeIn(List<String> values) {
            addCriterion("phonetic_code in", values, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeNotIn(List<String> values) {
            addCriterion("phonetic_code not in", values, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeBetween(String value1, String value2) {
            addCriterion("phonetic_code between", value1, value2, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andPhoneticCodeNotBetween(String value1, String value2) {
            addCriterion("phonetic_code not between", value1, value2, "phoneticCode");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andDosageFormIsNull() {
            addCriterion("dosage_form is null");
            return (Criteria) this;
        }

        public Criteria andDosageFormIsNotNull() {
            addCriterion("dosage_form is not null");
            return (Criteria) this;
        }

        public Criteria andDosageFormEqualTo(String value) {
            addCriterion("dosage_form =", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormNotEqualTo(String value) {
            addCriterion("dosage_form <>", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormGreaterThan(String value) {
            addCriterion("dosage_form >", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormGreaterThanOrEqualTo(String value) {
            addCriterion("dosage_form >=", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormLessThan(String value) {
            addCriterion("dosage_form <", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormLessThanOrEqualTo(String value) {
            addCriterion("dosage_form <=", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormLike(String value) {
            addCriterion("dosage_form like", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormNotLike(String value) {
            addCriterion("dosage_form not like", value, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormIn(List<String> values) {
            addCriterion("dosage_form in", values, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormNotIn(List<String> values) {
            addCriterion("dosage_form not in", values, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormBetween(String value1, String value2) {
            addCriterion("dosage_form between", value1, value2, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andDosageFormNotBetween(String value1, String value2) {
            addCriterion("dosage_form not between", value1, value2, "dosageForm");
            return (Criteria) this;
        }

        public Criteria andOtcIsNull() {
            addCriterion("otc is null");
            return (Criteria) this;
        }

        public Criteria andOtcIsNotNull() {
            addCriterion("otc is not null");
            return (Criteria) this;
        }

        public Criteria andOtcEqualTo(Integer value) {
            addCriterion("otc =", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcNotEqualTo(Integer value) {
            addCriterion("otc <>", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcGreaterThan(Integer value) {
            addCriterion("otc >", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcGreaterThanOrEqualTo(Integer value) {
            addCriterion("otc >=", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcLessThan(Integer value) {
            addCriterion("otc <", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcLessThanOrEqualTo(Integer value) {
            addCriterion("otc <=", value, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcIn(List<Integer> values) {
            addCriterion("otc in", values, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcNotIn(List<Integer> values) {
            addCriterion("otc not in", values, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcBetween(Integer value1, Integer value2) {
            addCriterion("otc between", value1, value2, "otc");
            return (Criteria) this;
        }

        public Criteria andOtcNotBetween(Integer value1, Integer value2) {
            addCriterion("otc not between", value1, value2, "otc");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIsNull() {
            addCriterion("approval_number is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIsNotNull() {
            addCriterion("approval_number is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberEqualTo(String value) {
            addCriterion("approval_number =", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotEqualTo(String value) {
            addCriterion("approval_number <>", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberGreaterThan(String value) {
            addCriterion("approval_number >", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberGreaterThanOrEqualTo(String value) {
            addCriterion("approval_number >=", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLessThan(String value) {
            addCriterion("approval_number <", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLessThanOrEqualTo(String value) {
            addCriterion("approval_number <=", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLike(String value) {
            addCriterion("approval_number like", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotLike(String value) {
            addCriterion("approval_number not like", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIn(List<String> values) {
            addCriterion("approval_number in", values, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotIn(List<String> values) {
            addCriterion("approval_number not in", values, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberBetween(String value1, String value2) {
            addCriterion("approval_number between", value1, value2, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotBetween(String value1, String value2) {
            addCriterion("approval_number not between", value1, value2, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNull() {
            addCriterion("packing_unit is null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNotNull() {
            addCriterion("packing_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitEqualTo(String value) {
            addCriterion("packing_unit =", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotEqualTo(String value) {
            addCriterion("packing_unit <>", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThan(String value) {
            addCriterion("packing_unit >", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("packing_unit >=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThan(String value) {
            addCriterion("packing_unit <", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThanOrEqualTo(String value) {
            addCriterion("packing_unit <=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLike(String value) {
            addCriterion("packing_unit like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotLike(String value) {
            addCriterion("packing_unit not like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIn(List<String> values) {
            addCriterion("packing_unit in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotIn(List<String> values) {
            addCriterion("packing_unit not in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitBetween(String value1, String value2) {
            addCriterion("packing_unit between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotBetween(String value1, String value2) {
            addCriterion("packing_unit not between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientIsNull() {
            addCriterion("basic_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientIsNotNull() {
            addCriterion("basic_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientEqualTo(String value) {
            addCriterion("basic_coefficient =", value, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientNotEqualTo(String value) {
            addCriterion("basic_coefficient <>", value, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientGreaterThan(String value) {
            addCriterion("basic_coefficient >", value, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientGreaterThanOrEqualTo(String value) {
            addCriterion("basic_coefficient >=", value, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientLessThan(String value) {
            addCriterion("basic_coefficient <", value, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientLessThanOrEqualTo(String value) {
            addCriterion("basic_coefficient <=", value, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientLike(String value) {
            addCriterion("basic_coefficient like", value, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientNotLike(String value) {
            addCriterion("basic_coefficient not like", value, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientIn(List<String> values) {
            addCriterion("basic_coefficient in", values, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientNotIn(List<String> values) {
            addCriterion("basic_coefficient not in", values, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientBetween(String value1, String value2) {
            addCriterion("basic_coefficient between", value1, value2, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicCoefficientNotBetween(String value1, String value2) {
            addCriterion("basic_coefficient not between", value1, value2, "basicCoefficient");
            return (Criteria) this;
        }

        public Criteria andBasicUnitIsNull() {
            addCriterion("basic_unit is null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitIsNotNull() {
            addCriterion("basic_unit is not null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitEqualTo(String value) {
            addCriterion("basic_unit =", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNotEqualTo(String value) {
            addCriterion("basic_unit <>", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitGreaterThan(String value) {
            addCriterion("basic_unit >", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitGreaterThanOrEqualTo(String value) {
            addCriterion("basic_unit >=", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitLessThan(String value) {
            addCriterion("basic_unit <", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitLessThanOrEqualTo(String value) {
            addCriterion("basic_unit <=", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitLike(String value) {
            addCriterion("basic_unit like", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNotLike(String value) {
            addCriterion("basic_unit not like", value, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitIn(List<String> values) {
            addCriterion("basic_unit in", values, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNotIn(List<String> values) {
            addCriterion("basic_unit not in", values, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitBetween(String value1, String value2) {
            addCriterion("basic_unit between", value1, value2, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNotBetween(String value1, String value2) {
            addCriterion("basic_unit not between", value1, value2, "basicUnit");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientIsNull() {
            addCriterion("dose_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientIsNotNull() {
            addCriterion("dose_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientEqualTo(String value) {
            addCriterion("dose_coefficient =", value, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientNotEqualTo(String value) {
            addCriterion("dose_coefficient <>", value, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientGreaterThan(String value) {
            addCriterion("dose_coefficient >", value, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientGreaterThanOrEqualTo(String value) {
            addCriterion("dose_coefficient >=", value, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientLessThan(String value) {
            addCriterion("dose_coefficient <", value, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientLessThanOrEqualTo(String value) {
            addCriterion("dose_coefficient <=", value, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientLike(String value) {
            addCriterion("dose_coefficient like", value, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientNotLike(String value) {
            addCriterion("dose_coefficient not like", value, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientIn(List<String> values) {
            addCriterion("dose_coefficient in", values, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientNotIn(List<String> values) {
            addCriterion("dose_coefficient not in", values, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientBetween(String value1, String value2) {
            addCriterion("dose_coefficient between", value1, value2, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseCoefficientNotBetween(String value1, String value2) {
            addCriterion("dose_coefficient not between", value1, value2, "doseCoefficient");
            return (Criteria) this;
        }

        public Criteria andDoseUnitIsNull() {
            addCriterion("dose_unit is null");
            return (Criteria) this;
        }

        public Criteria andDoseUnitIsNotNull() {
            addCriterion("dose_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDoseUnitEqualTo(String value) {
            addCriterion("dose_unit =", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotEqualTo(String value) {
            addCriterion("dose_unit <>", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitGreaterThan(String value) {
            addCriterion("dose_unit >", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitGreaterThanOrEqualTo(String value) {
            addCriterion("dose_unit >=", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitLessThan(String value) {
            addCriterion("dose_unit <", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitLessThanOrEqualTo(String value) {
            addCriterion("dose_unit <=", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitLike(String value) {
            addCriterion("dose_unit like", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotLike(String value) {
            addCriterion("dose_unit not like", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitIn(List<String> values) {
            addCriterion("dose_unit in", values, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotIn(List<String> values) {
            addCriterion("dose_unit not in", values, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitBetween(String value1, String value2) {
            addCriterion("dose_unit between", value1, value2, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotBetween(String value1, String value2) {
            addCriterion("dose_unit not between", value1, value2, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIsNull() {
            addCriterion("purchase_amount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIsNotNull() {
            addCriterion("purchase_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountEqualTo(BigDecimal value) {
            addCriterion("purchase_amount =", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotEqualTo(BigDecimal value) {
            addCriterion("purchase_amount <>", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountGreaterThan(BigDecimal value) {
            addCriterion("purchase_amount >", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_amount >=", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountLessThan(BigDecimal value) {
            addCriterion("purchase_amount <", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_amount <=", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIn(List<BigDecimal> values) {
            addCriterion("purchase_amount in", values, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotIn(List<BigDecimal> values) {
            addCriterion("purchase_amount not in", values, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_amount between", value1, value2, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_amount not between", value1, value2, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andRetailAmountIsNull() {
            addCriterion("retail_amount is null");
            return (Criteria) this;
        }

        public Criteria andRetailAmountIsNotNull() {
            addCriterion("retail_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRetailAmountEqualTo(BigDecimal value) {
            addCriterion("retail_amount =", value, "retailAmount");
            return (Criteria) this;
        }

        public Criteria andRetailAmountNotEqualTo(BigDecimal value) {
            addCriterion("retail_amount <>", value, "retailAmount");
            return (Criteria) this;
        }

        public Criteria andRetailAmountGreaterThan(BigDecimal value) {
            addCriterion("retail_amount >", value, "retailAmount");
            return (Criteria) this;
        }

        public Criteria andRetailAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_amount >=", value, "retailAmount");
            return (Criteria) this;
        }

        public Criteria andRetailAmountLessThan(BigDecimal value) {
            addCriterion("retail_amount <", value, "retailAmount");
            return (Criteria) this;
        }

        public Criteria andRetailAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_amount <=", value, "retailAmount");
            return (Criteria) this;
        }

        public Criteria andRetailAmountIn(List<BigDecimal> values) {
            addCriterion("retail_amount in", values, "retailAmount");
            return (Criteria) this;
        }

        public Criteria andRetailAmountNotIn(List<BigDecimal> values) {
            addCriterion("retail_amount not in", values, "retailAmount");
            return (Criteria) this;
        }

        public Criteria andRetailAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_amount between", value1, value2, "retailAmount");
            return (Criteria) this;
        }

        public Criteria andRetailAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_amount not between", value1, value2, "retailAmount");
            return (Criteria) this;
        }

        public Criteria andDismountedIsNull() {
            addCriterion("dismounted is null");
            return (Criteria) this;
        }

        public Criteria andDismountedIsNotNull() {
            addCriterion("dismounted is not null");
            return (Criteria) this;
        }

        public Criteria andDismountedEqualTo(Integer value) {
            addCriterion("dismounted =", value, "dismounted");
            return (Criteria) this;
        }

        public Criteria andDismountedNotEqualTo(Integer value) {
            addCriterion("dismounted <>", value, "dismounted");
            return (Criteria) this;
        }

        public Criteria andDismountedGreaterThan(Integer value) {
            addCriterion("dismounted >", value, "dismounted");
            return (Criteria) this;
        }

        public Criteria andDismountedGreaterThanOrEqualTo(Integer value) {
            addCriterion("dismounted >=", value, "dismounted");
            return (Criteria) this;
        }

        public Criteria andDismountedLessThan(Integer value) {
            addCriterion("dismounted <", value, "dismounted");
            return (Criteria) this;
        }

        public Criteria andDismountedLessThanOrEqualTo(Integer value) {
            addCriterion("dismounted <=", value, "dismounted");
            return (Criteria) this;
        }

        public Criteria andDismountedIn(List<Integer> values) {
            addCriterion("dismounted in", values, "dismounted");
            return (Criteria) this;
        }

        public Criteria andDismountedNotIn(List<Integer> values) {
            addCriterion("dismounted not in", values, "dismounted");
            return (Criteria) this;
        }

        public Criteria andDismountedBetween(Integer value1, Integer value2) {
            addCriterion("dismounted between", value1, value2, "dismounted");
            return (Criteria) this;
        }

        public Criteria andDismountedNotBetween(Integer value1, Integer value2) {
            addCriterion("dismounted not between", value1, value2, "dismounted");
            return (Criteria) this;
        }

        public Criteria andDrugUseIsNull() {
            addCriterion("drug_use is null");
            return (Criteria) this;
        }

        public Criteria andDrugUseIsNotNull() {
            addCriterion("drug_use is not null");
            return (Criteria) this;
        }

        public Criteria andDrugUseEqualTo(String value) {
            addCriterion("drug_use =", value, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseNotEqualTo(String value) {
            addCriterion("drug_use <>", value, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseGreaterThan(String value) {
            addCriterion("drug_use >", value, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseGreaterThanOrEqualTo(String value) {
            addCriterion("drug_use >=", value, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseLessThan(String value) {
            addCriterion("drug_use <", value, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseLessThanOrEqualTo(String value) {
            addCriterion("drug_use <=", value, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseLike(String value) {
            addCriterion("drug_use like", value, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseNotLike(String value) {
            addCriterion("drug_use not like", value, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseIn(List<String> values) {
            addCriterion("drug_use in", values, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseNotIn(List<String> values) {
            addCriterion("drug_use not in", values, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseBetween(String value1, String value2) {
            addCriterion("drug_use between", value1, value2, "drugUse");
            return (Criteria) this;
        }

        public Criteria andDrugUseNotBetween(String value1, String value2) {
            addCriterion("drug_use not between", value1, value2, "drugUse");
            return (Criteria) this;
        }

        public Criteria andSingleDosageIsNull() {
            addCriterion("single_dosage is null");
            return (Criteria) this;
        }

        public Criteria andSingleDosageIsNotNull() {
            addCriterion("single_dosage is not null");
            return (Criteria) this;
        }

        public Criteria andSingleDosageEqualTo(String value) {
            addCriterion("single_dosage =", value, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageNotEqualTo(String value) {
            addCriterion("single_dosage <>", value, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageGreaterThan(String value) {
            addCriterion("single_dosage >", value, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageGreaterThanOrEqualTo(String value) {
            addCriterion("single_dosage >=", value, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageLessThan(String value) {
            addCriterion("single_dosage <", value, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageLessThanOrEqualTo(String value) {
            addCriterion("single_dosage <=", value, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageLike(String value) {
            addCriterion("single_dosage like", value, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageNotLike(String value) {
            addCriterion("single_dosage not like", value, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageIn(List<String> values) {
            addCriterion("single_dosage in", values, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageNotIn(List<String> values) {
            addCriterion("single_dosage not in", values, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageBetween(String value1, String value2) {
            addCriterion("single_dosage between", value1, value2, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andSingleDosageNotBetween(String value1, String value2) {
            addCriterion("single_dosage not between", value1, value2, "singleDosage");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(String value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(String value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(String value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(String value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(String value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLike(String value) {
            addCriterion("frequency like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotLike(String value) {
            addCriterion("frequency not like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<String> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<String> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(String value1, String value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(String value1, String value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Integer value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Integer value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Integer value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Integer value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Integer value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Integer> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Integer> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Integer value1, Integer value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Integer value1, Integer value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryIsNull() {
            addCriterion("minimum_inventory is null");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryIsNotNull() {
            addCriterion("minimum_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryEqualTo(Integer value) {
            addCriterion("minimum_inventory =", value, "minimumInventory");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryNotEqualTo(Integer value) {
            addCriterion("minimum_inventory <>", value, "minimumInventory");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryGreaterThan(Integer value) {
            addCriterion("minimum_inventory >", value, "minimumInventory");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("minimum_inventory >=", value, "minimumInventory");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryLessThan(Integer value) {
            addCriterion("minimum_inventory <", value, "minimumInventory");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("minimum_inventory <=", value, "minimumInventory");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryIn(List<Integer> values) {
            addCriterion("minimum_inventory in", values, "minimumInventory");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryNotIn(List<Integer> values) {
            addCriterion("minimum_inventory not in", values, "minimumInventory");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryBetween(Integer value1, Integer value2) {
            addCriterion("minimum_inventory between", value1, value2, "minimumInventory");
            return (Criteria) this;
        }

        public Criteria andMinimumInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("minimum_inventory not between", value1, value2, "minimumInventory");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryIsNull() {
            addCriterion("maximum_inventory is null");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryIsNotNull() {
            addCriterion("maximum_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryEqualTo(Integer value) {
            addCriterion("maximum_inventory =", value, "maximumInventory");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryNotEqualTo(Integer value) {
            addCriterion("maximum_inventory <>", value, "maximumInventory");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryGreaterThan(Integer value) {
            addCriterion("maximum_inventory >", value, "maximumInventory");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("maximum_inventory >=", value, "maximumInventory");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryLessThan(Integer value) {
            addCriterion("maximum_inventory <", value, "maximumInventory");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("maximum_inventory <=", value, "maximumInventory");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryIn(List<Integer> values) {
            addCriterion("maximum_inventory in", values, "maximumInventory");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryNotIn(List<Integer> values) {
            addCriterion("maximum_inventory not in", values, "maximumInventory");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryBetween(Integer value1, Integer value2) {
            addCriterion("maximum_inventory between", value1, value2, "maximumInventory");
            return (Criteria) this;
        }

        public Criteria andMaximumInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("maximum_inventory not between", value1, value2, "maximumInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationIsNull() {
            addCriterion("goods_location is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationIsNotNull() {
            addCriterion("goods_location is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationEqualTo(String value) {
            addCriterion("goods_location =", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationNotEqualTo(String value) {
            addCriterion("goods_location <>", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationGreaterThan(String value) {
            addCriterion("goods_location >", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationGreaterThanOrEqualTo(String value) {
            addCriterion("goods_location >=", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationLessThan(String value) {
            addCriterion("goods_location <", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationLessThanOrEqualTo(String value) {
            addCriterion("goods_location <=", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationLike(String value) {
            addCriterion("goods_location like", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationNotLike(String value) {
            addCriterion("goods_location not like", value, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationIn(List<String> values) {
            addCriterion("goods_location in", values, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationNotIn(List<String> values) {
            addCriterion("goods_location not in", values, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationBetween(String value1, String value2) {
            addCriterion("goods_location between", value1, value2, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andGoodsLocationNotBetween(String value1, String value2) {
            addCriterion("goods_location not between", value1, value2, "goodsLocation");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningIsNull() {
            addCriterion("expiration_date_warning is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningIsNotNull() {
            addCriterion("expiration_date_warning is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningEqualTo(Integer value) {
            addCriterion("expiration_date_warning =", value, "expirationDateWarning");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningNotEqualTo(Integer value) {
            addCriterion("expiration_date_warning <>", value, "expirationDateWarning");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningGreaterThan(Integer value) {
            addCriterion("expiration_date_warning >", value, "expirationDateWarning");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningGreaterThanOrEqualTo(Integer value) {
            addCriterion("expiration_date_warning >=", value, "expirationDateWarning");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningLessThan(Integer value) {
            addCriterion("expiration_date_warning <", value, "expirationDateWarning");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningLessThanOrEqualTo(Integer value) {
            addCriterion("expiration_date_warning <=", value, "expirationDateWarning");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningIn(List<Integer> values) {
            addCriterion("expiration_date_warning in", values, "expirationDateWarning");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningNotIn(List<Integer> values) {
            addCriterion("expiration_date_warning not in", values, "expirationDateWarning");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningBetween(Integer value1, Integer value2) {
            addCriterion("expiration_date_warning between", value1, value2, "expirationDateWarning");
            return (Criteria) this;
        }

        public Criteria andExpirationDateWarningNotBetween(Integer value1, Integer value2) {
            addCriterion("expiration_date_warning not between", value1, value2, "expirationDateWarning");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNull() {
            addCriterion("instruction is null");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNotNull() {
            addCriterion("instruction is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionEqualTo(String value) {
            addCriterion("instruction =", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotEqualTo(String value) {
            addCriterion("instruction <>", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThan(String value) {
            addCriterion("instruction >", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("instruction >=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThan(String value) {
            addCriterion("instruction <", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThanOrEqualTo(String value) {
            addCriterion("instruction <=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLike(String value) {
            addCriterion("instruction like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotLike(String value) {
            addCriterion("instruction not like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionIn(List<String> values) {
            addCriterion("instruction in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotIn(List<String> values) {
            addCriterion("instruction not in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionBetween(String value1, String value2) {
            addCriterion("instruction between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotBetween(String value1, String value2) {
            addCriterion("instruction not between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}