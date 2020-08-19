package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class OrgTreeReq {
    private String node_no;//节点编号，查询下级，若为空则展示全部
    private String node_type;//节点类型（1：组织节点，2：部门节点），该值可从节点的node_type直接获取

    public String getNode_no() {
        return node_no;
    }

    public void setNode_no(String node_no) {
        this.node_no = node_no;
    }

    public String getNode_type() {
        return node_type;
    }

    public void setNode_type(String node_type) {
        this.node_type = node_type;
    }
}
