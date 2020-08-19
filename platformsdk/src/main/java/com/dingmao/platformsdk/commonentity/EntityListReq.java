package com.dingmao.platformsdk.commonentity;

import java.util.List;

/**
 * Create by atu on 2020/8/18
 */
public class EntityListReq {
    private String entitiy_no;//实体编号
    private List<EntityReq> conditions;//查询条件集合
    private String orders;//排序字段，遵从sql语法
    private String fields;//查询字段名，即field_code，多个英文逗号拼接
    private String is_page;//是否分页，默认不分页
    private String page;//
    private String page_size;//

    public String getEntitiy_no() {
        return entitiy_no;
    }

    public void setEntitiy_no(String entitiy_no) {
        this.entitiy_no = entitiy_no;
    }

    public List<EntityReq> getConditions() {
        return conditions;
    }

    public void setConditions(List<EntityReq> conditions) {
        this.conditions = conditions;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getIs_page() {
        return is_page;
    }

    public void setIs_page(String is_page) {
        this.is_page = is_page;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public static class EntityReq{
        private String cond_field;//条件字段名
        private String cond_operation;//运算类型，分为=，>，<,like 等
        private String cond_value;//条件值

        public String getCond_field() {
            return cond_field;
        }

        public void setCond_field(String cond_field) {
            this.cond_field = cond_field;
        }

        public String getCond_operation() {
            return cond_operation;
        }

        public void setCond_operation(String cond_operation) {
            this.cond_operation = cond_operation;
        }

        public String getCond_value() {
            return cond_value;
        }

        public void setCond_value(String cond_value) {
            this.cond_value = cond_value;
        }
    }
}
