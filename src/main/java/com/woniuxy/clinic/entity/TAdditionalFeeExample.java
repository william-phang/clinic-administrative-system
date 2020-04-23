package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAdditionalFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAdditionalFeeExample() {
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

        public Criteria andAdditionalIdIsNull() {
            addCriterion("additional_id is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdIsNotNull() {
            addCriterion("additional_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdEqualTo(Integer value) {
            addCriterion("additional_id =", value, "additionalId");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdNotEqualTo(Integer value) {
            addCriterion("additional_id <>", value, "additionalId");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdGreaterThan(Integer value) {
            addCriterion("additional_id >", value, "additionalId");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("additional_id >=", value, "additionalId");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdLessThan(Integer value) {
            addCriterion("additional_id <", value, "additionalId");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdLessThanOrEqualTo(Integer value) {
            addCriterion("additional_id <=", value, "additionalId");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdIn(List<Integer> values) {
            addCriterion("additional_id in", values, "additionalId");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdNotIn(List<Integer> values) {
            addCriterion("additional_id not in", values, "additionalId");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdBetween(Integer value1, Integer value2) {
            addCriterion("additional_id between", value1, value2, "additionalId");
            return (Criteria) this;
        }

        public Criteria andAdditionalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("additional_id not between", value1, value2, "additionalId");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameIsNull() {
            addCriterion("additional_name is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameIsNotNull() {
            addCriterion("additional_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameEqualTo(String value) {
            addCriterion("additional_name =", value, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameNotEqualTo(String value) {
            addCriterion("additional_name <>", value, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameGreaterThan(String value) {
            addCriterion("additional_name >", value, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameGreaterThanOrEqualTo(String value) {
            addCriterion("additional_name >=", value, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameLessThan(String value) {
            addCriterion("additional_name <", value, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameLessThanOrEqualTo(String value) {
            addCriterion("additional_name <=", value, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameLike(String value) {
            addCriterion("additional_name like", value, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameNotLike(String value) {
            addCriterion("additional_name not like", value, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameIn(List<String> values) {
            addCriterion("additional_name in", values, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameNotIn(List<String> values) {
            addCriterion("additional_name not in", values, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameBetween(String value1, String value2) {
            addCriterion("additional_name between", value1, value2, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalNameNotBetween(String value1, String value2) {
            addCriterion("additional_name not between", value1, value2, "additionalName");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeIsNull() {
            addCriterion("additional_fee is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeIsNotNull() {
            addCriterion("additional_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeEqualTo(BigDecimal value) {
            addCriterion("additional_fee =", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeNotEqualTo(BigDecimal value) {
            addCriterion("additional_fee <>", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeGreaterThan(BigDecimal value) {
            addCriterion("additional_fee >", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_fee >=", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeLessThan(BigDecimal value) {
            addCriterion("additional_fee <", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_fee <=", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeIn(List<BigDecimal> values) {
            addCriterion("additional_fee in", values, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeNotIn(List<BigDecimal> values) {
            addCriterion("additional_fee not in", values, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_fee between", value1, value2, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_fee not between", value1, value2, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostIsNull() {
            addCriterion("additional_cost is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostIsNotNull() {
            addCriterion("additional_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostEqualTo(BigDecimal value) {
            addCriterion("additional_cost =", value, "additionalCost");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostNotEqualTo(BigDecimal value) {
            addCriterion("additional_cost <>", value, "additionalCost");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostGreaterThan(BigDecimal value) {
            addCriterion("additional_cost >", value, "additionalCost");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_cost >=", value, "additionalCost");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostLessThan(BigDecimal value) {
            addCriterion("additional_cost <", value, "additionalCost");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_cost <=", value, "additionalCost");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostIn(List<BigDecimal> values) {
            addCriterion("additional_cost in", values, "additionalCost");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostNotIn(List<BigDecimal> values) {
            addCriterion("additional_cost not in", values, "additionalCost");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_cost between", value1, value2, "additionalCost");
            return (Criteria) this;
        }

        public Criteria andAdditionalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_cost not between", value1, value2, "additionalCost");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateIsNull() {
            addCriterion("additional_date is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateIsNotNull() {
            addCriterion("additional_date is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateEqualTo(Date value) {
            addCriterion("additional_date =", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateNotEqualTo(Date value) {
            addCriterion("additional_date <>", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateGreaterThan(Date value) {
            addCriterion("additional_date >", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("additional_date >=", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateLessThan(Date value) {
            addCriterion("additional_date <", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateLessThanOrEqualTo(Date value) {
            addCriterion("additional_date <=", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateIn(List<Date> values) {
            addCriterion("additional_date in", values, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateNotIn(List<Date> values) {
            addCriterion("additional_date not in", values, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateBetween(Date value1, Date value2) {
            addCriterion("additional_date between", value1, value2, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateNotBetween(Date value1, Date value2) {
            addCriterion("additional_date not between", value1, value2, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderIsNull() {
            addCriterion("additional_founder is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderIsNotNull() {
            addCriterion("additional_founder is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderEqualTo(String value) {
            addCriterion("additional_founder =", value, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderNotEqualTo(String value) {
            addCriterion("additional_founder <>", value, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderGreaterThan(String value) {
            addCriterion("additional_founder >", value, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderGreaterThanOrEqualTo(String value) {
            addCriterion("additional_founder >=", value, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderLessThan(String value) {
            addCriterion("additional_founder <", value, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderLessThanOrEqualTo(String value) {
            addCriterion("additional_founder <=", value, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderLike(String value) {
            addCriterion("additional_founder like", value, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderNotLike(String value) {
            addCriterion("additional_founder not like", value, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderIn(List<String> values) {
            addCriterion("additional_founder in", values, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderNotIn(List<String> values) {
            addCriterion("additional_founder not in", values, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderBetween(String value1, String value2) {
            addCriterion("additional_founder between", value1, value2, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalFounderNotBetween(String value1, String value2) {
            addCriterion("additional_founder not between", value1, value2, "additionalFounder");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateIsNull() {
            addCriterion("additional_state is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateIsNotNull() {
            addCriterion("additional_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateEqualTo(String value) {
            addCriterion("additional_state =", value, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateNotEqualTo(String value) {
            addCriterion("additional_state <>", value, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateGreaterThan(String value) {
            addCriterion("additional_state >", value, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateGreaterThanOrEqualTo(String value) {
            addCriterion("additional_state >=", value, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateLessThan(String value) {
            addCriterion("additional_state <", value, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateLessThanOrEqualTo(String value) {
            addCriterion("additional_state <=", value, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateLike(String value) {
            addCriterion("additional_state like", value, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateNotLike(String value) {
            addCriterion("additional_state not like", value, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateIn(List<String> values) {
            addCriterion("additional_state in", values, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateNotIn(List<String> values) {
            addCriterion("additional_state not in", values, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateBetween(String value1, String value2) {
            addCriterion("additional_state between", value1, value2, "additionalState");
            return (Criteria) this;
        }

        public Criteria andAdditionalStateNotBetween(String value1, String value2) {
            addCriterion("additional_state not between", value1, value2, "additionalState");
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