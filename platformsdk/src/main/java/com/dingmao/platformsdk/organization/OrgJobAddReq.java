package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class OrgJobAddReq {
    private String job_id;//岗位id
    private String auth_template_ids;//权限模板id集合，多个用英文逗号拼接，如：1,2,3

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getAuth_template_ids() {
        return auth_template_ids;
    }

    public void setAuth_template_ids(String auth_template_ids) {
        this.auth_template_ids = auth_template_ids;
    }
}
