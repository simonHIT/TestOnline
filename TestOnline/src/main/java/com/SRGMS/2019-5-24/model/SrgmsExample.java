package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class SrgmsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SrgmsExample() {
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

        public Criteria andSrgmidIsNull() {
            addCriterion("SRGMId is null");
            return (Criteria) this;
        }

        public Criteria andSrgmidIsNotNull() {
            addCriterion("SRGMId is not null");
            return (Criteria) this;
        }

        public Criteria andSrgmidEqualTo(Integer value) {
            addCriterion("SRGMId =", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidNotEqualTo(Integer value) {
            addCriterion("SRGMId <>", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidGreaterThan(Integer value) {
            addCriterion("SRGMId >", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SRGMId >=", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidLessThan(Integer value) {
            addCriterion("SRGMId <", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidLessThanOrEqualTo(Integer value) {
            addCriterion("SRGMId <=", value, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidIn(List<Integer> values) {
            addCriterion("SRGMId in", values, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidNotIn(List<Integer> values) {
            addCriterion("SRGMId not in", values, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidBetween(Integer value1, Integer value2) {
            addCriterion("SRGMId between", value1, value2, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmidNotBetween(Integer value1, Integer value2) {
            addCriterion("SRGMId not between", value1, value2, "srgmid");
            return (Criteria) this;
        }

        public Criteria andSrgmnameIsNull() {
            addCriterion("SRGMName is null");
            return (Criteria) this;
        }

        public Criteria andSrgmnameIsNotNull() {
            addCriterion("SRGMName is not null");
            return (Criteria) this;
        }

        public Criteria andSrgmnameEqualTo(String value) {
            addCriterion("SRGMName =", value, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameNotEqualTo(String value) {
            addCriterion("SRGMName <>", value, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameGreaterThan(String value) {
            addCriterion("SRGMName >", value, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameGreaterThanOrEqualTo(String value) {
            addCriterion("SRGMName >=", value, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameLessThan(String value) {
            addCriterion("SRGMName <", value, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameLessThanOrEqualTo(String value) {
            addCriterion("SRGMName <=", value, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameLike(String value) {
            addCriterion("SRGMName like", value, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameNotLike(String value) {
            addCriterion("SRGMName not like", value, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameIn(List<String> values) {
            addCriterion("SRGMName in", values, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameNotIn(List<String> values) {
            addCriterion("SRGMName not in", values, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameBetween(String value1, String value2) {
            addCriterion("SRGMName between", value1, value2, "srgmname");
            return (Criteria) this;
        }

        public Criteria andSrgmnameNotBetween(String value1, String value2) {
            addCriterion("SRGMName not between", value1, value2, "srgmname");
            return (Criteria) this;
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

        public Criteria andEmeternumIsNull() {
            addCriterion("EmeterNum is null");
            return (Criteria) this;
        }

        public Criteria andEmeternumIsNotNull() {
            addCriterion("EmeterNum is not null");
            return (Criteria) this;
        }

        public Criteria andEmeternumEqualTo(Integer value) {
            addCriterion("EmeterNum =", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumNotEqualTo(Integer value) {
            addCriterion("EmeterNum <>", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumGreaterThan(Integer value) {
            addCriterion("EmeterNum >", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmeterNum >=", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumLessThan(Integer value) {
            addCriterion("EmeterNum <", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumLessThanOrEqualTo(Integer value) {
            addCriterion("EmeterNum <=", value, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumIn(List<Integer> values) {
            addCriterion("EmeterNum in", values, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumNotIn(List<Integer> values) {
            addCriterion("EmeterNum not in", values, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumBetween(Integer value1, Integer value2) {
            addCriterion("EmeterNum between", value1, value2, "emeternum");
            return (Criteria) this;
        }

        public Criteria andEmeternumNotBetween(Integer value1, Integer value2) {
            addCriterion("EmeterNum not between", value1, value2, "emeternum");
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