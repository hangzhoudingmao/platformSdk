package com.dingmao.platformsdk.basicservices;

import java.util.List;

/**
 * Create by atu on 2020/8/17
 */
public class SmsListResponse {
    /**
     * total_count : -8.840085887189618E7
     * total_page : 8.370962929923484E7
     * page_size : -7.776055207992622E7
     * cur_page : -2.9535685131124675E7
     * list : [{"sms_id":"fugiat do amet re","templete_no":"dolor anim","send_time":"aute id elit nisi","phone":"velit","content":"sit eiusmod ullamco commodo","usage":"tempor","rela_id":"in do ex","oper_name":"dolore sit incididunt","oper_id":"in deserunt sunt"},{"sms_id":"dolore cillum sint","templete_no":"quis ex","send_time":"nostrud","phone":"ipsum cillum in","content":"culpa sed elit","usage":"laboris id ullamco","rela_id":"exercitation non enim","oper_name":"cillum ullamco ipsum non voluptate","oper_id":"aliqua consectetur est"},{"sms_id":"anim culpa eu","templete_no":"ex deserunt","send_time":"laboris","phone":"eu","content":"exercitation ","usage":"veniam officia nostrud ","rela_id":"laborum veniam anim","oper_name":"ut Ut anim","oper_id":"aute cillum est consectetur aliquip"},{"sms_id":"laborum aute fugiat incididunt esse","templete_no":"in","send_time":"et deseru","phone":"ex do ut","content":"exercitation dolor aute","usage":"culpa nulla","rela_id":"nulla Duis","oper_name":"tempor","oper_id":"magna"}]
     */

    private double total_count;
    private double total_page;
    private double page_size;
    private double cur_page;
    private List<SmsListBean> list;

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

    public List<SmsListBean> getList() {
        return list;
    }

    public void setList(List<SmsListBean> list) {
        this.list = list;
    }

    public class SmsListBean {
        /**
         * sms_id : fugiat do amet re
         * templete_no : dolor anim
         * send_time : aute id elit nisi
         * phone : velit
         * content : sit eiusmod ullamco commodo
         * usage : tempor
         * rela_id : in do ex
         * oper_name : dolore sit incididunt
         * oper_id : in deserunt sunt
         */

        private String sms_id;
        private String templete_no;
        private String send_time;
        private String phone;
        private String content;
        private String usage;
        private String rela_id;
        private String oper_name;
        private String oper_id;

        public String getSms_id() {
            return sms_id;
        }

        public void setSms_id(String sms_id) {
            this.sms_id = sms_id;
        }

        public String getTemplete_no() {
            return templete_no;
        }

        public void setTemplete_no(String templete_no) {
            this.templete_no = templete_no;
        }

        public String getSend_time() {
            return send_time;
        }

        public void setSend_time(String send_time) {
            this.send_time = send_time;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUsage() {
            return usage;
        }

        public void setUsage(String usage) {
            this.usage = usage;
        }

        public String getRela_id() {
            return rela_id;
        }

        public void setRela_id(String rela_id) {
            this.rela_id = rela_id;
        }

        public String getOper_name() {
            return oper_name;
        }

        public void setOper_name(String oper_name) {
            this.oper_name = oper_name;
        }

        public String getOper_id() {
            return oper_id;
        }

        public void setOper_id(String oper_id) {
            this.oper_id = oper_id;
        }
    }
}
