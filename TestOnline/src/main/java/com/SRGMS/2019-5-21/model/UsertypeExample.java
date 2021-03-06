package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class UsertypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsertypeExample() {
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

        public Criteria andUsertypeidIsNull() {
            addCriterion("UserTypeId is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeidIsNotNull() {
            addCriterion("UserTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeidEqualTo(Integer value) {
            addCriterion("UserTypeId =", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidNotEqualTo(Integer value) {
            addCriterion("UserTypeId <>", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidGreaterThan(Integer value) {
            addCriterion("UserTypeId >", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserTypeId >=", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidLessThan(Integer value) {
            addCriterion("UserTypeId <", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidLessThanOrEqualTo(Integer value) {
            addCriterion("UserTypeId <=", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidIn(List<Integer> values) {
            addCriterion("UserTypeId in", values, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidNotIn(List<Integer> values) {
            addCriterion("UserTypeId not in", values, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidBetween(Integer value1, Integer value2) {
            addCriterion("UserTypeId between", value1, value2, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("UserTypeId not between", value1, value2, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameIsNull() {
            addCriterion("UserTypeName is null");
            return (Criteria) this;
        }

        public Criteria andUsertypenameIsNotNull() {
            addCriterion("UserTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypenameEqualTo(String value) {
            addCriterion("UserTypeName =", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameNotEqualTo(String value) {
            addCriterion("UserTypeName <>", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameGreaterThan(String value) {
            addCriterion("UserTypeName >", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameGreaterThanOrEqualTo(String value) {
            addCriterion("UserTypeName >=", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameLessThan(String value) {
            addCriterion("UserTypeName <", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameLessThanOrEqualTo(String value) {
            addCriterion("UserTypeName <=", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameLike(String value) {
            addCriterion("UserTypeName like", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameNotLike(String value) {
            addCriterion("UserTypeName not like", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameIn(List<String> values) {
            addCriterion("UserTypeName in", values, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameNotIn(List<String> values) {
            addCriterion("UserTypeName not in", values, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameBetween(String value1, String value2) {
            addCriterion("UserTypeName between", value1, value2, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameNotBetween(String value1, String value2) {
            addCriterion("UserTypeName not between", value1, value2, "usertypename");
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