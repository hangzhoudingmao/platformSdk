package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class AccountAddReq {
    @NotNull(fileName = "岗位id")
    private String job_id;//岗位id
    @NotNull(fileName = "用户id")
    private String user_ids;//用户id集合，英文逗号拼接，参数必传，不传值表示清空岗位关联的用户记录

}
