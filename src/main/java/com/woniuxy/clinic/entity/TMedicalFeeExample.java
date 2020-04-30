
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

        public Criteria andMedical_idIsNull() {
            addCriterion("medical_id is null");
            return (Criteria) this;
        }

        public Criteria andMedical_idIsNotNull() {
            addCriterion("medical_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedical_idEqualTo(Integer value) {
            addCriterion("medical_id =", value, "medical_id");
            return (Criteria) this;
        }

        public Criteria andMedical_idNotEqualTo(Integer value) {
            addCriterion("medical_id <>", value, "medical_id");
            return (Criteria) this;
        }

        public Criteria andMedical_idGreaterThan(Integer value) {
            addCriterion("medical_id >", value, "medical_id");
            return (Criteria) this;
        }

        public Criteria andMedical_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("medical_id >=", value, "medical_id");
            return (Criteria) this;
        }

        public Criteria andMedical_idLessThan(Integer value) {
            addCriterion("medical_id <", value, "medical_id");
            return (Criteria) this;
        }

        public Criteria andMedical_idLessThanOrEqualTo(Integer value) {
            addCriterion("medical_id <=", value, "medical_id");
            return (Criteria) this;
        }

        public Criteria andMedical_idIn(List<Integer> values) {
            addCriterion("medical_id in", values, "medical_id");
            return (Criteria) this;
        }

        public Criteria andMedical_idNotIn(List<Integer> values) {
            addCriterion("medical_id not in", values, "medical_id");
            return (Criteria) this;
        }

        public Criteria andMedical_idBetween(Integer value1, Integer value2) {
            addCriterion("medical_id between", value1, value2, "medical_id");
            return (Criteria) this;
        }

        public Criteria andMedical_idNotBetween(Integer value1, Integer value2) {
            addCriterion("medical_id not between", value1, value2, "medical_id");
            return (Criteria) this;
        }

        public Criteria andMedical_nameIsNull() {
            addCriterion("medical_name is null");
            return (Criteria) this;
        }

        public Criteria andMedical_nameIsNotNull() {
            addCriterion("medical_name is not null");
            return (Criteria) this;
        }

        public Criteria andMedical_nameEqualTo(String value) {
            addCriterion("medical_name =", value, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameNotEqualTo(String value) {
            addCriterion("medical_name <>", value, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameGreaterThan(String value) {
            addCriterion("medical_name >", value, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameGreaterThanOrEqualTo(String value) {
            addCriterion("medical_name >=", value, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameLessThan(String value) {
            addCriterion("medical_name <", value, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameLessThanOrEqualTo(String value) {
            addCriterion("medical_name <=", value, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameLike(String value) {
            addCriterion("medical_name like", value, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameNotLike(String value) {
            addCriterion("medical_name not like", value, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameIn(List<String> values) {
            addCriterion("medical_name in", values, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameNotIn(List<String> values) {
            addCriterion("medical_name not in", values, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameBetween(String value1, String value2) {
            addCriterion("medical_name between", value1, value2, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_nameNotBetween(String value1, String value2) {
            addCriterion("medical_name not between", value1, value2, "medical_name");
            return (Criteria) this;
        }

        public Criteria andMedical_feeIsNull() {
            addCriterion("medical_fee is null");
            return (Criteria) this;
        }

        public Criteria andMedical_feeIsNotNull() {
            addCriterion("medical_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMedical_feeEqualTo(BigDecimal value) {
            addCriterion("medical_fee =", value, "medical_fee");
            return (Criteria) this;
        }

        public Criteria andMedical_feeNotEqualTo(BigDecimal value) {
            addCriterion("medical_fee <>", value, "medical_fee");
            return (Criteria) this;
        }

        public Criteria andMedical_feeGreaterThan(BigDecimal value) {
            addCriterion("medical_fee >", value, "medical_fee");
            return (Criteria) this;
        }

        public Criteria andMedical_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_fee >=", value, "medical_fee");
            return (Criteria) this;
        }

        public Criteria andMedical_feeLessThan(BigDecimal value) {
            addCriterion("medical_fee <", value, "medical_fee");
            return (Criteria) this;
        }

        public Criteria andMedical_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_fee <=", value, "medical_fee");
            return (Criteria) this;
        }

        public Criteria andMedical_feeIn(List<BigDecimal> values) {
            addCriterion("medical_fee in", values, "medical_fee");
            return (Criteria) this;
        }

        public Criteria andMedical_feeNotIn(List<BigDecimal> values) {
            addCriterion("medical_fee not in", values, "medical_fee");
            return (Criteria) this;
        }

        public Criteria andMedical_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_fee between", value1, value2, "medical_fee");
            return (Criteria) this;
        }

        public Criteria andMedical_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_fee not between", value1, value2, "medical_fee");
            return (Criteria) this;
        }

        public Criteria andMedical_costIsNull() {
            addCriterion("medical_cost is null");
            return (Criteria) this;
        }

        public Criteria andMedical_costIsNotNull() {
            addCriterion("medical_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMedical_costEqualTo(BigDecimal value) {
            addCriterion("medical_cost =", value, "medical_cost");
            return (Criteria) this;
        }

        public Criteria andMedical_costNotEqualTo(BigDecimal value) {
            addCriterion("medical_cost <>", value, "medical_cost");
            return (Criteria) this;
        }

        public Criteria andMedical_costGreaterThan(BigDecimal value) {
            addCriterion("medical_cost >", value, "medical_cost");
            return (Criteria) this;
        }

        public Criteria andMedical_costGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_cost >=", value, "medical_cost");
            return (Criteria) this;
        }

        public Criteria andMedical_costLessThan(BigDecimal value) {
            addCriterion("medical_cost <", value, "medical_cost");
            return (Criteria) this;
        }

        public Criteria andMedical_costLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_cost <=", value, "medical_cost");
            return (Criteria) this;
        }

        public Criteria andMedical_costIn(List<BigDecimal> values) {
            addCriterion("medical_cost in", values, "medical_cost");
            return (Criteria) this;
        }

        public Criteria andMedical_costNotIn(List<BigDecimal> values) {
            addCriterion("medical_cost not in", values, "medical_cost");
            return (Criteria) this;
        }

        public Criteria andMedical_costBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_cost between", value1, value2, "medical_cost");
            return (Criteria) this;
        }

        public Criteria andMedical_costNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_cost not between", value1, value2, "medical_cost");
            return (Criteria) this;
        }

        public Criteria andMedical_dateIsNull() {
            addCriterion("medical_date is null");
            return (Criteria) this;
        }

        public Criteria andMedical_dateIsNotNull() {
            addCriterion("medical_date is not null");
            return (Criteria) this;
        }

        public Criteria andMedical_dateEqualTo(Date value) {
            addCriterion("medical_date =", value, "medical_date");
            return (Criteria) this;
        }

        public Criteria andMedical_dateNotEqualTo(Date value) {
            addCriterion("medical_date <>", value, "medical_date");
            return (Criteria) this;
        }

        public Criteria andMedical_dateGreaterThan(Date value) {
            addCriterion("medical_date >", value, "medical_date");
            return (Criteria) this;
        }

        public Criteria andMedical_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("medical_date >=", value, "medical_date");
            return (Criteria) this;
        }

        public Criteria andMedical_dateLessThan(Date value) {
            addCriterion("medical_date <", value, "medical_date");
            return (Criteria) this;
        }

        public Criteria andMedical_dateLessThanOrEqualTo(Date value) {
            addCriterion("medical_date <=", value, "medical_date");
            return (Criteria) this;
        }

        public Criteria andMedical_dateIn(List<Date> values) {
            addCriterion("medical_date in", values, "medical_date");
            return (Criteria) this;
        }

        public Criteria andMedical_dateNotIn(List<Date> values) {
            addCriterion("medical_date not in", values, "medical_date");
            return (Criteria) this;
        }

        public Criteria andMedical_dateBetween(Date value1, Date value2) {
            addCriterion("medical_date between", value1, value2, "medical_date");
            return (Criteria) this;
        }

        public Criteria andMedical_dateNotBetween(Date value1, Date value2) {
            addCriterion("medical_date not between", value1, value2, "medical_date");
            return (Criteria) this;
        }

        public Criteria andMedical_founderIsNull() {
            addCriterion("medical_founder is null");
            return (Criteria) this;
        }

        public Criteria andMedical_founderIsNotNull() {
            addCriterion("medical_founder is not null");
            return (Criteria) this;
        }

        public Criteria andMedical_founderEqualTo(String value) {
            addCriterion("medical_founder =", value, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderNotEqualTo(String value) {
            addCriterion("medical_founder <>", value, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderGreaterThan(String value) {
            addCriterion("medical_founder >", value, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderGreaterThanOrEqualTo(String value) {
            addCriterion("medical_founder >=", value, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderLessThan(String value) {
            addCriterion("medical_founder <", value, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderLessThanOrEqualTo(String value) {
            addCriterion("medical_founder <=", value, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderLike(String value) {
            addCriterion("medical_founder like", value, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderNotLike(String value) {
            addCriterion("medical_founder not like", value, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderIn(List<String> values) {
            addCriterion("medical_founder in", values, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderNotIn(List<String> values) {
            addCriterion("medical_founder not in", values, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderBetween(String value1, String value2) {
            addCriterion("medical_founder between", value1, value2, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_founderNotBetween(String value1, String value2) {
            addCriterion("medical_founder not between", value1, value2, "medical_founder");
            return (Criteria) this;
        }

        public Criteria andMedical_stateIsNull() {
            addCriterion("medical_state is null");
            return (Criteria) this;
        }

        public Criteria andMedical_stateIsNotNull() {
            addCriterion("medical_state is not null");
            return (Criteria) this;
        }

        public Criteria andMedical_stateEqualTo(String value) {
            addCriterion("medical_state =", value, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateNotEqualTo(String value) {
            addCriterion("medical_state <>", value, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateGreaterThan(String value) {
            addCriterion("medical_state >", value, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateGreaterThanOrEqualTo(String value) {
            addCriterion("medical_state >=", value, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateLessThan(String value) {
            addCriterion("medical_state <", value, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateLessThanOrEqualTo(String value) {
            addCriterion("medical_state <=", value, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateLike(String value) {
            addCriterion("medical_state like", value, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateNotLike(String value) {
            addCriterion("medical_state not like", value, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateIn(List<String> values) {
            addCriterion("medical_state in", values, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateNotIn(List<String> values) {
            addCriterion("medical_state not in", values, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateBetween(String value1, String value2) {
            addCriterion("medical_state between", value1, value2, "medical_state");
            return (Criteria) this;
        }

        public Criteria andMedical_stateNotBetween(String value1, String value2) {
            addCriterion("medical_state not between", value1, value2, "medical_state");
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