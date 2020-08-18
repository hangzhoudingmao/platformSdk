package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 */
public class SmsTempGetRequest {
    private String key;
    private String templete_no;
    private String status;
    private String is_page;
    private String page;
    private String pag_size;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTemplete_no() {
        return templete_no;
    }

    public void setTemplete_no(String templete_no) {
        this.templete_no = templete_no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIs_page() {
        return is_page;
    }

    public void setIs_page(String is_page) {
        this.is_page = is_page;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPag_size() {
        return pag_size;
    }

    public void setPag_size(String pag_size) {
        this.pag_size = pag_size;
    }
}
