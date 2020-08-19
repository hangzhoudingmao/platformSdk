package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class ObsPowerListReq {
    private String auth_template_id;//模板id
    private String is_page;//是否分页（0：否，1：是），此处值为1
    private String page;//页码，默认第一页
    private String page_size;//每页数量，默认每页10条

    public String getAuth_template_id() {
        return auth_template_id;
    }

    public void setAuth_template_id(String auth_template_id) {
        this.auth_template_id = auth_template_id;
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

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }
}
