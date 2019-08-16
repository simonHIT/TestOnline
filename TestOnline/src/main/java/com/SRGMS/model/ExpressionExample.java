package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class ExpressionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpressionExample() {
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

        public Criteria andIdexpressionIsNull() {
            addCriterion("idExpression is null");
            return (Criteria) this;
        }

        public Criteria andIdexpressionIsNotNull() {
            addCriterion("idExpression is not null");
            return (Criteria) this;
        }

        public Criteria andIdexpressionEqualTo(Integer value) {
            addCriterion("idExpression =", value, "idexpression");
            return (Criteria) this;
        }

        public Criteria andIdexpressionNotEqualTo(Integer value) {
            addCriterion("idExpression <>", value, "idexpression");
            return (Criteria) this;
        }

        public Criteria andIdexpressionGreaterThan(Integer value) {
            addCriterion("idExpression >", value, "idexpression");
            return (Criteria) this;
        }

        public Criteria andIdexpressionGreaterThanOrEqualTo(Integer value) {
            addCriterion("idExpression >=", value, "idexpression");
            return (Criteria) this;
        }

        public Criteria andIdexpressionLessThan(Integer value) {
            addCriterion("idExpression <", value, "idexpression");
            return (Criteria) this;
        }

        public Criteria andIdexpressionLessThanOrEqualTo(Integer value) {
            addCriterion("idExpression <=", value, "idexpression");
            return (Criteria) this;
        }

        public Criteria andIdexpressionIn(List<Integer> values) {
            addCriterion("idExpression in", values, "idexpression");
            return (Criteria) this;
        }

        public Criteria andIdexpressionNotIn(List<Integer> values) {
            addCriterion("idExpression not in", values, "idexpression");
            return (Criteria) this;
        }

        public Criteria andIdexpressionBetween(Integer value1, Integer value2) {
            addCriterion("idExpression between", value1, value2, "idexpression");
            return (Criteria) this;
        }

        public Criteria andIdexpressionNotBetween(Integer value1, Integer value2) {
            addCriterion("idExpression not between", value1, value2, "idexpression");
            return (Criteria) this;
        }

        public Criteria andWormIsNull() {
            addCriterion("WORM is null");
            return (Criteria) this;
        }

        public Criteria andWormIsNotNull() {
            addCriterion("WORM is not null");
            return (Criteria) this;
        }

        public Criteria andWormEqualTo(String value) {
            addCriterion("WORM =", value, "worm");
            return (Criteria) this;
        }

        public Criteria andWormNotEqualTo(String value) {
            addCriterion("WORM <>", value, "worm");
            return (Criteria) this;
        }

        public Criteria andWormGreaterThan(String value) {
            addCriterion("WORM >", value, "worm");
            return (Criteria) this;
        }

        public Criteria andWormGreaterThanOrEqualTo(String value) {
            addCriterion("WORM >=", value, "worm");
            return (Criteria) this;
        }

        public Criteria andWormLessThan(String value) {
            addCriterion("WORM <", value, "worm");
            return (Criteria) this;
        }

        public Criteria andWormLessThanOrEqualTo(String value) {
            addCriterion("WORM <=", value, "worm");
            return (Criteria) this;
        }

        public Criteria andWormLike(String value) {
            addCriterion("WORM like", value, "worm");
            return (Criteria) this;
        }

        public Criteria andWormNotLike(String value) {
            addCriterion("WORM not like", value, "worm");
            return (Criteria) this;
        }

        public Criteria andWormIn(List<String> values) {
            addCriterion("WORM in", values, "worm");
            return (Criteria) this;
        }

        public Criteria andWormNotIn(List<String> values) {
            addCriterion("WORM not in", values, "worm");
            return (Criteria) this;
        }

        public Criteria andWormBetween(String value1, String value2) {
            addCriterion("WORM between", value1, value2, "worm");
            return (Criteria) this;
        }

        public Criteria andWormNotBetween(String value1, String value2) {
            addCriterion("WORM not between", value1, value2, "worm");
            return (Criteria) this;
        }

        public Criteria andEmeternumIsNull() {
            addCriterion("emeterNum is null");
            return (Criteria) this;
        }

        public Criteria andEmeternumIsNotNull() {
            addCriterion("emeterNum is not null");
            return (Criteria) this;
        }

        public Criteria andEmeternumEqualTo(Integer value) {
            addCriterion("emeterNum =", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumNotEqualTo(Integer value) {
            addCriterion("emeterNum <>", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumGreaterThan(Integer value) {
            addCriterion("emeterNum >", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumGreaterThanOrEqualTo(Integer value) {
            addCriterion("emeterNum >=", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumLessThan(Integer value) {
            addCriterion("emeterNum <", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumLessThanOrEqualTo(Integer value) {
            addCriterion("emeterNum <=", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumIn(List<Integer> values) {
            addCriterion("emeterNum in", values, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumNotIn(List<Integer> values) {
            addCriterion("emeterNum not in", values, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumBetween(Integer value1, Integer value2) {
            addCriterion("emeterNum between", value1, value2, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumNotBetween(Integer value1, Integer value2) {
            addCriterion("emeterNum not between", value1, value2, "emeternum");
            return (Criteria) this;
        }

        public Criteria andSrgmidIsNull() {
            addCriterion("srgmId is null");
            return (Criteria) this;
        }

        public Criteria andSrgmidIsNotNull() {
            addCriterion("srgmId is not null");
            return (Criteria) this;
        }

        public Criteria andSrgmidEqualTo(Integer value) {
            addCriterion("srgmId =", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidNotEqualTo(Integer value) {
            addCriterion("srgmId <>", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidGreaterThan(Integer value) {
            addCriterion("srgmId >", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("srgmId >=", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidLessThan(Integer value) {
            addCriterion("srgmId <", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidLessThanOrEqualTo(Integer value) {
            addCriterion("srgmId <=", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidIn(List<Integer> values) {
            addCriterion("srgmId in", values, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidNotIn(List<Integer> values) {
            addCriterion("srgmId not in", values, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidBetween(Integer value1, Integer value2) {
            addCriterion("srgmId between", value1, value2, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidNotBetween(Integer value1, Integer value2) {
            addCriterion("srgmId not between", value1, value2, "srgmid");
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