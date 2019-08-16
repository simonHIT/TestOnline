package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class DsdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DsdetailExample() {
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

        public Criteria andDsdetailidIsNull() {
            addCriterion("DSDetailId is null");
            return (Criteria) this;
        }

        public Criteria andDsdetailidIsNotNull() {
            addCriterion("DSDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andDsdetailidEqualTo(Integer value) {
            addCriterion("DSDetailId =", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidNotEqualTo(Integer value) {
            addCriterion("DSDetailId <>", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidGreaterThan(Integer value) {
            addCriterion("DSDetailId >", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DSDetailId >=", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidLessThan(Integer value) {
            addCriterion("DSDetailId <", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("DSDetailId <=", value, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidIn(List<Integer> values) {
            addCriterion("DSDetailId in", values, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidNotIn(List<Integer> values) {
            addCriterion("DSDetailId not in", values, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidBetween(Integer value1, Integer value2) {
            addCriterion("DSDetailId between", value1, value2, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("DSDetailId not between", value1, value2, "dsdetailid");
            return (Criteria) this;
        }

        public Criteria andDsidIsNull() {
            addCriterion("DSId is null");
            return (Criteria) this;
        }

        public Criteria andDsidIsNotNull() {
            addCriterion("DSId is not null");
            return (Criteria) this;
        }

        public Criteria andDsidEqualTo(Integer value) {
            addCriterion("DSId =", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotEqualTo(Integer value) {
            addCriterion("DSId <>", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidGreaterThan(Integer value) {
            addCriterion("DSId >", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DSId >=", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidLessThan(Integer value) {
            addCriterion("DSId <", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidLessThanOrEqualTo(Integer value) {
            addCriterion("DSId <=", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidIn(List<Integer> values) {
            addCriterion("DSId in", values, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotIn(List<Integer> values) {
            addCriterion("DSId not in", values, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidBetween(Integer value1, Integer value2) {
            addCriterion("DSId between", value1, value2, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotBetween(Integer value1, Integer value2) {
            addCriterion("DSId not between", value1, value2, "dsid");
            return (Criteria) this;
        }

        public Criteria andTimevalueIsNull() {
            addCriterion("TimeValue is null");
            return (Criteria) this;
        }

        public Criteria andTimevalueIsNotNull() {
            addCriterion("TimeValue is not null");
            return (Criteria) this;
        }

        public Criteria andTimevalueEqualTo(Double value) {
            addCriterion("TimeValue =", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueNotEqualTo(Double value) {
            addCriterion("TimeValue <>", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueGreaterThan(Double value) {
            addCriterion("TimeValue >", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueGreaterThanOrEqualTo(Double value) {
            addCriterion("TimeValue >=", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueLessThan(Double value) {
            addCriterion("TimeValue <", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueLessThanOrEqualTo(Double value) {
            addCriterion("TimeValue <=", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueIn(List<Double> values) {
            addCriterion("TimeValue in", values, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueNotIn(List<Double> values) {
            addCriterion("TimeValue not in", values, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueBetween(Double value1, Double value2) {
            addCriterion("TimeValue between", value1, value2, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueNotBetween(Double value1, Double value2) {
            addCriterion("TimeValue not between", value1, value2, "timevalue");
            return (Criteria) this;
        }

        public Criteria andMnumIsNull() {
            addCriterion("MNum is null");
            return (Criteria) this;
        }

        public Criteria andMnumIsNotNull() {
            addCriterion("MNum is not null");
            return (Criteria) this;
        }

        public Criteria andMnumEqualTo(Double value) {
            addCriterion("MNum =", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumNotEqualTo(Double value) {
            addCriterion("MNum <>", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumGreaterThan(Double value) {
            addCriterion("MNum >", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumGreaterThanOrEqualTo(Double value) {
            addCriterion("MNum >=", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumLessThan(Double value) {
            addCriterion("MNum <", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumLessThanOrEqualTo(Double value) {
            addCriterion("MNum <=", value, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumIn(List<Double> values) {
            addCriterion("MNum in", values, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumNotIn(List<Double> values) {
            addCriterion("MNum not in", values, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumBetween(Double value1, Double value2) {
            addCriterion("MNum between", value1, value2, "mnum");
            return (Criteria) this;
        }

        public Criteria andMnumNotBetween(Double value1, Double value2) {
            addCriterion("MNum not between", value1, value2, "mnum");
            return (Criteria) this;
        }

        public Criteria andWnumIsNull() {
            addCriterion("WNum is null");
            return (Criteria) this;
        }

        public Criteria andWnumIsNotNull() {
            addCriterion("WNum is not null");
            return (Criteria) this;
        }

        public Criteria andWnumEqualTo(Double value) {
            addCriterion("WNum =", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumNotEqualTo(Double value) {
            addCriterion("WNum <>", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumGreaterThan(Double value) {
            addCriterion("WNum >", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumGreaterThanOrEqualTo(Double value) {
            addCriterion("WNum >=", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumLessThan(Double value) {
            addCriterion("WNum <", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumLessThanOrEqualTo(Double value) {
            addCriterion("WNum <=", value, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumIn(List<Double> values) {
            addCriterion("WNum in", values, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumNotIn(List<Double> values) {
            addCriterion("WNum not in", values, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumBetween(Double value1, Double value2) {
            addCriterion("WNum between", value1, value2, "wnum");
            return (Criteria) this;
        }

        public Criteria andWnumNotBetween(Double value1, Double value2) {
            addCriterion("WNum not between", value1, value2, "wnum");
            return (Criteria) this;
        }

        public Criteria andCnumIsNull() {
            addCriterion("CNum is null");
            return (Criteria) this;
        }

        public Criteria andCnumIsNotNull() {
            addCriterion("CNum is not null");
            return (Criteria) this;
        }

        public Criteria andCnumEqualTo(Double value) {
            addCriterion("CNum =", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumNotEqualTo(Double value) {
            addCriterion("CNum <>", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumGreaterThan(Double value) {
            addCriterion("CNum >", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumGreaterThanOrEqualTo(Double value) {
            addCriterion("CNum >=", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumLessThan(Double value) {
            addCriterion("CNum <", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumLessThanOrEqualTo(Double value) {
            addCriterion("CNum <=", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumIn(List<Double> values) {
            addCriterion("CNum in", values, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumNotIn(List<Double> values) {
            addCriterion("CNum not in", values, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumBetween(Double value1, Double value2) {
            addCriterion("CNum between", value1, value2, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumNotBetween(Double value1, Double value2) {
            addCriterion("CNum not between", value1, value2, "cnum");
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