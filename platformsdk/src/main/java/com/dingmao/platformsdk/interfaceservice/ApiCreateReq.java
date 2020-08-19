package com.dingmao.platformsdk.interfaceservice;

/**
 * Create by atu on 2020/8/19
 */
public class ApiCreateReq {
    private String sort_no;//分类编号
    private String api_name;//接口名称
    private String api_url;//地址
    private String remark;//说明

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
