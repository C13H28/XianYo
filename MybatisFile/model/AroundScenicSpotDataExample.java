package com.project.model;

import java.util.ArrayList;
import java.util.List;

public class AroundScenicSpotDataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public AroundScenicSpotDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
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

        public Criteria andSurroundnumIsNull() {
            addCriterion("surroundNum is null");
            return (Criteria) this;
        }

        public Criteria andSurroundnumIsNotNull() {
            addCriterion("surroundNum is not null");
            return (Criteria) this;
        }

        public Criteria andSurroundnumEqualTo(Integer value) {
            addCriterion("surroundNum =", value, "surroundnum");
            return (Criteria) this;
        }

        public Criteria andSurroundnumNotEqualTo(Integer value) {
            addCriterion("surroundNum <>", value, "surroundnum");
            return (Criteria) this;
        }

        public Criteria andSurroundnumGreaterThan(Integer value) {
            addCriterion("surroundNum >", value, "surroundnum");
            return (Criteria) this;
        }

        public Criteria andSurroundnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("surroundNum >=", value, "surroundnum");
            return (Criteria) this;
        }

        public Criteria andSurroundnumLessThan(Integer value) {
            addCriterion("surroundNum <", value, "surroundnum");
            return (Criteria) this;
        }

        public Criteria andSurroundnumLessThanOrEqualTo(Integer value) {
            addCriterion("surroundNum <=", value, "surroundnum");
            return (Criteria) this;
        }

        public Criteria andSurroundnumIn(List<Integer> values) {
            addCriterion("surroundNum in", values, "surroundnum");
            return (Criteria) this;
        }

        public Criteria andSurroundnumNotIn(List<Integer> values) {
            addCriterion("surroundNum not in", values, "surroundnum");
            return (Criteria) this;
        }

        public Criteria andSurroundnumBetween(Integer value1, Integer value2) {
            addCriterion("surroundNum between", value1, value2, "surroundnum");
            return (Criteria) this;
        }

        public Criteria andSurroundnumNotBetween(Integer value1, Integer value2) {
            addCriterion("surroundNum not between", value1, value2, "surroundnum");
            return (Criteria) this;
        }

        public Criteria andScenicscoreIsNull() {
            addCriterion("scenicScore is null");
            return (Criteria) this;
        }

        public Criteria andScenicscoreIsNotNull() {
            addCriterion("scenicScore is not null");
            return (Criteria) this;
        }

        public Criteria andScenicscoreEqualTo(Double value) {
            addCriterion("scenicScore =", value, "scenicscore");
            return (Criteria) this;
        }

        public Criteria andScenicscoreNotEqualTo(Double value) {
            addCriterion("scenicScore <>", value, "scenicscore");
            return (Criteria) this;
        }

        public Criteria andScenicscoreGreaterThan(Double value) {
            addCriterion("scenicScore >", value, "scenicscore");
            return (Criteria) this;
        }

        public Criteria andScenicscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("scenicScore >=", value, "scenicscore");
            return (Criteria) this;
        }

        public Criteria andScenicscoreLessThan(Double value) {
            addCriterion("scenicScore <", value, "scenicscore");
            return (Criteria) this;
        }

        public Criteria andScenicscoreLessThanOrEqualTo(Double value) {
            addCriterion("scenicScore <=", value, "scenicscore");
            return (Criteria) this;
        }

        public Criteria andScenicscoreIn(List<Double> values) {
            addCriterion("scenicScore in", values, "scenicscore");
            return (Criteria) this;
        }

        public Criteria andScenicscoreNotIn(List<Double> values) {
            addCriterion("scenicScore not in", values, "scenicscore");
            return (Criteria) this;
        }

        public Criteria andScenicscoreBetween(Double value1, Double value2) {
            addCriterion("scenicScore between", value1, value2, "scenicscore");
            return (Criteria) this;
        }

        public Criteria andScenicscoreNotBetween(Double value1, Double value2) {
            addCriterion("scenicScore not between", value1, value2, "scenicscore");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNull() {
            addCriterion("commentNum is null");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNotNull() {
            addCriterion("commentNum is not null");
            return (Criteria) this;
        }

        public Criteria andCommentnumEqualTo(Integer value) {
            addCriterion("commentNum =", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotEqualTo(Integer value) {
            addCriterion("commentNum <>", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThan(Integer value) {
            addCriterion("commentNum >", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentNum >=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThan(Integer value) {
            addCriterion("commentNum <", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThanOrEqualTo(Integer value) {
            addCriterion("commentNum <=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumIn(List<Integer> values) {
            addCriterion("commentNum in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotIn(List<Integer> values) {
            addCriterion("commentNum not in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumBetween(Integer value1, Integer value2) {
            addCriterion("commentNum between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("commentNum not between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andQuestionnumIsNull() {
            addCriterion("questionNum is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnumIsNotNull() {
            addCriterion("questionNum is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnumEqualTo(Integer value) {
            addCriterion("questionNum =", value, "questionnum");
            return (Criteria) this;
        }

        public Criteria andQuestionnumNotEqualTo(Integer value) {
            addCriterion("questionNum <>", value, "questionnum");
            return (Criteria) this;
        }

        public Criteria andQuestionnumGreaterThan(Integer value) {
            addCriterion("questionNum >", value, "questionnum");
            return (Criteria) this;
        }

        public Criteria andQuestionnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionNum >=", value, "questionnum");
            return (Criteria) this;
        }

        public Criteria andQuestionnumLessThan(Integer value) {
            addCriterion("questionNum <", value, "questionnum");
            return (Criteria) this;
        }

        public Criteria andQuestionnumLessThanOrEqualTo(Integer value) {
            addCriterion("questionNum <=", value, "questionnum");
            return (Criteria) this;
        }

        public Criteria andQuestionnumIn(List<Integer> values) {
            addCriterion("questionNum in", values, "questionnum");
            return (Criteria) this;
        }

        public Criteria andQuestionnumNotIn(List<Integer> values) {
            addCriterion("questionNum not in", values, "questionnum");
            return (Criteria) this;
        }

        public Criteria andQuestionnumBetween(Integer value1, Integer value2) {
            addCriterion("questionNum between", value1, value2, "questionnum");
            return (Criteria) this;
        }

        public Criteria andQuestionnumNotBetween(Integer value1, Integer value2) {
            addCriterion("questionNum not between", value1, value2, "questionnum");
            return (Criteria) this;
        }

        public Criteria andScenicidIsNull() {
            addCriterion("scenicID is null");
            return (Criteria) this;
        }

        public Criteria andScenicidIsNotNull() {
            addCriterion("scenicID is not null");
            return (Criteria) this;
        }

        public Criteria andScenicidEqualTo(Long value) {
            addCriterion("scenicID =", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidNotEqualTo(Long value) {
            addCriterion("scenicID <>", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidGreaterThan(Long value) {
            addCriterion("scenicID >", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidGreaterThanOrEqualTo(Long value) {
            addCriterion("scenicID >=", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidLessThan(Long value) {
            addCriterion("scenicID <", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidLessThanOrEqualTo(Long value) {
            addCriterion("scenicID <=", value, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidIn(List<Long> values) {
            addCriterion("scenicID in", values, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidNotIn(List<Long> values) {
            addCriterion("scenicID not in", values, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidBetween(Long value1, Long value2) {
            addCriterion("scenicID between", value1, value2, "scenicid");
            return (Criteria) this;
        }

        public Criteria andScenicidNotBetween(Long value1, Long value2) {
            addCriterion("scenicID not between", value1, value2, "scenicid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated do_not_delete_during_merge Fri Sep 08 10:01:11 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aroundsenicspotinfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
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