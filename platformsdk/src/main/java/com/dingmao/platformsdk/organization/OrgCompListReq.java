package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class OrgCompListReq {
    private String business_type;//业务范围（此下拉框的值来自于标准码表code_type=businessType）
    private String company_name;//单位名称,支持模糊匹配
    private String is_page;//是否分页（0：否，1：是），此处为1
    private String page;//页码，默认第一页
    private String page_size;//每页数量，默认10条
    private String company_ids;//单位id字符串，英文逗号拼接

    public String getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
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

    public String getCompany_ids() {
        return company_ids;
    }

    public void setCompany_ids(String company_ids) {
        this.company_ids = company_ids;
    }
}
