package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class DstypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstypeExample() {
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

        public Criteria andDstypeidIsNull() {
            addCriterion("DSTypeId is null");
            return (Criteria) this;
        }

        public Criteria andDstypeidIsNotNull() {
            addCriterion("DSTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andDstypeidEqualTo(Integer value) {
            addCriterion("DSTypeId =", value, "dstypeid");
            return (Criteria) this;
        }

        public Criteria andDstypeidNotEqualTo(Integer value) {
            addCriterion("DSTypeId <>", value, "dstypeid");
            return (Criteria) this;
        }

        public Criteria andDstypeidGreaterThan(Integer value) {
            addCriterion("DSTypeId >", value, "dstypeid");
            return (Criteria) this;
        }

        public Criteria andDstypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DSTypeId >=", value, "dstypeid");
            return (Criteria) this;
        }

        public Criteria andDstypeidLessThan(Integer value) {
            addCriterion("DSTypeId <", value, "dstypeid");
            return (Criteria) this;
        }

        public Criteria andDstypeidLessThanOrEqualTo(Integer value) {
            addCriterion("DSTypeId <=", value, "dstypeid");
            return (Criteria) this;
        }

        public Criteria andDstypeidIn(List<Integer> values) {
            addCriterion("DSTypeId in", values, "dstypeid");
            return (Criteria) this;
        }

        public Criteria andDstypeidNotIn(List<Integer> values) {
            addCriterion("DSTypeId not in", values, "dstypeid");
            return (Criteria) this;
        }

        public Criteria andDstypeidBetween(Integer value1, Integer value2) {
            addCriterion("DSTypeId between", value1, value2, "dstypeid");
            return (Criteria) this;
        }

        public Criteria andDstypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("DSTypeId not between", value1, value2, "dstypeid");
            return (Criteria) this;
        }

        public Criteria andDstypenameIsNull() {
            addCriterion("DSTypeName is null");
            return (Criteria) this;
        }

        public Criteria andDstypenameIsNotNull() {
            addCriterion("DSTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andDstypenameEqualTo(String value) {
            addCriterion("DSTypeName =", value, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameNotEqualTo(String value) {
            addCriterion("DSTypeName <>", value, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameGreaterThan(String value) {
            addCriterion("DSTypeName >", value, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameGreaterThanOrEqualTo(String value) {
            addCriterion("DSTypeName >=", value, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameLessThan(String value) {
            addCriterion("DSTypeName <", value, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameLessThanOrEqualTo(String value) {
            addCriterion("DSTypeName <=", value, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameLike(String value) {
            addCriterion("DSTypeName like", value, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameNotLike(String value) {
            addCriterion("DSTypeName not like", value, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameIn(List<String> values) {
            addCriterion("DSTypeName in", values, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameNotIn(List<String> values) {
            addCriterion("DSTypeName not in", values, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameBetween(String value1, String value2) {
            addCriterion("DSTypeName between", value1, value2, "dstypename");
            return (Criteria) this;
        }

        public Criteria andDstypenameNotBetween(String value1, String value2) {
            addCriterion("DSTypeName not between", value1, value2, "dstypename");
            return (Criteria) this;
        }

        public Criteria andTimeunitIsNull() {
            addCriterion("TimeUnit is null");
            return (Criteria) this;
        }

        public Criteria andTimeunitIsNotNull() {
            addCriterion("TimeUnit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeunitEqualTo(String value) {
            addCriterion("TimeUnit =", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitNotEqualTo(String value) {
            addCriterion("TimeUnit <>", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitGreaterThan(String value) {
            addCriterion("TimeUnit >", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitGreaterThanOrEqualTo(String value) {
            addCriterion("TimeUnit >=", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitLessThan(String value) {
            addCriterion("TimeUnit <", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitLessThanOrEqualTo(String value) {
            addCriterion("TimeUnit <=", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitLike(String value) {
            addCriterion("TimeUnit like", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitNotLike(String value) {
            addCriterion("TimeUnit not like", value, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitIn(List<String> values) {
            addCriterion("TimeUnit in", values, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitNotIn(List<String> values) {
            addCriterion("TimeUnit not in", values, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitBetween(String value1, String value2) {
            addCriterion("TimeUnit between", value1, value2, "timeunit");
            return (Criteria) this;
        }

        public Criteria andTimeunitNotBetween(String value1, String value2) {
            addCriterion("TimeUnit not between", value1, value2, "timeunit");
            return (Criteria) this;
        }

        public Criteria andNumunitIsNull() {
            addCriterion("NumUnit is null");
            return (Criteria) this;
        }

        public Criteria andNumunitIsNotNull() {
            addCriterion("NumUnit is not null");
            return (Criteria) this;
        }

        public Criteria andNumunitEqualTo(String value) {
            addCriterion("NumUnit =", value, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitNotEqualTo(String value) {
            addCriterion("NumUnit <>", value, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitGreaterThan(String value) {
            addCriterion("NumUnit >", value, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitGreaterThanOrEqualTo(String value) {
            addCriterion("NumUnit >=", value, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitLessThan(String value) {
            addCriterion("NumUnit <", value, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitLessThanOrEqualTo(String value) {
            addCriterion("NumUnit <=", value, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitLike(String value) {
            addCriterion("NumUnit like", value, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitNotLike(String value) {
            addCriterion("NumUnit not like", value, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitIn(List<String> values) {
            addCriterion("NumUnit in", values, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitNotIn(List<String> values) {
            addCriterion("NumUnit not in", values, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitBetween(String value1, String value2) {
            addCriterion("NumUnit between", value1, value2, "numunit");
            return (Criteria) this;
        }

        public Criteria andNumunitNotBetween(String value1, String value2) {
            addCriterion("NumUnit not between", value1, value2, "numunit");
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