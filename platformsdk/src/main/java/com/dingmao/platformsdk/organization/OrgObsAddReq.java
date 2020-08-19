package com.dingmao.platformsdk.organization;

/**
 * Create by atu on 2020/8/19
 */
public class OrgObsAddReq {
    private String input_node_type;//新增节点类型（1：组织，2：部门，3：岗位），此处值为1
    private String input_name;//组织名称
    private String input_org_type;//组织等级类型
    private String input_remark;//备注
    private String id;//选中节点参数
    private String no;//选中节点参数，必传
    private String org_no;//选中节点参数
    private String p_no;//选中节点参数
    private String org_type;//选中节点参数
    private String remark;//选中节点参数
    private String name;//选中节点参数
    private String node_type;//选中节点参数 必传

    public String getInput_node_type() {
        return input_node_type;
    }

    public void setInput_node_type(String input_node_type) {
        this.input_node_type = input_node_type;
    }

    public String getInput_name() {
        return input_name;
    }

    public void setInput_name(String input_name) {
        this.input_name = input_name;
    }

    public String getInput_org_type() {
        return input_org_type;
    }

    public void setInput_org_type(String input_org_type) {
        this.input_org_type = input_org_type;
    }

    public String getInput_remark() {
        return input_remark;
    }

    public void setInput_remark(String input_remark) {
        this.input_remark = input_remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getOrg_no() {
        return org_no;
    }

    public void setOrg_no(String org_no) {
        this.org_no = org_no;
    }

    public String getP_no() {
        return p_no;
    }

    public void setP_no(String p_no) {
        this.p_no = p_no;
    }

    public String getOrg_type() {
        return org_type;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNode_type() {
        return node_type;
    }

    public void setNode_type(String node_type) {
        this.node_type = node_type;
    }
}
