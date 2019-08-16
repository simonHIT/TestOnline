package com.testOnline.model;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCourseTagIsNull() {
            addCriterion("course_tag is null");
            return (Criteria) this;
        }

        public Criteria andCourseTagIsNotNull() {
            addCriterion("course_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTagEqualTo(String value) {
            addCriterion("course_tag =", value, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagNotEqualTo(String value) {
            addCriterion("course_tag <>", value, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagGreaterThan(String value) {
            addCriterion("course_tag >", value, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagGreaterThanOrEqualTo(String value) {
            addCriterion("course_tag >=", value, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagLessThan(String value) {
            addCriterion("course_tag <", value, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagLessThanOrEqualTo(String value) {
            addCriterion("course_tag <=", value, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagLike(String value) {
            addCriterion("course_tag like", value, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagNotLike(String value) {
            addCriterion("course_tag not like", value, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagIn(List<String> values) {
            addCriterion("course_tag in", values, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagNotIn(List<String> values) {
            addCriterion("course_tag not in", values, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagBetween(String value1, String value2) {
            addCriterion("course_tag between", value1, value2, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseTagNotBetween(String value1, String value2) {
            addCriterion("course_tag not between", value1, value2, "courseTag");
            return (Criteria) this;
        }

        public Criteria andCourseImgIsNull() {
            addCriterion("course_img is null");
            return (Criteria) this;
        }

        public Criteria andCourseImgIsNotNull() {
            addCriterion("course_img is not null");
            return (Criteria) this;
        }

        public Criteria andCourseImgEqualTo(String value) {
            addCriterion("course_img =", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotEqualTo(String value) {
            addCriterion("course_img <>", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgGreaterThan(String value) {
            addCriterion("course_img >", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgGreaterThanOrEqualTo(String value) {
            addCriterion("course_img >=", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgLessThan(String value) {
            addCriterion("course_img <", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgLessThanOrEqualTo(String value) {
            addCriterion("course_img <=", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgLike(String value) {
            addCriterion("course_img like", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotLike(String value) {
            addCriterion("course_img not like", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgIn(List<String> values) {
            addCriterion("course_img in", values, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotIn(List<String> values) {
            addCriterion("course_img not in", values, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgBetween(String value1, String value2) {
            addCriterion("course_img between", value1, value2, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotBetween(String value1, String value2) {
            addCriterion("course_img not between", value1, value2, "courseImg");
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