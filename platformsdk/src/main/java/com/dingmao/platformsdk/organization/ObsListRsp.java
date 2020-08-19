package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class ObsListRsp {
    /**
     * total_page : 8.058738406092942E7
     * total_count : -2396595.5231409967
     * list : [{"user_id":"sit in non cupidatat","is_admin":"quis deserunt fugiat minim commodo","user_type":"officia minim nulla commodo","user_no":"ad Ut","user_name":"in sed non","phone":"magna","status":"exercitati","status_name":"proiden","create_date":"commodo elit exercitation"},{"user_id":"sed labore culpa","is_admin":"eu sunt","user_type":"occaecat qui anim ad cupidatat","user_no":"aliquip mollit sed aute","user_name":"Lorem qui","phone":"tempor cillum Ut ut quis","status":"magna id officia nostrud","status_name":"ipsum","create_date":"Excepteur incididunt in"}]
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
         * user_id : sit in non cupidatat
         * is_admin : quis deserunt fugiat minim commodo
         * user_type : officia minim nulla commodo
         * user_no : ad Ut
         * user_name : in sed non
         * phone : magna
         * status : exercitati
         * status_name : proiden
         * create_date : commodo elit exercitation
         */

        private String user_id;
        private String is_admin;
        private String user_type;
        private String user_no;
        private String user_name;
        private String phone;
        private String status;
        private String status_name;
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

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }
    }
}
