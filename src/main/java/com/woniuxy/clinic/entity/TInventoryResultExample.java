package com.woniuxy.clinic.entity;

import java.util.ArrayList;
import java.util.List;

public class TInventoryResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInventoryResultExample() {
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

        public Criteria andInventoryResultIdIsNull() {
            addCriterion("inventory_result_id is null");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdIsNotNull() {
            addCriterion("inventory_result_id is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdEqualTo(Integer value) {
            addCriterion("inventory_result_id =", value, "inventoryResultId");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdNotEqualTo(Integer value) {
            addCriterion("inventory_result_id <>", value, "inventoryResultId");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdGreaterThan(Integer value) {
            addCriterion("inventory_result_id >", value, "inventoryResultId");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_result_id >=", value, "inventoryResultId");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdLessThan(Integer value) {
            addCriterion("inventory_result_id <", value, "inventoryResultId");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_result_id <=", value, "inventoryResultId");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdIn(List<Integer> values) {
            addCriterion("inventory_result_id in", values, "inventoryResultId");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdNotIn(List<Integer> values) {
            addCriterion("inventory_result_id not in", values, "inventoryResultId");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdBetween(Integer value1, Integer value2) {
            addCriterion("inventory_result_id between", value1, value2, "inventoryResultId");
            return (Criteria) this;
        }

        public Criteria andInventoryResultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_result_id not between", value1, value2, "inventoryResultId");
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

        public Criteria andInventorySnIsNull() {
            addCriterion("inventory_sn is null");
            return (Criteria) this;
        }

        public Criteria andInventorySnIsNotNull() {
            addCriterion("inventory_sn is not null");
            return (Criteria) this;
        }

        public Criteria andInventorySnEqualTo(String value) {
            addCriterion("inventory_sn =", value, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnNotEqualTo(String value) {
            addCriterion("inventory_sn <>", value, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnGreaterThan(String value) {
            addCriterion("inventory_sn >", value, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnGreaterThanOrEqualTo(String value) {
            addCriterion("inventory_sn >=", value, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnLessThan(String value) {
            addCriterion("inventory_sn <", value, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnLessThanOrEqualTo(String value) {
            addCriterion("inventory_sn <=", value, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnLike(String value) {
            addCriterion("inventory_sn like", value, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnNotLike(String value) {
            addCriterion("inventory_sn not like", value, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnIn(List<String> values) {
            addCriterion("inventory_sn in", values, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnNotIn(List<String> values) {
            addCriterion("inventory_sn not in", values, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnBetween(String value1, String value2) {
            addCriterion("inventory_sn between", value1, value2, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andInventorySnNotBetween(String value1, String value2) {
            addCriterion("inventory_sn not between", value1, value2, "inventorySn");
            return (Criteria) this;
        }

        public Criteria andStockAmountIsNull() {
            addCriterion("stock_amount is null");
            return (Criteria) this;
        }

        public Criteria andStockAmountIsNotNull() {
            addCriterion("stock_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStockAmountEqualTo(Integer value) {
            addCriterion("stock_amount =", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotEqualTo(Integer value) {
            addCriterion("stock_amount <>", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountGreaterThan(Integer value) {
            addCriterion("stock_amount >", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_amount >=", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountLessThan(Integer value) {
            addCriterion("stock_amount <", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountLessThanOrEqualTo(Integer value) {
            addCriterion("stock_amount <=", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountIn(List<Integer> values) {
            addCriterion("stock_amount in", values, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotIn(List<Integer> values) {
            addCriterion("stock_amount not in", values, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountBetween(Integer value1, Integer value2) {
            addCriterion("stock_amount between", value1, value2, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_amount not between", value1, value2, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountIsNull() {
            addCriterion("inventory_amount is null");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountIsNotNull() {
            addCriterion("inventory_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountEqualTo(Integer value) {
            addCriterion("inventory_amount =", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountNotEqualTo(Integer value) {
            addCriterion("inventory_amount <>", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountGreaterThan(Integer value) {
            addCriterion("inventory_amount >", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_amount >=", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountLessThan(Integer value) {
            addCriterion("inventory_amount <", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_amount <=", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountIn(List<Integer> values) {
            addCriterion("inventory_amount in", values, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountNotIn(List<Integer> values) {
            addCriterion("inventory_amount not in", values, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountBetween(Integer value1, Integer value2) {
            addCriterion("inventory_amount between", value1, value2, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_amount not between", value1, value2, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountIsNull() {
            addCriterion("result_amount is null");
            return (Criteria) this;
        }

        public Criteria andResultAmountIsNotNull() {
            addCriterion("result_amount is not null");
            return (Criteria) this;
        }

        public Criteria andResultAmountEqualTo(Integer value) {
            addCriterion("result_amount =", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountNotEqualTo(Integer value) {
            addCriterion("result_amount <>", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountGreaterThan(Integer value) {
            addCriterion("result_amount >", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_amount >=", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountLessThan(Integer value) {
            addCriterion("result_amount <", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountLessThanOrEqualTo(Integer value) {
            addCriterion("result_amount <=", value, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountIn(List<Integer> values) {
            addCriterion("result_amount in", values, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountNotIn(List<Integer> values) {
            addCriterion("result_amount not in", values, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountBetween(Integer value1, Integer value2) {
            addCriterion("result_amount between", value1, value2, "resultAmount");
            return (Criteria) this;
        }

        public Criteria andResultAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("result_amount not between", value1, value2, "resultAmount");
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