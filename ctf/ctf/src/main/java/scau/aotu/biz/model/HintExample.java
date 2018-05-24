package scau.aotu.biz.model;

import java.util.ArrayList;
import java.util.List;

public class HintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HintExample() {
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

        public Criteria andHintIdIsNull() {
            addCriterion("hint_id is null");
            return (Criteria) this;
        }

        public Criteria andHintIdIsNotNull() {
            addCriterion("hint_id is not null");
            return (Criteria) this;
        }

        public Criteria andHintIdEqualTo(Integer value) {
            addCriterion("hint_id =", value, "hintId");
            return (Criteria) this;
        }

        public Criteria andHintIdNotEqualTo(Integer value) {
            addCriterion("hint_id <>", value, "hintId");
            return (Criteria) this;
        }

        public Criteria andHintIdGreaterThan(Integer value) {
            addCriterion("hint_id >", value, "hintId");
            return (Criteria) this;
        }

        public Criteria andHintIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hint_id >=", value, "hintId");
            return (Criteria) this;
        }

        public Criteria andHintIdLessThan(Integer value) {
            addCriterion("hint_id <", value, "hintId");
            return (Criteria) this;
        }

        public Criteria andHintIdLessThanOrEqualTo(Integer value) {
            addCriterion("hint_id <=", value, "hintId");
            return (Criteria) this;
        }

        public Criteria andHintIdIn(List<Integer> values) {
            addCriterion("hint_id in", values, "hintId");
            return (Criteria) this;
        }

        public Criteria andHintIdNotIn(List<Integer> values) {
            addCriterion("hint_id not in", values, "hintId");
            return (Criteria) this;
        }

        public Criteria andHintIdBetween(Integer value1, Integer value2) {
            addCriterion("hint_id between", value1, value2, "hintId");
            return (Criteria) this;
        }

        public Criteria andHintIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hint_id not between", value1, value2, "hintId");
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

        public Criteria andHintDescIsNull() {
            addCriterion("hint_desc is null");
            return (Criteria) this;
        }

        public Criteria andHintDescIsNotNull() {
            addCriterion("hint_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHintDescEqualTo(String value) {
            addCriterion("hint_desc =", value, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescNotEqualTo(String value) {
            addCriterion("hint_desc <>", value, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescGreaterThan(String value) {
            addCriterion("hint_desc >", value, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescGreaterThanOrEqualTo(String value) {
            addCriterion("hint_desc >=", value, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescLessThan(String value) {
            addCriterion("hint_desc <", value, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescLessThanOrEqualTo(String value) {
            addCriterion("hint_desc <=", value, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescLike(String value) {
            addCriterion("hint_desc like", value, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescNotLike(String value) {
            addCriterion("hint_desc not like", value, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescIn(List<String> values) {
            addCriterion("hint_desc in", values, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescNotIn(List<String> values) {
            addCriterion("hint_desc not in", values, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescBetween(String value1, String value2) {
            addCriterion("hint_desc between", value1, value2, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintDescNotBetween(String value1, String value2) {
            addCriterion("hint_desc not between", value1, value2, "hintDesc");
            return (Criteria) this;
        }

        public Criteria andHintCostIsNull() {
            addCriterion("hint_cost is null");
            return (Criteria) this;
        }

        public Criteria andHintCostIsNotNull() {
            addCriterion("hint_cost is not null");
            return (Criteria) this;
        }

        public Criteria andHintCostEqualTo(Integer value) {
            addCriterion("hint_cost =", value, "hintCost");
            return (Criteria) this;
        }

        public Criteria andHintCostNotEqualTo(Integer value) {
            addCriterion("hint_cost <>", value, "hintCost");
            return (Criteria) this;
        }

        public Criteria andHintCostGreaterThan(Integer value) {
            addCriterion("hint_cost >", value, "hintCost");
            return (Criteria) this;
        }

        public Criteria andHintCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("hint_cost >=", value, "hintCost");
            return (Criteria) this;
        }

        public Criteria andHintCostLessThan(Integer value) {
            addCriterion("hint_cost <", value, "hintCost");
            return (Criteria) this;
        }

        public Criteria andHintCostLessThanOrEqualTo(Integer value) {
            addCriterion("hint_cost <=", value, "hintCost");
            return (Criteria) this;
        }

        public Criteria andHintCostIn(List<Integer> values) {
            addCriterion("hint_cost in", values, "hintCost");
            return (Criteria) this;
        }

        public Criteria andHintCostNotIn(List<Integer> values) {
            addCriterion("hint_cost not in", values, "hintCost");
            return (Criteria) this;
        }

        public Criteria andHintCostBetween(Integer value1, Integer value2) {
            addCriterion("hint_cost between", value1, value2, "hintCost");
            return (Criteria) this;
        }

        public Criteria andHintCostNotBetween(Integer value1, Integer value2) {
            addCriterion("hint_cost not between", value1, value2, "hintCost");
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