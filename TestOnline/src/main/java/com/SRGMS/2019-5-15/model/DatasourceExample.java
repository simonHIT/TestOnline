package com.SRGMS.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatasourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatasourceExample() {
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

        public Criteria andDsnameIsNull() {
            addCriterion("DSName is null");
            return (Criteria) this;
        }

        public Criteria andDsnameIsNotNull() {
            addCriterion("DSName is not null");
            return (Criteria) this;
        }

        public Criteria andDsnameEqualTo(String value) {
            addCriterion("DSName =", value, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameNotEqualTo(String value) {
            addCriterion("DSName <>", value, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameGreaterThan(String value) {
            addCriterion("DSName >", value, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameGreaterThanOrEqualTo(String value) {
            addCriterion("DSName >=", value, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameLessThan(String value) {
            addCriterion("DSName <", value, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameLessThanOrEqualTo(String value) {
            addCriterion("DSName <=", value, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameLike(String value) {
            addCriterion("DSName like", value, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameNotLike(String value) {
            addCriterion("DSName not like", value, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameIn(List<String> values) {
            addCriterion("DSName in", values, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameNotIn(List<String> values) {
            addCriterion("DSName not in", values, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameBetween(String value1, String value2) {
            addCriterion("DSName between", value1, value2, "dsname");
            return (Criteria) this;
        }

        public Criteria andDsnameNotBetween(String value1, String value2) {
            addCriterion("DSName not between", value1, value2, "dsname");
            return (Criteria) this;
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

        public Criteria andTimeIsNull() {
            addCriterion("Time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("Time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("Time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("Time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("Time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("Time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("Time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("Time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("Time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("Time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("Time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andPublicationIsNull() {
            addCriterion("Publication is null");
            return (Criteria) this;
        }

        public Criteria andPublicationIsNotNull() {
            addCriterion("Publication is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationEqualTo(String value) {
            addCriterion("Publication =", value, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationNotEqualTo(String value) {
            addCriterion("Publication <>", value, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationGreaterThan(String value) {
            addCriterion("Publication >", value, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationGreaterThanOrEqualTo(String value) {
            addCriterion("Publication >=", value, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationLessThan(String value) {
            addCriterion("Publication <", value, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationLessThanOrEqualTo(String value) {
            addCriterion("Publication <=", value, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationLike(String value) {
            addCriterion("Publication like", value, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationNotLike(String value) {
            addCriterion("Publication not like", value, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationIn(List<String> values) {
            addCriterion("Publication in", values, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationNotIn(List<String> values) {
            addCriterion("Publication not in", values, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationBetween(String value1, String value2) {
            addCriterion("Publication between", value1, value2, "publication");
            return (Criteria) this;
        }

        public Criteria andPublicationNotBetween(String value1, String value2) {
            addCriterion("Publication not between", value1, value2, "publication");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
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