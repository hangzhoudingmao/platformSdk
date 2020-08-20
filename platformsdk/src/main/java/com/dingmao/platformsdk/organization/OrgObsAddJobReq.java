package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class OrgObsAddJobReq {
    @NotNull(fileName = "节点类型")
    private String input_node_type;//新增节点类型（1：组织，2：部门，3：岗位），此处值为2
    @NotNull(fileName = "部门名称")
    private String input_name;//部门名称
    private String input_is_admin;//是否主管
    private String input_remark;//备注
    private String id;//选中节点参数
    @NotNull(fileName = "选中节点参数")
    private String no;//选中节点参数，必传
    private String org_no;//选中节点参数
    private String p_no;//选中节点参数
    private String remark;//选中节点参数
    private String name;//选中节点参数
    @NotNull(fileName = "选中节点参数")
    private String node_type;//选中节点参数 必传

}
