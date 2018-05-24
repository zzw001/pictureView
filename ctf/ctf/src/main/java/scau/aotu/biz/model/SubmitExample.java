package scau.aotu.biz.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubmitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubmitExample() {
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

        public Criteria andSubIdIsNull() {
            addCriterion("sub_id is null");
            return (Criteria) this;
        }

        public Criteria andSubIdIsNotNull() {
            addCriterion("sub_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubIdEqualTo(Integer value) {
            addCriterion("sub_id =", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotEqualTo(Integer value) {
            addCriterion("sub_id <>", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThan(Integer value) {
            addCriterion("sub_id >", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_id >=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThan(Integer value) {
            addCriterion("sub_id <", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_id <=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdIn(List<Integer> values) {
            addCriterion("sub_id in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotIn(List<Integer> values) {
            addCriterion("sub_id not in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_id between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_id not between", value1, value2, "subId");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andSubStateIsNull() {
            addCriterion("sub_state is null");
            return (Criteria) this;
        }

        public Criteria andSubStateIsNotNull() {
            addCriterion("sub_state is not null");
            return (Criteria) this;
        }

        public Criteria andSubStateEqualTo(Integer value) {
            addCriterion("sub_state =", value, "subState");
            return (Criteria) this;
        }

        public Criteria andSubStateNotEqualTo(Integer value) {
            addCriterion("sub_state <>", value, "subState");
            return (Criteria) this;
        }

        public Criteria andSubStateGreaterThan(Integer value) {
            addCriterion("sub_state >", value, "subState");
            return (Criteria) this;
        }

        public Criteria andSubStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_state >=", value, "subState");
            return (Criteria) this;
        }

        public Criteria andSubStateLessThan(Integer value) {
            addCriterion("sub_state <", value, "subState");
            return (Criteria) this;
        }

        public Criteria andSubStateLessThanOrEqualTo(Integer value) {
            addCriterion("sub_state <=", value, "subState");
            return (Criteria) this;
        }

        public Criteria andSubStateIn(List<Integer> values) {
            addCriterion("sub_state in", values, "subState");
            return (Criteria) this;
        }

        public Criteria andSubStateNotIn(List<Integer> values) {
            addCriterion("sub_state not in", values, "subState");
            return (Criteria) this;
        }

        public Criteria andSubStateBetween(Integer value1, Integer value2) {
            addCriterion("sub_state between", value1, value2, "subState");
            return (Criteria) this;
        }

        public Criteria andSubStateNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_state not between", value1, value2, "subState");
            return (Criteria) this;
        }

        public Criteria andSubFlagIsNull() {
            addCriterion("sub_flag is null");
            return (Criteria) this;
        }

        public Criteria andSubFlagIsNotNull() {
            addCriterion("sub_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSubFlagEqualTo(String value) {
            addCriterion("sub_flag =", value, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagNotEqualTo(String value) {
            addCriterion("sub_flag <>", value, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagGreaterThan(String value) {
            addCriterion("sub_flag >", value, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagGreaterThanOrEqualTo(String value) {
            addCriterion("sub_flag >=", value, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagLessThan(String value) {
            addCriterion("sub_flag <", value, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagLessThanOrEqualTo(String value) {
            addCriterion("sub_flag <=", value, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagLike(String value) {
            addCriterion("sub_flag like", value, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagNotLike(String value) {
            addCriterion("sub_flag not like", value, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagIn(List<String> values) {
            addCriterion("sub_flag in", values, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagNotIn(List<String> values) {
            addCriterion("sub_flag not in", values, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagBetween(String value1, String value2) {
            addCriterion("sub_flag between", value1, value2, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubFlagNotBetween(String value1, String value2) {
            addCriterion("sub_flag not between", value1, value2, "subFlag");
            return (Criteria) this;
        }

        public Criteria andSubTimeIsNull() {
            addCriterion("sub_time is null");
            return (Criteria) this;
        }

        public Criteria andSubTimeIsNotNull() {
            addCriterion("sub_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubTimeEqualTo(Date value) {
            addCriterion("sub_time =", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeNotEqualTo(Date value) {
            addCriterion("sub_time <>", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeGreaterThan(Date value) {
            addCriterion("sub_time >", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sub_time >=", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeLessThan(Date value) {
            addCriterion("sub_time <", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeLessThanOrEqualTo(Date value) {
            addCriterion("sub_time <=", value, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeIn(List<Date> values) {
            addCriterion("sub_time in", values, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeNotIn(List<Date> values) {
            addCriterion("sub_time not in", values, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeBetween(Date value1, Date value2) {
            addCriterion("sub_time between", value1, value2, "subTime");
            return (Criteria) this;
        }

        public Criteria andSubTimeNotBetween(Date value1, Date value2) {
            addCriterion("sub_time not between", value1, value2, "subTime");
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