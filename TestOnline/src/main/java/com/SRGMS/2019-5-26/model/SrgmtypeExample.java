package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class SrgmtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SrgmtypeExample() {
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

        public Criteria andSrgmtypeidIsNull() {
            addCriterion("SRGMTypeId is null");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidIsNotNull() {
            addCriterion("SRGMTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidEqualTo(Integer value) {
            addCriterion("SRGMTypeId =", value, "srgmtypeid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidNotEqualTo(Integer value) {
            addCriterion("SRGMTypeId <>", value, "srgmtypeid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidGreaterThan(Integer value) {
            addCriterion("SRGMTypeId >", value, "srgmtypeid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SRGMTypeId >=", value, "srgmtypeid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidLessThan(Integer value) {
            addCriterion("SRGMTypeId <", value, "srgmtypeid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("SRGMTypeId <=", value, "srgmtypeid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidIn(List<Integer> values) {
            addCriterion("SRGMTypeId in", values, "srgmtypeid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidNotIn(List<Integer> values) {
            addCriterion("SRGMTypeId not in", values, "srgmtypeid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidBetween(Integer value1, Integer value2) {
            addCriterion("SRGMTypeId between", value1, value2, "srgmtypeid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("SRGMTypeId not between", value1, value2, "srgmtypeid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameIsNull() {
            addCriterion("SRGMTypeName is null");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameIsNotNull() {
            addCriterion("SRGMTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameEqualTo(String value) {
            addCriterion("SRGMTypeName =", value, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameNotEqualTo(String value) {
            addCriterion("SRGMTypeName <>", value, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameGreaterThan(String value) {
            addCriterion("SRGMTypeName >", value, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("SRGMTypeName >=", value, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameLessThan(String value) {
            addCriterion("SRGMTypeName <", value, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameLessThanOrEqualTo(String value) {
            addCriterion("SRGMTypeName <=", value, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameLike(String value) {
            addCriterion("SRGMTypeName like", value, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameNotLike(String value) {
            addCriterion("SRGMTypeName not like", value, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameIn(List<String> values) {
            addCriterion("SRGMTypeName in", values, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameNotIn(List<String> values) {
            addCriterion("SRGMTypeName not in", values, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameBetween(String value1, String value2) {
            addCriterion("SRGMTypeName between", value1, value2, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andSrgmtypenameNotBetween(String value1, String value2) {
            addCriterion("SRGMTypeName not between", value1, value2, "srgmtypename");
            return (Criteria) this;
        }

        public Criteria andAppearenceIsNull() {
            addCriterion("Appearence is null");
            return (Criteria) this;
        }

        public Criteria andAppearenceIsNotNull() {
            addCriterion("Appearence is not null");
            return (Criteria) this;
        }

        public Criteria andAppearenceEqualTo(String value) {
            addCriterion("Appearence =", value, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceNotEqualTo(String value) {
            addCriterion("Appearence <>", value, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceGreaterThan(String value) {
            addCriterion("Appearence >", value, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceGreaterThanOrEqualTo(String value) {
            addCriterion("Appearence >=", value, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceLessThan(String value) {
            addCriterion("Appearence <", value, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceLessThanOrEqualTo(String value) {
            addCriterion("Appearence <=", value, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceLike(String value) {
            addCriterion("Appearence like", value, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceNotLike(String value) {
            addCriterion("Appearence not like", value, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceIn(List<String> values) {
            addCriterion("Appearence in", values, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceNotIn(List<String> values) {
            addCriterion("Appearence not in", values, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceBetween(String value1, String value2) {
            addCriterion("Appearence between", value1, value2, "appearence");
            return (Criteria) this;
        }

        public Criteria andAppearenceNotBetween(String value1, String value2) {
            addCriterion("Appearence not between", value1, value2, "appearence");
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