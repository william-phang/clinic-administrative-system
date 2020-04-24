package com.woniuxy.clinic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOutputRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOutputRecordExample() {
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

        public Criteria andOutputIdIsNull() {
            addCriterion("output_id is null");
            return (Criteria) this;
        }

        public Criteria andOutputIdIsNotNull() {
            addCriterion("output_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutputIdEqualTo(Integer value) {
            addCriterion("output_id =", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdNotEqualTo(Integer value) {
            addCriterion("output_id <>", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdGreaterThan(Integer value) {
            addCriterion("output_id >", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("output_id >=", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdLessThan(Integer value) {
            addCriterion("output_id <", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdLessThanOrEqualTo(Integer value) {
            addCriterion("output_id <=", value, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdIn(List<Integer> values) {
            addCriterion("output_id in", values, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdNotIn(List<Integer> values) {
            addCriterion("output_id not in", values, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdBetween(Integer value1, Integer value2) {
            addCriterion("output_id between", value1, value2, "outputId");
            return (Criteria) this;
        }

        public Criteria andOutputIdNotBetween(Integer value1, Integer value2) {
            addCriterion("output_id not between", value1, value2, "outputId");
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

        public Criteria andOutputDateIsNull() {
            addCriterion("output_date is null");
            return (Criteria) this;
        }

        public Criteria andOutputDateIsNotNull() {
            addCriterion("output_date is not null");
            return (Criteria) this;
        }

        public Criteria andOutputDateEqualTo(Date value) {
            addCriterion("output_date =", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateNotEqualTo(Date value) {
            addCriterion("output_date <>", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateGreaterThan(Date value) {
            addCriterion("output_date >", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateGreaterThanOrEqualTo(Date value) {
            addCriterion("output_date >=", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateLessThan(Date value) {
            addCriterion("output_date <", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateLessThanOrEqualTo(Date value) {
            addCriterion("output_date <=", value, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateIn(List<Date> values) {
            addCriterion("output_date in", values, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateNotIn(List<Date> values) {
            addCriterion("output_date not in", values, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateBetween(Date value1, Date value2) {
            addCriterion("output_date between", value1, value2, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputDateNotBetween(Date value1, Date value2) {
            addCriterion("output_date not between", value1, value2, "outputDate");
            return (Criteria) this;
        }

        public Criteria andOutputPersonIsNull() {
            addCriterion("output_person is null");
            return (Criteria) this;
        }

        public Criteria andOutputPersonIsNotNull() {
            addCriterion("output_person is not null");
            return (Criteria) this;
        }

        public Criteria andOutputPersonEqualTo(String value) {
            addCriterion("output_person =", value, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonNotEqualTo(String value) {
            addCriterion("output_person <>", value, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonGreaterThan(String value) {
            addCriterion("output_person >", value, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonGreaterThanOrEqualTo(String value) {
            addCriterion("output_person >=", value, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonLessThan(String value) {
            addCriterion("output_person <", value, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonLessThanOrEqualTo(String value) {
            addCriterion("output_person <=", value, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonLike(String value) {
            addCriterion("output_person like", value, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonNotLike(String value) {
            addCriterion("output_person not like", value, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonIn(List<String> values) {
            addCriterion("output_person in", values, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonNotIn(List<String> values) {
            addCriterion("output_person not in", values, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonBetween(String value1, String value2) {
            addCriterion("output_person between", value1, value2, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputPersonNotBetween(String value1, String value2) {
            addCriterion("output_person not between", value1, value2, "outputPerson");
            return (Criteria) this;
        }

        public Criteria andOutputTypeIsNull() {
            addCriterion("output_type is null");
            return (Criteria) this;
        }

        public Criteria andOutputTypeIsNotNull() {
            addCriterion("output_type is not null");
            return (Criteria) this;
        }

        public Criteria andOutputTypeEqualTo(String value) {
            addCriterion("output_type =", value, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeNotEqualTo(String value) {
            addCriterion("output_type <>", value, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeGreaterThan(String value) {
            addCriterion("output_type >", value, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeGreaterThanOrEqualTo(String value) {
            addCriterion("output_type >=", value, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeLessThan(String value) {
            addCriterion("output_type <", value, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeLessThanOrEqualTo(String value) {
            addCriterion("output_type <=", value, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeLike(String value) {
            addCriterion("output_type like", value, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeNotLike(String value) {
            addCriterion("output_type not like", value, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeIn(List<String> values) {
            addCriterion("output_type in", values, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeNotIn(List<String> values) {
            addCriterion("output_type not in", values, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeBetween(String value1, String value2) {
            addCriterion("output_type between", value1, value2, "outputType");
            return (Criteria) this;
        }

        public Criteria andOutputTypeNotBetween(String value1, String value2) {
            addCriterion("output_type not between", value1, value2, "outputType");
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