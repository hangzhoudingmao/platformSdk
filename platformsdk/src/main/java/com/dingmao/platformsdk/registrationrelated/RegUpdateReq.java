package com.dingmao.platformsdk.registrationrelated;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Getter
@Setter
public class RegUpdateReq {
    private String user_reg_id;//主键id
    private String phone;//手机号
    private String user_name;//姓名
    private String job_name;//岗位职务
    private String status;//注册用户审核状态（1：待审核，2：审核通过，3：审核拒绝）
    private String reason;//审核不通过原因
}
