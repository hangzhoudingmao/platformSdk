package com.dingmao.platformsdk.commonentity;

import java.util.List;

/**
 * Create by atu on 2020/8/18
 */
public class EntityAddReq {
    private String entity_no;//实体编号，通过公共中心定义
    private String system_no;//系统编码
    private List<EntityReq> data;//

    public String getEntity_no() {
        return entity_no;
    }

    public void setEntity_no(String entity_no) {
        this.entity_no = entity_no;
    }

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }

    public List<EntityReq> getData() {
        return data;
    }

    public void setData(List<EntityReq> data) {
        this.data = data;
    }

    public static class EntityReq{
        private String field_code;//字段编码,到公共中心去定义
        private String val;//字段值

        public String getField_code() {
            return field_code;
        }

        public void setField_code(String field_code) {
            this.field_code = field_code;
        }

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }
    }

}
