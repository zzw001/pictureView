package scau.aotu.biz.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaintenanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintenanceExample() {
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

        public Criteria andMateIdIsNull() {
            addCriterion("mate_id is null");
            return (Criteria) this;
        }

        public Criteria andMateIdIsNotNull() {
            addCriterion("mate_id is not null");
            return (Criteria) this;
        }

        public Criteria andMateIdEqualTo(Integer value) {
            addCriterion("mate_id =", value, "mateId");
            return (Criteria) this;
        }

        public Criteria andMateIdNotEqualTo(Integer value) {
            addCriterion("mate_id <>", value, "mateId");
            return (Criteria) this;
        }

        public Criteria andMateIdGreaterThan(Integer value) {
            addCriterion("mate_id >", value, "mateId");
            return (Criteria) this;
        }

        public Criteria andMateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mate_id >=", value, "mateId");
            return (Criteria) this;
        }

        public Criteria andMateIdLessThan(Integer value) {
            addCriterion("mate_id <", value, "mateId");
            return (Criteria) this;
        }

        public Criteria andMateIdLessThanOrEqualTo(Integer value) {
            addCriterion("mate_id <=", value, "mateId");
            return (Criteria) this;
        }

        public Criteria andMateIdIn(List<Integer> values) {
            addCriterion("mate_id in", values, "mateId");
            return (Criteria) this;
        }

        public Criteria andMateIdNotIn(List<Integer> values) {
            addCriterion("mate_id not in", values, "mateId");
            return (Criteria) this;
        }

        public Criteria andMateIdBetween(Integer value1, Integer value2) {
            addCriterion("mate_id between", value1, value2, "mateId");
            return (Criteria) this;
        }

        public Criteria andMateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mate_id not between", value1, value2, "mateId");
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

        public Criteria andMatestaffIdIsNull() {
            addCriterion("matestaff_id is null");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdIsNotNull() {
            addCriterion("matestaff_id is not null");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdEqualTo(String value) {
            addCriterion("matestaff_id =", value, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdNotEqualTo(String value) {
            addCriterion("matestaff_id <>", value, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdGreaterThan(String value) {
            addCriterion("matestaff_id >", value, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("matestaff_id >=", value, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdLessThan(String value) {
            addCriterion("matestaff_id <", value, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdLessThanOrEqualTo(String value) {
            addCriterion("matestaff_id <=", value, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdLike(String value) {
            addCriterion("matestaff_id like", value, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdNotLike(String value) {
            addCriterion("matestaff_id not like", value, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdIn(List<String> values) {
            addCriterion("matestaff_id in", values, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdNotIn(List<String> values) {
            addCriterion("matestaff_id not in", values, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdBetween(String value1, String value2) {
            addCriterion("matestaff_id between", value1, value2, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMatestaffIdNotBetween(String value1, String value2) {
            addCriterion("matestaff_id not between", value1, value2, "matestaffId");
            return (Criteria) this;
        }

        public Criteria andMateStateIsNull() {
            addCriterion("mate_state is null");
            return (Criteria) this;
        }

        public Criteria andMateStateIsNotNull() {
            addCriterion("mate_state is not null");
            return (Criteria) this;
        }

        public Criteria andMateStateEqualTo(Integer value) {
            addCriterion("mate_state =", value, "mateState");
            return (Criteria) this;
        }

        public Criteria andMateStateNotEqualTo(Integer value) {
            addCriterion("mate_state <>", value, "mateState");
            return (Criteria) this;
        }

        public Criteria andMateStateGreaterThan(Integer value) {
            addCriterion("mate_state >", value, "mateState");
            return (Criteria) this;
        }

        public Criteria andMateStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("mate_state >=", value, "mateState");
            return (Criteria) this;
        }

        public Criteria andMateStateLessThan(Integer value) {
            addCriterion("mate_state <", value, "mateState");
            return (Criteria) this;
        }

        public Criteria andMateStateLessThanOrEqualTo(Integer value) {
            addCriterion("mate_state <=", value, "mateState");
            return (Criteria) this;
        }

        public Criteria andMateStateIn(List<Integer> values) {
            addCriterion("mate_state in", values, "mateState");
            return (Criteria) this;
        }

        public Criteria andMateStateNotIn(List<Integer> values) {
            addCriterion("mate_state not in", values, "mateState");
            return (Criteria) this;
        }

        public Criteria andMateStateBetween(Integer value1, Integer value2) {
            addCriterion("mate_state between", value1, value2, "mateState");
            return (Criteria) this;
        }

        public Criteria andMateStateNotBetween(Integer value1, Integer value2) {
            addCriterion("mate_state not between", value1, value2, "mateState");
            return (Criteria) this;
        }

        public Criteria andMateTimeIsNull() {
            addCriterion("mate_time is null");
            return (Criteria) this;
        }

        public Criteria andMateTimeIsNotNull() {
            addCriterion("mate_time is not null");
            return (Criteria) this;
        }

        public Criteria andMateTimeEqualTo(Date value) {
            addCriterion("mate_time =", value, "mateTime");
            return (Criteria) this;
        }

        public Criteria andMateTimeNotEqualTo(Date value) {
            addCriterion("mate_time <>", value, "mateTime");
            return (Criteria) this;
        }

        public Criteria andMateTimeGreaterThan(Date value) {
            addCriterion("mate_time >", value, "mateTime");
            return (Criteria) this;
        }

        public Criteria andMateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mate_time >=", value, "mateTime");
            return (Criteria) this;
        }

        public Criteria andMateTimeLessThan(Date value) {
            addCriterion("mate_time <", value, "mateTime");
            return (Criteria) this;
        }

        public Criteria andMateTimeLessThanOrEqualTo(Date value) {
            addCriterion("mate_time <=", value, "mateTime");
            return (Criteria) this;
        }

        public Criteria andMateTimeIn(List<Date> values) {
            addCriterion("mate_time in", values, "mateTime");
            return (Criteria) this;
        }

        public Criteria andMateTimeNotIn(List<Date> values) {
            addCriterion("mate_time not in", values, "mateTime");
            return (Criteria) this;
        }

        public Criteria andMateTimeBetween(Date value1, Date value2) {
            addCriterion("mate_time between", value1, value2, "mateTime");
            return (Criteria) this;
        }

        public Criteria andMateTimeNotBetween(Date value1, Date value2) {
            addCriterion("mate_time not between", value1, value2, "mateTime");
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