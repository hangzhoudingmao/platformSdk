package com.dingmao.platformsdk.commonentity;

import java.util.List;

/**
 * Create by atu on 2020/8/18
 */
public class EntityUpdateReq {
    private String entity_data_id;//数据记录ID
    private List<EntityReq> data;

    public String getEntity_data_id() {
        return entity_data_id;
    }

    public void setEntity_data_id(String entity_data_id) {
        this.entity_data_id = entity_data_id;
    }

    public List<EntityReq> getData() {
        return data;
    }

    public void setData(List<EntityReq> data) {
        this.data = data;
    }

    public static class EntityReq{
        private String field_code;//字段编码
        private String val;//修改值
        private String entity_det_id;//属性记录ID

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

        public String getEntity_det_id() {
            return entity_det_id;
        }

        public void setEntity_det_id(String entity_det_id) {
            this.entity_det_id = entity_det_id;
        }
    }
}
