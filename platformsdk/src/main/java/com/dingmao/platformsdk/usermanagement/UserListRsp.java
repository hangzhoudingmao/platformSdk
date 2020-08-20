package com.dingmao.platformsdk.usermanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/20
 */
public class UserListRsp {
    /**
     * total_count : 1.9703569461137027E7
     * total_page : -8.1812195738514E7
     * page_size : -9.106219917876692E7
     * cur_page : -6.458605477199683E7
     * list : [{"user_id":"fugiat","comp_id":"esse et magna aute","org_no":"tempor enim","dept_no":"sint cupidatat Duis sunt","is_admin":"laborum","user_no":"eu","user_type":"Excepteur et cupidatat","user_name":"qui","phone":"voluptate magna ea esse","avatar":"incididunt tempor aliqua","mail":"voluptate commodo sit","status":"aliqua mollit elit laborum anim","create_date":"dolor anim eiusmod elit esse","create_id":"labore quis","last_modify_id":"sunt laborum amet ali","last_modify_date":"qui elit eiusmod reprehenderit","last_login_date":"non nostrud voluptate","last_login_ip":"et cupidatat ea non ","jobs":[{"job_id":"dolor id officia proident deserunt","job_name":"et dolore officia","user_id":"dolor laborum eu irure","dept_no":"tempor nisi elit commodo proident","dept_name":"irure Duis officia enim","org_no":"consequat proident aliqua esse","org_name":"nostrud ut Lorem"},{"job_id":"aliqua occaecat","job_name":"exercitation","user_id":"laboris ipsum Duis ex","dept_no":"consequat","dept_name":"in dolor tempor amet Excepteur","org_no":"ut","org_name":"in"},{"job_id":"in","job_name":"occaecat sit dolore minim ad","user_id":"","dept_no":"","dept_name":"Excepteur ","org_no":"commodo non nisi","org_name":"sit ipsum reprehenderit do Excepteur"},{"job_id":"irure","job_name":"voluptate fugiat laborum ipsum","user_id":"amet ut in dolore","dept_no":"id est occaecat","dept_name":"laboris ut commodo proident cillum","org_no":"sunt ex esse","org_name":"reprehenderit pariatur in Duis velit"},{"job_id":"ex labore aliqua qui","job_name":"eu proident","user_id":"in nulla enim nostrud ad","dept_no":"sunt nostrud","dept_name":"dolore elit occaecat labore","org_no":"dolore v","org_name":"deserunt nostrud occaecat"}]},{"user_id":"incididunt culpa aute sit","comp_id":"minim veniam esse irure cupidatat","org_no":"ut","dept_no":"aliqua","is_admin":"labore ani","user_no":"dolor dolore reprehenderit incididunt","user_type":"proident Excepteur Ut culpa veniam","user_name":"aute sint u","phone":"exercitation cupidatat","avatar":"amet non esse pariatur","mail":"quis ipsum","status":"incididunt","create_date":"commodo eiusmod quis","create_id":"amet cupidatat ut","last_modify_id":"anim","last_modify_date":"id","last_login_date":"sed","last_login_ip":"aute","jobs":[{"job_id":"Excepteur adipisicing in proident minim","job_name":"occaecat","user_id":"cillum occaecat ","dept_no":"mollit commodo anim","dept_name":"do qui officia sunt","org_no":"cupidatat","org_name":"cupidatat commodo irure sint"},{"job_id":"consectetur officia magna sit consequat","job_name":"occaecat consequat nisi sit veniam","user_id":"ex officia","dept_no":"in labore qui exercitation","dept_name":"ut","org_no":"proident","org_name":"nostrud Lorem anim"},{"job_id":"culpa incididunt","job_name":"incididunt eu do","user_id":"nisi ut Ut Excepteur Duis","dept_no":"eiusmod non minim dolor culpa","dept_name":"deserunt commodo anim","org_no":"mollit commodo ullamco sint","org_name":"ad deserunt Excepteur"}]},{"user_id":"minim","comp_id":"ipsum officia mollit dolor minim","org_no":"laboris","dept_no":"ut","is_admin":"officia","user_no":"eiusmod","user_type":"nulla dolor dolore adipisicing sed","user_name":"dolore elit amet deserunt es","phone":"dolor","avatar":"magna","mail":"","status":"Duis","create_date":"aliqua","create_id":"mollit dolore","last_modify_id":"esse consectetur ut","last_modify_date":"et nulla eiusmod","last_login_date":"fugiat Ut ut do aute","last_login_ip":"pariatur est","jobs":[{"job_id":"ad cupidatat commodo eius","job_name":"sit aliqua cupidatat","user_id":"do ea ex","dept_no":"ipsum ullamc","dept_name":"adipisicing","org_no":"in veniam","org_name":"mollit anim"},{"job_id":"ipsum","job_name":"Ut sed","user_id":"irure eu nisi cupidatat","dept_no":"qui","dept_name":"culpa aute","org_no":"aliquip nulla","org_name":"voluptate"}]},{"user_id":"qui","comp_id":"dolore ullamco sunt laborum","org_no":"dolor cupidatat","dept_no":"ullamco cillum do","is_admin":"quis","user_no":"esse","user_type":"elit","user_name":"reprehenderit","phone":"i","avatar":"fugiat in sint commodo el","mail":"ad reprehe","status":"Excepteur ipsum reprehe","create_date":"ut magna","create_id":"nostrud dolore","last_modify_id":"Excepteur velit Lorem magna anim","last_modify_date":"ipsum nulla esse in","last_login_date":"tempor laboris occaecat elit","last_login_ip":"non est tempor eu","jobs":[{"job_id":"tempor id","job_name":"voluptate m","user_id":"sed do id veniam sit","dept_no":"et eu","dept_name":"occaecat officia minim","org_no":"deserunt eu nulla cupidatat","org_name":"aute sint dolore est"},{"job_id":"in adipisicing","job_name":"pariatur nostrud","user_id":"quis fugiat minim commodo","dept_no":"aute non","dept_name":"Ut do","org_no":"irure ut","org_name":"non veniam nulla dolor ad"}]}]
     */

