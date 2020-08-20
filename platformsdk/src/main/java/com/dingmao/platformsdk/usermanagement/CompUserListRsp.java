package com.dingmao.platformsdk.usermanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/20
 */
public class CompUserListRsp {
    /**
     * total_count : -8.269159492904596E7
     * total_page : -8.725210434323052E7
     * cur_page : 3.707874993428603E7
     * page_size : elit nulla exercitation
     * list : [{"user_type":"amet exercitation nisi dolore dolor","user_no":"in Lorem sunt aliquip","user_name":"enim Lorem quis sint","phone":"ipsum incididunt s","avatar":null,"status":"dolor","last_login_date":null,"audit_status":"ut non enim et","create_date":"aliquip mollit","user_id":"Ut sed eu dolor","comp_id":"id dolor deserunt","org_no":null,"dept_no":"sit proident Lorem Ut","job_name":"cillum","status_name":"officia proident eiusmod","dept_name":"veniam","company_name":""},{"user_type":"ipsum Lorem reprehenderit minim est","user_no":"proident voluptate","user_name":"Lorem esse fugia","phone":"fugiat culpa aliqua","avatar":null,"status":"cillum ","last_login_date":"","audit_status":"culpa ad","create_date":"culpa","user_id":"quis sit consequat","comp_id":"sed esse cillum aliqua velit","org_no":"labore","dept_no":"reprehenderit magna tempor id qui","job_name":"reprehenderit sit nulla aliqua ex","status_name":"deserunt","dept_name":"et Ut eu in cupidatat","company_name":"nisi Duis adipisicing commodo"},{"user_type":"adipisicing","user_no":"ea Ut vol","user_name":"co","phone":"nisi Excepteur ut voluptate ut","avatar":null,"status":"mollit laboris","last_login_date":null,"audit_status":"Duis Ut","create_date":"Duis ipsum mollit eu","user_id":"consectetur dolore officia est","comp_id":"cupidatat dolor laborum Excepteur","org_no":null,"dept_no":"labore","job_name":"consequat Excepteur commodo","status_name":"esse magna","dept_name":"ut fugiat ea irure esse","company_name":"eiusmod eu sed"},{"user_type":"nulla laboris incididunt","user_no":"est consectetur","user_name":"elit","phone":"in sint pariatur Lorem ex","avatar":null,"status":"dolor Duis dolore mollit esse","last_login_date":"esse irure","audit_status":"laboris culpa","create_date":"elit occaecat aliqua magna in","user_id":"dolor laboris elit","comp_id":"dolore amet sed deserunt","org_no":null,"dept_no":"ex","job_name":"sunt","status_name":"dolor qui","dept_name":"laboris nulla","company_name":"Lorem do occaecat"},{"user_type":"ut laborum veniam elit officia","user_no":"sunt mollit amet","user_name":"est esse Lorem irure","phone":"irure nulla","avatar":"dolore aute cupidatat sint sit","status":"ut in","last_login_date":"laboris nisi id","audit_status":"ex nisi ad deserunt","create_date":"proident incididunt ex","user_id":"laborum consectetur ipsum Excepteur non","comp_id":"eiusmod","org_no":"laborum deserunt elit","dept_no":"cillum Duis nostrud anim ut","job_name":"occaecat eu in in","status_name":"incididunt","dept_name":"incididunt cul","company_name":"anim enim cillum"}]
     */

    private double total_count;
    private double total_page;
    private double cur_page;
    private String page_size;
    private List<ListBean> list;

    public double getTotal_count() {
        return total_count;
    }

    public void setTotal_count(double total_count) {
        this.total_count = total_count;
    }

    public double getTotal_page() {
        return total_page;
    }

    public void setTotal_page(double total_page) {
        this.total_page = total_page;
    }

    public double getCur_page() {
        return cur_page;
    }

    public void setCur_page(double cur_page) {
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
         * user_type : amet exercitation nisi dolore dolor
         * user_no : in Lorem sunt aliquip
         * user_name : enim Lorem quis sint
         * phone : ipsum incididunt s
         * avatar : null
         * status : dolor
         * last_login_date : null
         * audit_status : ut non enim et
         * create_date : aliquip mollit
         * user_id : Ut sed eu dolor
         * comp_id : id dolor deserunt
         * org_no : null
         * dept_no : sit proident Lorem Ut
         * job_name : cillum
         * status_name : officia proident eiusmod
         * dept_name : veniam
         * company_name :
         */

        private String user_type;
        private String user_no;
        private String user_name;
        private String phone;
        private Object avatar;
        private String status;
        private Object last_login_date;
        private String audit_status;
        private String create_date;
        private String user_id;
        private String comp_id;
        private Object org_no;
        private String dept_no;
        private String job_name;
        private String status_name;
        private String dept_name;
        private String company_name;

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

        public Object getAvatar() {
            return avatar;
        }

        public void setAvatar(Object avatar) {
            this.avatar = avatar;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getLast_login_date() {
            return last_login_date;
        }

        public void setLast_login_date(Object last_login_date) {
            this.last_login_date = last_login_date;
        }

        public String getAudit_status() {
            return audit_status;
        }

        public void setAudit_status(String audit_status) {
            this.audit_status = audit_status;
        }

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getComp_id() {
            return comp_id;
        }

        public void setComp_id(String comp_id) {
            this.comp_id = comp_id;
        }

        public Object getOrg_no() {
            return org_no;
        }

        public void setOrg_no(Object org_no) {
            this.org_no = org_no;
        }

        public String getDept_no() {
            return dept_no;
        }

        public void setDept_no(String dept_no) {
            this.dept_no = dept_no;
        }

        public String getJob_name() {
            return job_name;
        }

        public void setJob_name(String job_name) {
            this.job_name = job_name;
        }

        public String getStatus_name() {
            return status_name;
        }

        public void setStatus_name(String status_name) {
            this.status_name = status_name;
        }

        public String getDept_name() {
            return dept_name;
        }

        public void setDept_name(String dept_name) {
            this.dept_name = dept_name;
        }

        public String getCompany_name() {
            return company_name;
        }

        public void setCompany_name(String company_name) {
            this.company_name = company_name;
        }
    }
}
