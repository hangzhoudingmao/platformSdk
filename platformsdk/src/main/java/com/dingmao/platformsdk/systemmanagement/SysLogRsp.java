package com.dingmao.platformsdk.systemmanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/20
 */
public class SysLogRsp {
    /**
     * total_count : 7.91082499468176E7
     * total_page : 9.521601188015822E7
     * page_size : 6.993646359105709E7
     * cur_page : 4.817414321288559E7
     * list : [{"sys_log_id":"labore Lorem","oper_id":"anim","oper_no":"culpa velit Duis in","oper_name":"nostrud mollit","oper_date":"fugiat Duis consequat mollit commodo","exp_desc":"Lorem","exp_message":"et laborum adipisicing","module":"velit do occaecat elit reprehenderi","method":"ullamco"},{"sys_log_id":"commodo ad deserunt veli","oper_id":"dolor Lorem eu","oper_no":"sint","oper_name":"sunt quis Ut velit","oper_date":"ull","exp_desc":"eiusmod sit mollit occaecat irure","exp_message":"reprehenderit dolor in cupidatat nulla","module":"quis sit laboris incididunt voluptate","method":"dolor"},{"sys_log_id":"aute exercitation et mollit","oper_id":"fugiat","oper_no":"proident laborum","oper_name":"qui eiusmod est","oper_date":"amet Excepteur sint","exp_desc":"laboris","exp_message":"exercitation","module":"anim exer","method":"sint in dolor nisi"},{"sys_log_id":"sint mollit commodo eu enim","oper_id":"consectetur","oper_no":"aliquip aute labore non enim","oper_name":"mollit est magna fugiat tempor","oper_date":"ut laboris dolor","exp_desc":"in do id veniam","exp_message":"id exercitation irure Duis","module":"Lorem in mollit","method":"esse"},{"sys_log_id":"ad eiusmod sint exercitation consectetur","oper_id":"pariatur dolor","oper_no":"dolor minim ipsum","oper_name":"ut labore nisi elit","oper_date":"pariatur","exp_desc":"irure do in minim","exp_message":"consectetur nulla ea","module":"tempor","method":"sunt"}]
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
         * sys_log_id : labore Lorem
         * oper_id : anim
         * oper_no : culpa velit Duis in
         * oper_name : nostrud mollit
         * oper_date : fugiat Duis consequat mollit commodo
         * exp_desc : Lorem
         * exp_message : et laborum adipisicing
         * module : velit do occaecat elit reprehenderi
         * method : ullamco
         */

        private String sys_log_id;
        private String oper_id;
        private String oper_no;
        private String oper_name;
        private String oper_date;
        private String exp_desc;
        private String exp_message;
        private String module;
        private String method;

        public String getSys_log_id() {
            return sys_log_id;
        }

        public void setSys_log_id(String sys_log_id) {
            this.sys_log_id = sys_log_id;
        }

        public String getOper_id() {
            return oper_id;
        }

        public void setOper_id(String oper_id) {
            this.oper_id = oper_id;
        }

        public String getOper_no() {
            return oper_no;
        }

        public void setOper_no(String oper_no) {
            this.oper_no = oper_no;
        }

        public String getOper_name() {
            return oper_name;
        }

        public void setOper_name(String oper_name) {
            this.oper_name = oper_name;
        }

        public String getOper_date() {
            return oper_date;
        }

        public void setOper_date(String oper_date) {
            this.oper_date = oper_date;
        }

        public String getExp_desc() {
            return exp_desc;
        }

        public void setExp_desc(String exp_desc) {
            this.exp_desc = exp_desc;
        }

        public String getExp_message() {
            return exp_message;
        }

        public void setExp_message(String exp_message) {
            this.exp_message = exp_message;
        }

        public String getModule() {
            return module;
        }

        public void setModule(String module) {
            this.module = module;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }
    }
}
