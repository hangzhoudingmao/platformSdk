package com.dingmao.platformsdk.systemresources;

/**
 * Create by atu on 2020/8/18
 */
public class SourceSortAddReq {
    private String p_id;//上级分类id（上一级主键id）若无传0
    private String source_sort_name;//名称
    private String source_sort_no;//系统资源分类编号

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
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
