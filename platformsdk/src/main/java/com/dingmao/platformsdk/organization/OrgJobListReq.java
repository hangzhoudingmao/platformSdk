package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class OrgJobListReq {
    private String job_id;//岗位id
    private String org_no;//组织编码
    private String auth_template_name;//权限模板名称
    private String is_select;//是否去除已关联模板（0：否，1：是），此处值为1
    private String is_page;//是否分页（0：否，1：是），此处值为1
    private String page;//页码，默认第一页
    private String page_size;//每页数量，默认每页10条

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getOrg_no() {
        return org_no;
    }

    public void setOrg_no(String org_no) {
        this.org_no = org_no;
    }

    public String getAuth_template_name() {
        return auth_template_name;
    }

    public void setAuth_template_name(String auth_template_name) {
        this.auth_template_name = auth_template_name;
    }

    public String getIs_select() {
        return is_select;
    }

    public void setIs_select(String is_select) {
        this.is_select = is_select;
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
