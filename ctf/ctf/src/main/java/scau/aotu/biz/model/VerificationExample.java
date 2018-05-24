package scau.aotu.biz.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VerificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VerificationExample() {
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

        public Criteria andVeriIdIsNull() {
            addCriterion("veri_id is null");
            return (Criteria) this;
        }

        public Criteria andVeriIdIsNotNull() {
            addCriterion("veri_id is not null");
            return (Criteria) this;
        }

        public Criteria andVeriIdEqualTo(Integer value) {
            addCriterion("veri_id =", value, "veriId");
            return (Criteria) this;
        }

        public Criteria andVeriIdNotEqualTo(Integer value) {
            addCriterion("veri_id <>", value, "veriId");
            return (Criteria) this;
        }

        public Criteria andVeriIdGreaterThan(Integer value) {
            addCriterion("veri_id >", value, "veriId");
            return (Criteria) this;
        }

        public Criteria andVeriIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("veri_id >=", value, "veriId");
            return (Criteria) this;
        }

        public Criteria andVeriIdLessThan(Integer value) {
            addCriterion("veri_id <", value, "veriId");
            return (Criteria) this;
        }

        public Criteria andVeriIdLessThanOrEqualTo(Integer value) {
            addCriterion("veri_id <=", value, "veriId");
            return (Criteria) this;
        }

        public Criteria andVeriIdIn(List<Integer> values) {
            addCriterion("veri_id in", values, "veriId");
            return (Criteria) this;
        }

        public Criteria andVeriIdNotIn(List<Integer> values) {
            addCriterion("veri_id not in", values, "veriId");
            return (Criteria) this;
        }

        public Criteria andVeriIdBetween(Integer value1, Integer value2) {
            addCriterion("veri_id between", value1, value2, "veriId");
            return (Criteria) this;
        }

        public Criteria andVeriIdNotBetween(Integer value1, Integer value2) {
            addCriterion("veri_id not between", value1, value2, "veriId");
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

        public Criteria andVerifyDescIsNull() {
            addCriterion("verify_desc is null");
            return (Criteria) this;
        }

        public Criteria andVerifyDescIsNotNull() {
            addCriterion("verify_desc is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyDescEqualTo(String value) {
            addCriterion("verify_desc =", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescNotEqualTo(String value) {
            addCriterion("verify_desc <>", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescGreaterThan(String value) {
            addCriterion("verify_desc >", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescGreaterThanOrEqualTo(String value) {
            addCriterion("verify_desc >=", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescLessThan(String value) {
            addCriterion("verify_desc <", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescLessThanOrEqualTo(String value) {
            addCriterion("verify_desc <=", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescLike(String value) {
            addCriterion("verify_desc like", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescNotLike(String value) {
            addCriterion("verify_desc not like", value, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescIn(List<String> values) {
            addCriterion("verify_desc in", values, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescNotIn(List<String> values) {
            addCriterion("verify_desc not in", values, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescBetween(String value1, String value2) {
            addCriterion("verify_desc between", value1, value2, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyDescNotBetween(String value1, String value2) {
            addCriterion("verify_desc not between", value1, value2, "verifyDesc");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verify_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Date value) {
            addCriterion("verify_time =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Date value) {
            addCriterion("verify_time <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Date value) {
            addCriterion("verify_time >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_time >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Date value) {
            addCriterion("verify_time <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("verify_time <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Date> values) {
            addCriterion("verify_time in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Date> values) {
            addCriterion("verify_time not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("verify_time between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("verify_time not between", value1, value2, "verifyTime");
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