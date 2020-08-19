package com.dingmao.platformsdk.insertmanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/18
 */
public class SimulateLoginRsp {
    /**
     * user_id : ut
     * comp_id : eu incididunt est in
     * domain_name : ea
     * org_no : e
     * dept_no : aliquip minim laboris
     * is_admin : dolor do amet fugiat in
     * user_type : eu
     * user_no : exer
     * user_name : sunt fugiat irure
     * phone : qui ut dolore
     * mail : Ut minim velit elit
     * avatar : null
     * status : laborum nisi ess
     * system_no : voluptate laboris veniam
     * sid : -6.514315302308744E7
     * privileges : ["sunt labore nulla","reprehenderit","culpa","pariatur eu non ullamco ipsum","eiusmod in ex aute"]
     * access_token : dolore nost
     * refresh_token : Ut dolore reprehenderit ex
     * job_list : [{"job_id":"magna culpa eiusmod velit","job_name":"do cillum non sed culpa","company_id":"proident sit nisi culpa","dept_no":"fugiat","dept_name":"proident nulla reprehenderit","org_no":"do","org_name":"qui deserunt dolor ullamco ad","user_id":"adipisicing"},{"job_id":"n","job_name":"quis ea et do in","company_id":"non elit e","dept_no":"dolore Duis ullamco ipsum mollit","dept_name":"fugiat","org_no":"dolore in enim sed","org_name":"","user_id":"enim"},{"job_id":"Lorem irure","job_name":"amet","company_id":"magna ex culpa aute","dept_no":"Ut Lorem est conse","dept_name":"fugiat aute proident cillum","org_no":"non ","org_name":"dolor","user_id":"ut non enim"}]
     */

    private String user_id;
    private String comp_id;
    private String domain_name;
    private String org_no;
    private String dept_no;
    private String is_admin;
    private String user_type;
    private String user_no;
    private String user_name;
    private String phone;
    private String mail;
    private Object avatar;
    private String status;
    private String system_no;
    private double sid;
    private String access_token;
    private String refresh_token;
    private List<String> privileges;
    private List<JobListBean> job_list;

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

    public String getDomain_name() {
        return domain_name;
    }

    public void setDomain_name(String domain_name) {
        this.domain_name = domain_name;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }

    public double getSid() {
        return sid;
    }

    public void setSid(double sid) {
        this.sid = sid;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    public List<JobListBean> getJob_list() {
        return job_list;
    }

    public void setJob_list(List<JobListBean> job_list) {
        this.job_list = job_list;
    }

    public static class JobListBean {
        /**
         * job_id : magna culpa eiusmod velit
         * job_name : do cillum non sed culpa
         * company_id : proident sit nisi culpa
         * dept_no : fugiat
         * dept_name : proident nulla reprehenderit
         * org_no : do
         * org_name : qui deserunt dolor ullamco ad
         * user_id : adipisicing
         */

        private String job_id;
        private String job_name;
        private String company_id;
        private String dept_no;
        private String dept_name;
        private String org_no;
        private String org_name;
        private String user_id;

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

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }
    }
}
