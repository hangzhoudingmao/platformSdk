package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class DeptMultiListRsp {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * dept_id : proident
         * org_no : culpa ex officia laboris
         * company_id : culpa
         * dept_no : nisi
         * dept_name : Duis incididunt Excepteur dolore
         * dept_type : in proident ea laborum anim
         * p_dept_no : ad cillum
         */

        private String dept_id;
        private String org_no;
        private String company_id;
        private String dept_no;
        private String dept_name;
        private String dept_type;
        private String p_dept_no;

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public String getOrg_no() {
            return org_no;
        }

        public void setOrg_no(String org_no) {
            this.org_no = org_no;
        }

        public String getCompany_id() {
            return company_id;
        }

        public void setCompany_id(String company_id) {
            this.company_id = company_id;
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

        public String getDept_type() {
            return dept_type;
        }

        public void setDept_type(String dept_type) {
            this.dept_type = dept_type;
        }

        public String getP_dept_no() {
            return p_dept_no;
        }

        public void setP_dept_no(String p_dept_no) {
            this.p_dept_no = p_dept_no;
        }
    }
}
