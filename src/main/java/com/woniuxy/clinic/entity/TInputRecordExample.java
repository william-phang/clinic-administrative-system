package com.woniuxy.clinic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TInputRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInputRecordExample() {
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

        public Criteria andInputIdIsNull() {
            addCriterion("input_id is null");
            return (Criteria) this;
        }

        public Criteria andInputIdIsNotNull() {
            addCriterion("input_id is not null");
            return (Criteria) this;
        }

        public Criteria andInputIdEqualTo(Integer value) {
            addCriterion("input_id =", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdNotEqualTo(Integer value) {
            addCriterion("input_id <>", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdGreaterThan(Integer value) {
            addCriterion("input_id >", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("input_id >=", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdLessThan(Integer value) {
            addCriterion("input_id <", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdLessThanOrEqualTo(Integer value) {
            addCriterion("input_id <=", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdIn(List<Integer> values) {
            addCriterion("input_id in", values, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdNotIn(List<Integer> values) {
            addCriterion("input_id not in", values, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdBetween(Integer value1, Integer value2) {
            addCriterion("input_id between", value1, value2, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdNotBetween(Integer value1, Integer value2) {
            addCriterion("input_id not between", value1, value2, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputSnIsNull() {
            addCriterion("input_sn is null");
            return (Criteria) this;
        }

        public Criteria andInputSnIsNotNull() {
            addCriterion("input_sn is not null");
            return (Criteria) this;
        }

        public Criteria andInputSnEqualTo(String value) {
            addCriterion("input_sn =", value, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnNotEqualTo(String value) {
            addCriterion("input_sn <>", value, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnGreaterThan(String value) {
            addCriterion("input_sn >", value, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnGreaterThanOrEqualTo(String value) {
            addCriterion("input_sn >=", value, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnLessThan(String value) {
            addCriterion("input_sn <", value, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnLessThanOrEqualTo(String value) {
            addCriterion("input_sn <=", value, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnLike(String value) {
            addCriterion("input_sn like", value, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnNotLike(String value) {
            addCriterion("input_sn not like", value, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnIn(List<String> values) {
            addCriterion("input_sn in", values, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnNotIn(List<String> values) {
            addCriterion("input_sn not in", values, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnBetween(String value1, String value2) {
            addCriterion("input_sn between", value1, value2, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputSnNotBetween(String value1, String value2) {
            addCriterion("input_sn not between", value1, value2, "inputSn");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("input_date is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("input_date is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(Date value) {
            addCriterion("input_date =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(Date value) {
            addCriterion("input_date <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(Date value) {
            addCriterion("input_date >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(Date value) {
            addCriterion("input_date >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(Date value) {
            addCriterion("input_date <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(Date value) {
            addCriterion("input_date <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<Date> values) {
            addCriterion("input_date in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<Date> values) {
            addCriterion("input_date not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(Date value1, Date value2) {
            addCriterion("input_date between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(Date value1, Date value2) {
            addCriterion("input_date not between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputPersonIsNull() {
            addCriterion("input_person is null");
            return (Criteria) this;
        }

        public Criteria andInputPersonIsNotNull() {
            addCriterion("input_person is not null");
            return (Criteria) this;
        }

        public Criteria andInputPersonEqualTo(String value) {
            addCriterion("input_person =", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonNotEqualTo(String value) {
            addCriterion("input_person <>", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonGreaterThan(String value) {
            addCriterion("input_person >", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonGreaterThanOrEqualTo(String value) {
            addCriterion("input_person >=", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonLessThan(String value) {
            addCriterion("input_person <", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonLessThanOrEqualTo(String value) {
            addCriterion("input_person <=", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonLike(String value) {
            addCriterion("input_person like", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonNotLike(String value) {
            addCriterion("input_person not like", value, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonIn(List<String> values) {
            addCriterion("input_person in", values, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonNotIn(List<String> values) {
            addCriterion("input_person not in", values, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonBetween(String value1, String value2) {
            addCriterion("input_person between", value1, value2, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputPersonNotBetween(String value1, String value2) {
            addCriterion("input_person not between", value1, value2, "inputPerson");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNull() {
            addCriterion("input_type is null");
            return (Criteria) this;
        }

        public Criteria andInputTypeIsNotNull() {
            addCriterion("input_type is not null");
            return (Criteria) this;
        }

        public Criteria andInputTypeEqualTo(String value) {
            addCriterion("input_type =", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotEqualTo(String value) {
            addCriterion("input_type <>", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThan(String value) {
            addCriterion("input_type >", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeGreaterThanOrEqualTo(String value) {
            addCriterion("input_type >=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThan(String value) {
            addCriterion("input_type <", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLessThanOrEqualTo(String value) {
            addCriterion("input_type <=", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeLike(String value) {
            addCriterion("input_type like", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotLike(String value) {
            addCriterion("input_type not like", value, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeIn(List<String> values) {
            addCriterion("input_type in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotIn(List<String> values) {
            addCriterion("input_type not in", values, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeBetween(String value1, String value2) {
            addCriterion("input_type between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andInputTypeNotBetween(String value1, String value2) {
            addCriterion("input_type not between", value1, value2, "inputType");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andTabulationDateIsNull() {
            addCriterion("tabulation_date is null");
            return (Criteria) this;
        }

        public Criteria andTabulationDateIsNotNull() {
            addCriterion("tabulation_date is not null");
            return (Criteria) this;
        }

        public Criteria andTabulationDateEqualTo(Date value) {
            addCriterion("tabulation_date =", value, "tabulationDate");
            return (Criteria) this;
        }

        public Criteria andTabulationDateNotEqualTo(Date value) {
            addCriterion("tabulation_date <>", value, "tabulationDate");
            return (Criteria) this;
        }

        public Criteria andTabulationDateGreaterThan(Date value) {
            addCriterion("tabulation_date >", value, "tabulationDate");
            return (Criteria) this;
        }

        public Criteria andTabulationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tabulation_date >=", value, "tabulationDate");
            return (Criteria) this;
        }

        public Criteria andTabulationDateLessThan(Date value) {
            addCriterion("tabulation_date <", value, "tabulationDate");
            return (Criteria) this;
        }

        public Criteria andTabulationDateLessThanOrEqualTo(Date value) {
            addCriterion("tabulation_date <=", value, "tabulationDate");
            return (Criteria) this;
        }

        public Criteria andTabulationDateIn(List<Date> values) {
            addCriterion("tabulation_date in", values, "tabulationDate");
            return (Criteria) this;
        }

        public Criteria andTabulationDateNotIn(List<Date> values) {
            addCriterion("tabulation_date not in", values, "tabulationDate");
            return (Criteria) this;
        }

        public Criteria andTabulationDateBetween(Date value1, Date value2) {
            addCriterion("tabulation_date between", value1, value2, "tabulationDate");
            return (Criteria) this;
        }

        public Criteria andTabulationDateNotBetween(Date value1, Date value2) {
            addCriterion("tabulation_date not between", value1, value2, "tabulationDate");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonIsNull() {
            addCriterion("tabulation_person is null");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonIsNotNull() {
            addCriterion("tabulation_person is not null");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonEqualTo(String value) {
            addCriterion("tabulation_person =", value, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonNotEqualTo(String value) {
            addCriterion("tabulation_person <>", value, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonGreaterThan(String value) {
            addCriterion("tabulation_person >", value, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonGreaterThanOrEqualTo(String value) {
            addCriterion("tabulation_person >=", value, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonLessThan(String value) {
            addCriterion("tabulation_person <", value, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonLessThanOrEqualTo(String value) {
            addCriterion("tabulation_person <=", value, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonLike(String value) {
            addCriterion("tabulation_person like", value, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonNotLike(String value) {
            addCriterion("tabulation_person not like", value, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonIn(List<String> values) {
            addCriterion("tabulation_person in", values, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonNotIn(List<String> values) {
            addCriterion("tabulation_person not in", values, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonBetween(String value1, String value2) {
            addCriterion("tabulation_person between", value1, value2, "tabulationPerson");
            return (Criteria) this;
        }

        public Criteria andTabulationPersonNotBetween(String value1, String value2) {
            addCriterion("tabulation_person not between", value1, value2, "tabulationPerson");
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