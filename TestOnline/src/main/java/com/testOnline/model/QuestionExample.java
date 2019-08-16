package com.testOnline.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQueIdIsNull() {
            addCriterion("que_id is null");
            return (Criteria) this;
        }

        public Criteria andQueIdIsNotNull() {
            addCriterion("que_id is not null");
            return (Criteria) this;
        }

        public Criteria andQueIdEqualTo(Integer value) {
            addCriterion("que_id =", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotEqualTo(Integer value) {
            addCriterion("que_id <>", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThan(Integer value) {
            addCriterion("que_id >", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_id >=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThan(Integer value) {
            addCriterion("que_id <", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThanOrEqualTo(Integer value) {
            addCriterion("que_id <=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdIn(List<Integer> values) {
            addCriterion("que_id in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotIn(List<Integer> values) {
            addCriterion("que_id not in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdBetween(Integer value1, Integer value2) {
            addCriterion("que_id between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("que_id not between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueTagIsNull() {
            addCriterion("que_tag is null");
            return (Criteria) this;
        }

        public Criteria andQueTagIsNotNull() {
            addCriterion("que_tag is not null");
            return (Criteria) this;
        }

        public Criteria andQueTagEqualTo(String value) {
            addCriterion("que_tag =", value, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagNotEqualTo(String value) {
            addCriterion("que_tag <>", value, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagGreaterThan(String value) {
            addCriterion("que_tag >", value, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagGreaterThanOrEqualTo(String value) {
            addCriterion("que_tag >=", value, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagLessThan(String value) {
            addCriterion("que_tag <", value, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagLessThanOrEqualTo(String value) {
            addCriterion("que_tag <=", value, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagLike(String value) {
            addCriterion("que_tag like", value, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagNotLike(String value) {
            addCriterion("que_tag not like", value, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagIn(List<String> values) {
            addCriterion("que_tag in", values, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagNotIn(List<String> values) {
            addCriterion("que_tag not in", values, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagBetween(String value1, String value2) {
            addCriterion("que_tag between", value1, value2, "queTag");
            return (Criteria) this;
        }

        public Criteria andQueTagNotBetween(String value1, String value2) {
            addCriterion("que_tag not between", value1, value2, "queTag");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andQueValueIsNull() {
            addCriterion("que_value is null");
            return (Criteria) this;
        }

        public Criteria andQueValueIsNotNull() {
            addCriterion("que_value is not null");
            return (Criteria) this;
        }

        public Criteria andQueValueEqualTo(String value) {
            addCriterion("que_value =", value, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueNotEqualTo(String value) {
            addCriterion("que_value <>", value, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueGreaterThan(String value) {
            addCriterion("que_value >", value, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueGreaterThanOrEqualTo(String value) {
            addCriterion("que_value >=", value, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueLessThan(String value) {
            addCriterion("que_value <", value, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueLessThanOrEqualTo(String value) {
            addCriterion("que_value <=", value, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueLike(String value) {
            addCriterion("que_value like", value, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueNotLike(String value) {
            addCriterion("que_value not like", value, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueIn(List<String> values) {
            addCriterion("que_value in", values, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueNotIn(List<String> values) {
            addCriterion("que_value not in", values, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueBetween(String value1, String value2) {
            addCriterion("que_value between", value1, value2, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueValueNotBetween(String value1, String value2) {
            addCriterion("que_value not between", value1, value2, "queValue");
            return (Criteria) this;
        }

        public Criteria andQueRankIsNull() {
            addCriterion("que_rank is null");
            return (Criteria) this;
        }

        public Criteria andQueRankIsNotNull() {
            addCriterion("que_rank is not null");
            return (Criteria) this;
        }

        public Criteria andQueRankEqualTo(String value) {
            addCriterion("que_rank =", value, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankNotEqualTo(String value) {
            addCriterion("que_rank <>", value, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankGreaterThan(String value) {
            addCriterion("que_rank >", value, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankGreaterThanOrEqualTo(String value) {
            addCriterion("que_rank >=", value, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankLessThan(String value) {
            addCriterion("que_rank <", value, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankLessThanOrEqualTo(String value) {
            addCriterion("que_rank <=", value, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankLike(String value) {
            addCriterion("que_rank like", value, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankNotLike(String value) {
            addCriterion("que_rank not like", value, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankIn(List<String> values) {
            addCriterion("que_rank in", values, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankNotIn(List<String> values) {
            addCriterion("que_rank not in", values, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankBetween(String value1, String value2) {
            addCriterion("que_rank between", value1, value2, "queRank");
            return (Criteria) this;
        }

        public Criteria andQueRankNotBetween(String value1, String value2) {
            addCriterion("que_rank not between", value1, value2, "queRank");
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