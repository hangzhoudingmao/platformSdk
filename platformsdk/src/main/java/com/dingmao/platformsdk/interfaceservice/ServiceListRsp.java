package com.dingmao.platformsdk.interfaceservice;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class ServiceListRsp {
    /**
     * total_count : 1.1422571790079728E7
     * total_page : -2.577674861936395E7
     * page_size : 5.7556161029364705E7
     * cur_page : 7.519041965241021E7
     * list : [{"api_id":"do","sort_no":"aute proident","api_name":"culpa veniam officia","api_url":"culpa consectetur","remark":"cillum nulla minim cupidatat adipisicing"},{"api_id":"reprehenderit Ut non nostrud","sort_no":"laboris Duis","api_name":"fugiat cupidatat nostrud sit ex","api_url":"in eu Ut cillum","remark":"aute"},{"api_id":"ea magna aliqua labore nostrud","sort_no":"magna anim cillum","api_name":"irure aute","api_url":"minim labore ex ad laboris","remark":"dolor nisi ex"}]
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
         * api_id : do
         * sort_no : aute proident
         * api_name : culpa veniam officia
         * api_url : culpa consectetur
         * remark : cillum nulla minim cupidatat adipisicing
         */

        private String api_id;
        private String sort_no;
        private String api_name;
        private String api_url;
        private String remark;

        public String getApi_id() {
            return api_id;
        }

        public void setApi_id(String api_id) {
            this.api_id = api_id;
        }

        public String getSort_no() {
            return sort_no;
        }

        public void setSort_no(String sort_no) {
            this.sort_no = sort_no;
        }

        public String getApi_name() {
            return api_name;
        }

        public void setApi_name(String api_name) {
            this.api_name = api_name;
        }

        public String getApi_url() {
            return api_url;
        }

        public void setApi_url(String api_url) {
            this.api_url = api_url;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