    private double total_count;
    private double total_page;
    private double page_size;
    private double cur_page;
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

    public double getPage_size() {
        return page_size;
    }

    public void setPage_size(double page_size) {
        this.page_size = page_size;
    }

    public double getCur_page() {
        return cur_page;
    }

    public void setCur_page(double cur_page) {
        this.cur_page = cur_page;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * user_id : fugiat
         * comp_id : esse et magna aute
         * org_no : tempor enim
         * dept_no : sint cupidatat Duis sunt
         * is_admin : laborum
         * user_no : eu
         * user_type : Excepteur et cupidatat
         * user_name : qui
         * phone : voluptate magna ea esse
         * avatar : incididunt tempor aliqua
         * mail : voluptate commodo sit
         * status : aliqua mollit elit laborum anim
         * create_date : dolor anim eiusmod elit esse
         * create_id : labore quis
         * last_modify_id : sunt laborum amet ali
         * last_modify_date : qui elit eiusmod reprehenderit
         * last_login_date : non nostrud voluptate
         * last_login_ip : et cupidatat ea non
         * jobs : [{"job_id":"dolor id officia proident deserunt","job_name":"et dolore officia","user_id":"dolor laborum eu irure","dept_no":"tempor nisi elit commodo proident","dept_name":"irure Duis officia enim","org_no":"consequat proident aliqua esse","org_name":"nostrud ut Lorem"},{"job_id":"aliqua occaecat","job_name":"exercitation","user_id":"laboris ipsum Duis ex","dept_no":"consequat","dept_name":"in dolor tempor amet Excepteur","org_no":"ut","org_name":"in"},{"job_id":"in","job_name":"occaecat sit dolore minim ad","user_id":"","dept_no":"","dept_name":"Excepteur ","org_no":"commodo non nisi","org_name":"sit ipsum reprehenderit do Excepteur"},{"job_id":"irure","job_name":"voluptate fugiat laborum ipsum","user_id":"amet ut in dolore","dept_no":"id est occaecat","dept_name":"laboris ut commodo proident cillum","org_no":"sunt ex esse","org_name":"reprehenderit pariatur in Duis velit"},{"job_id":"ex labore aliqua qui","job_name":"eu proident","user_id":"in nulla enim nostrud ad","dept_no":"sunt nostrud","dept_name":"dolore elit occaecat labore","org_no":"dolore v","org_name":"deserunt nostrud occaecat"}]
         */

        private String user_id;
        private String comp_id;
        private String org_no;
        private String dept_no;
        private String is_admin;
        private String user_no;
        private String user_type;
        private String user_name;
        private String phone;
        private String avatar;
        private String mail;
        private String status;
        private String create_date;
        private String create_id;
        private String last_modify_id;
        private String last_modify_date;
        private String last_login_date;
        private String last_login_ip;
        private List<JobsBean> jobs;

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

        public String getUser_no() {
            return user_no;
        }

        public void setUser_no(String user_no) {
            this.user_no = user_no;
        }

        public String getUser_type() {
            return user_type;
        }

        public void setUser_type(String user_type) {
            this.user_type = user_type;
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

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
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

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }

        public String getCreate_id() {
            return create_id;
        }

        public void setCreate_id(String create_id) {
            this.create_id = create_id;
        }

        public String getLast_modify_id() {
            return last_modify_id;
        }

        public void setLast_modify_id(String last_modify_id) {
            this.last_modify_id = last_modify_id;
        }

        public String getLast_modify_date() {
            return last_modify_date;
        }

        public void setLast_modify_date(String last_modify_date) {
            this.last_modify_date = last_modify_date;
        }

        public String getLast_login_date() {
            return last_login_date;
        }

        public void setLast_login_date(String last_login_date) {
            this.last_login_date = last_login_date;
        }

        public String getLast_login_ip() {
            return last_login_ip;
        }

        public void setLast_login_ip(String last_login_ip) {
            this.last_login_ip = last_login_ip;
        }

        public List<JobsBean> getJobs() {
            return jobs;
        }

        public void setJobs(List<JobsBean> jobs) {
            this.jobs = jobs;
        }

        public static class JobsBean {
            /**
             * job_id : dolor id officia proident deserunt
             * job_name : et dolore officia
             * user_id : dolor laborum eu irure
             * dept_no : tempor nisi elit commodo proident
             * dept_name : irure Duis officia enim
             * org_no : consequat proident aliqua esse
             * org_name : nostrud ut Lorem
             */

            private String job_id;
            private String job_name;
            private String user_id;
            private String dept_no;
            private String dept_name;
            private String org_no;
            private String org_name;

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

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
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
        }
    }
}
