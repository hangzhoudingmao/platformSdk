package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class SubDeptListRsp {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * dept_id : nostrud sit non velit Duis
         * no : eu quis in magna
         * dept_name : occaecat aute adipisicing
         * p_dept_no : aliqua dolor
         */

        private String dept_id;
        private String no;
        private String dept_name;
        private String p_dept_no;

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getP_dept_no() {
            return p_dept_no;
        }

        public void setP_dept_no(String p_dept_no) {
            this.p_dept_no = p_dept_no;
        }
    }
}
