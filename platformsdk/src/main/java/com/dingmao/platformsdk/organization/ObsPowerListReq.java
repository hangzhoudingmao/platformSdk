package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class ObsPowerListReq {
    @NotNull(fileName = "模版ID")
    private String auth_template_id;//模板id
    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是），此处值为1
    private String page;//页码，默认第一页
    private String page_size;//每页数量，默认每页10条

}
