package com.dingmao.platformsdk.systemresources;

import java.util.List;

/**
 * Create by atu on 2020/8/18
 */
public class SourceAddReq {
    private String source_sort_id;//系统资源分类标识
    private List<SourceDataReq> source_data;

    public String getSource_sort_id() {
        return source_sort_id;
    }

    public void setSource_sort_id(String source_sort_id) {
        this.source_sort_id = source_sort_id;
    }

    public List<SourceDataReq> getSource_data() {
        return source_data;
    }

    public void setSource_data(List<SourceDataReq> source_data) {
        this.source_data = source_data;
    }

    public static class SourceDataReq{
        private String source_value;//系统资源值
        private String source_no;//系统资源编码
        private String remark;//系统资源说明

        public String getSource_value() {
            return source_value;
        }

        public void setSource_value(String source_value) {
            this.source_value = source_value;
        }

        public String getSource_no() {
            return source_no;
        }

        public void setSource_no(String source_no) {
            this.source_no = source_no;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
