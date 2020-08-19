package com.dingmao.platformsdk.systemresources;

import java.util.List;

/**
 * Create by atu on 2020/8/18
 */
public class SourceDataRsp {
    /**
     * total_count : minim aute veniam cillum in
     * total_page : sunt
     * list : [{"source_id":"dolor eiusmod","source_sort_id":"et","source_no":"sunt","source_value":"ullamco ad","remark":"eu labore"}]
     */

    private String total_count;
    private String total_page;
    private List<ListBean> list;

    public String getTotal_count() {
        return total_count;
    }

    public void setTotal_count(String total_count) {
        this.total_count = total_count;
    }

    public String getTotal_page() {
        return total_page;
    }

    public void setTotal_page(String total_page) {
        this.total_page = total_page;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * source_id : dolor eiusmod
         * source_sort_id : et
         * source_no : sunt
         * source_value : ullamco ad
         * remark : eu labore
         */

        private String source_id;
        private String source_sort_id;
        private String source_no;
        private String source_value;
        private String remark;

        public String getSource_id() {
            return source_id;
        }

        public void setSource_id(String source_id) {
            this.source_id = source_id;
        }

        public String getSource_sort_id() {
            return source_sort_id;
        }

        public void setSource_sort_id(String source_sort_id) {
            this.source_sort_id = source_sort_id;
        }

        public String getSource_no() {
            return source_no;
        }

        public void setSource_no(String source_no) {
            this.source_no = source_no;
        }

        public String getSource_value() {
            return source_value;
        }

        public void setSource_value(String source_value) {
            this.source_value = source_value;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
