package com.dingmao.platformsdk.interfaceservice;

/**
 * Create by atu on 2020/8/19
 */
public class SortUpdateReq {
    private String api_sort_id;//分分类ID
    private String sort_name;//分类名称

    public String getApi_sort_id() {
        return api_sort_id;
    }

    public void setApi_sort_id(String api_sort_id) {
        this.api_sort_id = api_sort_id;
    }

    public String getSort_name() {
        return sort_name;
    }

    public void setSort_name(String sort_name) {
        this.sort_name = sort_name;
    }
}
