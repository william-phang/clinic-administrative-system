package com.woniuxy.clinic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDepartmentExample() {
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeIsNull() {
            addCriterion("department_describe is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeIsNotNull() {
            addCriterion("department_describe is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeEqualTo(String value) {
            addCriterion("department_describe =", value, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeNotEqualTo(String value) {
            addCriterion("department_describe <>", value, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeGreaterThan(String value) {
            addCriterion("department_describe >", value, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("department_describe >=", value, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeLessThan(String value) {
            addCriterion("department_describe <", value, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeLessThanOrEqualTo(String value) {
            addCriterion("department_describe <=", value, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeLike(String value) {
            addCriterion("department_describe like", value, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeNotLike(String value) {
            addCriterion("department_describe not like", value, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeIn(List<String> values) {
            addCriterion("department_describe in", values, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeNotIn(List<String> values) {
            addCriterion("department_describe not in", values, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeBetween(String value1, String value2) {
            addCriterion("department_describe between", value1, value2, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentDescribeNotBetween(String value1, String value2) {
            addCriterion("department_describe not between", value1, value2, "departmentDescribe");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeIsNull() {
            addCriterion("department_creationtime is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeIsNotNull() {
            addCriterion("department_creationtime is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeEqualTo(Date value) {
            addCriterion("department_creationtime =", value, "departmentCreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeNotEqualTo(Date value) {
            addCriterion("department_creationtime <>", value, "departmentCreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeGreaterThan(Date value) {
            addCriterion("department_creationtime >", value, "departmentCreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("department_creationtime >=", value, "departmentCreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeLessThan(Date value) {
            addCriterion("department_creationtime <", value, "departmentCreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("department_creationtime <=", value, "departmentCreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeIn(List<Date> values) {
            addCriterion("department_creationtime in", values, "departmentCreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeNotIn(List<Date> values) {
            addCriterion("department_creationtime not in", values, "departmentCreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeBetween(Date value1, Date value2) {
            addCriterion("department_creationtime between", value1, value2, "departmentCreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("department_creationtime not between", value1, value2, "departmentCreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusIsNull() {
            addCriterion("department_status is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusIsNotNull() {
            addCriterion("department_status is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusEqualTo(String value) {
            addCriterion("department_status =", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotEqualTo(String value) {
            addCriterion("department_status <>", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusGreaterThan(String value) {
            addCriterion("department_status >", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("department_status >=", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusLessThan(String value) {
            addCriterion("department_status <", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusLessThanOrEqualTo(String value) {
            addCriterion("department_status <=", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusLike(String value) {
            addCriterion("department_status like", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotLike(String value) {
            addCriterion("department_status not like", value, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusIn(List<String> values) {
            addCriterion("department_status in", values, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotIn(List<String> values) {
            addCriterion("department_status not in", values, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusBetween(String value1, String value2) {
            addCriterion("department_status between", value1, value2, "departmentStatus");
            return (Criteria) this;
        }

        public Criteria andDepartmentStatusNotBetween(String value1, String value2) {
            addCriterion("department_status not between", value1, value2, "departmentStatus");
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