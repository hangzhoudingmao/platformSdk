package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class BelongOrgListRsp {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * dept_no : in proident
         * org_id : eiusmod nulla
         * org_no : anim sit Lorem voluptate
         * org_name : id magn
         */

        private String dept_no;
        private String org_id;
        private String org_no;
        private String org_name;

        public String getDept_no() {
            return dept_no;
        }

        public void setDept_no(String dept_no) {
            this.dept_no = dept_no;
        }

        public String getOrg_id() {
            return org_id;
        }

        public void setOrg_id(String org_id) {
            this.org_id = org_id;
        }

        public String getOrg_no() {
            return org_no;
        }

        public void setOrg_no(String org_no) {
            this.org_no = org_no;
        }

        public String getOrg_name() {
            return org_name;
        }

        public void setOrg_name(String org_name) {
            this.org_name = org_name;
        }
    }
}
