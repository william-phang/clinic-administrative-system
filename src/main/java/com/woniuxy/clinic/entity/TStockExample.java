package com.woniuxy.clinic.entity;

import java.util.ArrayList;
import java.util.List;

public class TStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStockExample() {
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

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
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