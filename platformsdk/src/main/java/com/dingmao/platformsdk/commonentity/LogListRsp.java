package com.dingmao.platformsdk.commonentity;

import java.util.List;

/**
 * Create by atu on 2020/8/18
 */
public class LogListRsp {
    /**
     * total_page : -5.891267266952598E7
     * page : 6.362438803071946E7
     * total_count : -9.607155228839259E7
     * page_size : -6.902358483189182E7
     * list : [{"log_id":"incididunt officia dolore ","created_at":"et esse aute","user_no":"et qui aliquip","phone":"cupidatat nulla magna nostrud consequat","created_user_id":"ipsum commodo occaecat","created_user_name":"Excepteur dolore cupidatat in ipsum","system_no":"in nostrud","module":"anim ea in","modular":"aute id Excepteur cupidatat","action_type":"nostrud","action_name":"dolore consequat adipisicing velit","description":"dolor culpa","entrys":"cill"},{"log_id":"dolore in eu laboris reprehenderit","created_at":"consectetur u","user_no":"nostrud non ut","phone":"dolore","created_user_id":"cillum mollit","created_user_name":"labore laborum sint anim eu","system_no":"non","module":"dolore voluptate Ut tempor Duis","modular":"est ad anim do","action_type":"Ut laborum dolor quis","action_name":"do Excepteur consequat ut","description":"voluptate proident mollit tempor","entrys":"ut sint "},{"log_id":"labore pariatur","created_at":"elit","user_no":"amet pariatur sunt occaecat exercitation","phone":"est Duis in","created_user_id":"nulla in ut exercita","created_user_name":"non cupidatat Excepteur officia","system_no":"officia in","module":"occaecat ut","modular":"irur","action_type":"aliqua dolore irure commodo amet","action_name":"nostrud Excepteur","description":"laborum","entrys":"mollit amet dolor anim in"}]
     */

    private double total_page;
    private double page;
    private double total_count;
    private double page_size;
    private List<ListBean> list;

    public double getTotal_page() {
        return total_page;
    }

    public void setTotal_page(double total_page) {
        this.total_page = total_page;
    }

    public double getPage() {
        return page;
    }

    public void setPage(double page) {
        this.page = page;
    }

    public double getTotal_count() {
        return total_count;
    }

    public void setTotal_count(double total_count) {
        this.total_count = total_count;
    }

    public double getPage_size() {
        return page_size;
    }

    public void setPage_size(double page_size) {
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
         * log_id : incididunt officia dolore
         * created_at : et esse aute
         * user_no : et qui aliquip
         * phone : cupidatat nulla magna nostrud consequat
         * created_user_id : ipsum commodo occaecat
         * created_user_name : Excepteur dolore cupidatat in ipsum
         * system_no : in nostrud
         * module : anim ea in
         * modular : aute id Excepteur cupidatat
         * action_type : nostrud
         * action_name : dolore consequat adipisicing velit
         * description : dolor culpa
         * entrys : cill
         */

        private String log_id;
        private String created_at;
        private String user_no;
        private String phone;
        private String created_user_id;
        private String created_user_name;
        private String system_no;
        private String module;
        private String modular;
        private String action_type;
        private String action_name;
        private String description;
        private String entrys;

        public String getLog_id() {
            return log_id;
        }

        public void setLog_id(String log_id) {
            this.log_id = log_id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUser_no() {
            return user_no;
        }

        public void setUser_no(String user_no) {
            this.user_no = user_no;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getCreated_user_id() {
            return created_user_id;
        }

        public void setCreated_user_id(String created_user_id) {
            this.created_user_id = created_user_id;
        }

        public String getCreated_user_name() {
            return created_user_name;
        }

        public void setCreated_user_name(String created_user_name) {
            this.created_user_name = created_user_name;
        }

        public String getSystem_no() {
            return system_no;
        }

        public void setSystem_no(String system_no) {
            this.system_no = system_no;
        }

        public String getModule() {
            return module;
        }

        public void setModule(String module) {
            this.module = module;
        }

        public String getModular() {
            return modular;
        }

        public void setModular(String modular) {
            this.modular = modular;
        }

        public String getAction_type() {
            return action_type;
        }

        public void setAction_type(String action_type) {
            this.action_type = action_type;
        }

        public String getAction_name() {
            return action_name;
        }

        public void setAction_name(String action_name) {
            this.action_name = action_name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getEntrys() {
            return entrys;
        }

        public void setEntrys(String entrys) {
            this.entrys = entrys;
        }
    }
}
