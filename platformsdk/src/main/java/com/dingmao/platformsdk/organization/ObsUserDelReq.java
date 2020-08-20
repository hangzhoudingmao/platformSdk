package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

/**
 * Create by atu on 2020/8/19
 */
public class ObsUserDelReq {
    private String user_id;//节用户id（组织、部门（node_type值为1或2）人员列表移除时，改参数必传）
    private String job_user_id;//岗位用户id（node_type值为3时，改参数必传）
    @NotNull(fileName = "节点类型")
    private String node_type;//节点类型（1：组织，2：部门，3：岗位）

}
