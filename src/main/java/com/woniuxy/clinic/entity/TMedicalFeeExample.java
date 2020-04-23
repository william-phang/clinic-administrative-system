package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMedicalFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMedicalFeeExample() {
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

        public Criteria andMedicalIdIsNull() {
            addCriterion("medical_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicalIdIsNotNull() {
            addCriterion("medical_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalIdEqualTo(Integer value) {
            addCriterion("medical_id =", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdNotEqualTo(Integer value) {
            addCriterion("medical_id <>", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdGreaterThan(Integer value) {
            addCriterion("medical_id >", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medical_id >=", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdLessThan(Integer value) {
            addCriterion("medical_id <", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdLessThanOrEqualTo(Integer value) {
            addCriterion("medical_id <=", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdIn(List<Integer> values) {
            addCriterion("medical_id in", values, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdNotIn(List<Integer> values) {
            addCriterion("medical_id not in", values, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdBetween(Integer value1, Integer value2) {
            addCriterion("medical_id between", value1, value2, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medical_id not between", value1, value2, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalNameIsNull() {
            addCriterion("medical_name is null");
            return (Criteria) this;
        }

        public Criteria andMedicalNameIsNotNull() {
            addCriterion("medical_name is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalNameEqualTo(String value) {
            addCriterion("medical_name =", value, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameNotEqualTo(String value) {
            addCriterion("medical_name <>", value, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameGreaterThan(String value) {
            addCriterion("medical_name >", value, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameGreaterThanOrEqualTo(String value) {
            addCriterion("medical_name >=", value, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameLessThan(String value) {
            addCriterion("medical_name <", value, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameLessThanOrEqualTo(String value) {
            addCriterion("medical_name <=", value, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameLike(String value) {
            addCriterion("medical_name like", value, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameNotLike(String value) {
            addCriterion("medical_name not like", value, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameIn(List<String> values) {
            addCriterion("medical_name in", values, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameNotIn(List<String> values) {
            addCriterion("medical_name not in", values, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameBetween(String value1, String value2) {
            addCriterion("medical_name between", value1, value2, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalNameNotBetween(String value1, String value2) {
            addCriterion("medical_name not between", value1, value2, "medicalName");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeIsNull() {
            addCriterion("medical_fee is null");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeIsNotNull() {
            addCriterion("medical_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeEqualTo(BigDecimal value) {
            addCriterion("medical_fee =", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeNotEqualTo(BigDecimal value) {
            addCriterion("medical_fee <>", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeGreaterThan(BigDecimal value) {
            addCriterion("medical_fee >", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_fee >=", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeLessThan(BigDecimal value) {
            addCriterion("medical_fee <", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_fee <=", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeIn(List<BigDecimal> values) {
            addCriterion("medical_fee in", values, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeNotIn(List<BigDecimal> values) {
            addCriterion("medical_fee not in", values, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_fee between", value1, value2, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_fee not between", value1, value2, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalCostIsNull() {
            addCriterion("medical_cost is null");
            return (Criteria) this;
        }

        public Criteria andMedicalCostIsNotNull() {
            addCriterion("medical_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalCostEqualTo(BigDecimal value) {
            addCriterion("medical_cost =", value, "medicalCost");
            return (Criteria) this;
        }

        public Criteria andMedicalCostNotEqualTo(BigDecimal value) {
            addCriterion("medical_cost <>", value, "medicalCost");
            return (Criteria) this;
        }

        public Criteria andMedicalCostGreaterThan(BigDecimal value) {
            addCriterion("medical_cost >", value, "medicalCost");
            return (Criteria) this;
        }

        public Criteria andMedicalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_cost >=", value, "medicalCost");
            return (Criteria) this;
        }

        public Criteria andMedicalCostLessThan(BigDecimal value) {
            addCriterion("medical_cost <", value, "medicalCost");
            return (Criteria) this;
        }

        public Criteria andMedicalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_cost <=", value, "medicalCost");
            return (Criteria) this;
        }

        public Criteria andMedicalCostIn(List<BigDecimal> values) {
            addCriterion("medical_cost in", values, "medicalCost");
            return (Criteria) this;
        }

        public Criteria andMedicalCostNotIn(List<BigDecimal> values) {
            addCriterion("medical_cost not in", values, "medicalCost");
            return (Criteria) this;
        }

        public Criteria andMedicalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_cost between", value1, value2, "medicalCost");
            return (Criteria) this;
        }

        public Criteria andMedicalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_cost not between", value1, value2, "medicalCost");
            return (Criteria) this;
        }

        public Criteria andMedicalDateIsNull() {
            addCriterion("medical_date is null");
            return (Criteria) this;
        }

        public Criteria andMedicalDateIsNotNull() {
            addCriterion("medical_date is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalDateEqualTo(Date value) {
            addCriterion("medical_date =", value, "medicalDate");
            return (Criteria) this;
        }

        public Criteria andMedicalDateNotEqualTo(Date value) {
            addCriterion("medical_date <>", value, "medicalDate");
            return (Criteria) this;
        }

        public Criteria andMedicalDateGreaterThan(Date value) {
            addCriterion("medical_date >", value, "medicalDate");
            return (Criteria) this;
        }

        public Criteria andMedicalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("medical_date >=", value, "medicalDate");
            return (Criteria) this;
        }

        public Criteria andMedicalDateLessThan(Date value) {
            addCriterion("medical_date <", value, "medicalDate");
            return (Criteria) this;
        }

        public Criteria andMedicalDateLessThanOrEqualTo(Date value) {
            addCriterion("medical_date <=", value, "medicalDate");
            return (Criteria) this;
        }

        public Criteria andMedicalDateIn(List<Date> values) {
            addCriterion("medical_date in", values, "medicalDate");
            return (Criteria) this;
        }

        public Criteria andMedicalDateNotIn(List<Date> values) {
            addCriterion("medical_date not in", values, "medicalDate");
            return (Criteria) this;
        }

        public Criteria andMedicalDateBetween(Date value1, Date value2) {
            addCriterion("medical_date between", value1, value2, "medicalDate");
            return (Criteria) this;
        }

        public Criteria andMedicalDateNotBetween(Date value1, Date value2) {
            addCriterion("medical_date not between", value1, value2, "medicalDate");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderIsNull() {
            addCriterion("medical_founder is null");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderIsNotNull() {
            addCriterion("medical_founder is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderEqualTo(String value) {
            addCriterion("medical_founder =", value, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderNotEqualTo(String value) {
            addCriterion("medical_founder <>", value, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderGreaterThan(String value) {
            addCriterion("medical_founder >", value, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderGreaterThanOrEqualTo(String value) {
            addCriterion("medical_founder >=", value, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderLessThan(String value) {
            addCriterion("medical_founder <", value, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderLessThanOrEqualTo(String value) {
            addCriterion("medical_founder <=", value, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderLike(String value) {
            addCriterion("medical_founder like", value, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderNotLike(String value) {
            addCriterion("medical_founder not like", value, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderIn(List<String> values) {
            addCriterion("medical_founder in", values, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderNotIn(List<String> values) {
            addCriterion("medical_founder not in", values, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderBetween(String value1, String value2) {
            addCriterion("medical_founder between", value1, value2, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalFounderNotBetween(String value1, String value2) {
            addCriterion("medical_founder not between", value1, value2, "medicalFounder");
            return (Criteria) this;
        }

        public Criteria andMedicalStateIsNull() {
            addCriterion("medical_state is null");
            return (Criteria) this;
        }

        public Criteria andMedicalStateIsNotNull() {
            addCriterion("medical_state is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalStateEqualTo(String value) {
            addCriterion("medical_state =", value, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateNotEqualTo(String value) {
            addCriterion("medical_state <>", value, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateGreaterThan(String value) {
            addCriterion("medical_state >", value, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateGreaterThanOrEqualTo(String value) {
            addCriterion("medical_state >=", value, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateLessThan(String value) {
            addCriterion("medical_state <", value, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateLessThanOrEqualTo(String value) {
            addCriterion("medical_state <=", value, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateLike(String value) {
            addCriterion("medical_state like", value, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateNotLike(String value) {
            addCriterion("medical_state not like", value, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateIn(List<String> values) {
            addCriterion("medical_state in", values, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateNotIn(List<String> values) {
            addCriterion("medical_state not in", values, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateBetween(String value1, String value2) {
            addCriterion("medical_state between", value1, value2, "medicalState");
            return (Criteria) this;
        }

        public Criteria andMedicalStateNotBetween(String value1, String value2) {
            addCriterion("medical_state not between", value1, value2, "medicalState");
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