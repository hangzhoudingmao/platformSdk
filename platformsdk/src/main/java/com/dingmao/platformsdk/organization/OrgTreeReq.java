package com.dingmao.platformsdk.organization;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Setter
@Getter
public class OrgTreeReq {
    private String node_no;//节点编号，查询下级，若为空则展示全部
    private String node_type;//节点类型（1：组织节点，2：部门节点），该值可从节点的node_type直接获取

}
