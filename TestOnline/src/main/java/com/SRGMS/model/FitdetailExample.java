package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class FitdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FitdetailExample() {
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

        public Criteria andFitdetailidIsNull() {
            addCriterion("FitDetailId is null");
            return (Criteria) this;
        }

        public Criteria andFitdetailidIsNotNull() {
            addCriterion("FitDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andFitdetailidEqualTo(Integer value) {
            addCriterion("FitDetailId =", value, "fitdetailid");
            return (Criteria) this;
        }

        public Criteria andFitdetailidNotEqualTo(Integer value) {
            addCriterion("FitDetailId <>", value, "fitdetailid");
            return (Criteria) this;
        }

        public Criteria andFitdetailidGreaterThan(Integer value) {
            addCriterion("FitDetailId >", value, "fitdetailid");
            return (Criteria) this;
        }

        public Criteria andFitdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FitDetailId >=", value, "fitdetailid");
            return (Criteria) this;
        }

        public Criteria andFitdetailidLessThan(Integer value) {
            addCriterion("FitDetailId <", value, "fitdetailid");
            return (Criteria) this;
        }

        public Criteria andFitdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("FitDetailId <=", value, "fitdetailid");
            return (Criteria) this;
        }

        public Criteria andFitdetailidIn(List<Integer> values) {
            addCriterion("FitDetailId in", values, "fitdetailid");
            return (Criteria) this;
        }

        public Criteria andFitdetailidNotIn(List<Integer> values) {
            addCriterion("FitDetailId not in", values, "fitdetailid");
            return (Criteria) this;
        }

        public Criteria andFitdetailidBetween(Integer value1, Integer value2) {
            addCriterion("FitDetailId between", value1, value2, "fitdetailid");
            return (Criteria) this;
        }

        public Criteria andFitdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("FitDetailId not between", value1, value2, "fitdetailid");
            return (Criteria) this;
        }

        public Criteria andFitidIsNull() {
            addCriterion("FitId is null");
            return (Criteria) this;
        }

        public Criteria andFitidIsNotNull() {
            addCriterion("FitId is not null");
            return (Criteria) this;
        }

        public Criteria andFitidEqualTo(Integer value) {
            addCriterion("FitId =", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidNotEqualTo(Integer value) {
            addCriterion("FitId <>", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidGreaterThan(Integer value) {
            addCriterion("FitId >", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FitId >=", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidLessThan(Integer value) {
            addCriterion("FitId <", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidLessThanOrEqualTo(Integer value) {
            addCriterion("FitId <=", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidIn(List<Integer> values) {
            addCriterion("FitId in", values, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidNotIn(List<Integer> values) {
            addCriterion("FitId not in", values, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidBetween(Integer value1, Integer value2) {
            addCriterion("FitId between", value1, value2, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidNotBetween(Integer value1, Integer value2) {
            addCriterion("FitId not between", value1, value2, "fitid");
            return (Criteria) this;
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

        public Criteria andValueIsNull() {
            addCriterion("Value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("Value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Double value) {
            addCriterion("Value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Double value) {
            addCriterion("Value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Double value) {
            addCriterion("Value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Double value) {
            addCriterion("Value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Double value) {
            addCriterion("Value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Double value) {
            addCriterion("Value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Double> values) {
            addCriterion("Value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Double> values) {
            addCriterion("Value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Double value1, Double value2) {
            addCriterion("Value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Double value1, Double value2) {
            addCriterion("Value not between", value1, value2, "value");
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