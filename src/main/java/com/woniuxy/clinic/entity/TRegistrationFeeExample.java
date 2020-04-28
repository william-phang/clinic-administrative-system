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

        public Criteria andRegis_idIsNull() {
            addCriterion("regis_id is null");
            return (Criteria) this;
        }

        public Criteria andRegis_idIsNotNull() {
            addCriterion("regis_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegis_idEqualTo(Integer value) {
            addCriterion("regis_id =", value, "regis_id");
            return (Criteria) this;
        }

        public Criteria andRegis_idNotEqualTo(Integer value) {
            addCriterion("regis_id <>", value, "regis_id");
            return (Criteria) this;
        }

        public Criteria andRegis_idGreaterThan(Integer value) {
            addCriterion("regis_id >", value, "regis_id");
            return (Criteria) this;
        }

        public Criteria andRegis_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("regis_id >=", value, "regis_id");
            return (Criteria) this;
        }

        public Criteria andRegis_idLessThan(Integer value) {
            addCriterion("regis_id <", value, "regis_id");
            return (Criteria) this;
        }

        public Criteria andRegis_idLessThanOrEqualTo(Integer value) {
            addCriterion("regis_id <=", value, "regis_id");
            return (Criteria) this;
        }

        public Criteria andRegis_idIn(List<Integer> values) {
            addCriterion("regis_id in", values, "regis_id");
            return (Criteria) this;
        }

        public Criteria andRegis_idNotIn(List<Integer> values) {
            addCriterion("regis_id not in", values, "regis_id");
            return (Criteria) this;
        }

        public Criteria andRegis_idBetween(Integer value1, Integer value2) {
            addCriterion("regis_id between", value1, value2, "regis_id");
            return (Criteria) this;
        }

        public Criteria andRegis_idNotBetween(Integer value1, Integer value2) {
            addCriterion("regis_id not between", value1, value2, "regis_id");
            return (Criteria) this;
        }

        public Criteria andRegis_nameIsNull() {
            addCriterion("regis_name is null");
            return (Criteria) this;
        }

        public Criteria andRegis_nameIsNotNull() {
            addCriterion("regis_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegis_nameEqualTo(String value) {
            addCriterion("regis_name =", value, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameNotEqualTo(String value) {
            addCriterion("regis_name <>", value, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameGreaterThan(String value) {
            addCriterion("regis_name >", value, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameGreaterThanOrEqualTo(String value) {
            addCriterion("regis_name >=", value, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameLessThan(String value) {
            addCriterion("regis_name <", value, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameLessThanOrEqualTo(String value) {
            addCriterion("regis_name <=", value, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameLike(String value) {
            addCriterion("regis_name like", value, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameNotLike(String value) {
            addCriterion("regis_name not like", value, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameIn(List<String> values) {
            addCriterion("regis_name in", values, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameNotIn(List<String> values) {
            addCriterion("regis_name not in", values, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameBetween(String value1, String value2) {
            addCriterion("regis_name between", value1, value2, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_nameNotBetween(String value1, String value2) {
            addCriterion("regis_name not between", value1, value2, "regis_name");
            return (Criteria) this;
        }

        public Criteria andRegis_feeIsNull() {
            addCriterion("regis_fee is null");
            return (Criteria) this;
        }

        public Criteria andRegis_feeIsNotNull() {
            addCriterion("regis_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRegis_feeEqualTo(BigDecimal value) {
            addCriterion("regis_fee =", value, "regis_fee");
            return (Criteria) this;
        }

        public Criteria andRegis_feeNotEqualTo(BigDecimal value) {
            addCriterion("regis_fee <>", value, "regis_fee");
            return (Criteria) this;
        }

        public Criteria andRegis_feeGreaterThan(BigDecimal value) {
            addCriterion("regis_fee >", value, "regis_fee");
            return (Criteria) this;
        }

        public Criteria andRegis_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("regis_fee >=", value, "regis_fee");
            return (Criteria) this;
        }

        public Criteria andRegis_feeLessThan(BigDecimal value) {
            addCriterion("regis_fee <", value, "regis_fee");
            return (Criteria) this;
        }

        public Criteria andRegis_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("regis_fee <=", value, "regis_fee");
            return (Criteria) this;
        }

        public Criteria andRegis_feeIn(List<BigDecimal> values) {
            addCriterion("regis_fee in", values, "regis_fee");
            return (Criteria) this;
        }

        public Criteria andRegis_feeNotIn(List<BigDecimal> values) {
            addCriterion("regis_fee not in", values, "regis_fee");
            return (Criteria) this;
        }

        public Criteria andRegis_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regis_fee between", value1, value2, "regis_fee");
            return (Criteria) this;
        }

        public Criteria andRegis_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regis_fee not between", value1, value2, "regis_fee");
            return (Criteria) this;
        }

        public Criteria andRegis_costIsNull() {
            addCriterion("regis_cost is null");
            return (Criteria) this;
        }

        public Criteria andRegis_costIsNotNull() {
            addCriterion("regis_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRegis_costEqualTo(BigDecimal value) {
            addCriterion("regis_cost =", value, "regis_cost");
            return (Criteria) this;
        }

        public Criteria andRegis_costNotEqualTo(BigDecimal value) {
            addCriterion("regis_cost <>", value, "regis_cost");
            return (Criteria) this;
        }

        public Criteria andRegis_costGreaterThan(BigDecimal value) {
            addCriterion("regis_cost >", value, "regis_cost");
            return (Criteria) this;
        }

        public Criteria andRegis_costGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("regis_cost >=", value, "regis_cost");
            return (Criteria) this;
        }

        public Criteria andRegis_costLessThan(BigDecimal value) {
            addCriterion("regis_cost <", value, "regis_cost");
            return (Criteria) this;
        }

        public Criteria andRegis_costLessThanOrEqualTo(BigDecimal value) {
            addCriterion("regis_cost <=", value, "regis_cost");
            return (Criteria) this;
        }

        public Criteria andRegis_costIn(List<BigDecimal> values) {
            addCriterion("regis_cost in", values, "regis_cost");
            return (Criteria) this;
        }

        public Criteria andRegis_costNotIn(List<BigDecimal> values) {
            addCriterion("regis_cost not in", values, "regis_cost");
            return (Criteria) this;
        }

        public Criteria andRegis_costBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regis_cost between", value1, value2, "regis_cost");
            return (Criteria) this;
        }

        public Criteria andRegis_costNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("regis_cost not between", value1, value2, "regis_cost");
            return (Criteria) this;
        }

        public Criteria andRegis_dateIsNull() {
            addCriterion("regis_date is null");
            return (Criteria) this;
        }

        public Criteria andRegis_dateIsNotNull() {
            addCriterion("regis_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegis_dateEqualTo(Date value) {
            addCriterion("regis_date =", value, "regis_date");
            return (Criteria) this;
        }

        public Criteria andRegis_dateNotEqualTo(Date value) {
            addCriterion("regis_date <>", value, "regis_date");
            return (Criteria) this;
        }

        public Criteria andRegis_dateGreaterThan(Date value) {
            addCriterion("regis_date >", value, "regis_date");
            return (Criteria) this;
        }

        public Criteria andRegis_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("regis_date >=", value, "regis_date");
            return (Criteria) this;
        }

        public Criteria andRegis_dateLessThan(Date value) {
            addCriterion("regis_date <", value, "regis_date");
            return (Criteria) this;
        }

        public Criteria andRegis_dateLessThanOrEqualTo(Date value) {
            addCriterion("regis_date <=", value, "regis_date");
            return (Criteria) this;
        }

        public Criteria andRegis_dateIn(List<Date> values) {
            addCriterion("regis_date in", values, "regis_date");
            return (Criteria) this;
        }

        public Criteria andRegis_dateNotIn(List<Date> values) {
            addCriterion("regis_date not in", values, "regis_date");
            return (Criteria) this;
        }

        public Criteria andRegis_dateBetween(Date value1, Date value2) {
            addCriterion("regis_date between", value1, value2, "regis_date");
            return (Criteria) this;
        }

        public Criteria andRegis_dateNotBetween(Date value1, Date value2) {
            addCriterion("regis_date not between", value1, value2, "regis_date");
            return (Criteria) this;
        }

        public Criteria andRegis_founderIsNull() {
            addCriterion("regis_founder is null");
            return (Criteria) this;
        }

        public Criteria andRegis_founderIsNotNull() {
            addCriterion("regis_founder is not null");
            return (Criteria) this;
        }

        public Criteria andRegis_founderEqualTo(String value) {
            addCriterion("regis_founder =", value, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderNotEqualTo(String value) {
            addCriterion("regis_founder <>", value, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderGreaterThan(String value) {
            addCriterion("regis_founder >", value, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderGreaterThanOrEqualTo(String value) {
            addCriterion("regis_founder >=", value, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderLessThan(String value) {
            addCriterion("regis_founder <", value, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderLessThanOrEqualTo(String value) {
            addCriterion("regis_founder <=", value, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderLike(String value) {
            addCriterion("regis_founder like", value, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderNotLike(String value) {
            addCriterion("regis_founder not like", value, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderIn(List<String> values) {
            addCriterion("regis_founder in", values, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderNotIn(List<String> values) {
            addCriterion("regis_founder not in", values, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderBetween(String value1, String value2) {
            addCriterion("regis_founder between", value1, value2, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_founderNotBetween(String value1, String value2) {
            addCriterion("regis_founder not between", value1, value2, "regis_founder");
            return (Criteria) this;
        }

        public Criteria andRegis_stateIsNull() {
            addCriterion("regis_state is null");
            return (Criteria) this;
        }

        public Criteria andRegis_stateIsNotNull() {
            addCriterion("regis_state is not null");
            return (Criteria) this;
        }

        public Criteria andRegis_stateEqualTo(String value) {
            addCriterion("regis_state =", value, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateNotEqualTo(String value) {
            addCriterion("regis_state <>", value, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateGreaterThan(String value) {
            addCriterion("regis_state >", value, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateGreaterThanOrEqualTo(String value) {
            addCriterion("regis_state >=", value, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateLessThan(String value) {
            addCriterion("regis_state <", value, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateLessThanOrEqualTo(String value) {
            addCriterion("regis_state <=", value, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateLike(String value) {
            addCriterion("regis_state like", value, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateNotLike(String value) {
            addCriterion("regis_state not like", value, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateIn(List<String> values) {
            addCriterion("regis_state in", values, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateNotIn(List<String> values) {
            addCriterion("regis_state not in", values, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateBetween(String value1, String value2) {
            addCriterion("regis_state between", value1, value2, "regis_state");
            return (Criteria) this;
        }

        public Criteria andRegis_stateNotBetween(String value1, String value2) {
            addCriterion("regis_state not between", value1, value2, "regis_state");
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