package com.woniuxy.clinic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TInventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInventoryExample() {
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

        public Criteria andInventoryIdIsNull() {
            addCriterion("inventory_id is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIdIsNotNull() {
            addCriterion("inventory_id is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryIdEqualTo(Integer value) {
            addCriterion("inventory_id =", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdNotEqualTo(Integer value) {
            addCriterion("inventory_id <>", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdGreaterThan(Integer value) {
            addCriterion("inventory_id >", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_id >=", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdLessThan(Integer value) {
            addCriterion("inventory_id <", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_id <=", value, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdIn(List<Integer> values) {
            addCriterion("inventory_id in", values, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdNotIn(List<Integer> values) {
            addCriterion("inventory_id not in", values, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdBetween(Integer value1, Integer value2) {
            addCriterion("inventory_id between", value1, value2, "inventoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_id not between", value1, value2, "inventoryId");
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

        public Criteria andInventoryDateIsNull() {
            addCriterion("inventory_date is null");
            return (Criteria) this;
        }

        public Criteria andInventoryDateIsNotNull() {
            addCriterion("inventory_date is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryDateEqualTo(Date value) {
            addCriterion("inventory_date =", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateNotEqualTo(Date value) {
            addCriterion("inventory_date <>", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateGreaterThan(Date value) {
            addCriterion("inventory_date >", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("inventory_date >=", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateLessThan(Date value) {
            addCriterion("inventory_date <", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateLessThanOrEqualTo(Date value) {
            addCriterion("inventory_date <=", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateIn(List<Date> values) {
            addCriterion("inventory_date in", values, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateNotIn(List<Date> values) {
            addCriterion("inventory_date not in", values, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateBetween(Date value1, Date value2) {
            addCriterion("inventory_date between", value1, value2, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateNotBetween(Date value1, Date value2) {
            addCriterion("inventory_date not between", value1, value2, "inventoryDate");
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