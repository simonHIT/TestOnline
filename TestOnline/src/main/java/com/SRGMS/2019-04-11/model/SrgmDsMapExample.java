package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class SrgmDsMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SrgmDsMapExample() {
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

        public Criteria andMapidIsNull() {
            addCriterion("MapId is null");
            return (Criteria) this;
        }

        public Criteria andMapidIsNotNull() {
            addCriterion("MapId is not null");
            return (Criteria) this;
        }

        public Criteria andMapidEqualTo(Integer value) {
            addCriterion("MapId =", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotEqualTo(Integer value) {
            addCriterion("MapId <>", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidGreaterThan(Integer value) {
            addCriterion("MapId >", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MapId >=", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidLessThan(Integer value) {
            addCriterion("MapId <", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidLessThanOrEqualTo(Integer value) {
            addCriterion("MapId <=", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidIn(List<Integer> values) {
            addCriterion("MapId in", values, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotIn(List<Integer> values) {
            addCriterion("MapId not in", values, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidBetween(Integer value1, Integer value2) {
            addCriterion("MapId between", value1, value2, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotBetween(Integer value1, Integer value2) {
            addCriterion("MapId not between", value1, value2, "mapid");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapIsNull() {
            addCriterion("SRGMTypeId_map is null");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapIsNotNull() {
            addCriterion("SRGMTypeId_map is not null");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapEqualTo(Integer value) {
            addCriterion("SRGMTypeId_map =", value, "srgmtypeidMap");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapNotEqualTo(Integer value) {
            addCriterion("SRGMTypeId_map <>", value, "srgmtypeidMap");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapGreaterThan(Integer value) {
            addCriterion("SRGMTypeId_map >", value, "srgmtypeidMap");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapGreaterThanOrEqualTo(Integer value) {
            addCriterion("SRGMTypeId_map >=", value, "srgmtypeidMap");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapLessThan(Integer value) {
            addCriterion("SRGMTypeId_map <", value, "srgmtypeidMap");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapLessThanOrEqualTo(Integer value) {
            addCriterion("SRGMTypeId_map <=", value, "srgmtypeidMap");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapIn(List<Integer> values) {
            addCriterion("SRGMTypeId_map in", values, "srgmtypeidMap");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapNotIn(List<Integer> values) {
            addCriterion("SRGMTypeId_map not in", values, "srgmtypeidMap");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapBetween(Integer value1, Integer value2) {
            addCriterion("SRGMTypeId_map between", value1, value2, "srgmtypeidMap");
            return (Criteria) this;
        }

        public Criteria andSrgmtypeidMapNotBetween(Integer value1, Integer value2) {
            addCriterion("SRGMTypeId_map not between", value1, value2, "srgmtypeidMap");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapIsNull() {
            addCriterion("DSTypeId_map is null");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapIsNotNull() {
            addCriterion("DSTypeId_map is not null");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapEqualTo(Integer value) {
            addCriterion("DSTypeId_map =", value, "dstypeidMap");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapNotEqualTo(Integer value) {
            addCriterion("DSTypeId_map <>", value, "dstypeidMap");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapGreaterThan(Integer value) {
            addCriterion("DSTypeId_map >", value, "dstypeidMap");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapGreaterThanOrEqualTo(Integer value) {
            addCriterion("DSTypeId_map >=", value, "dstypeidMap");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapLessThan(Integer value) {
            addCriterion("DSTypeId_map <", value, "dstypeidMap");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapLessThanOrEqualTo(Integer value) {
            addCriterion("DSTypeId_map <=", value, "dstypeidMap");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapIn(List<Integer> values) {
            addCriterion("DSTypeId_map in", values, "dstypeidMap");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapNotIn(List<Integer> values) {
            addCriterion("DSTypeId_map not in", values, "dstypeidMap");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapBetween(Integer value1, Integer value2) {
            addCriterion("DSTypeId_map between", value1, value2, "dstypeidMap");
            return (Criteria) this;
        }

        public Criteria andDstypeidMapNotBetween(Integer value1, Integer value2) {
            addCriterion("DSTypeId_map not between", value1, value2, "dstypeidMap");
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