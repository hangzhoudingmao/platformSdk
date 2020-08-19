package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class OrgCompDeptRsp {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * org_no : quis id Duis Lorem ea
         * org_name : minim amet labore est eu
         * dept_no : in mollit dolore
         * dept_name : qui et ut
         * org_id : sed non
         * dept_id : aliqua
         */

        private String org_no;
        private String org_name;
        private String dept_no;
        private String dept_name;
        private String org_id;
        private String dept_id;

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

        public String getDept_no() {
            return dept_no;
        }

        public void setDept_no(String dept_no) {
            this.dept_no = dept_no;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getOrg_id() {
            return org_id;
        }

        public void setOrg_id(String org_id) {
            this.org_id = org_id;
        }

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }
    }
}
