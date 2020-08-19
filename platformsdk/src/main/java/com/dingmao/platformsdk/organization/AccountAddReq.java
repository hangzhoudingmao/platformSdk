package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class AccountAddReq {
    private String job_id;//岗位id
    private String user_ids;//用户id集合，英文逗号拼接，参数必传，不传值表示清空岗位关联的用户记录

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getUser_ids() {
        return user_ids;
    }

    public void setUser_ids(String user_ids) {
        this.user_ids = user_ids;
    }
}
