package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class RedataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedataExample() {
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

        public Criteria andRedataidIsNull() {
            addCriterion("reDataId is null");
            return (Criteria) this;
        }

        public Criteria andRedataidIsNotNull() {
            addCriterion("reDataId is not null");
            return (Criteria) this;
        }

        public Criteria andRedataidEqualTo(Integer value) {
            addCriterion("reDataId =", value, "redataid");
            return (Criteria) this;
        }

        public Criteria andRedataidNotEqualTo(Integer value) {
            addCriterion("reDataId <>", value, "redataid");
            return (Criteria) this;
        }

        public Criteria andRedataidGreaterThan(Integer value) {
            addCriterion("reDataId >", value, "redataid");
            return (Criteria) this;
        }

        public Criteria andRedataidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reDataId >=", value, "redataid");
            return (Criteria) this;
        }

        public Criteria andRedataidLessThan(Integer value) {
            addCriterion("reDataId <", value, "redataid");
            return (Criteria) this;
        }

        public Criteria andRedataidLessThanOrEqualTo(Integer value) {
            addCriterion("reDataId <=", value, "redataid");
            return (Criteria) this;
        }

        public Criteria andRedataidIn(List<Integer> values) {
            addCriterion("reDataId in", values, "redataid");
            return (Criteria) this;
        }

        public Criteria andRedataidNotIn(List<Integer> values) {
            addCriterion("reDataId not in", values, "redataid");
            return (Criteria) this;
        }

        public Criteria andRedataidBetween(Integer value1, Integer value2) {
            addCriterion("reDataId between", value1, value2, "redataid");
            return (Criteria) this;
        }

        public Criteria andRedataidNotBetween(Integer value1, Integer value2) {
            addCriterion("reDataId not between", value1, value2, "redataid");
            return (Criteria) this;
        }

        public Criteria andTimevalueIsNull() {
            addCriterion("timeValue is null");
            return (Criteria) this;
        }

        public Criteria andTimevalueIsNotNull() {
            addCriterion("timeValue is not null");
            return (Criteria) this;
        }

        public Criteria andTimevalueEqualTo(Double value) {
            addCriterion("timeValue =", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueNotEqualTo(Double value) {
            addCriterion("timeValue <>", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueGreaterThan(Double value) {
            addCriterion("timeValue >", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueGreaterThanOrEqualTo(Double value) {
            addCriterion("timeValue >=", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueLessThan(Double value) {
            addCriterion("timeValue <", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueLessThanOrEqualTo(Double value) {
            addCriterion("timeValue <=", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueIn(List<Double> values) {
            addCriterion("timeValue in", values, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueNotIn(List<Double> values) {
            addCriterion("timeValue not in", values, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueBetween(Double value1, Double value2) {
            addCriterion("timeValue between", value1, value2, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueNotBetween(Double value1, Double value2) {
            addCriterion("timeValue not between", value1, value2, "timevalue");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Double value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Double value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Double value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Double value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Double value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Double value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Double> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Double> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Double value1, Double value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Double value1, Double value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andFitidReIsNull() {
            addCriterion("fitId_re is null");
            return (Criteria) this;
        }

        public Criteria andFitidReIsNotNull() {
            addCriterion("fitId_re is not null");
            return (Criteria) this;
        }

        public Criteria andFitidReEqualTo(Integer value) {
            addCriterion("fitId_re =", value, "fitidRe");
            return (Criteria) this;
        }

        public Criteria andFitidReNotEqualTo(Integer value) {
            addCriterion("fitId_re <>", value, "fitidRe");
            return (Criteria) this;
        }

        public Criteria andFitidReGreaterThan(Integer value) {
            addCriterion("fitId_re >", value, "fitidRe");
            return (Criteria) this;
        }

        public Criteria andFitidReGreaterThanOrEqualTo(Integer value) {
            addCriterion("fitId_re >=", value, "fitidRe");
            return (Criteria) this;
        }

        public Criteria andFitidReLessThan(Integer value) {
            addCriterion("fitId_re <", value, "fitidRe");
            return (Criteria) this;
        }

        public Criteria andFitidReLessThanOrEqualTo(Integer value) {
            addCriterion("fitId_re <=", value, "fitidRe");
            return (Criteria) this;
        }

        public Criteria andFitidReIn(List<Integer> values) {
            addCriterion("fitId_re in", values, "fitidRe");
            return (Criteria) this;
        }

        public Criteria andFitidReNotIn(List<Integer> values) {
            addCriterion("fitId_re not in", values, "fitidRe");
            return (Criteria) this;
        }

        public Criteria andFitidReBetween(Integer value1, Integer value2) {
            addCriterion("fitId_re between", value1, value2, "fitidRe");
            return (Criteria) this;
        }

        public Criteria andFitidReNotBetween(Integer value1, Integer value2) {
            addCriterion("fitId_re not between", value1, value2, "fitidRe");
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