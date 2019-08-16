package com.testOnline.model;

import java.util.ArrayList;
import java.util.List;

public class TestPaperToQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestPaperToQuestionExample() {
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

        public Criteria andTestPaperIdIsNull() {
            addCriterion("test_paper_id is null");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdIsNotNull() {
            addCriterion("test_paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdEqualTo(Integer value) {
            addCriterion("test_paper_id =", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdNotEqualTo(Integer value) {
            addCriterion("test_paper_id <>", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdGreaterThan(Integer value) {
            addCriterion("test_paper_id >", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_paper_id >=", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdLessThan(Integer value) {
            addCriterion("test_paper_id <", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_paper_id <=", value, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdIn(List<Integer> values) {
            addCriterion("test_paper_id in", values, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdNotIn(List<Integer> values) {
            addCriterion("test_paper_id not in", values, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("test_paper_id between", value1, value2, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_paper_id not between", value1, value2, "testPaperId");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdIsNull() {
            addCriterion("test_paper_state_record_id is null");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdIsNotNull() {
            addCriterion("test_paper_state_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdEqualTo(Integer value) {
            addCriterion("test_paper_state_record_id =", value, "testPaperStateRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdNotEqualTo(Integer value) {
            addCriterion("test_paper_state_record_id <>", value, "testPaperStateRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdGreaterThan(Integer value) {
            addCriterion("test_paper_state_record_id >", value, "testPaperStateRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_paper_state_record_id >=", value, "testPaperStateRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdLessThan(Integer value) {
            addCriterion("test_paper_state_record_id <", value, "testPaperStateRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_paper_state_record_id <=", value, "testPaperStateRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdIn(List<Integer> values) {
            addCriterion("test_paper_state_record_id in", values, "testPaperStateRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdNotIn(List<Integer> values) {
            addCriterion("test_paper_state_record_id not in", values, "testPaperStateRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("test_paper_state_record_id between", value1, value2, "testPaperStateRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperStateRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_paper_state_record_id not between", value1, value2, "testPaperStateRecordId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdIsNull() {
            addCriterion("user_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserUserIdIsNotNull() {
            addCriterion("user_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserUserIdEqualTo(Integer value) {
            addCriterion("user_user_id =", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdNotEqualTo(Integer value) {
            addCriterion("user_user_id <>", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdGreaterThan(Integer value) {
            addCriterion("user_user_id >", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_user_id >=", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdLessThan(Integer value) {
            addCriterion("user_user_id <", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_user_id <=", value, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdIn(List<Integer> values) {
            addCriterion("user_user_id in", values, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdNotIn(List<Integer> values) {
            addCriterion("user_user_id not in", values, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_user_id between", value1, value2, "userUserId");
            return (Criteria) this;
        }

        public Criteria andUserUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_user_id not between", value1, value2, "userUserId");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdIsNull() {
            addCriterion("test_paper_score_record_id is null");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdIsNotNull() {
            addCriterion("test_paper_score_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdEqualTo(Integer value) {
            addCriterion("test_paper_score_record_id =", value, "testPaperScoreRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdNotEqualTo(Integer value) {
            addCriterion("test_paper_score_record_id <>", value, "testPaperScoreRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdGreaterThan(Integer value) {
            addCriterion("test_paper_score_record_id >", value, "testPaperScoreRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_paper_score_record_id >=", value, "testPaperScoreRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdLessThan(Integer value) {
            addCriterion("test_paper_score_record_id <", value, "testPaperScoreRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_paper_score_record_id <=", value, "testPaperScoreRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdIn(List<Integer> values) {
            addCriterion("test_paper_score_record_id in", values, "testPaperScoreRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdNotIn(List<Integer> values) {
            addCriterion("test_paper_score_record_id not in", values, "testPaperScoreRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("test_paper_score_record_id between", value1, value2, "testPaperScoreRecordId");
            return (Criteria) this;
        }

        public Criteria andTestPaperScoreRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_paper_score_record_id not between", value1, value2, "testPaperScoreRecordId");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdIsNull() {
            addCriterion("question_que_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdIsNotNull() {
            addCriterion("question_que_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdEqualTo(Integer value) {
            addCriterion("question_que_id =", value, "questionQueId");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdNotEqualTo(Integer value) {
            addCriterion("question_que_id <>", value, "questionQueId");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdGreaterThan(Integer value) {
            addCriterion("question_que_id >", value, "questionQueId");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_que_id >=", value, "questionQueId");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdLessThan(Integer value) {
            addCriterion("question_que_id <", value, "questionQueId");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_que_id <=", value, "questionQueId");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdIn(List<Integer> values) {
            addCriterion("question_que_id in", values, "questionQueId");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdNotIn(List<Integer> values) {
            addCriterion("question_que_id not in", values, "questionQueId");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdBetween(Integer value1, Integer value2) {
            addCriterion("question_que_id between", value1, value2, "questionQueId");
            return (Criteria) this;
        }

        public Criteria andQuestionQueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_que_id not between", value1, value2, "questionQueId");
            return (Criteria) this;
        }

        public Criteria andUserGradeIsNull() {
            addCriterion("user_grade is null");
            return (Criteria) this;
        }

        public Criteria andUserGradeIsNotNull() {
            addCriterion("user_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUserGradeEqualTo(String value) {
            addCriterion("user_grade =", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotEqualTo(String value) {
            addCriterion("user_grade <>", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeGreaterThan(String value) {
            addCriterion("user_grade >", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeGreaterThanOrEqualTo(String value) {
            addCriterion("user_grade >=", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLessThan(String value) {
            addCriterion("user_grade <", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLessThanOrEqualTo(String value) {
            addCriterion("user_grade <=", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLike(String value) {
            addCriterion("user_grade like", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotLike(String value) {
            addCriterion("user_grade not like", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeIn(List<String> values) {
            addCriterion("user_grade in", values, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotIn(List<String> values) {
            addCriterion("user_grade not in", values, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeBetween(String value1, String value2) {
            addCriterion("user_grade between", value1, value2, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotBetween(String value1, String value2) {
            addCriterion("user_grade not between", value1, value2, "userGrade");
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