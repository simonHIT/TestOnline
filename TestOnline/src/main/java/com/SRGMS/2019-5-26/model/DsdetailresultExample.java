package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class DsdetailresultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DsdetailresultExample() {
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

        public Criteria andDsdetailresultidIsNull() {
            addCriterion("DsDetailResultId is null");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidIsNotNull() {
            addCriterion("DsDetailResultId is not null");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidEqualTo(Integer value) {
            addCriterion("DsDetailResultId =", value, "dsdetailresultid");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidNotEqualTo(Integer value) {
            addCriterion("DsDetailResultId <>", value, "dsdetailresultid");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidGreaterThan(Integer value) {
            addCriterion("DsDetailResultId >", value, "dsdetailresultid");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DsDetailResultId >=", value, "dsdetailresultid");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidLessThan(Integer value) {
            addCriterion("DsDetailResultId <", value, "dsdetailresultid");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidLessThanOrEqualTo(Integer value) {
            addCriterion("DsDetailResultId <=", value, "dsdetailresultid");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidIn(List<Integer> values) {
            addCriterion("DsDetailResultId in", values, "dsdetailresultid");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidNotIn(List<Integer> values) {
            addCriterion("DsDetailResultId not in", values, "dsdetailresultid");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidBetween(Integer value1, Integer value2) {
            addCriterion("DsDetailResultId between", value1, value2, "dsdetailresultid");
            return (Criteria) this;
        }

        public Criteria andDsdetailresultidNotBetween(Integer value1, Integer value2) {
            addCriterion("DsDetailResultId not between", value1, value2, "dsdetailresultid");
            return (Criteria) this;
        }

        public Criteria andFitidIsNull() {
            addCriterion("fitId is null");
            return (Criteria) this;
        }

        public Criteria andFitidIsNotNull() {
            addCriterion("fitId is not null");
            return (Criteria) this;
        }

        public Criteria andFitidEqualTo(Integer value) {
            addCriterion("fitId =", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidNotEqualTo(Integer value) {
            addCriterion("fitId <>", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidGreaterThan(Integer value) {
            addCriterion("fitId >", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fitId >=", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidLessThan(Integer value) {
            addCriterion("fitId <", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidLessThanOrEqualTo(Integer value) {
            addCriterion("fitId <=", value, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidIn(List<Integer> values) {
            addCriterion("fitId in", values, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidNotIn(List<Integer> values) {
            addCriterion("fitId not in", values, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidBetween(Integer value1, Integer value2) {
            addCriterion("fitId between", value1, value2, "fitid");
            return (Criteria) this;
        }

        public Criteria andFitidNotBetween(Integer value1, Integer value2) {
            addCriterion("fitId not between", value1, value2, "fitid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidIsNull() {
            addCriterion("dsDetailId is null");
            return (Criteria) this;
        }

        public Criteria andDsdetailidIsNotNull() {
            addCriterion("dsDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andDsdetailidEqualTo(Integer value) {
            addCriterion("dsDetailId =", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidNotEqualTo(Integer value) {
            addCriterion("dsDetailId <>", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidGreaterThan(Integer value) {
            addCriterion("dsDetailId >", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dsDetailId >=", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidLessThan(Integer value) {
            addCriterion("dsDetailId <", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("dsDetailId <=", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidIn(List<Integer> values) {
            addCriterion("dsDetailId in", values, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidNotIn(List<Integer> values) {
            addCriterion("dsDetailId not in", values, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidBetween(Integer value1, Integer value2) {
            addCriterion("dsDetailId between", value1, value2, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("dsDetailId not between", value1, value2, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andMvalueIsNull() {
            addCriterion("mValue is null");
            return (Criteria) this;
        }

        public Criteria andMvalueIsNotNull() {
            addCriterion("mValue is not null");
            return (Criteria) this;
        }

        public Criteria andMvalueEqualTo(Double value) {
            addCriterion("mValue =", value, "mvalue");
            return (Criteria) this;
        }

        public Criteria andMvalueNotEqualTo(Double value) {
            addCriterion("mValue <>", value, "mvalue");
            return (Criteria) this;
        }

        public Criteria andMvalueGreaterThan(Double value) {
            addCriterion("mValue >", value, "mvalue");
            return (Criteria) this;
        }

        public Criteria andMvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("mValue >=", value, "mvalue");
            return (Criteria) this;
        }

        public Criteria andMvalueLessThan(Double value) {
            addCriterion("mValue <", value, "mvalue");
            return (Criteria) this;
        }

        public Criteria andMvalueLessThanOrEqualTo(Double value) {
            addCriterion("mValue <=", value, "mvalue");
            return (Criteria) this;
        }

        public Criteria andMvalueIn(List<Double> values) {
            addCriterion("mValue in", values, "mvalue");
            return (Criteria) this;
        }

        public Criteria andMvalueNotIn(List<Double> values) {
            addCriterion("mValue not in", values, "mvalue");
            return (Criteria) this;
        }

        public Criteria andMvalueBetween(Double value1, Double value2) {
            addCriterion("mValue between", value1, value2, "mvalue");
            return (Criteria) this;
        }

        public Criteria andMvalueNotBetween(Double value1, Double value2) {
            addCriterion("mValue not between", value1, value2, "mvalue");
            return (Criteria) this;
        }

        public Criteria andWvalueIsNull() {
            addCriterion("wValue is null");
            return (Criteria) this;
        }

        public Criteria andWvalueIsNotNull() {
            addCriterion("wValue is not null");
            return (Criteria) this;
        }

        public Criteria andWvalueEqualTo(Double value) {
            addCriterion("wValue =", value, "wvalue");
            return (Criteria) this;
        }

        public Criteria andWvalueNotEqualTo(Double value) {
            addCriterion("wValue <>", value, "wvalue");
            return (Criteria) this;
        }

        public Criteria andWvalueGreaterThan(Double value) {
            addCriterion("wValue >", value, "wvalue");
            return (Criteria) this;
        }

        public Criteria andWvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("wValue >=", value, "wvalue");
            return (Criteria) this;
        }

        public Criteria andWvalueLessThan(Double value) {
            addCriterion("wValue <", value, "wvalue");
            return (Criteria) this;
        }

        public Criteria andWvalueLessThanOrEqualTo(Double value) {
            addCriterion("wValue <=", value, "wvalue");
            return (Criteria) this;
        }

        public Criteria andWvalueIn(List<Double> values) {
            addCriterion("wValue in", values, "wvalue");
            return (Criteria) this;
        }

        public Criteria andWvalueNotIn(List<Double> values) {
            addCriterion("wValue not in", values, "wvalue");
            return (Criteria) this;
        }

        public Criteria andWvalueBetween(Double value1, Double value2) {
            addCriterion("wValue between", value1, value2, "wvalue");
            return (Criteria) this;
        }

        public Criteria andWvalueNotBetween(Double value1, Double value2) {
            addCriterion("wValue not between", value1, value2, "wvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueIsNull() {
            addCriterion("cValue is null");
            return (Criteria) this;
        }

        public Criteria andCvalueIsNotNull() {
            addCriterion("cValue is not null");
            return (Criteria) this;
        }

        public Criteria andCvalueEqualTo(Double value) {
            addCriterion("cValue =", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueNotEqualTo(Double value) {
            addCriterion("cValue <>", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueGreaterThan(Double value) {
            addCriterion("cValue >", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("cValue >=", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueLessThan(Double value) {
            addCriterion("cValue <", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueLessThanOrEqualTo(Double value) {
            addCriterion("cValue <=", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueIn(List<Double> values) {
            addCriterion("cValue in", values, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueNotIn(List<Double> values) {
            addCriterion("cValue not in", values, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueBetween(Double value1, Double value2) {
            addCriterion("cValue between", value1, value2, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueNotBetween(Double value1, Double value2) {
            addCriterion("cValue not between", value1, value2, "cvalue");
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