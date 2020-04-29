package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOutputDrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOutputDrugExample() {
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

        public Criteria andOutputDrugIdIsNull() {
            addCriterion("output_drug_id is null");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdIsNotNull() {
            addCriterion("output_drug_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdEqualTo(Integer value) {
            addCriterion("output_drug_id =", value, "outputDrugId");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdNotEqualTo(Integer value) {
            addCriterion("output_drug_id <>", value, "outputDrugId");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdGreaterThan(Integer value) {
            addCriterion("output_drug_id >", value, "outputDrugId");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("output_drug_id >=", value, "outputDrugId");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdLessThan(Integer value) {
            addCriterion("output_drug_id <", value, "outputDrugId");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdLessThanOrEqualTo(Integer value) {
            addCriterion("output_drug_id <=", value, "outputDrugId");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdIn(List<Integer> values) {
            addCriterion("output_drug_id in", values, "outputDrugId");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdNotIn(List<Integer> values) {
            addCriterion("output_drug_id not in", values, "outputDrugId");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdBetween(Integer value1, Integer value2) {
            addCriterion("output_drug_id between", value1, value2, "outputDrugId");
            return (Criteria) this;
        }

        public Criteria andOutputDrugIdNotBetween(Integer value1, Integer value2) {
            addCriterion("output_drug_id not between", value1, value2, "outputDrugId");
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

        public Criteria andOutputSnIsNull() {
            addCriterion("output_sn is null");
            return (Criteria) this;
        }

        public Criteria andOutputSnIsNotNull() {
            addCriterion("output_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOutputSnEqualTo(String value) {
            addCriterion("output_sn =", value, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnNotEqualTo(String value) {
            addCriterion("output_sn <>", value, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnGreaterThan(String value) {
            addCriterion("output_sn >", value, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnGreaterThanOrEqualTo(String value) {
            addCriterion("output_sn >=", value, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnLessThan(String value) {
            addCriterion("output_sn <", value, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnLessThanOrEqualTo(String value) {
            addCriterion("output_sn <=", value, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnLike(String value) {
            addCriterion("output_sn like", value, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnNotLike(String value) {
            addCriterion("output_sn not like", value, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnIn(List<String> values) {
            addCriterion("output_sn in", values, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnNotIn(List<String> values) {
            addCriterion("output_sn not in", values, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnBetween(String value1, String value2) {
            addCriterion("output_sn between", value1, value2, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputSnNotBetween(String value1, String value2) {
            addCriterion("output_sn not between", value1, value2, "outputSn");
            return (Criteria) this;
        }

        public Criteria andOutputNumberIsNull() {
            addCriterion("output_number is null");
            return (Criteria) this;
        }

        public Criteria andOutputNumberIsNotNull() {
            addCriterion("output_number is not null");
            return (Criteria) this;
        }

        public Criteria andOutputNumberEqualTo(Integer value) {
            addCriterion("output_number =", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberNotEqualTo(Integer value) {
            addCriterion("output_number <>", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberGreaterThan(Integer value) {
            addCriterion("output_number >", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("output_number >=", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberLessThan(Integer value) {
            addCriterion("output_number <", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberLessThanOrEqualTo(Integer value) {
            addCriterion("output_number <=", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberIn(List<Integer> values) {
            addCriterion("output_number in", values, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberNotIn(List<Integer> values) {
            addCriterion("output_number not in", values, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberBetween(Integer value1, Integer value2) {
            addCriterion("output_number between", value1, value2, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("output_number not between", value1, value2, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNull() {
            addCriterion("expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNotNull() {
            addCriterion("expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateEqualTo(Date value) {
            addCriterion("expiration_date =", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotEqualTo(Date value) {
            addCriterion("expiration_date <>", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThan(Date value) {
            addCriterion("expiration_date >", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("expiration_date >=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThan(Date value) {
            addCriterion("expiration_date <", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThanOrEqualTo(Date value) {
            addCriterion("expiration_date <=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIn(List<Date> values) {
            addCriterion("expiration_date in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotIn(List<Date> values) {
            addCriterion("expiration_date not in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateBetween(Date value1, Date value2) {
            addCriterion("expiration_date between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotBetween(Date value1, Date value2) {
            addCriterion("expiration_date not between", value1, value2, "expirationDate");
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