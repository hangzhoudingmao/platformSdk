package com.dingmao.platformsdk.systemmanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/20
 */
public class SysAuthRsp {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * sid : ullamco dolor
         * system_no : aute
         * system_name : id sed deserunt tempor commodo
         * system_alias : dolor ut
         */

        private String sid;
        private String system_no;
        private String system_name;
        private String system_alias;

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getSystem_no() {
            return system_no;
        }

        public void setSystem_no(String system_no) {
            this.system_no = system_no;
        }

        public String getSystem_name() {
            return system_name;
        }

        public void setSystem_name(String system_name) {
            this.system_name = system_name;
        }

        public String getSystem_alias() {
            return system_alias;
        }

        public void setSystem_alias(String system_alias) {
            this.system_alias = system_alias;
        }
    }
}
