package com.dingmao.platformsdk.interfaceservice;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class ApiLogRsp {
    /**
     * total_count : 3.525338162627077E7
     * total_page : -9.771193051219593E7
     * page_size : -7.993428237498845E7
     * cur_page : -5.153038057464574E7
     * list : [{"api_log_id":"anim","oper_id":"sit proident sunt incididunt Duis","oper_no":"do quis laborum nisi","oper_name":"ut consectetur voluptate","req_date":"in fugiat ut Duis","result":"amet","input":"in culpa aute","output":"voluptate incididunt","ip":"ea qui co","spend":"veniam Excepteur minim","headers":"eu"},{"api_log_id":"incididunt mollit","oper_id":"sed ea","oper_no":"magna dolor laborum anim sunt","oper_name":"et","req_date":"in aliquip proident consectetur","result":"ut aliqua id irure","input":"cillum ea","output":"elit adipisicing in","ip":"in cupidatat fugiat sit ut","spend":"anim nulla nostrud d","headers":"de"}]
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
         * api_log_id : anim
         * oper_id : sit proident sunt incididunt Duis
         * oper_no : do quis laborum nisi
         * oper_name : ut consectetur voluptate
         * req_date : in fugiat ut Duis
         * result : amet
         * input : in culpa aute
         * output : voluptate incididunt
         * ip : ea qui co
         * spend : veniam Excepteur minim
         * headers : eu
         */

        private String api_log_id;
        private String oper_id;
        private String oper_no;
        private String oper_name;
        private String req_date;
        private String result;
        private String input;
        private String output;
        private String ip;
        private String spend;
        private String headers;

        public String getApi_log_id() {
            return api_log_id;
        }

        public void setApi_log_id(String api_log_id) {
            this.api_log_id = api_log_id;
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

        public String getReq_date() {
            return req_date;
        }

        public void setReq_date(String req_date) {
            this.req_date = req_date;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getInput() {
            return input;
        }

        public void setInput(String input) {
            this.input = input;
        }

        public String getOutput() {
            return output;
        }

        public void setOutput(String output) {
            this.output = output;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getSpend() {
            return spend;
        }

        public void setSpend(String spend) {
            this.spend = spend;
        }

        public String getHeaders() {
            return headers;
        }

        public void setHeaders(String headers) {
            this.headers = headers;
        }
    }
}
