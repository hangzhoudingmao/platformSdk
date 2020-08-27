package com.dingmao.platformsdk.registrationrelated;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Getter
@Setter
public class RegAddReq {
    @NotNull(fileName = "电话号")
    private String phone;//电话
    @NotNull(fileName = "用户类型")
    private String user_type;//注册用户类型（3：单位管理员，4：普通用户）
}
