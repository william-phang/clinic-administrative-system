package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRegistrationExample() {
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

        public Criteria andRegistration_idIsNull() {
            addCriterion("registration_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistration_idIsNotNull() {
            addCriterion("registration_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistration_idEqualTo(Long value) {
            addCriterion("registration_id =", value, "registration_id");
            return (Criteria) this;
        }

        public Criteria andRegistration_idNotEqualTo(Long value) {
            addCriterion("registration_id <>", value, "registration_id");
            return (Criteria) this;
        }

        public Criteria andRegistration_idGreaterThan(Long value) {
            addCriterion("registration_id >", value, "registration_id");
            return (Criteria) this;
        }

        public Criteria andRegistration_idGreaterThanOrEqualTo(Long value) {
            addCriterion("registration_id >=", value, "registration_id");
            return (Criteria) this;
        }

        public Criteria andRegistration_idLessThan(Long value) {
            addCriterion("registration_id <", value, "registration_id");
            return (Criteria) this;
        }

        public Criteria andRegistration_idLessThanOrEqualTo(Long value) {
            addCriterion("registration_id <=", value, "registration_id");
            return (Criteria) this;
        }

        public Criteria andRegistration_idIn(List<Long> values) {
            addCriterion("registration_id in", values, "registration_id");
            return (Criteria) this;
        }

        public Criteria andRegistration_idNotIn(List<Long> values) {
            addCriterion("registration_id not in", values, "registration_id");
            return (Criteria) this;
        }

        public Criteria andRegistration_idBetween(Long value1, Long value2) {
            addCriterion("registration_id between", value1, value2, "registration_id");
            return (Criteria) this;
        }

        public Criteria andRegistration_idNotBetween(Long value1, Long value2) {
            addCriterion("registration_id not between", value1, value2, "registration_id");
            return (Criteria) this;
        }

        public Criteria andRegistration_snIsNull() {
            addCriterion("registration_sn is null");
            return (Criteria) this;
        }

        public Criteria andRegistration_snIsNotNull() {
            addCriterion("registration_sn is not null");
            return (Criteria) this;
        }

        public Criteria andRegistration_snEqualTo(String value) {
            addCriterion("registration_sn =", value, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snNotEqualTo(String value) {
            addCriterion("registration_sn <>", value, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snGreaterThan(String value) {
            addCriterion("registration_sn >", value, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snGreaterThanOrEqualTo(String value) {
            addCriterion("registration_sn >=", value, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snLessThan(String value) {
            addCriterion("registration_sn <", value, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snLessThanOrEqualTo(String value) {
            addCriterion("registration_sn <=", value, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snLike(String value) {
            addCriterion("registration_sn like", value, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snNotLike(String value) {
            addCriterion("registration_sn not like", value, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snIn(List<String> values) {
            addCriterion("registration_sn in", values, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snNotIn(List<String> values) {
            addCriterion("registration_sn not in", values, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snBetween(String value1, String value2) {
            addCriterion("registration_sn between", value1, value2, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andRegistration_snNotBetween(String value1, String value2) {
            addCriterion("registration_sn not between", value1, value2, "registration_sn");
            return (Criteria) this;
        }

        public Criteria andDepartment_idIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartment_idIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartment_idEqualTo(Integer value) {
            addCriterion("department_id =", value, "department_id");
            return (Criteria) this;
        }

        public Criteria andDepartment_idNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "department_id");
            return (Criteria) this;
        }

        public Criteria andDepartment_idGreaterThan(Integer value) {
            addCriterion("department_id >", value, "department_id");
            return (Criteria) this;
        }

        public Criteria andDepartment_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "department_id");
            return (Criteria) this;
        }

        public Criteria andDepartment_idLessThan(Integer value) {
            addCriterion("department_id <", value, "department_id");
            return (Criteria) this;
        }

        public Criteria andDepartment_idLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "department_id");
            return (Criteria) this;
        }

        public Criteria andDepartment_idIn(List<Integer> values) {
            addCriterion("department_id in", values, "department_id");
            return (Criteria) this;
        }

        public Criteria andDepartment_idNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "department_id");
            return (Criteria) this;
        }

        public Criteria andDepartment_idBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "department_id");
            return (Criteria) this;
        }

        public Criteria andDepartment_idNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "department_id");
            return (Criteria) this;
        }

        public Criteria andReception_typeIsNull() {
            addCriterion("reception_type is null");
            return (Criteria) this;
        }

        public Criteria andReception_typeIsNotNull() {
            addCriterion("reception_type is not null");
            return (Criteria) this;
        }

        public Criteria andReception_typeEqualTo(String value) {
            addCriterion("reception_type =", value, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeNotEqualTo(String value) {
            addCriterion("reception_type <>", value, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeGreaterThan(String value) {
            addCriterion("reception_type >", value, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeGreaterThanOrEqualTo(String value) {
            addCriterion("reception_type >=", value, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeLessThan(String value) {
            addCriterion("reception_type <", value, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeLessThanOrEqualTo(String value) {
            addCriterion("reception_type <=", value, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeLike(String value) {
            addCriterion("reception_type like", value, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeNotLike(String value) {
            addCriterion("reception_type not like", value, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeIn(List<String> values) {
            addCriterion("reception_type in", values, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeNotIn(List<String> values) {
            addCriterion("reception_type not in", values, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeBetween(String value1, String value2) {
            addCriterion("reception_type between", value1, value2, "reception_type");
            return (Criteria) this;
        }

        public Criteria andReception_typeNotBetween(String value1, String value2) {
            addCriterion("reception_type not between", value1, value2, "reception_type");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountIsNull() {
            addCriterion("registration_amount is null");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountIsNotNull() {
            addCriterion("registration_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountEqualTo(BigDecimal value) {
            addCriterion("registration_amount =", value, "registration_amount");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountNotEqualTo(BigDecimal value) {
            addCriterion("registration_amount <>", value, "registration_amount");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountGreaterThan(BigDecimal value) {
            addCriterion("registration_amount >", value, "registration_amount");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("registration_amount >=", value, "registration_amount");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountLessThan(BigDecimal value) {
            addCriterion("registration_amount <", value, "registration_amount");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("registration_amount <=", value, "registration_amount");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountIn(List<BigDecimal> values) {
            addCriterion("registration_amount in", values, "registration_amount");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountNotIn(List<BigDecimal> values) {
            addCriterion("registration_amount not in", values, "registration_amount");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registration_amount between", value1, value2, "registration_amount");
            return (Criteria) this;
        }

        public Criteria andRegistration_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registration_amount not between", value1, value2, "registration_amount");
            return (Criteria) this;
        }

        public Criteria andReception_amountIsNull() {
            addCriterion("reception_amount is null");
            return (Criteria) this;
        }

        public Criteria andReception_amountIsNotNull() {
            addCriterion("reception_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReception_amountEqualTo(BigDecimal value) {
            addCriterion("reception_amount =", value, "reception_amount");
            return (Criteria) this;
        }

        public Criteria andReception_amountNotEqualTo(BigDecimal value) {
            addCriterion("reception_amount <>", value, "reception_amount");
            return (Criteria) this;
        }

        public Criteria andReception_amountGreaterThan(BigDecimal value) {
            addCriterion("reception_amount >", value, "reception_amount");
            return (Criteria) this;
        }

        public Criteria andReception_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reception_amount >=", value, "reception_amount");
            return (Criteria) this;
        }

        public Criteria andReception_amountLessThan(BigDecimal value) {
            addCriterion("reception_amount <", value, "reception_amount");
            return (Criteria) this;
        }

        public Criteria andReception_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reception_amount <=", value, "reception_amount");
            return (Criteria) this;
        }

        public Criteria andReception_amountIn(List<BigDecimal> values) {
            addCriterion("reception_amount in", values, "reception_amount");
            return (Criteria) this;
        }

        public Criteria andReception_amountNotIn(List<BigDecimal> values) {
            addCriterion("reception_amount not in", values, "reception_amount");
            return (Criteria) this;
        }

        public Criteria andReception_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reception_amount between", value1, value2, "reception_amount");
            return (Criteria) this;
        }

        public Criteria andReception_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reception_amount not between", value1, value2, "reception_amount");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andStaff_idIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaff_idIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaff_idEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idLessThan(Integer value) {
            addCriterion("staff_id <", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staff_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatient_idIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatient_idEqualTo(Integer value) {
            addCriterion("patient_id =", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idNotEqualTo(Integer value) {
            addCriterion("patient_id <>", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idGreaterThan(Integer value) {
            addCriterion("patient_id >", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_id >=", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idLessThan(Integer value) {
            addCriterion("patient_id <", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idLessThanOrEqualTo(Integer value) {
            addCriterion("patient_id <=", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idIn(List<Integer> values) {
            addCriterion("patient_id in", values, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idNotIn(List<Integer> values) {
            addCriterion("patient_id not in", values, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idBetween(Integer value1, Integer value2) {
            addCriterion("patient_id between", value1, value2, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_id not between", value1, value2, "patient_id");
            return (Criteria) this;
        }

        public Criteria andReception_statusIsNull() {
            addCriterion("reception_status is null");
            return (Criteria) this;
        }

        public Criteria andReception_statusIsNotNull() {
            addCriterion("reception_status is not null");
            return (Criteria) this;
        }

        public Criteria andReception_statusEqualTo(String value) {
            addCriterion("reception_status =", value, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusNotEqualTo(String value) {
            addCriterion("reception_status <>", value, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusGreaterThan(String value) {
            addCriterion("reception_status >", value, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusGreaterThanOrEqualTo(String value) {
            addCriterion("reception_status >=", value, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusLessThan(String value) {
            addCriterion("reception_status <", value, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusLessThanOrEqualTo(String value) {
            addCriterion("reception_status <=", value, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusLike(String value) {
            addCriterion("reception_status like", value, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusNotLike(String value) {
            addCriterion("reception_status not like", value, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusIn(List<String> values) {
            addCriterion("reception_status in", values, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusNotIn(List<String> values) {
            addCriterion("reception_status not in", values, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusBetween(String value1, String value2) {
            addCriterion("reception_status between", value1, value2, "reception_status");
            return (Criteria) this;
        }

        public Criteria andReception_statusNotBetween(String value1, String value2) {
            addCriterion("reception_status not between", value1, value2, "reception_status");
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