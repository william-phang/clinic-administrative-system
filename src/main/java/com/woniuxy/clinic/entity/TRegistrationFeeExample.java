package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRegistrationFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRegistrationFeeExample() {
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

        public Criteria andRegisIdIsNull() {
            addCriterion("regis_id is null");
            return (Criteria) this;
        }

        public Criteria andRegisIdIsNotNull() {
            addCriterion("regis_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegisIdEqualTo(Integer value) {
            addCriterion("regis_id =", value, "regisId");
            return (Criteria) this;
        }

        public Criteria andRegisIdNotEqualTo(Integer value) {
            addCriterion("regis_id <>", value, "regisId");
            return (Criteria) this;
        }

        public Criteria andRegisIdGreaterThan(Integer value) {
            addCriterion("regis_id >", value, "regisId");
            return (Criteria) this;
        }

        public Criteria andRegisIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("regis_id >=", value, "regisId");
            return (Criteria) this;
        }

        public Criteria andRegisIdLessThan(Integer value) {
            addCriterion("regis_id <", value, "regisId");
            return (Criteria) this;
        }

        public Criteria andRegisIdLessThanOrEqualTo(Integer value) {
            addCriterion("regis_id <=", value, "regisId");
            return (Criteria) this;
        }

        public Criteria andRegisIdIn(List<Integer> values) {
            addCriterion("regis_id in", values, "regisId");
            return (Criteria) this;
        }

        public Criteria andRegisIdNotIn(List<Integer> values) {
            addCriterion("regis_id not in", values, "regisId");
            return (Criteria) this;
        }

        public Criteria andRegisIdBetween(Integer value1, Integer value2) {
            addCriterion("regis_id between", value1, value2, "regisId");
            return (Criteria) this;
        }

        public Criteria andRegisIdNotBetween(Integer value1, Integer value2) {
            addCriterion("regis_id not between", value1, value2, "regisId");
            return (Criteria) this;
        }

        public Criteria andRegisNameIsNull() {
            addCriterion("regis_name is null");
            return (Criteria) this;
        }

        public Criteria andRegisNameIsNotNull() {
            addCriterion("regis_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegisNameEqualTo(String value) {
            addCriterion("regis_name =", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameNotEqualTo(String value) {
            addCriterion("regis_name <>", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameGreaterThan(String value) {
            addCriterion("regis_name >", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameGreaterThanOrEqualTo(String value) {
            addCriterion("regis_name >=", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameLessThan(String value) {
            addCriterion("regis_name <", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameLessThanOrEqualTo(String value) {
            addCriterion("regis_name <=", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameLike(String value) {
            addCriterion("regis_name like", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameNotLike(String value) {
            addCriterion("regis_name not like", value, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameIn(List<String> values) {
            addCriterion("regis_name in", values, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameNotIn(List<String> values) {
            addCriterion("regis_name not in", values, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameBetween(String value1, String value2) {
            addCriterion("regis_name between", value1, value2, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisNameNotBetween(String value1, String value2) {
            addCriterion("regis_name not between", value1, value2, "regisName");
            return (Criteria) this;
        }

        public Criteria andRegisFeeIsNull() {
            addCriterion("regis_fee is null");
            return (Criteria) this;
        }

        public Criteria andRegisFeeIsNotNull() {
            addCriterion("regis_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRegisFeeEqualTo(BigDecimal value) {
            addCriterion("regis_fee =", value, "regisFee");
            return (Criteria) this;
        }

        public Criteria andRegisFeeNotEqualTo(BigDecimal value) {
            addCriterion("regis_fee <>", value, "regisFee");
            return (Criteria) this;
        }

        public Criteria andRegisFeeGreaterThan(BigDecimal value) {
            addCriterion("regis_fee >", value, "regisFee");
            return (Criteria) this;
        }

        public Criteria andRegisFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("regis_fee >=", value, "regisFee");
            return (Criteria) this;
        }

        public Criteria andRegisFeeLessThan(BigDecimal value) {
            addCriterion("regis_fee <", value, "regisFee");
            return (Criteria) this;
        }

        public Criteria andRegisFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("regis_fee <=", value, "regisFee");
            return (Criteria) this;
        }

        public Criteria andRegisFeeIn(List<BigDecimal> values) {
            addCriterion("regis_fee in", values, "regisFee");
            return (Criteria) this;
        }

        public Criteria andRegisFeeNotIn(List<BigDecimal> values) {
            addCriterion("regis_fee not in", values, "regisFee");
            return (Criteria) this;
        }

        public Criteria andRegisFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regis_fee between", value1, value2, "regisFee");
            return (Criteria) this;
        }

        public Criteria andRegisFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regis_fee not between", value1, value2, "regisFee");
            return (Criteria) this;
        }

        public Criteria andRegisCostIsNull() {
            addCriterion("regis_cost is null");
            return (Criteria) this;
        }

        public Criteria andRegisCostIsNotNull() {
            addCriterion("regis_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRegisCostEqualTo(BigDecimal value) {
            addCriterion("regis_cost =", value, "regisCost");
            return (Criteria) this;
        }

        public Criteria andRegisCostNotEqualTo(BigDecimal value) {
            addCriterion("regis_cost <>", value, "regisCost");
            return (Criteria) this;
        }

        public Criteria andRegisCostGreaterThan(BigDecimal value) {
            addCriterion("regis_cost >", value, "regisCost");
            return (Criteria) this;
        }

        public Criteria andRegisCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("regis_cost >=", value, "regisCost");
            return (Criteria) this;
        }

        public Criteria andRegisCostLessThan(BigDecimal value) {
            addCriterion("regis_cost <", value, "regisCost");
            return (Criteria) this;
        }

        public Criteria andRegisCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("regis_cost <=", value, "regisCost");
            return (Criteria) this;
        }

        public Criteria andRegisCostIn(List<BigDecimal> values) {
            addCriterion("regis_cost in", values, "regisCost");
            return (Criteria) this;
        }

        public Criteria andRegisCostNotIn(List<BigDecimal> values) {
            addCriterion("regis_cost not in", values, "regisCost");
            return (Criteria) this;
        }

        public Criteria andRegisCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regis_cost between", value1, value2, "regisCost");
            return (Criteria) this;
        }

        public Criteria andRegisCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regis_cost not between", value1, value2, "regisCost");
            return (Criteria) this;
        }

        public Criteria andRegisDateIsNull() {
            addCriterion("regis_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisDateIsNotNull() {
            addCriterion("regis_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisDateEqualTo(Date value) {
            addCriterion("regis_date =", value, "regisDate");
            return (Criteria) this;
        }

        public Criteria andRegisDateNotEqualTo(Date value) {
            addCriterion("regis_date <>", value, "regisDate");
            return (Criteria) this;
        }

        public Criteria andRegisDateGreaterThan(Date value) {
            addCriterion("regis_date >", value, "regisDate");
            return (Criteria) this;
        }

        public Criteria andRegisDateGreaterThanOrEqualTo(Date value) {
            addCriterion("regis_date >=", value, "regisDate");
            return (Criteria) this;
        }

        public Criteria andRegisDateLessThan(Date value) {
            addCriterion("regis_date <", value, "regisDate");
            return (Criteria) this;
        }

        public Criteria andRegisDateLessThanOrEqualTo(Date value) {
            addCriterion("regis_date <=", value, "regisDate");
            return (Criteria) this;
        }

        public Criteria andRegisDateIn(List<Date> values) {
            addCriterion("regis_date in", values, "regisDate");
            return (Criteria) this;
        }

        public Criteria andRegisDateNotIn(List<Date> values) {
            addCriterion("regis_date not in", values, "regisDate");
            return (Criteria) this;
        }

        public Criteria andRegisDateBetween(Date value1, Date value2) {
            addCriterion("regis_date between", value1, value2, "regisDate");
            return (Criteria) this;
        }

        public Criteria andRegisDateNotBetween(Date value1, Date value2) {
            addCriterion("regis_date not between", value1, value2, "regisDate");
            return (Criteria) this;
        }

        public Criteria andRegisFounderIsNull() {
            addCriterion("regis_founder is null");
            return (Criteria) this;
        }

        public Criteria andRegisFounderIsNotNull() {
            addCriterion("regis_founder is not null");
            return (Criteria) this;
        }

        public Criteria andRegisFounderEqualTo(String value) {
            addCriterion("regis_founder =", value, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderNotEqualTo(String value) {
            addCriterion("regis_founder <>", value, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderGreaterThan(String value) {
            addCriterion("regis_founder >", value, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderGreaterThanOrEqualTo(String value) {
            addCriterion("regis_founder >=", value, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderLessThan(String value) {
            addCriterion("regis_founder <", value, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderLessThanOrEqualTo(String value) {
            addCriterion("regis_founder <=", value, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderLike(String value) {
            addCriterion("regis_founder like", value, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderNotLike(String value) {
            addCriterion("regis_founder not like", value, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderIn(List<String> values) {
            addCriterion("regis_founder in", values, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderNotIn(List<String> values) {
            addCriterion("regis_founder not in", values, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderBetween(String value1, String value2) {
            addCriterion("regis_founder between", value1, value2, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisFounderNotBetween(String value1, String value2) {
            addCriterion("regis_founder not between", value1, value2, "regisFounder");
            return (Criteria) this;
        }

        public Criteria andRegisStateIsNull() {
            addCriterion("regis_state is null");
            return (Criteria) this;
        }

        public Criteria andRegisStateIsNotNull() {
            addCriterion("regis_state is not null");
            return (Criteria) this;
        }

        public Criteria andRegisStateEqualTo(String value) {
            addCriterion("regis_state =", value, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateNotEqualTo(String value) {
            addCriterion("regis_state <>", value, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateGreaterThan(String value) {
            addCriterion("regis_state >", value, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateGreaterThanOrEqualTo(String value) {
            addCriterion("regis_state >=", value, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateLessThan(String value) {
            addCriterion("regis_state <", value, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateLessThanOrEqualTo(String value) {
            addCriterion("regis_state <=", value, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateLike(String value) {
            addCriterion("regis_state like", value, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateNotLike(String value) {
            addCriterion("regis_state not like", value, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateIn(List<String> values) {
            addCriterion("regis_state in", values, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateNotIn(List<String> values) {
            addCriterion("regis_state not in", values, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateBetween(String value1, String value2) {
            addCriterion("regis_state between", value1, value2, "regisState");
            return (Criteria) this;
        }

        public Criteria andRegisStateNotBetween(String value1, String value2) {
            addCriterion("regis_state not between", value1, value2, "regisState");
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