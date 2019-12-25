package com.jicl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnnouncementExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    public AnnouncementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
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
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_announcement
     *
     * @mbg.generated
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

        public Criteria andAnncIdIsNull() {
            addCriterion("annc_id is null");
            return (Criteria) this;
        }

        public Criteria andAnncIdIsNotNull() {
            addCriterion("annc_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnncIdEqualTo(Integer value) {
            addCriterion("annc_id =", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdNotEqualTo(Integer value) {
            addCriterion("annc_id <>", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdGreaterThan(Integer value) {
            addCriterion("annc_id >", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("annc_id >=", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdLessThan(Integer value) {
            addCriterion("annc_id <", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdLessThanOrEqualTo(Integer value) {
            addCriterion("annc_id <=", value, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdIn(List<Integer> values) {
            addCriterion("annc_id in", values, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdNotIn(List<Integer> values) {
            addCriterion("annc_id not in", values, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdBetween(Integer value1, Integer value2) {
            addCriterion("annc_id between", value1, value2, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncIdNotBetween(Integer value1, Integer value2) {
            addCriterion("annc_id not between", value1, value2, "anncId");
            return (Criteria) this;
        }

        public Criteria andAnncTitleIsNull() {
            addCriterion("annc_title is null");
            return (Criteria) this;
        }

        public Criteria andAnncTitleIsNotNull() {
            addCriterion("annc_title is not null");
            return (Criteria) this;
        }

        public Criteria andAnncTitleEqualTo(String value) {
            addCriterion("annc_title =", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleNotEqualTo(String value) {
            addCriterion("annc_title <>", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleGreaterThan(String value) {
            addCriterion("annc_title >", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleGreaterThanOrEqualTo(String value) {
            addCriterion("annc_title >=", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleLessThan(String value) {
            addCriterion("annc_title <", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleLessThanOrEqualTo(String value) {
            addCriterion("annc_title <=", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleLike(String value) {
            addCriterion("annc_title like", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleNotLike(String value) {
            addCriterion("annc_title not like", value, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleIn(List<String> values) {
            addCriterion("annc_title in", values, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleNotIn(List<String> values) {
            addCriterion("annc_title not in", values, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleBetween(String value1, String value2) {
            addCriterion("annc_title between", value1, value2, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncTitleNotBetween(String value1, String value2) {
            addCriterion("annc_title not between", value1, value2, "anncTitle");
            return (Criteria) this;
        }

        public Criteria andAnncDescIsNull() {
            addCriterion("annc_desc is null");
            return (Criteria) this;
        }

        public Criteria andAnncDescIsNotNull() {
            addCriterion("annc_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAnncDescEqualTo(String value) {
            addCriterion("annc_desc =", value, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescNotEqualTo(String value) {
            addCriterion("annc_desc <>", value, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescGreaterThan(String value) {
            addCriterion("annc_desc >", value, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescGreaterThanOrEqualTo(String value) {
            addCriterion("annc_desc >=", value, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescLessThan(String value) {
            addCriterion("annc_desc <", value, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescLessThanOrEqualTo(String value) {
            addCriterion("annc_desc <=", value, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescLike(String value) {
            addCriterion("annc_desc like", value, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescNotLike(String value) {
            addCriterion("annc_desc not like", value, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescIn(List<String> values) {
            addCriterion("annc_desc in", values, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescNotIn(List<String> values) {
            addCriterion("annc_desc not in", values, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescBetween(String value1, String value2) {
            addCriterion("annc_desc between", value1, value2, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andAnncDescNotBetween(String value1, String value2) {
            addCriterion("annc_desc not between", value1, value2, "anncDesc");
            return (Criteria) this;
        }

        public Criteria andTopFlagIsNull() {
            addCriterion("top_flag is null");
            return (Criteria) this;
        }

        public Criteria andTopFlagIsNotNull() {
            addCriterion("top_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTopFlagEqualTo(Boolean value) {
            addCriterion("top_flag =", value, "topFlag");
            return (Criteria) this;
        }

        public Criteria andTopFlagNotEqualTo(Boolean value) {
            addCriterion("top_flag <>", value, "topFlag");
            return (Criteria) this;
        }

        public Criteria andTopFlagGreaterThan(Boolean value) {
            addCriterion("top_flag >", value, "topFlag");
            return (Criteria) this;
        }

        public Criteria andTopFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("top_flag >=", value, "topFlag");
            return (Criteria) this;
        }

        public Criteria andTopFlagLessThan(Boolean value) {
            addCriterion("top_flag <", value, "topFlag");
            return (Criteria) this;
        }

        public Criteria andTopFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("top_flag <=", value, "topFlag");
            return (Criteria) this;
        }

        public Criteria andTopFlagIn(List<Boolean> values) {
            addCriterion("top_flag in", values, "topFlag");
            return (Criteria) this;
        }

        public Criteria andTopFlagNotIn(List<Boolean> values) {
            addCriterion("top_flag not in", values, "topFlag");
            return (Criteria) this;
        }

        public Criteria andTopFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("top_flag between", value1, value2, "topFlag");
            return (Criteria) this;
        }

        public Criteria andTopFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("top_flag not between", value1, value2, "topFlag");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNull() {
            addCriterion("published is null");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNotNull() {
            addCriterion("published is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedEqualTo(Boolean value) {
            addCriterion("published =", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotEqualTo(Boolean value) {
            addCriterion("published <>", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThan(Boolean value) {
            addCriterion("published >", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("published >=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThan(Boolean value) {
            addCriterion("published <", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThanOrEqualTo(Boolean value) {
            addCriterion("published <=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedIn(List<Boolean> values) {
            addCriterion("published in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotIn(List<Boolean> values) {
            addCriterion("published not in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedBetween(Boolean value1, Boolean value2) {
            addCriterion("published between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("published not between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Boolean value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Boolean value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Boolean value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Boolean value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Boolean> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Boolean> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNull() {
            addCriterion("del_time is null");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNotNull() {
            addCriterion("del_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelTimeEqualTo(Date value) {
            addCriterion("del_time =", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotEqualTo(Date value) {
            addCriterion("del_time <>", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThan(Date value) {
            addCriterion("del_time >", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("del_time >=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThan(Date value) {
            addCriterion("del_time <", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThanOrEqualTo(Date value) {
            addCriterion("del_time <=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeIn(List<Date> values) {
            addCriterion("del_time in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotIn(List<Date> values) {
            addCriterion("del_time not in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeBetween(Date value1, Date value2) {
            addCriterion("del_time between", value1, value2, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotBetween(Date value1, Date value2) {
            addCriterion("del_time not between", value1, value2, "delTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_announcement
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_announcement
     *
     * @mbg.generated
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