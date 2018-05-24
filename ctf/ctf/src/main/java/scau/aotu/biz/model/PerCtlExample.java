package scau.aotu.biz.model;

import java.util.ArrayList;
import java.util.List;

public class PerCtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerCtlExample() {
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

        public Criteria andPerCtlIdIsNull() {
            addCriterion("per_ctl_id is null");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdIsNotNull() {
            addCriterion("per_ctl_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdEqualTo(Integer value) {
            addCriterion("per_ctl_id =", value, "perCtlId");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdNotEqualTo(Integer value) {
            addCriterion("per_ctl_id <>", value, "perCtlId");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdGreaterThan(Integer value) {
            addCriterion("per_ctl_id >", value, "perCtlId");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_ctl_id >=", value, "perCtlId");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdLessThan(Integer value) {
            addCriterion("per_ctl_id <", value, "perCtlId");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("per_ctl_id <=", value, "perCtlId");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdIn(List<Integer> values) {
            addCriterion("per_ctl_id in", values, "perCtlId");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdNotIn(List<Integer> values) {
            addCriterion("per_ctl_id not in", values, "perCtlId");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdBetween(Integer value1, Integer value2) {
            addCriterion("per_ctl_id between", value1, value2, "perCtlId");
            return (Criteria) this;
        }

        public Criteria andPerCtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("per_ctl_id not between", value1, value2, "perCtlId");
            return (Criteria) this;
        }

        public Criteria andPerIdIsNull() {
            addCriterion("per_id is null");
            return (Criteria) this;
        }

        public Criteria andPerIdIsNotNull() {
            addCriterion("per_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerIdEqualTo(String value) {
            addCriterion("per_id =", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotEqualTo(String value) {
            addCriterion("per_id <>", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThan(String value) {
            addCriterion("per_id >", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThanOrEqualTo(String value) {
            addCriterion("per_id >=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThan(String value) {
            addCriterion("per_id <", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThanOrEqualTo(String value) {
            addCriterion("per_id <=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLike(String value) {
            addCriterion("per_id like", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotLike(String value) {
            addCriterion("per_id not like", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdIn(List<String> values) {
            addCriterion("per_id in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotIn(List<String> values) {
            addCriterion("per_id not in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdBetween(String value1, String value2) {
            addCriterion("per_id between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotBetween(String value1, String value2) {
            addCriterion("per_id not between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andCtlIsNull() {
            addCriterion("ctl is null");
            return (Criteria) this;
        }

        public Criteria andCtlIsNotNull() {
            addCriterion("ctl is not null");
            return (Criteria) this;
        }

        public Criteria andCtlEqualTo(String value) {
            addCriterion("ctl =", value, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlNotEqualTo(String value) {
            addCriterion("ctl <>", value, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlGreaterThan(String value) {
            addCriterion("ctl >", value, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlGreaterThanOrEqualTo(String value) {
            addCriterion("ctl >=", value, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlLessThan(String value) {
            addCriterion("ctl <", value, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlLessThanOrEqualTo(String value) {
            addCriterion("ctl <=", value, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlLike(String value) {
            addCriterion("ctl like", value, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlNotLike(String value) {
            addCriterion("ctl not like", value, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlIn(List<String> values) {
            addCriterion("ctl in", values, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlNotIn(List<String> values) {
            addCriterion("ctl not in", values, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlBetween(String value1, String value2) {
            addCriterion("ctl between", value1, value2, "ctl");
            return (Criteria) this;
        }

        public Criteria andCtlNotBetween(String value1, String value2) {
            addCriterion("ctl not between", value1, value2, "ctl");
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