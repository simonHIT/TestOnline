package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class EmeterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmeterExample() {
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

        public Criteria andEmeteridIsNull() {
            addCriterion("EmeterId is null");
            return (Criteria) this;
        }

        public Criteria andEmeteridIsNotNull() {
            addCriterion("EmeterId is not null");
            return (Criteria) this;
        }

        public Criteria andEmeteridEqualTo(Integer value) {
            addCriterion("EmeterId =", value, "emeterid");
            return (Criteria) this;
        }

        public Criteria andEmeteridNotEqualTo(Integer value) {
            addCriterion("EmeterId <>", value, "emeterid");
            return (Criteria) this;
        }

        public Criteria andEmeteridGreaterThan(Integer value) {
            addCriterion("EmeterId >", value, "emeterid");
            return (Criteria) this;
        }

        public Criteria andEmeteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmeterId >=", value, "emeterid");
            return (Criteria) this;
        }

        public Criteria andEmeteridLessThan(Integer value) {
            addCriterion("EmeterId <", value, "emeterid");
            return (Criteria) this;
        }

        public Criteria andEmeteridLessThanOrEqualTo(Integer value) {
            addCriterion("EmeterId <=", value, "emeterid");
            return (Criteria) this;
        }

        public Criteria andEmeteridIn(List<Integer> values) {
            addCriterion("EmeterId in", values, "emeterid");
            return (Criteria) this;
        }

        public Criteria andEmeteridNotIn(List<Integer> values) {
            addCriterion("EmeterId not in", values, "emeterid");
            return (Criteria) this;
        }

        public Criteria andEmeteridBetween(Integer value1, Integer value2) {
            addCriterion("EmeterId between", value1, value2, "emeterid");
            return (Criteria) this;
        }

        public Criteria andEmeteridNotBetween(Integer value1, Integer value2) {
            addCriterion("EmeterId not between", value1, value2, "emeterid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMeaningIsNull() {
            addCriterion("Meaning is null");
            return (Criteria) this;
        }

        public Criteria andMeaningIsNotNull() {
            addCriterion("Meaning is not null");
            return (Criteria) this;
        }

        public Criteria andMeaningEqualTo(String value) {
            addCriterion("Meaning =", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningNotEqualTo(String value) {
            addCriterion("Meaning <>", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningGreaterThan(String value) {
            addCriterion("Meaning >", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningGreaterThanOrEqualTo(String value) {
            addCriterion("Meaning >=", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningLessThan(String value) {
            addCriterion("Meaning <", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningLessThanOrEqualTo(String value) {
            addCriterion("Meaning <=", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningLike(String value) {
            addCriterion("Meaning like", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningNotLike(String value) {
            addCriterion("Meaning not like", value, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningIn(List<String> values) {
            addCriterion("Meaning in", values, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningNotIn(List<String> values) {
            addCriterion("Meaning not in", values, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningBetween(String value1, String value2) {
            addCriterion("Meaning between", value1, value2, "meaning");
            return (Criteria) this;
        }

        public Criteria andMeaningNotBetween(String value1, String value2) {
            addCriterion("Meaning not between", value1, value2, "meaning");
            return (Criteria) this;
        }

        public Criteria andExpressionidIsNull() {
            addCriterion("expressionId is null");
            return (Criteria) this;
        }

        public Criteria andExpressionidIsNotNull() {
            addCriterion("expressionId is not null");
            return (Criteria) this;
        }

        public Criteria andExpressionidEqualTo(Integer value) {
            addCriterion("expressionId =", value, "expressionid");
            return (Criteria) this;
        }

        public Criteria andExpressionidNotEqualTo(Integer value) {
            addCriterion("expressionId <>", value, "expressionid");
            return (Criteria) this;
        }

        public Criteria andExpressionidGreaterThan(Integer value) {
            addCriterion("expressionId >", value, "expressionid");
            return (Criteria) this;
        }

        public Criteria andExpressionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("expressionId >=", value, "expressionid");
            return (Criteria) this;
        }

        public Criteria andExpressionidLessThan(Integer value) {
            addCriterion("expressionId <", value, "expressionid");
            return (Criteria) this;
        }

        public Criteria andExpressionidLessThanOrEqualTo(Integer value) {
            addCriterion("expressionId <=", value, "expressionid");
            return (Criteria) this;
        }

        public Criteria andExpressionidIn(List<Integer> values) {
            addCriterion("expressionId in", values, "expressionid");
            return (Criteria) this;
        }

        public Criteria andExpressionidNotIn(List<Integer> values) {
            addCriterion("expressionId not in", values, "expressionid");
            return (Criteria) this;
        }

        public Criteria andExpressionidBetween(Integer value1, Integer value2) {
            addCriterion("expressionId between", value1, value2, "expressionid");
            return (Criteria) this;
        }

        public Criteria andExpressionidNotBetween(Integer value1, Integer value2) {
            addCriterion("expressionId not between", value1, value2, "expressionid");
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