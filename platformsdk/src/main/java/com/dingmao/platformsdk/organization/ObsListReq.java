package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Getter
@Setter
public class ObsListReq {
    private String org_no;//组织编码（node_type为1时，改参数必传）
    private String dept_no;//部门编码（node_type为2时，改参数必传）
    private String job_id;// 岗位id（node_type为3时）
    @NotNull(fileName = "节点类型")
    private String node_type;//节点类型（1：组织，2：部门，3：岗位）
    private String user_name;//用户名
    private String job_name;//岗位名称，若岗位ID不传入，则本参数必须配合部门编号来完成查询
    @NotNull(fileName = "是否分页")
    private String is_page;//是否分页（0：否，1：是），此处值为1
    private String page;//页码，默认第一页
    private String page_size;//每页数量，默认每页10条

}
