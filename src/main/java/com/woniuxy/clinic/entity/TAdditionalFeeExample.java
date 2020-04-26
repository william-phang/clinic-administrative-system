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

        public Criteria andAdditional_idIsNull() {
            addCriterion("additional_id is null");
            return (Criteria) this;
        }

        public Criteria andAdditional_idIsNotNull() {
            addCriterion("additional_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdditional_idEqualTo(Integer value) {
            addCriterion("additional_id =", value, "additional_id");
            return (Criteria) this;
        }

        public Criteria andAdditional_idNotEqualTo(Integer value) {
            addCriterion("additional_id <>", value, "additional_id");
            return (Criteria) this;
        }

        public Criteria andAdditional_idGreaterThan(Integer value) {
            addCriterion("additional_id >", value, "additional_id");
            return (Criteria) this;
        }

        public Criteria andAdditional_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("additional_id >=", value, "additional_id");
            return (Criteria) this;
        }

        public Criteria andAdditional_idLessThan(Integer value) {
            addCriterion("additional_id <", value, "additional_id");
            return (Criteria) this;
        }

        public Criteria andAdditional_idLessThanOrEqualTo(Integer value) {
            addCriterion("additional_id <=", value, "additional_id");
            return (Criteria) this;
        }

        public Criteria andAdditional_idIn(List<Integer> values) {
            addCriterion("additional_id in", values, "additional_id");
            return (Criteria) this;
        }

        public Criteria andAdditional_idNotIn(List<Integer> values) {
            addCriterion("additional_id not in", values, "additional_id");
            return (Criteria) this;
        }

        public Criteria andAdditional_idBetween(Integer value1, Integer value2) {
            addCriterion("additional_id between", value1, value2, "additional_id");
            return (Criteria) this;
        }

        public Criteria andAdditional_idNotBetween(Integer value1, Integer value2) {
            addCriterion("additional_id not between", value1, value2, "additional_id");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameIsNull() {
            addCriterion("additional_name is null");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameIsNotNull() {
            addCriterion("additional_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameEqualTo(String value) {
            addCriterion("additional_name =", value, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameNotEqualTo(String value) {
            addCriterion("additional_name <>", value, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameGreaterThan(String value) {
            addCriterion("additional_name >", value, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameGreaterThanOrEqualTo(String value) {
            addCriterion("additional_name >=", value, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameLessThan(String value) {
            addCriterion("additional_name <", value, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameLessThanOrEqualTo(String value) {
            addCriterion("additional_name <=", value, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameLike(String value) {
            addCriterion("additional_name like", value, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameNotLike(String value) {
            addCriterion("additional_name not like", value, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameIn(List<String> values) {
            addCriterion("additional_name in", values, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameNotIn(List<String> values) {
            addCriterion("additional_name not in", values, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameBetween(String value1, String value2) {
            addCriterion("additional_name between", value1, value2, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_nameNotBetween(String value1, String value2) {
            addCriterion("additional_name not between", value1, value2, "additional_name");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeIsNull() {
            addCriterion("additional_fee is null");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeIsNotNull() {
            addCriterion("additional_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeEqualTo(BigDecimal value) {
            addCriterion("additional_fee =", value, "additional_fee");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeNotEqualTo(BigDecimal value) {
            addCriterion("additional_fee <>", value, "additional_fee");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeGreaterThan(BigDecimal value) {
            addCriterion("additional_fee >", value, "additional_fee");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_fee >=", value, "additional_fee");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeLessThan(BigDecimal value) {
            addCriterion("additional_fee <", value, "additional_fee");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_fee <=", value, "additional_fee");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeIn(List<BigDecimal> values) {
            addCriterion("additional_fee in", values, "additional_fee");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeNotIn(List<BigDecimal> values) {
            addCriterion("additional_fee not in", values, "additional_fee");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_fee between", value1, value2, "additional_fee");
            return (Criteria) this;
        }

        public Criteria andAdditional_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_fee not between", value1, value2, "additional_fee");
            return (Criteria) this;
        }

        public Criteria andAdditional_costIsNull() {
            addCriterion("additional_cost is null");
            return (Criteria) this;
        }

        public Criteria andAdditional_costIsNotNull() {
            addCriterion("additional_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAdditional_costEqualTo(BigDecimal value) {
            addCriterion("additional_cost =", value, "additional_cost");
            return (Criteria) this;
        }

        public Criteria andAdditional_costNotEqualTo(BigDecimal value) {
            addCriterion("additional_cost <>", value, "additional_cost");
            return (Criteria) this;
        }

        public Criteria andAdditional_costGreaterThan(BigDecimal value) {
            addCriterion("additional_cost >", value, "additional_cost");
            return (Criteria) this;
        }

        public Criteria andAdditional_costGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_cost >=", value, "additional_cost");
            return (Criteria) this;
        }

        public Criteria andAdditional_costLessThan(BigDecimal value) {
            addCriterion("additional_cost <", value, "additional_cost");
            return (Criteria) this;
        }

        public Criteria andAdditional_costLessThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_cost <=", value, "additional_cost");
            return (Criteria) this;
        }

        public Criteria andAdditional_costIn(List<BigDecimal> values) {
            addCriterion("additional_cost in", values, "additional_cost");
            return (Criteria) this;
        }

        public Criteria andAdditional_costNotIn(List<BigDecimal> values) {
            addCriterion("additional_cost not in", values, "additional_cost");
            return (Criteria) this;
        }

        public Criteria andAdditional_costBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_cost between", value1, value2, "additional_cost");
            return (Criteria) this;
        }

        public Criteria andAdditional_costNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_cost not between", value1, value2, "additional_cost");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateIsNull() {
            addCriterion("additional_date is null");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateIsNotNull() {
            addCriterion("additional_date is not null");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateEqualTo(Date value) {
            addCriterion("additional_date =", value, "additional_date");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateNotEqualTo(Date value) {
            addCriterion("additional_date <>", value, "additional_date");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateGreaterThan(Date value) {
            addCriterion("additional_date >", value, "additional_date");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("additional_date >=", value, "additional_date");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateLessThan(Date value) {
            addCriterion("additional_date <", value, "additional_date");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateLessThanOrEqualTo(Date value) {
            addCriterion("additional_date <=", value, "additional_date");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateIn(List<Date> values) {
            addCriterion("additional_date in", values, "additional_date");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateNotIn(List<Date> values) {
            addCriterion("additional_date not in", values, "additional_date");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateBetween(Date value1, Date value2) {
            addCriterion("additional_date between", value1, value2, "additional_date");
            return (Criteria) this;
        }

        public Criteria andAdditional_dateNotBetween(Date value1, Date value2) {
            addCriterion("additional_date not between", value1, value2, "additional_date");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderIsNull() {
            addCriterion("additional_founder is null");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderIsNotNull() {
            addCriterion("additional_founder is not null");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderEqualTo(String value) {
            addCriterion("additional_founder =", value, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderNotEqualTo(String value) {
            addCriterion("additional_founder <>", value, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderGreaterThan(String value) {
            addCriterion("additional_founder >", value, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderGreaterThanOrEqualTo(String value) {
            addCriterion("additional_founder >=", value, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderLessThan(String value) {
            addCriterion("additional_founder <", value, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderLessThanOrEqualTo(String value) {
            addCriterion("additional_founder <=", value, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderLike(String value) {
            addCriterion("additional_founder like", value, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderNotLike(String value) {
            addCriterion("additional_founder not like", value, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderIn(List<String> values) {
            addCriterion("additional_founder in", values, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderNotIn(List<String> values) {
            addCriterion("additional_founder not in", values, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderBetween(String value1, String value2) {
            addCriterion("additional_founder between", value1, value2, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_founderNotBetween(String value1, String value2) {
            addCriterion("additional_founder not between", value1, value2, "additional_founder");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateIsNull() {
            addCriterion("additional_state is null");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateIsNotNull() {
            addCriterion("additional_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateEqualTo(String value) {
            addCriterion("additional_state =", value, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateNotEqualTo(String value) {
            addCriterion("additional_state <>", value, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateGreaterThan(String value) {
            addCriterion("additional_state >", value, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateGreaterThanOrEqualTo(String value) {
            addCriterion("additional_state >=", value, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateLessThan(String value) {
            addCriterion("additional_state <", value, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateLessThanOrEqualTo(String value) {
            addCriterion("additional_state <=", value, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateLike(String value) {
            addCriterion("additional_state like", value, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateNotLike(String value) {
            addCriterion("additional_state not like", value, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateIn(List<String> values) {
            addCriterion("additional_state in", values, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateNotIn(List<String> values) {
            addCriterion("additional_state not in", values, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateBetween(String value1, String value2) {
            addCriterion("additional_state between", value1, value2, "additional_state");
            return (Criteria) this;
        }

        public Criteria andAdditional_stateNotBetween(String value1, String value2) {
            addCriterion("additional_state not between", value1, value2, "additional_state");
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