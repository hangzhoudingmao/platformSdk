package com.dingmao.platformsdk.usermanagement;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Setter
@Getter
public class UserJobListRsp {
    private String job_id;//岗位id
    private String job_name;//岗位名称
    private String user_id;//用户id
    private String dept_no;//部门编号
    private String dept_name;//部门名称
    private String org_no;//组织编号
    private String org_name;//组织名称

}
