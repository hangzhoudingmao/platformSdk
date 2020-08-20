package com.dingmao.platformsdk.usermanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/20
 */
public class UserDetailRsp {
    /**
     * user_id : sint dolore Excepteur exercitation ipsum
     * org_no : culpa in
     * org_name : se
     * dept_no : nisi deserunt
     * dept_name : ea aliquip
     * user_no : irure qui sed tempor quis
     * user_name : eiusmod
     * phone : Lorem veniam eu
     * mail : nisi
     * status : Ut id
     * avatar : Lorem
     * avatar_url : sint
     * remark : dolore
     * create_date : occaecat nisi ea mollit
     * job_data : [{"user_id":"ipsum adipisicing dolore quis est","job_id":"sunt aliquip","job_name":"officia eiusmod"},{"user_id":"fugiat nostrud officia","job_id":"dol","job_name":"commodo laborum"}]
     * company_id : nostrud ipsum
     * company_name : pariatur voluptate
     */

    private String user_id;
    private String org_no;
    private String org_name;
    private String dept_no;
    private String dept_name;
    private String user_no;
    private String user_name;
    private String phone;
    private String mail;
    private String status;
    private String avatar;
    private String avatar_url;
    private String remark;
    private String create_date;
    private String company_id;
    private String company_name;
    private List<JobDataBean> job_data;

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

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public List<JobDataBean> getJob_data() {
        return job_data;
    }

    public void setJob_data(List<JobDataBean> job_data) {
        this.job_data = job_data;
    }

    public static class JobDataBean {
        /**
         * user_id : ipsum adipisicing dolore quis est
         * job_id : sunt aliquip
         * job_name : officia eiusmod
         */

        private String user_id;
        private String job_id;
        private String job_name;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
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
