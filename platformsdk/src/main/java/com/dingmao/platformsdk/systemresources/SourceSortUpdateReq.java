package com.dingmao.platformsdk.systemresources;

/**
 * Create by atu on 2020/8/18
 */
public class SourceSortUpdateReq {
    private String source_sort_id;//系统资源分类标识
    private String source_sort_name;//名称
    private String source_sort_no;//编号

    public String getSource_sort_id() {
        return source_sort_id;
    }

    public void setSource_sort_id(String source_sort_id) {
        this.source_sort_id = source_sort_id;
    }

    public String getSource_sort_name() {
        return source_sort_name;
    }

    public void setSource_sort_name(String source_sort_name) {
        this.source_sort_name = source_sort_name;
    }

    public String getSource_sort_no() {
        return source_sort_no;
    }

    public void setSource_sort_no(String source_sort_no) {
        this.source_sort_no = source_sort_no;
    }
}
