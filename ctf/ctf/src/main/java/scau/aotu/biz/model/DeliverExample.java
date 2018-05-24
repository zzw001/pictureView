package scau.aotu.biz.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverExample() {
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

        public Criteria andDeliIdIsNull() {
            addCriterion("deli_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliIdIsNotNull() {
            addCriterion("deli_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliIdEqualTo(Integer value) {
            addCriterion("deli_id =", value, "deliId");
            return (Criteria) this;
        }

        public Criteria andDeliIdNotEqualTo(Integer value) {
            addCriterion("deli_id <>", value, "deliId");
            return (Criteria) this;
        }

        public Criteria andDeliIdGreaterThan(Integer value) {
            addCriterion("deli_id >", value, "deliId");
            return (Criteria) this;
        }

        public Criteria andDeliIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("deli_id >=", value, "deliId");
            return (Criteria) this;
        }

        public Criteria andDeliIdLessThan(Integer value) {
            addCriterion("deli_id <", value, "deliId");
            return (Criteria) this;
        }

        public Criteria andDeliIdLessThanOrEqualTo(Integer value) {
            addCriterion("deli_id <=", value, "deliId");
            return (Criteria) this;
        }

        public Criteria andDeliIdIn(List<Integer> values) {
            addCriterion("deli_id in", values, "deliId");
            return (Criteria) this;
        }

        public Criteria andDeliIdNotIn(List<Integer> values) {
            addCriterion("deli_id not in", values, "deliId");
            return (Criteria) this;
        }

        public Criteria andDeliIdBetween(Integer value1, Integer value2) {
            addCriterion("deli_id between", value1, value2, "deliId");
            return (Criteria) this;
        }

        public Criteria andDeliIdNotBetween(Integer value1, Integer value2) {
            addCriterion("deli_id not between", value1, value2, "deliId");
            return (Criteria) this;
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

        public Criteria andDeliTimeIsNull() {
            addCriterion("deli_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliTimeIsNotNull() {
            addCriterion("deli_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliTimeEqualTo(Date value) {
            addCriterion("deli_time =", value, "deliTime");
            return (Criteria) this;
        }

        public Criteria andDeliTimeNotEqualTo(Date value) {
            addCriterion("deli_time <>", value, "deliTime");
            return (Criteria) this;
        }

        public Criteria andDeliTimeGreaterThan(Date value) {
            addCriterion("deli_time >", value, "deliTime");
            return (Criteria) this;
        }

        public Criteria andDeliTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deli_time >=", value, "deliTime");
            return (Criteria) this;
        }

        public Criteria andDeliTimeLessThan(Date value) {
            addCriterion("deli_time <", value, "deliTime");
            return (Criteria) this;
        }

        public Criteria andDeliTimeLessThanOrEqualTo(Date value) {
            addCriterion("deli_time <=", value, "deliTime");
            return (Criteria) this;
        }

        public Criteria andDeliTimeIn(List<Date> values) {
            addCriterion("deli_time in", values, "deliTime");
            return (Criteria) this;
        }

        public Criteria andDeliTimeNotIn(List<Date> values) {
            addCriterion("deli_time not in", values, "deliTime");
            return (Criteria) this;
        }

        public Criteria andDeliTimeBetween(Date value1, Date value2) {
            addCriterion("deli_time between", value1, value2, "deliTime");
            return (Criteria) this;
        }

        public Criteria andDeliTimeNotBetween(Date value1, Date value2) {
            addCriterion("deli_time not between", value1, value2, "deliTime");
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