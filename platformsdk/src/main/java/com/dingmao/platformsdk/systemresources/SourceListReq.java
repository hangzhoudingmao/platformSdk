package com.dingmao.platformsdk.systemresources;

/**
 * Create by atu on 2020/8/18
 */
public class SourceListReq {
    private String source_sort_id;//系统资源分类标识
    private String page;//页数
    private String is_page;//是否分页1=》分页，0=》不分
    private String page_size;//每页显示的条数
    private String content;//搜索内容

    public String getSource_sort_id() {
        return source_sort_id;
    }

    public void setSource_sort_id(String source_sort_id) {
        this.source_sort_id = source_sort_id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getIs_page() {
        return is_page;
    }

    public void setIs_page(String is_page) {
        this.is_page = is_page;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
