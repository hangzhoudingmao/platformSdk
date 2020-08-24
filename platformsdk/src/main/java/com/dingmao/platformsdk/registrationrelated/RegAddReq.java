package com.dingmao.platformsdk.registrationrelated;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Getter
@Setter
public class RegAddReq {
    private String phone;//电话
    private String user_type;//注册用户类型（3：单位管理员，4：普通用户）
}
