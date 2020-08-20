package com.dingmao.platformsdk.usermanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/20
 */
public class UserAddRsp {
    private List<ListBean> list;

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * user_id : reprehenderit
         * org_no : officia laboris non aliquip en
         * dept_no : commodo pariatur o
         * user_no : in veniam
         * user_name : nulla nisi mollit deserunt ea
         * phone : occaecat ullamco sed
         * mail : con
         * status : dolor
         * avatar : consectetur officia Ut ipsum
         */

        private String user_id;
        private String org_no;
        private String dept_no;
        private String user_no;
        private String user_name;
        private String phone;
        private String mail;
        private String status;
        private String avatar;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getOrg_no() {
            return org_no;
        }

        public void setOrg_no(String org_no) {
            this.org_no = org_no;
        }

        public String getDept_no() {
            return dept_no;
        }

        public void setDept_no(String dept_no) {
            this.dept_no = dept_no;
        }

        public String getUser_no() {
            return user_no;
        }

        public void setUser_no(String user_no) {
            this.user_no = user_no;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }
}
