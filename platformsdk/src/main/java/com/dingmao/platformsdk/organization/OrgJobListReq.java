package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class OrgJobListReq {
    @NotNull(fileName = "岗位id")
    private String job_id;//岗位id
    @NotNull(fileName = "组织编码")
    private String org_no;//组织编码
    private String auth_template_name;//权限模板名称
    @NotNull(fileName = "是否去除关联模板")
    private String is_select;//是否去除已关联模板（0：否，1：是），此处值为1
    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是），此处值为1
    private String page;//页码，默认第一页
    private String page_size;//每页数量，默认每页10条

}
