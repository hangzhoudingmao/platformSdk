package com.dingmao.platformsdk.interfaceservice;

/**
 * Create by atu on 2020/8/19
 */
public class SortCreateReq {
    private String p_sort_id;//上级分类，不传入表示根目录
    private String sort_name;//分类名称
    private String sort_no;//分类编号

    public String getP_sort_id() {
        return p_sort_id;
    }

    public void setP_sort_id(String p_sort_id) {
        this.p_sort_id = p_sort_id;
    }

    public String getSort_name() {
        return sort_name;
    }

    public void setSort_name(String sort_name) {
        this.sort_name = sort_name;
    }

    public String getSort_no() {
        return sort_no;
    }

    public void setSort_no(String sort_no) {
        this.sort_no = sort_no;
    }
}
