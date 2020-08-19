package com.dingmao.platformsdk.interfaceservice;

/**
 * Create by atu on 2020/8/19
 */
public class ServiceTreeReq {
    private String sort_no;//服务分类编号，不传入则获取全部分类

    public String getSort_no() {
        return sort_no;
    }

    public void setSort_no(String sort_no) {
        this.sort_no = sort_no;
    }
}
