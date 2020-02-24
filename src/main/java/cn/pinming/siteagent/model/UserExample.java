package cn.pinming.siteagent.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andTelNumIsNull() {
            addCriterion("tel_num is null");
            return (Criteria) this;
        }

        public Criteria andTelNumIsNotNull() {
            addCriterion("tel_num is not null");
            return (Criteria) this;
        }

        public Criteria andTelNumEqualTo(String value) {
            addCriterion("tel_num =", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotEqualTo(String value) {
            addCriterion("tel_num <>", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumGreaterThan(String value) {
            addCriterion("tel_num >", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumGreaterThanOrEqualTo(String value) {
            addCriterion("tel_num >=", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumLessThan(String value) {
            addCriterion("tel_num <", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumLessThanOrEqualTo(String value) {
            addCriterion("tel_num <=", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumLike(String value) {
            addCriterion("tel_num like", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotLike(String value) {
            addCriterion("tel_num not like", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumIn(List<String> values) {
            addCriterion("tel_num in", values, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotIn(List<String> values) {
            addCriterion("tel_num not in", values, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumBetween(String value1, String value2) {
            addCriterion("tel_num between", value1, value2, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotBetween(String value1, String value2) {
            addCriterion("tel_num not between", value1, value2, "telNum");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatIdIsNull() {
            addCriterion("creat_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatIdIsNotNull() {
            addCriterion("creat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatIdEqualTo(Integer value) {
            addCriterion("creat_id =", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdNotEqualTo(Integer value) {
            addCriterion("creat_id <>", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdGreaterThan(Integer value) {
            addCriterion("creat_id >", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creat_id >=", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdLessThan(Integer value) {
            addCriterion("creat_id <", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdLessThanOrEqualTo(Integer value) {
            addCriterion("creat_id <=", value, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdIn(List<Integer> values) {
            addCriterion("creat_id in", values, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdNotIn(List<Integer> values) {
            addCriterion("creat_id not in", values, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdBetween(Integer value1, Integer value2) {
            addCriterion("creat_id between", value1, value2, "creatId");
            return (Criteria) this;
        }

        public Criteria andCreatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creat_id not between", value1, value2, "creatId");
            return (Criteria) this;
        }

        public Criteria andModifyIdIsNull() {
            addCriterion("modify_id is null");
            return (Criteria) this;
        }

        public Criteria andModifyIdIsNotNull() {
            addCriterion("modify_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifyIdEqualTo(Integer value) {
            addCriterion("modify_id =", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotEqualTo(Integer value) {
            addCriterion("modify_id <>", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdGreaterThan(Integer value) {
            addCriterion("modify_id >", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("modify_id >=", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdLessThan(Integer value) {
            addCriterion("modify_id <", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("modify_id <=", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdIn(List<Integer> values) {
            addCriterion("modify_id in", values, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotIn(List<Integer> values) {
            addCriterion("modify_id not in", values, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdBetween(Integer value1, Integer value2) {
            addCriterion("modify_id between", value1, value2, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("modify_id not between", value1, value2, "modifyId");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateIsNull() {
            addCriterion("timestamp_create is null");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateIsNotNull() {
            addCriterion("timestamp_create is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateEqualTo(Date value) {
            addCriterion("timestamp_create =", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateNotEqualTo(Date value) {
            addCriterion("timestamp_create <>", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateGreaterThan(Date value) {
            addCriterion("timestamp_create >", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp_create >=", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateLessThan(Date value) {
            addCriterion("timestamp_create <", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateLessThanOrEqualTo(Date value) {
            addCriterion("timestamp_create <=", value, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateIn(List<Date> values) {
            addCriterion("timestamp_create in", values, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateNotIn(List<Date> values) {
            addCriterion("timestamp_create not in", values, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateBetween(Date value1, Date value2) {
            addCriterion("timestamp_create between", value1, value2, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampCreateNotBetween(Date value1, Date value2) {
            addCriterion("timestamp_create not between", value1, value2, "timestampCreate");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyIsNull() {
            addCriterion("timestamp_modify is null");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyIsNotNull() {
            addCriterion("timestamp_modify is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyEqualTo(Date value) {
            addCriterion("timestamp_modify =", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyNotEqualTo(Date value) {
            addCriterion("timestamp_modify <>", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyGreaterThan(Date value) {
            addCriterion("timestamp_modify >", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp_modify >=", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyLessThan(Date value) {
            addCriterion("timestamp_modify <", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyLessThanOrEqualTo(Date value) {
            addCriterion("timestamp_modify <=", value, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyIn(List<Date> values) {
            addCriterion("timestamp_modify in", values, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyNotIn(List<Date> values) {
            addCriterion("timestamp_modify not in", values, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyBetween(Date value1, Date value2) {
            addCriterion("timestamp_modify between", value1, value2, "timestampModify");
            return (Criteria) this;
        }

        public Criteria andTimestampModifyNotBetween(Date value1, Date value2) {
            addCriterion("timestamp_modify not between", value1, value2, "timestampModify");
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