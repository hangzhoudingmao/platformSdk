package com.dingmao.platformsdk.systemmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter @Setter
public class SysUpdateVerReq {
    private String ver_content;//更新内容
    private String ver;//当前版本号,指客户端的当前版本
    @NotNull(fileName = "系统类型")
    private String system_type;//系统类型，传web、app、pad
    private String is_force;//是否强制更新
    private String url;//更新地址
    private String ver_date;//发布日期
    @NotNull(fileName = "系统版本id")
    private String sys_ver_id;//系统版本id

}
