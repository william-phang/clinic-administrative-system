package com.woniuxy.clinic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStaffExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("staff_sex is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("staff_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(String value) {
            addCriterion("staff_sex =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(String value) {
            addCriterion("staff_sex <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(String value) {
            addCriterion("staff_sex >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(String value) {
            addCriterion("staff_sex >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(String value) {
            addCriterion("staff_sex <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(String value) {
            addCriterion("staff_sex <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLike(String value) {
            addCriterion("staff_sex like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotLike(String value) {
            addCriterion("staff_sex not like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<String> values) {
            addCriterion("staff_sex in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<String> values) {
            addCriterion("staff_sex not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(String value1, String value2) {
            addCriterion("staff_sex between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(String value1, String value2) {
            addCriterion("staff_sex not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIsNull() {
            addCriterion("staff_age is null");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIsNotNull() {
            addCriterion("staff_age is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAgeEqualTo(Integer value) {
            addCriterion("staff_age =", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotEqualTo(Integer value) {
            addCriterion("staff_age <>", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeGreaterThan(Integer value) {
            addCriterion("staff_age >", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_age >=", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeLessThan(Integer value) {
            addCriterion("staff_age <", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeLessThanOrEqualTo(Integer value) {
            addCriterion("staff_age <=", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIn(List<Integer> values) {
            addCriterion("staff_age in", values, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotIn(List<Integer> values) {
            addCriterion("staff_age not in", values, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeBetween(Integer value1, Integer value2) {
            addCriterion("staff_age between", value1, value2, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_age not between", value1, value2, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNull() {
            addCriterion("staff_phone is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNotNull() {
            addCriterion("staff_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneEqualTo(String value) {
            addCriterion("staff_phone =", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotEqualTo(String value) {
            addCriterion("staff_phone <>", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThan(String value) {
            addCriterion("staff_phone >", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_phone >=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThan(String value) {
            addCriterion("staff_phone <", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThanOrEqualTo(String value) {
            addCriterion("staff_phone <=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLike(String value) {
            addCriterion("staff_phone like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotLike(String value) {
            addCriterion("staff_phone not like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIn(List<String> values) {
            addCriterion("staff_phone in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotIn(List<String> values) {
            addCriterion("staff_phone not in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneBetween(String value1, String value2) {
            addCriterion("staff_phone between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotBetween(String value1, String value2) {
            addCriterion("staff_phone not between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffCardIsNull() {
            addCriterion("staff_card is null");
            return (Criteria) this;
        }

        public Criteria andStaffCardIsNotNull() {
            addCriterion("staff_card is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCardEqualTo(String value) {
            addCriterion("staff_card =", value, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardNotEqualTo(String value) {
            addCriterion("staff_card <>", value, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardGreaterThan(String value) {
            addCriterion("staff_card >", value, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardGreaterThanOrEqualTo(String value) {
            addCriterion("staff_card >=", value, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardLessThan(String value) {
            addCriterion("staff_card <", value, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardLessThanOrEqualTo(String value) {
            addCriterion("staff_card <=", value, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardLike(String value) {
            addCriterion("staff_card like", value, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardNotLike(String value) {
            addCriterion("staff_card not like", value, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardIn(List<String> values) {
            addCriterion("staff_card in", values, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardNotIn(List<String> values) {
            addCriterion("staff_card not in", values, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardBetween(String value1, String value2) {
            addCriterion("staff_card between", value1, value2, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffCardNotBetween(String value1, String value2) {
            addCriterion("staff_card not between", value1, value2, "staffCard");
            return (Criteria) this;
        }

        public Criteria andStaffTimeIsNull() {
            addCriterion("staff_time is null");
            return (Criteria) this;
        }

        public Criteria andStaffTimeIsNotNull() {
            addCriterion("staff_time is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTimeEqualTo(Date value) {
            addCriterion("staff_time =", value, "staffTime");
            return (Criteria) this;
        }

        public Criteria andStaffTimeNotEqualTo(Date value) {
            addCriterion("staff_time <>", value, "staffTime");
            return (Criteria) this;
        }

        public Criteria andStaffTimeGreaterThan(Date value) {
            addCriterion("staff_time >", value, "staffTime");
            return (Criteria) this;
        }

        public Criteria andStaffTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("staff_time >=", value, "staffTime");
            return (Criteria) this;
        }

        public Criteria andStaffTimeLessThan(Date value) {
            addCriterion("staff_time <", value, "staffTime");
            return (Criteria) this;
        }

        public Criteria andStaffTimeLessThanOrEqualTo(Date value) {
            addCriterion("staff_time <=", value, "staffTime");
            return (Criteria) this;
        }

        public Criteria andStaffTimeIn(List<Date> values) {
            addCriterion("staff_time in", values, "staffTime");
            return (Criteria) this;
        }

        public Criteria andStaffTimeNotIn(List<Date> values) {
            addCriterion("staff_time not in", values, "staffTime");
            return (Criteria) this;
        }

        public Criteria andStaffTimeBetween(Date value1, Date value2) {
            addCriterion("staff_time between", value1, value2, "staffTime");
            return (Criteria) this;
        }

        public Criteria andStaffTimeNotBetween(Date value1, Date value2) {
            addCriterion("staff_time not between", value1, value2, "staffTime");
            return (Criteria) this;
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIsNull() {
            addCriterion("staff_status is null");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIsNotNull() {
            addCriterion("staff_status is not null");
            return (Criteria) this;
        }

        public Criteria andStaffStatusEqualTo(String value) {
            addCriterion("staff_status =", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotEqualTo(String value) {
            addCriterion("staff_status <>", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusGreaterThan(String value) {
            addCriterion("staff_status >", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusGreaterThanOrEqualTo(String value) {
            addCriterion("staff_status >=", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusLessThan(String value) {
            addCriterion("staff_status <", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusLessThanOrEqualTo(String value) {
            addCriterion("staff_status <=", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusLike(String value) {
            addCriterion("staff_status like", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotLike(String value) {
            addCriterion("staff_status not like", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIn(List<String> values) {
            addCriterion("staff_status in", values, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotIn(List<String> values) {
            addCriterion("staff_status not in", values, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusBetween(String value1, String value2) {
            addCriterion("staff_status between", value1, value2, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotBetween(String value1, String value2) {
            addCriterion("staff_status not between", value1, value2, "staffStatus");
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