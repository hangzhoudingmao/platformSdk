package com.dingmao.platformsdk.usermanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/20
 */
public class UserMultiListRsp {
    /**
     * total_page : -5.2777096721265115E7
     * total_count : 9.559066549002257E7
     * list : [{"user_id":"culpa dolore Lorem deserunt","user_name":"reprehenderit ad irure anim","phone":"aute Excepteur","comp_id":"labore officia","dept_id":"irure nisi occaecat eiusmod exercitatio","dept_no":"incidi","dept_name":"labore mollit ad consequat","dept_type":"nisi velit ad sit","p_dept_no":"culpa ","job_id":"reprehenderit in id dolore magna","job_name":"fugiat sint"},{"user_id":"nulla consectetur consequat laborum","user_name":"consequat Duis","phone":"ex Excepteur sed dolore","comp_id":"sunt","dept_id":"qui","dept_no":"fugiat ut","dept_name":"consectetur","dept_type":"laborum ipsum officia","p_dept_no":"proident enim","job_id":"cillum occaecat dolor","job_name":"fugiat Excepteur"}]
     * cur_page : cupidatat consequat Lorem nostrud pariatur
     * page_size : commodo in
     */

    private double total_page;
    private double total_count;
    private String cur_page;
    private String page_size;
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

    public String getCur_page() {
        return cur_page;
    }

    public void setCur_page(String cur_page) {
        this.cur_page = cur_page;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * user_id : culpa dolore Lorem deserunt
         * user_name : reprehenderit ad irure anim
         * phone : aute Excepteur
         * comp_id : labore officia
         * dept_id : irure nisi occaecat eiusmod exercitatio
         * dept_no : incidi
         * dept_name : labore mollit ad consequat
         * dept_type : nisi velit ad sit
         * p_dept_no : culpa
         * job_id : reprehenderit in id dolore magna
         * job_name : fugiat sint
         */

        private String user_id;
        private String user_name;
        private String phone;
        private String comp_id;
        private String dept_id;
        private String dept_no;
        private String dept_name;
        private String dept_type;
        private String p_dept_no;
        private String job_id;
        private String job_name;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
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

        public String getComp_id() {
            return comp_id;
        }

        public void setComp_id(String comp_id) {
            this.comp_id = comp_id;
        }

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
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

        public String getJob_id() {
            return job_id;
        }

        public void setJob_id(String job_id) {
            this.job_id = job_id;
        }

        public String getJob_name() {
            return job_name;
        }

        public void setJob_name(String job_name) {
            this.job_name = job_name;
        }
    }
}
