package com.dingmao.platformsdk.usermanagement;

/**
 * Create by atu on 2020/8/20
 */
public class UserJobListRsp {
    private String job_id;//岗位id
    private String job_name;//岗位名称

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }
}
