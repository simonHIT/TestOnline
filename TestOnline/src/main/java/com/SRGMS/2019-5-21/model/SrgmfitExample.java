package com.SRGMS.model;

import java.util.ArrayList;
import java.util.List;

public class SrgmfitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SrgmfitExample() {
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

        public Criteria andSrgmfitidIsNull() {
            addCriterion("SRGMFitId is null");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidIsNotNull() {
            addCriterion("SRGMFitId is not null");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidEqualTo(Integer value) {
            addCriterion("SRGMFitId =", value, "srgmfitid");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidNotEqualTo(Integer value) {
            addCriterion("SRGMFitId <>", value, "srgmfitid");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidGreaterThan(Integer value) {
            addCriterion("SRGMFitId >", value, "srgmfitid");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SRGMFitId >=", value, "srgmfitid");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidLessThan(Integer value) {
            addCriterion("SRGMFitId <", value, "srgmfitid");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidLessThanOrEqualTo(Integer value) {
            addCriterion("SRGMFitId <=", value, "srgmfitid");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidIn(List<Integer> values) {
            addCriterion("SRGMFitId in", values, "srgmfitid");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidNotIn(List<Integer> values) {
            addCriterion("SRGMFitId not in", values, "srgmfitid");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidBetween(Integer value1, Integer value2) {
            addCriterion("SRGMFitId between", value1, value2, "srgmfitid");
            return (Criteria) this;
        }

        public Criteria andSrgmfitidNotBetween(Integer value1, Integer value2) {
            addCriterion("SRGMFitId not between", value1, value2, "srgmfitid");
            return (Criteria) this;
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

        public Criteria andMseIsNull() {
            addCriterion("MSE is null");
            return (Criteria) this;
        }

        public Criteria andMseIsNotNull() {
            addCriterion("MSE is not null");
            return (Criteria) this;
        }

        public Criteria andMseEqualTo(Double value) {
            addCriterion("MSE =", value, "mse");
            return (Criteria) this;
        }

        public Criteria andMseNotEqualTo(Double value) {
            addCriterion("MSE <>", value, "mse");
            return (Criteria) this;
        }

        public Criteria andMseGreaterThan(Double value) {
            addCriterion("MSE >", value, "mse");
            return (Criteria) this;
        }

        public Criteria andMseGreaterThanOrEqualTo(Double value) {
            addCriterion("MSE >=", value, "mse");
            return (Criteria) this;
        }

        public Criteria andMseLessThan(Double value) {
            addCriterion("MSE <", value, "mse");
            return (Criteria) this;
        }

        public Criteria andMseLessThanOrEqualTo(Double value) {
            addCriterion("MSE <=", value, "mse");
            return (Criteria) this;
        }

        public Criteria andMseIn(List<Double> values) {
            addCriterion("MSE in", values, "mse");
            return (Criteria) this;
        }

        public Criteria andMseNotIn(List<Double> values) {
            addCriterion("MSE not in", values, "mse");
            return (Criteria) this;
        }

        public Criteria andMseBetween(Double value1, Double value2) {
            addCriterion("MSE between", value1, value2, "mse");
            return (Criteria) this;
        }

        public Criteria andMseNotBetween(Double value1, Double value2) {
            addCriterion("MSE not between", value1, value2, "mse");
            return (Criteria) this;
        }

        public Criteria andMeopIsNull() {
            addCriterion("MEOP is null");
            return (Criteria) this;
        }

        public Criteria andMeopIsNotNull() {
            addCriterion("MEOP is not null");
            return (Criteria) this;
        }

        public Criteria andMeopEqualTo(Double value) {
            addCriterion("MEOP =", value, "meop");
            return (Criteria) this;
        }

        public Criteria andMeopNotEqualTo(Double value) {
            addCriterion("MEOP <>", value, "meop");
            return (Criteria) this;
        }

        public Criteria andMeopGreaterThan(Double value) {
            addCriterion("MEOP >", value, "meop");
            return (Criteria) this;
        }

        public Criteria andMeopGreaterThanOrEqualTo(Double value) {
            addCriterion("MEOP >=", value, "meop");
            return (Criteria) this;
        }

        public Criteria andMeopLessThan(Double value) {
            addCriterion("MEOP <", value, "meop");
            return (Criteria) this;
        }

        public Criteria andMeopLessThanOrEqualTo(Double value) {
            addCriterion("MEOP <=", value, "meop");
            return (Criteria) this;
        }

        public Criteria andMeopIn(List<Double> values) {
            addCriterion("MEOP in", values, "meop");
            return (Criteria) this;
        }

        public Criteria andMeopNotIn(List<Double> values) {
            addCriterion("MEOP not in", values, "meop");
            return (Criteria) this;
        }

        public Criteria andMeopBetween(Double value1, Double value2) {
            addCriterion("MEOP between", value1, value2, "meop");
            return (Criteria) this;
        }

        public Criteria andMeopNotBetween(Double value1, Double value2) {
            addCriterion("MEOP not between", value1, value2, "meop");
            return (Criteria) this;
        }

        public Criteria andRsquareIsNull() {
            addCriterion("RSquare is null");
            return (Criteria) this;
        }

        public Criteria andRsquareIsNotNull() {
            addCriterion("RSquare is not null");
            return (Criteria) this;
        }

        public Criteria andRsquareEqualTo(Double value) {
            addCriterion("RSquare =", value, "rsquare");
            return (Criteria) this;
        }

        public Criteria andRsquareNotEqualTo(Double value) {
            addCriterion("RSquare <>", value, "rsquare");
            return (Criteria) this;
        }

        public Criteria andRsquareGreaterThan(Double value) {
            addCriterion("RSquare >", value, "rsquare");
            return (Criteria) this;
        }

        public Criteria andRsquareGreaterThanOrEqualTo(Double value) {
            addCriterion("RSquare >=", value, "rsquare");
            return (Criteria) this;
        }

        public Criteria andRsquareLessThan(Double value) {
            addCriterion("RSquare <", value, "rsquare");
            return (Criteria) this;
        }

        public Criteria andRsquareLessThanOrEqualTo(Double value) {
            addCriterion("RSquare <=", value, "rsquare");
            return (Criteria) this;
        }

        public Criteria andRsquareIn(List<Double> values) {
            addCriterion("RSquare in", values, "rsquare");
            return (Criteria) this;
        }

        public Criteria andRsquareNotIn(List<Double> values) {
            addCriterion("RSquare not in", values, "rsquare");
            return (Criteria) this;
        }

        public Criteria andRsquareBetween(Double value1, Double value2) {
            addCriterion("RSquare between", value1, value2, "rsquare");
            return (Criteria) this;
        }

        public Criteria andRsquareNotBetween(Double value1, Double value2) {
            addCriterion("RSquare not between", value1, value2, "rsquare");
            return (Criteria) this;
        }

        public Criteria andVariationIsNull() {
            addCriterion("Variation is null");
            return (Criteria) this;
        }

        public Criteria andVariationIsNotNull() {
            addCriterion("Variation is not null");
            return (Criteria) this;
        }

        public Criteria andVariationEqualTo(Double value) {
            addCriterion("Variation =", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotEqualTo(Double value) {
            addCriterion("Variation <>", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationGreaterThan(Double value) {
            addCriterion("Variation >", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationGreaterThanOrEqualTo(Double value) {
            addCriterion("Variation >=", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationLessThan(Double value) {
            addCriterion("Variation <", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationLessThanOrEqualTo(Double value) {
            addCriterion("Variation <=", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationIn(List<Double> values) {
            addCriterion("Variation in", values, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotIn(List<Double> values) {
            addCriterion("Variation not in", values, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationBetween(Double value1, Double value2) {
            addCriterion("Variation between", value1, value2, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotBetween(Double value1, Double value2) {
            addCriterion("Variation not between", value1, value2, "variation");
            return (Criteria) this;
        }

        public Criteria andRmsPeIsNull() {
            addCriterion("RMS_PE is null");
            return (Criteria) this;
        }

        public Criteria andRmsPeIsNotNull() {
            addCriterion("RMS_PE is not null");
            return (Criteria) this;
        }

        public Criteria andRmsPeEqualTo(Double value) {
            addCriterion("RMS_PE =", value, "rmsPe");
            return (Criteria) this;
        }

        public Criteria andRmsPeNotEqualTo(Double value) {
            addCriterion("RMS_PE <>", value, "rmsPe");
            return (Criteria) this;
        }

        public Criteria andRmsPeGreaterThan(Double value) {
            addCriterion("RMS_PE >", value, "rmsPe");
            return (Criteria) this;
        }

        public Criteria andRmsPeGreaterThanOrEqualTo(Double value) {
            addCriterion("RMS_PE >=", value, "rmsPe");
            return (Criteria) this;
        }

        public Criteria andRmsPeLessThan(Double value) {
            addCriterion("RMS_PE <", value, "rmsPe");
            return (Criteria) this;
        }

        public Criteria andRmsPeLessThanOrEqualTo(Double value) {
            addCriterion("RMS_PE <=", value, "rmsPe");
            return (Criteria) this;
        }

        public Criteria andRmsPeIn(List<Double> values) {
            addCriterion("RMS_PE in", values, "rmsPe");
            return (Criteria) this;
        }

        public Criteria andRmsPeNotIn(List<Double> values) {
            addCriterion("RMS_PE not in", values, "rmsPe");
            return (Criteria) this;
        }

        public Criteria andRmsPeBetween(Double value1, Double value2) {
            addCriterion("RMS_PE between", value1, value2, "rmsPe");
            return (Criteria) this;
        }

        public Criteria andRmsPeNotBetween(Double value1, Double value2) {
            addCriterion("RMS_PE not between", value1, value2, "rmsPe");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("TS is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("TS is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Double value) {
            addCriterion("TS =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Double value) {
            addCriterion("TS <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Double value) {
            addCriterion("TS >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Double value) {
            addCriterion("TS >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Double value) {
            addCriterion("TS <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Double value) {
            addCriterion("TS <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Double> values) {
            addCriterion("TS in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Double> values) {
            addCriterion("TS not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Double value1, Double value2) {
            addCriterion("TS between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Double value1, Double value2) {
            addCriterion("TS not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andBmmreIsNull() {
            addCriterion("BMMRE is null");
            return (Criteria) this;
        }

        public Criteria andBmmreIsNotNull() {
            addCriterion("BMMRE is not null");
            return (Criteria) this;
        }

        public Criteria andBmmreEqualTo(Double value) {
            addCriterion("BMMRE =", value, "bmmre");
            return (Criteria) this;
        }

        public Criteria andBmmreNotEqualTo(Double value) {
            addCriterion("BMMRE <>", value, "bmmre");
            return (Criteria) this;
        }

        public Criteria andBmmreGreaterThan(Double value) {
            addCriterion("BMMRE >", value, "bmmre");
            return (Criteria) this;
        }

        public Criteria andBmmreGreaterThanOrEqualTo(Double value) {
            addCriterion("BMMRE >=", value, "bmmre");
            return (Criteria) this;
        }

        public Criteria andBmmreLessThan(Double value) {
            addCriterion("BMMRE <", value, "bmmre");
            return (Criteria) this;
        }

        public Criteria andBmmreLessThanOrEqualTo(Double value) {
            addCriterion("BMMRE <=", value, "bmmre");
            return (Criteria) this;
        }

        public Criteria andBmmreIn(List<Double> values) {
            addCriterion("BMMRE in", values, "bmmre");
            return (Criteria) this;
        }

        public Criteria andBmmreNotIn(List<Double> values) {
            addCriterion("BMMRE not in", values, "bmmre");
            return (Criteria) this;
        }

        public Criteria andBmmreBetween(Double value1, Double value2) {
            addCriterion("BMMRE between", value1, value2, "bmmre");
            return (Criteria) this;
        }

        public Criteria andBmmreNotBetween(Double value1, Double value2) {
            addCriterion("BMMRE not between", value1, value2, "bmmre");
            return (Criteria) this;
        }

        public Criteria andFitpathIsNull() {
            addCriterion("FitPath is null");
            return (Criteria) this;
        }

        public Criteria andFitpathIsNotNull() {
            addCriterion("FitPath is not null");
            return (Criteria) this;
        }

        public Criteria andFitpathEqualTo(String value) {
            addCriterion("FitPath =", value, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathNotEqualTo(String value) {
            addCriterion("FitPath <>", value, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathGreaterThan(String value) {
            addCriterion("FitPath >", value, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathGreaterThanOrEqualTo(String value) {
            addCriterion("FitPath >=", value, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathLessThan(String value) {
            addCriterion("FitPath <", value, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathLessThanOrEqualTo(String value) {
            addCriterion("FitPath <=", value, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathLike(String value) {
            addCriterion("FitPath like", value, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathNotLike(String value) {
            addCriterion("FitPath not like", value, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathIn(List<String> values) {
            addCriterion("FitPath in", values, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathNotIn(List<String> values) {
            addCriterion("FitPath not in", values, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathBetween(String value1, String value2) {
            addCriterion("FitPath between", value1, value2, "fitpath");
            return (Criteria) this;
        }

        public Criteria andFitpathNotBetween(String value1, String value2) {
            addCriterion("FitPath not between", value1, value2, "fitpath");
            return (Criteria) this;
        }

        public Criteria andRepathIsNull() {
            addCriterion("REPath is null");
            return (Criteria) this;
        }

        public Criteria andRepathIsNotNull() {
            addCriterion("REPath is not null");
            return (Criteria) this;
        }

        public Criteria andRepathEqualTo(String value) {
            addCriterion("REPath =", value, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathNotEqualTo(String value) {
            addCriterion("REPath <>", value, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathGreaterThan(String value) {
            addCriterion("REPath >", value, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathGreaterThanOrEqualTo(String value) {
            addCriterion("REPath >=", value, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathLessThan(String value) {
            addCriterion("REPath <", value, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathLessThanOrEqualTo(String value) {
            addCriterion("REPath <=", value, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathLike(String value) {
            addCriterion("REPath like", value, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathNotLike(String value) {
            addCriterion("REPath not like", value, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathIn(List<String> values) {
            addCriterion("REPath in", values, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathNotIn(List<String> values) {
            addCriterion("REPath not in", values, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathBetween(String value1, String value2) {
            addCriterion("REPath between", value1, value2, "repath");
            return (Criteria) this;
        }

        public Criteria andRepathNotBetween(String value1, String value2) {
            addCriterion("REPath not between", value1, value2, "repath");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNull() {
            addCriterion("ownerId is null");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNotNull() {
            addCriterion("ownerId is not null");
            return (Criteria) this;
        }

        public Criteria andOwneridEqualTo(Integer value) {
            addCriterion("ownerId =", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotEqualTo(Integer value) {
            addCriterion("ownerId <>", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThan(Integer value) {
            addCriterion("ownerId >", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ownerId >=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThan(Integer value) {
            addCriterion("ownerId <", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThanOrEqualTo(Integer value) {
            addCriterion("ownerId <=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridIn(List<Integer> values) {
            addCriterion("ownerId in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotIn(List<Integer> values) {
            addCriterion("ownerId not in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridBetween(Integer value1, Integer value2) {
            addCriterion("ownerId between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotBetween(Integer value1, Integer value2) {
            addCriterion("ownerId not between", value1, value2, "ownerid");
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