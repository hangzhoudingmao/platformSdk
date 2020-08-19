package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class AccountListRsp {
    /**
     * total_page : 7.01191371628392E7
     * total_count : 6.335267785095161E7
     * list : [{"user_id":"deserunt minim culpa","is_admin":"laboris","user_type":"ex reprehenderit ipsum","user_type_name":"ipsum adipisicing sint ci","user_no":"minim enim consectetur qui","user_name":"minim","phone":"cupidatat","mail":"sed ","status":"anim adipisicing","status_name":"minim laborum sunt cupidatat irure","dept_id":null,"dept_name":null,"create_date":"deserunt aute"}]
     */

    private double total_page;
    private double total_count;
    private List<ListBean> list;

    public double getTotal_page() {
        return total_page;
    }

    public void setTotal_page(double total_page) {
        this.total_page = total_page;
    }

    public double getTotal_count() {
        return total_count;
    }

    public void setTotal_count(double total_count) {
        this.total_count = total_count;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * user_id : deserunt minim culpa
         * is_admin : laboris
         * user_type : ex reprehenderit ipsum
         * user_type_name : ipsum adipisicing sint ci
         * user_no : minim enim consectetur qui
         * user_name : minim
         * phone : cupidatat
         * mail : sed
         * status : anim adipisicing
         * status_name : minim laborum sunt cupidatat irure
         * dept_id : null
         * dept_name : null
         * create_date : deserunt aute
         */

        private String user_id;
        private String is_admin;
        private String user_type;
        private String user_type_name;
        private String user_no;
        private String user_name;
        private String phone;
        private String mail;
        private String status;
        private String status_name;
        private Object dept_id;
        private Object dept_name;
        private String create_date;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getIs_admin() {
            return is_admin;
        }

        public void setIs_admin(String is_admin) {
            this.is_admin = is_admin;
        }

        public String getUser_type() {
            return user_type;
        }

        public void setUser_type(String user_type) {
            this.user_type = user_type;
        }

        public String getUser_type_name() {
            return user_type_name;
        }

        public void setUser_type_name(String user_type_name) {
            this.user_type_name = user_type_name;
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

        public String getStatus_name() {
            return status_name;
        }

        public void setStatus_name(String status_name) {
            this.status_name = status_name;
        }

        public Object getDept_id() {
            return dept_id;
        }

        public void setDept_id(Object dept_id) {
            this.dept_id = dept_id;
        }

        public Object getDept_name() {
            return dept_name;
        }

        public void setDept_name(Object dept_name) {
            this.dept_name = dept_name;
        }

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }
    }
}
