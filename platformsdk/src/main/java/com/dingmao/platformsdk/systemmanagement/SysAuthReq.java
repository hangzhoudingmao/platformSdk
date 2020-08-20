package com.dingmao.platformsdk.systemmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class SysAuthReq {
    @NotNull(fileName = "账号id或单位id")
    private String id;//账号id或单位id
    private String system_name;//系统名称（支持模糊匹配）

    @NotNull(fileName = "授权系统类型")
    private String auth_sys_type;//授权系统类型（1：账号授权系统，2：单位授权系统），与参数id保持一致

    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是）

    private String page;//
    private String page_size;//

}
