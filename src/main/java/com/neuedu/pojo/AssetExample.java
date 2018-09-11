package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andComtractIsNull() {
            addCriterion("comtract is null");
            return (Criteria) this;
        }

        public Criteria andComtractIsNotNull() {
            addCriterion("comtract is not null");
            return (Criteria) this;
        }

        public Criteria andComtractEqualTo(Integer value) {
            addCriterion("comtract =", value, "comtract");
            return (Criteria) this;
        }

        public Criteria andComtractNotEqualTo(Integer value) {
            addCriterion("comtract <>", value, "comtract");
            return (Criteria) this;
        }

        public Criteria andComtractGreaterThan(Integer value) {
            addCriterion("comtract >", value, "comtract");
            return (Criteria) this;
        }

        public Criteria andComtractGreaterThanOrEqualTo(Integer value) {
            addCriterion("comtract >=", value, "comtract");
            return (Criteria) this;
        }

        public Criteria andComtractLessThan(Integer value) {
            addCriterion("comtract <", value, "comtract");
            return (Criteria) this;
        }

        public Criteria andComtractLessThanOrEqualTo(Integer value) {
            addCriterion("comtract <=", value, "comtract");
            return (Criteria) this;
        }

        public Criteria andComtractIn(List<Integer> values) {
            addCriterion("comtract in", values, "comtract");
            return (Criteria) this;
        }

        public Criteria andComtractNotIn(List<Integer> values) {
            addCriterion("comtract not in", values, "comtract");
            return (Criteria) this;
        }

        public Criteria andComtractBetween(Integer value1, Integer value2) {
            addCriterion("comtract between", value1, value2, "comtract");
            return (Criteria) this;
        }

        public Criteria andComtractNotBetween(Integer value1, Integer value2) {
            addCriterion("comtract not between", value1, value2, "comtract");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIsNull() {
            addCriterion("asset_type is null");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIsNotNull() {
            addCriterion("asset_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssetTypeEqualTo(Integer value) {
            addCriterion("asset_type =", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotEqualTo(Integer value) {
            addCriterion("asset_type <>", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeGreaterThan(Integer value) {
            addCriterion("asset_type >", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("asset_type >=", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLessThan(Integer value) {
            addCriterion("asset_type <", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("asset_type <=", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIn(List<Integer> values) {
            addCriterion("asset_type in", values, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotIn(List<Integer> values) {
            addCriterion("asset_type not in", values, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeBetween(Integer value1, Integer value2) {
            addCriterion("asset_type between", value1, value2, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("asset_type not between", value1, value2, "assetType");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNull() {
            addCriterion("config_id is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("config_id is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(Integer value) {
            addCriterion("config_id =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(Integer value) {
            addCriterion("config_id <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(Integer value) {
            addCriterion("config_id >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("config_id >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(Integer value) {
            addCriterion("config_id <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(Integer value) {
            addCriterion("config_id <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<Integer> values) {
            addCriterion("config_id in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<Integer> values) {
            addCriterion("config_id not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(Integer value1, Integer value2) {
            addCriterion("config_id between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(Integer value1, Integer value2) {
            addCriterion("config_id not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andComputerroomIsNull() {
            addCriterion("computerroom is null");
            return (Criteria) this;
        }

        public Criteria andComputerroomIsNotNull() {
            addCriterion("computerroom is not null");
            return (Criteria) this;
        }

        public Criteria andComputerroomEqualTo(String value) {
            addCriterion("computerroom =", value, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomNotEqualTo(String value) {
            addCriterion("computerroom <>", value, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomGreaterThan(String value) {
            addCriterion("computerroom >", value, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomGreaterThanOrEqualTo(String value) {
            addCriterion("computerroom >=", value, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomLessThan(String value) {
            addCriterion("computerroom <", value, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomLessThanOrEqualTo(String value) {
            addCriterion("computerroom <=", value, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomLike(String value) {
            addCriterion("computerroom like", value, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomNotLike(String value) {
            addCriterion("computerroom not like", value, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomIn(List<String> values) {
            addCriterion("computerroom in", values, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomNotIn(List<String> values) {
            addCriterion("computerroom not in", values, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomBetween(String value1, String value2) {
            addCriterion("computerroom between", value1, value2, "computerroom");
            return (Criteria) this;
        }

        public Criteria andComputerroomNotBetween(String value1, String value2) {
            addCriterion("computerroom not between", value1, value2, "computerroom");
            return (Criteria) this;
        }

        public Criteria andRackIdIsNull() {
            addCriterion("rack_id is null");
            return (Criteria) this;
        }

        public Criteria andRackIdIsNotNull() {
            addCriterion("rack_id is not null");
            return (Criteria) this;
        }

        public Criteria andRackIdEqualTo(Integer value) {
            addCriterion("rack_id =", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdNotEqualTo(Integer value) {
            addCriterion("rack_id <>", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdGreaterThan(Integer value) {
            addCriterion("rack_id >", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rack_id >=", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdLessThan(Integer value) {
            addCriterion("rack_id <", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdLessThanOrEqualTo(Integer value) {
            addCriterion("rack_id <=", value, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdIn(List<Integer> values) {
            addCriterion("rack_id in", values, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdNotIn(List<Integer> values) {
            addCriterion("rack_id not in", values, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdBetween(Integer value1, Integer value2) {
            addCriterion("rack_id between", value1, value2, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rack_id not between", value1, value2, "rackId");
            return (Criteria) this;
        }

        public Criteria andRackIsNull() {
            addCriterion("rack is null");
            return (Criteria) this;
        }

        public Criteria andRackIsNotNull() {
            addCriterion("rack is not null");
            return (Criteria) this;
        }

        public Criteria andRackEqualTo(String value) {
            addCriterion("rack =", value, "rack");
            return (Criteria) this;
        }

        public Criteria andRackNotEqualTo(String value) {
            addCriterion("rack <>", value, "rack");
            return (Criteria) this;
        }

        public Criteria andRackGreaterThan(String value) {
            addCriterion("rack >", value, "rack");
            return (Criteria) this;
        }

        public Criteria andRackGreaterThanOrEqualTo(String value) {
            addCriterion("rack >=", value, "rack");
            return (Criteria) this;
        }

        public Criteria andRackLessThan(String value) {
            addCriterion("rack <", value, "rack");
            return (Criteria) this;
        }

        public Criteria andRackLessThanOrEqualTo(String value) {
            addCriterion("rack <=", value, "rack");
            return (Criteria) this;
        }

        public Criteria andRackLike(String value) {
            addCriterion("rack like", value, "rack");
            return (Criteria) this;
        }

        public Criteria andRackNotLike(String value) {
            addCriterion("rack not like", value, "rack");
            return (Criteria) this;
        }

        public Criteria andRackIn(List<String> values) {
            addCriterion("rack in", values, "rack");
            return (Criteria) this;
        }

        public Criteria andRackNotIn(List<String> values) {
            addCriterion("rack not in", values, "rack");
            return (Criteria) this;
        }

        public Criteria andRackBetween(String value1, String value2) {
            addCriterion("rack between", value1, value2, "rack");
            return (Criteria) this;
        }

        public Criteria andRackNotBetween(String value1, String value2) {
            addCriterion("rack not between", value1, value2, "rack");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("in_time is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("in_time is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(Date value) {
            addCriterion("in_time =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(Date value) {
            addCriterion("in_time <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(Date value) {
            addCriterion("in_time >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("in_time >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(Date value) {
            addCriterion("in_time <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(Date value) {
            addCriterion("in_time <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<Date> values) {
            addCriterion("in_time in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<Date> values) {
            addCriterion("in_time not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(Date value1, Date value2) {
            addCriterion("in_time between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(Date value1, Date value2) {
            addCriterion("in_time not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeIsNull() {
            addCriterion("warranty_time is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeIsNotNull() {
            addCriterion("warranty_time is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeEqualTo(String value) {
            addCriterion("warranty_time =", value, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeNotEqualTo(String value) {
            addCriterion("warranty_time <>", value, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeGreaterThan(String value) {
            addCriterion("warranty_time >", value, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("warranty_time >=", value, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeLessThan(String value) {
            addCriterion("warranty_time <", value, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeLessThanOrEqualTo(String value) {
            addCriterion("warranty_time <=", value, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeLike(String value) {
            addCriterion("warranty_time like", value, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeNotLike(String value) {
            addCriterion("warranty_time not like", value, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeIn(List<String> values) {
            addCriterion("warranty_time in", values, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeNotIn(List<String> values) {
            addCriterion("warranty_time not in", values, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeBetween(String value1, String value2) {
            addCriterion("warranty_time between", value1, value2, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andWarrantyTimeNotBetween(String value1, String value2) {
            addCriterion("warranty_time not between", value1, value2, "warrantyTime");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andResponsibleByIsNull() {
            addCriterion("responsible_by is null");
            return (Criteria) this;
        }

        public Criteria andResponsibleByIsNotNull() {
            addCriterion("responsible_by is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibleByEqualTo(String value) {
            addCriterion("responsible_by =", value, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByNotEqualTo(String value) {
            addCriterion("responsible_by <>", value, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByGreaterThan(String value) {
            addCriterion("responsible_by >", value, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByGreaterThanOrEqualTo(String value) {
            addCriterion("responsible_by >=", value, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByLessThan(String value) {
            addCriterion("responsible_by <", value, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByLessThanOrEqualTo(String value) {
            addCriterion("responsible_by <=", value, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByLike(String value) {
            addCriterion("responsible_by like", value, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByNotLike(String value) {
            addCriterion("responsible_by not like", value, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByIn(List<String> values) {
            addCriterion("responsible_by in", values, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByNotIn(List<String> values) {
            addCriterion("responsible_by not in", values, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByBetween(String value1, String value2) {
            addCriterion("responsible_by between", value1, value2, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsibleByNotBetween(String value1, String value2) {
            addCriterion("responsible_by not between", value1, value2, "responsibleBy");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameIsNull() {
            addCriterion("responsible_person_name is null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameIsNotNull() {
            addCriterion("responsible_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameEqualTo(String value) {
            addCriterion("responsible_person_name =", value, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameNotEqualTo(String value) {
            addCriterion("responsible_person_name <>", value, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameGreaterThan(String value) {
            addCriterion("responsible_person_name >", value, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("responsible_person_name >=", value, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameLessThan(String value) {
            addCriterion("responsible_person_name <", value, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameLessThanOrEqualTo(String value) {
            addCriterion("responsible_person_name <=", value, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameLike(String value) {
            addCriterion("responsible_person_name like", value, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameNotLike(String value) {
            addCriterion("responsible_person_name not like", value, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameIn(List<String> values) {
            addCriterion("responsible_person_name in", values, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameNotIn(List<String> values) {
            addCriterion("responsible_person_name not in", values, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameBetween(String value1, String value2) {
            addCriterion("responsible_person_name between", value1, value2, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonNameNotBetween(String value1, String value2) {
            addCriterion("responsible_person_name not between", value1, value2, "responsiblePersonName");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneIsNull() {
            addCriterion("responsible_person_phone is null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneIsNotNull() {
            addCriterion("responsible_person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneEqualTo(String value) {
            addCriterion("responsible_person_phone =", value, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneNotEqualTo(String value) {
            addCriterion("responsible_person_phone <>", value, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneGreaterThan(String value) {
            addCriterion("responsible_person_phone >", value, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("responsible_person_phone >=", value, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneLessThan(String value) {
            addCriterion("responsible_person_phone <", value, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("responsible_person_phone <=", value, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneLike(String value) {
            addCriterion("responsible_person_phone like", value, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneNotLike(String value) {
            addCriterion("responsible_person_phone not like", value, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneIn(List<String> values) {
            addCriterion("responsible_person_phone in", values, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneNotIn(List<String> values) {
            addCriterion("responsible_person_phone not in", values, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneBetween(String value1, String value2) {
            addCriterion("responsible_person_phone between", value1, value2, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andResponsiblePersonPhoneNotBetween(String value1, String value2) {
            addCriterion("responsible_person_phone not between", value1, value2, "responsiblePersonPhone");
            return (Criteria) this;
        }

        public Criteria andRepairStateIsNull() {
            addCriterion("repair_state is null");
            return (Criteria) this;
        }

        public Criteria andRepairStateIsNotNull() {
            addCriterion("repair_state is not null");
            return (Criteria) this;
        }

        public Criteria andRepairStateEqualTo(Integer value) {
            addCriterion("repair_state =", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotEqualTo(Integer value) {
            addCriterion("repair_state <>", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateGreaterThan(Integer value) {
            addCriterion("repair_state >", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("repair_state >=", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateLessThan(Integer value) {
            addCriterion("repair_state <", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateLessThanOrEqualTo(Integer value) {
            addCriterion("repair_state <=", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateIn(List<Integer> values) {
            addCriterion("repair_state in", values, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotIn(List<Integer> values) {
            addCriterion("repair_state not in", values, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateBetween(Integer value1, Integer value2) {
            addCriterion("repair_state between", value1, value2, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotBetween(Integer value1, Integer value2) {
            addCriterion("repair_state not between", value1, value2, "repairState");
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