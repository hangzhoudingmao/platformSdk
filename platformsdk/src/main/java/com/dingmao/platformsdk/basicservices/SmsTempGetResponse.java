package com.dingmao.platformsdk.basicservices;

import java.util.List;

/**
 * Create by atu on 2020/8/17
 */
public class SmsTempGetResponse {
    /**
     * total_page : -9.453908539902152E7
     * total_count : -4.9013398864883184E7
     * list : [{"template_id":"do","template_sort":"culpa non minim anim eiusmod","template_no":"anim","content":"ea deserunt minim","status":"quis","apply_id":"fugiat dolor do est dolore","apply_name":"occae","apply_reason":"proident","audit_id":"Excepteur ex aliquip adipisicing laboris","audit_name":"sit","fail_reason":"nulla cupidatat voluptate Lorem","template_code":"reprehenderit pariatur qui exercitation","sign":"n","system_no":"Duis commodo et culpa","status_name":"elit amet"},{"template_id":"officia","template_sort":"Ut ut eiusmod","template_no":"commodo fugiat amet m","content":"reprehenderit labore","status":"Lorem","apply_id":"deserunt reprehenderit et","apply_name":"officia","apply_reason":"aute qui","audit_id":"consectetur id","audit_name":"officia nulla Ut elit aute","fail_reason":"labore voluptate sunt consectetur","template_code":"culpa labore","sign":"Ut est et Lorem dolor","system_no":"laborum in ","status_name":"eu non sit eiusmod"},{"template_id":"ul","template_sort":"ex cupidatat consequat","template_no":"occaecat non","content":"deserunt","status":"ea do v","apply_id":"commodo","apply_name":"eu pariatur in nostrud consectetur","apply_reason":"ad","audit_id":"aute ea aliqua minim do","audit_name":"enim","fail_reason":"ut ex ea","template_code":"in labore sint","sign":"a","system_no":"eiusmod officia","status_name":"deserunt Lorem"},{"template_id":"mollit in velit aliqua ad","template_sort":"Lorem","template_no":"sit nostrud in anim Excepteur","content":"ad","status":"sit in adipisicing nostrud","apply_id":"qui aute","apply_name":"nisi in","apply_reason":"quis","audit_id":"commodo","audit_name":"tempor sed irure","fail_reason":"commodo tempor anim","template_code":"sunt irure","sign":"anim","system_no":"in","status_name":"ea ex culpa aute"}]
     * cur_page : consectetur est consequat
     * page_size : aliquip cupidatat velit
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

    public class ListBean {
        /**
         * template_id : do
         * template_sort : culpa non minim anim eiusmod
         * template_no : anim
         * content : ea deserunt minim
         * status : quis
         * apply_id : fugiat dolor do est dolore
         * apply_name : occae
         * apply_reason : proident
         * audit_id : Excepteur ex aliquip adipisicing laboris
         * audit_name : sit
         * fail_reason : nulla cupidatat voluptate Lorem
         * template_code : reprehenderit pariatur qui exercitation
         * sign : n
         * system_no : Duis commodo et culpa
         * status_name : elit amet
         */

        private String template_id;
        private String template_sort;
        private String template_no;
        private String content;
        private String status;
        private String apply_id;
        private String apply_name;
        private String apply_reason;
        private String audit_id;
        private String audit_name;
        private String fail_reason;
        private String template_code;
        private String sign;
        private String system_no;
        private String status_name;

        public String getTemplate_id() {
            return template_id;
        }

        public void setTemplate_id(String template_id) {
            this.template_id = template_id;
        }

        public String getTemplate_sort() {
            return template_sort;
        }

        public void setTemplate_sort(String template_sort) {
            this.template_sort = template_sort;
        }

        public String getTemplate_no() {
            return template_no;
        }

        public void setTemplate_no(String template_no) {
            this.template_no = template_no;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getApply_id() {
            return apply_id;
        }

        public void setApply_id(String apply_id) {
            this.apply_id = apply_id;
        }

        public String getApply_name() {
            return apply_name;
        }

        public void setApply_name(String apply_name) {
            this.apply_name = apply_name;
        }

        public String getApply_reason() {
            return apply_reason;
        }

        public void setApply_reason(String apply_reason) {
            this.apply_reason = apply_reason;
        }

        public String getAudit_id() {
            return audit_id;
        }

        public void setAudit_id(String audit_id) {
            this.audit_id = audit_id;
        }

        public String getAudit_name() {
            return audit_name;
        }

        public void setAudit_name(String audit_name) {
            this.audit_name = audit_name;
        }

        public String getFail_reason() {
            return fail_reason;
        }

        public void setFail_reason(String fail_reason) {
            this.fail_reason = fail_reason;
        }

        public String getTemplate_code() {
            return template_code;
        }

        public void setTemplate_code(String template_code) {
            this.template_code = template_code;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getSystem_no() {
            return system_no;
        }

        public void setSystem_no(String system_no) {
            this.system_no = system_no;
        }

        public String getStatus_name() {
            return status_name;
        }

        public void setStatus_name(String status_name) {
            this.status_name = status_name;
        }
    }
}
