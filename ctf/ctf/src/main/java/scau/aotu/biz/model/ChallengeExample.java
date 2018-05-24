package scau.aotu.biz.model;

import java.util.ArrayList;
import java.util.List;

public class ChallengeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChallengeExample() {
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

        public Criteria andChalIdIsNull() {
            addCriterion("chal_id is null");
            return (Criteria) this;
        }

        public Criteria andChalIdIsNotNull() {
            addCriterion("chal_id is not null");
            return (Criteria) this;
        }

        public Criteria andChalIdEqualTo(String value) {
            addCriterion("chal_id =", value, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdNotEqualTo(String value) {
            addCriterion("chal_id <>", value, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdGreaterThan(String value) {
            addCriterion("chal_id >", value, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdGreaterThanOrEqualTo(String value) {
            addCriterion("chal_id >=", value, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdLessThan(String value) {
            addCriterion("chal_id <", value, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdLessThanOrEqualTo(String value) {
            addCriterion("chal_id <=", value, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdLike(String value) {
            addCriterion("chal_id like", value, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdNotLike(String value) {
            addCriterion("chal_id not like", value, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdIn(List<String> values) {
            addCriterion("chal_id in", values, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdNotIn(List<String> values) {
            addCriterion("chal_id not in", values, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdBetween(String value1, String value2) {
            addCriterion("chal_id between", value1, value2, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalIdNotBetween(String value1, String value2) {
            addCriterion("chal_id not between", value1, value2, "chalId");
            return (Criteria) this;
        }

        public Criteria andChalNameIsNull() {
            addCriterion("chal_name is null");
            return (Criteria) this;
        }

        public Criteria andChalNameIsNotNull() {
            addCriterion("chal_name is not null");
            return (Criteria) this;
        }

        public Criteria andChalNameEqualTo(String value) {
            addCriterion("chal_name =", value, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameNotEqualTo(String value) {
            addCriterion("chal_name <>", value, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameGreaterThan(String value) {
            addCriterion("chal_name >", value, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameGreaterThanOrEqualTo(String value) {
            addCriterion("chal_name >=", value, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameLessThan(String value) {
            addCriterion("chal_name <", value, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameLessThanOrEqualTo(String value) {
            addCriterion("chal_name <=", value, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameLike(String value) {
            addCriterion("chal_name like", value, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameNotLike(String value) {
            addCriterion("chal_name not like", value, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameIn(List<String> values) {
            addCriterion("chal_name in", values, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameNotIn(List<String> values) {
            addCriterion("chal_name not in", values, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameBetween(String value1, String value2) {
            addCriterion("chal_name between", value1, value2, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalNameNotBetween(String value1, String value2) {
            addCriterion("chal_name not between", value1, value2, "chalName");
            return (Criteria) this;
        }

        public Criteria andChalDescIsNull() {
            addCriterion("chal_desc is null");
            return (Criteria) this;
        }

        public Criteria andChalDescIsNotNull() {
            addCriterion("chal_desc is not null");
            return (Criteria) this;
        }

        public Criteria andChalDescEqualTo(String value) {
            addCriterion("chal_desc =", value, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescNotEqualTo(String value) {
            addCriterion("chal_desc <>", value, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescGreaterThan(String value) {
            addCriterion("chal_desc >", value, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescGreaterThanOrEqualTo(String value) {
            addCriterion("chal_desc >=", value, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescLessThan(String value) {
            addCriterion("chal_desc <", value, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescLessThanOrEqualTo(String value) {
            addCriterion("chal_desc <=", value, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescLike(String value) {
            addCriterion("chal_desc like", value, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescNotLike(String value) {
            addCriterion("chal_desc not like", value, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescIn(List<String> values) {
            addCriterion("chal_desc in", values, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescNotIn(List<String> values) {
            addCriterion("chal_desc not in", values, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescBetween(String value1, String value2) {
            addCriterion("chal_desc between", value1, value2, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andChalDescNotBetween(String value1, String value2) {
            addCriterion("chal_desc not between", value1, value2, "chalDesc");
            return (Criteria) this;
        }

        public Criteria andCataIdIsNull() {
            addCriterion("cata_id is null");
            return (Criteria) this;
        }

        public Criteria andCataIdIsNotNull() {
            addCriterion("cata_id is not null");
            return (Criteria) this;
        }

        public Criteria andCataIdEqualTo(Integer value) {
            addCriterion("cata_id =", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdNotEqualTo(Integer value) {
            addCriterion("cata_id <>", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdGreaterThan(Integer value) {
            addCriterion("cata_id >", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cata_id >=", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdLessThan(Integer value) {
            addCriterion("cata_id <", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdLessThanOrEqualTo(Integer value) {
            addCriterion("cata_id <=", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdIn(List<Integer> values) {
            addCriterion("cata_id in", values, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdNotIn(List<Integer> values) {
            addCriterion("cata_id not in", values, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdBetween(Integer value1, Integer value2) {
            addCriterion("cata_id between", value1, value2, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cata_id not between", value1, value2, "cataId");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andChalScoreIsNull() {
            addCriterion("chal_score is null");
            return (Criteria) this;
        }

        public Criteria andChalScoreIsNotNull() {
            addCriterion("chal_score is not null");
            return (Criteria) this;
        }

        public Criteria andChalScoreEqualTo(Integer value) {
            addCriterion("chal_score =", value, "chalScore");
            return (Criteria) this;
        }

        public Criteria andChalScoreNotEqualTo(Integer value) {
            addCriterion("chal_score <>", value, "chalScore");
            return (Criteria) this;
        }

        public Criteria andChalScoreGreaterThan(Integer value) {
            addCriterion("chal_score >", value, "chalScore");
            return (Criteria) this;
        }

        public Criteria andChalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("chal_score >=", value, "chalScore");
            return (Criteria) this;
        }

        public Criteria andChalScoreLessThan(Integer value) {
            addCriterion("chal_score <", value, "chalScore");
            return (Criteria) this;
        }

        public Criteria andChalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("chal_score <=", value, "chalScore");
            return (Criteria) this;
        }

        public Criteria andChalScoreIn(List<Integer> values) {
            addCriterion("chal_score in", values, "chalScore");
            return (Criteria) this;
        }

        public Criteria andChalScoreNotIn(List<Integer> values) {
            addCriterion("chal_score not in", values, "chalScore");
            return (Criteria) this;
        }

        public Criteria andChalScoreBetween(Integer value1, Integer value2) {
            addCriterion("chal_score between", value1, value2, "chalScore");
            return (Criteria) this;
        }

        public Criteria andChalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("chal_score not between", value1, value2, "chalScore");
            return (Criteria) this;
        }

        public Criteria andChalSourceIsNull() {
            addCriterion("chal_source is null");
            return (Criteria) this;
        }

        public Criteria andChalSourceIsNotNull() {
            addCriterion("chal_source is not null");
            return (Criteria) this;
        }

        public Criteria andChalSourceEqualTo(String value) {
            addCriterion("chal_source =", value, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceNotEqualTo(String value) {
            addCriterion("chal_source <>", value, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceGreaterThan(String value) {
            addCriterion("chal_source >", value, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceGreaterThanOrEqualTo(String value) {
            addCriterion("chal_source >=", value, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceLessThan(String value) {
            addCriterion("chal_source <", value, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceLessThanOrEqualTo(String value) {
            addCriterion("chal_source <=", value, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceLike(String value) {
            addCriterion("chal_source like", value, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceNotLike(String value) {
            addCriterion("chal_source not like", value, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceIn(List<String> values) {
            addCriterion("chal_source in", values, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceNotIn(List<String> values) {
            addCriterion("chal_source not in", values, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceBetween(String value1, String value2) {
            addCriterion("chal_source between", value1, value2, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalSourceNotBetween(String value1, String value2) {
            addCriterion("chal_source not between", value1, value2, "chalSource");
            return (Criteria) this;
        }

        public Criteria andChalPointIsNull() {
            addCriterion("chal_point is null");
            return (Criteria) this;
        }

        public Criteria andChalPointIsNotNull() {
            addCriterion("chal_point is not null");
            return (Criteria) this;
        }

        public Criteria andChalPointEqualTo(String value) {
            addCriterion("chal_point =", value, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointNotEqualTo(String value) {
            addCriterion("chal_point <>", value, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointGreaterThan(String value) {
            addCriterion("chal_point >", value, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointGreaterThanOrEqualTo(String value) {
            addCriterion("chal_point >=", value, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointLessThan(String value) {
            addCriterion("chal_point <", value, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointLessThanOrEqualTo(String value) {
            addCriterion("chal_point <=", value, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointLike(String value) {
            addCriterion("chal_point like", value, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointNotLike(String value) {
            addCriterion("chal_point not like", value, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointIn(List<String> values) {
            addCriterion("chal_point in", values, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointNotIn(List<String> values) {
            addCriterion("chal_point not in", values, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointBetween(String value1, String value2) {
            addCriterion("chal_point between", value1, value2, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andChalPointNotBetween(String value1, String value2) {
            addCriterion("chal_point not between", value1, value2, "chalPoint");
            return (Criteria) this;
        }

        public Criteria andWriteupIsNull() {
            addCriterion("writeup is null");
            return (Criteria) this;
        }

        public Criteria andWriteupIsNotNull() {
            addCriterion("writeup is not null");
            return (Criteria) this;
        }

        public Criteria andWriteupEqualTo(String value) {
            addCriterion("writeup =", value, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupNotEqualTo(String value) {
            addCriterion("writeup <>", value, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupGreaterThan(String value) {
            addCriterion("writeup >", value, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupGreaterThanOrEqualTo(String value) {
            addCriterion("writeup >=", value, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupLessThan(String value) {
            addCriterion("writeup <", value, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupLessThanOrEqualTo(String value) {
            addCriterion("writeup <=", value, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupLike(String value) {
            addCriterion("writeup like", value, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupNotLike(String value) {
            addCriterion("writeup not like", value, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupIn(List<String> values) {
            addCriterion("writeup in", values, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupNotIn(List<String> values) {
            addCriterion("writeup not in", values, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupBetween(String value1, String value2) {
            addCriterion("writeup between", value1, value2, "writeup");
            return (Criteria) this;
        }

        public Criteria andWriteupNotBetween(String value1, String value2) {
            addCriterion("writeup not between", value1, value2, "writeup");
            return (Criteria) this;
        }

        public Criteria andShowStateIsNull() {
            addCriterion("show_state is null");
            return (Criteria) this;
        }

        public Criteria andShowStateIsNotNull() {
            addCriterion("show_state is not null");
            return (Criteria) this;
        }

        public Criteria andShowStateEqualTo(Integer value) {
            addCriterion("show_state =", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateNotEqualTo(Integer value) {
            addCriterion("show_state <>", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateGreaterThan(Integer value) {
            addCriterion("show_state >", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_state >=", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateLessThan(Integer value) {
            addCriterion("show_state <", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateLessThanOrEqualTo(Integer value) {
            addCriterion("show_state <=", value, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateIn(List<Integer> values) {
            addCriterion("show_state in", values, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateNotIn(List<Integer> values) {
            addCriterion("show_state not in", values, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateBetween(Integer value1, Integer value2) {
            addCriterion("show_state between", value1, value2, "showState");
            return (Criteria) this;
        }

        public Criteria andShowStateNotBetween(Integer value1, Integer value2) {
            addCriterion("show_state not between", value1, value2, "showState");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(String value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(String value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(String value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(String value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(String value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(String value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLike(String value) {
            addCriterion("author_id like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotLike(String value) {
            addCriterion("author_id not like", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<String> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<String> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(String value1, String value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(String value1, String value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdIsNull() {
            addCriterion("verifitor_id is null");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdIsNotNull() {
            addCriterion("verifitor_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdEqualTo(String value) {
            addCriterion("verifitor_id =", value, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdNotEqualTo(String value) {
            addCriterion("verifitor_id <>", value, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdGreaterThan(String value) {
            addCriterion("verifitor_id >", value, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdGreaterThanOrEqualTo(String value) {
            addCriterion("verifitor_id >=", value, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdLessThan(String value) {
            addCriterion("verifitor_id <", value, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdLessThanOrEqualTo(String value) {
            addCriterion("verifitor_id <=", value, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdLike(String value) {
            addCriterion("verifitor_id like", value, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdNotLike(String value) {
            addCriterion("verifitor_id not like", value, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdIn(List<String> values) {
            addCriterion("verifitor_id in", values, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdNotIn(List<String> values) {
            addCriterion("verifitor_id not in", values, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdBetween(String value1, String value2) {
            addCriterion("verifitor_id between", value1, value2, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifitorIdNotBetween(String value1, String value2) {
            addCriterion("verifitor_id not between", value1, value2, "verifitorId");
            return (Criteria) this;
        }

        public Criteria andVerifyStateIsNull() {
            addCriterion("verify_state is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStateIsNotNull() {
            addCriterion("verify_state is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStateEqualTo(Integer value) {
            addCriterion("verify_state =", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateNotEqualTo(Integer value) {
            addCriterion("verify_state <>", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateGreaterThan(Integer value) {
            addCriterion("verify_state >", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_state >=", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateLessThan(Integer value) {
            addCriterion("verify_state <", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateLessThanOrEqualTo(Integer value) {
            addCriterion("verify_state <=", value, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateIn(List<Integer> values) {
            addCriterion("verify_state in", values, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateNotIn(List<Integer> values) {
            addCriterion("verify_state not in", values, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateBetween(Integer value1, Integer value2) {
            addCriterion("verify_state between", value1, value2, "verifyState");
            return (Criteria) this;
        }

        public Criteria andVerifyStateNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_state not between", value1, value2, "verifyState");
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