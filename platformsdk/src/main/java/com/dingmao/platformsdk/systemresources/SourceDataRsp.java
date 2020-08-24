package com.dingmao.platformsdk.systemresources;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/18
 * 客户端获取资源信息
 */
@Setter
@Getter
public class SourceDataRsp {
    /**
     * total_count : minim aute veniam cillum in
     * total_page : sunt
     * list : [{"source_id":"dolor eiusmod","source_sort_id":"et","source_no":"sunt","source_value":"ullamco ad","remark":"eu labore"}]
     */

    private String total_count;
    private String total_page;
    private List<ListBean> list;


    @Setter
    @Getter
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
