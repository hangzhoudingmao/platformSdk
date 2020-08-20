package com.dingmao.platformsdk.usermanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class AssignAuthReq {
    @NotNull(fileName = "用户ID")
    private String user_id;//用户ID
    @NotNull(fileName = "权限ID")
    private String object_ids;//权限ID, 多个用逗号隔开


}
