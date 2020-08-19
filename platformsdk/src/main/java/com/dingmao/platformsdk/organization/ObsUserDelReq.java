package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class ObsUserDelReq {
    private String user_id;//节用户id（组织、部门（node_type值为1或2）人员列表移除时，改参数必传）
    private String job_user_id;//岗位用户id（node_type值为3时，改参数必传）
    private String node_type;//节点类型（1：组织，2：部门，3：岗位）

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getJob_user_id() {
        return job_user_id;
    }

    public void setJob_user_id(String job_user_id) {
        this.job_user_id = job_user_id;
    }

    public String getNode_type() {
        return node_type;
    }

    public void setNode_type(String node_type) {
        this.node_type = node_type;
    }
}
