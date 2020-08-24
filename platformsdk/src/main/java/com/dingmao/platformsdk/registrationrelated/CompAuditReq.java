package com.dingmao.platformsdk.registrationrelated;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Setter
@Getter
public class CompAuditReq {
    @NotNull(fileName = "入驻申请单位id")
    private String company_apply_id;//入驻申请单位id
    @NotNull(fileName = "申请入驻的用户手机号")
    private String phone;//申请入驻的用户手机号（非登录用户）
    @NotNull(fileName = "审核状态")
    private String status;//审核状态（审核通过：2，审核拒绝：3）
    @NotNull(fileName = "审核结果")
    private String appr_result;//审核结果（审核通过：2，审核拒绝：3）
    @NotNull(fileName = "注册用户id")
    private String user_reg_id;//注册用户id
    private String user_name;//用户姓名
    private String job_name;//岗位职务
    private String credit_img;//营业执照照片
    private String appr_message;//审核描述，不通过描述必须填写
    private String company_name;//单位名称
    private String area_id;//省市区id，最后选中的area_id
    private String addr;//详细地址
    private String jd;//经度
    private String wd;//纬度
    private String contact_name;//负责人姓名
    private String contact_phone;//负责人电话
    private String legal_name;//法人姓名
    private String legal_card_type;//法人证件类型
    private String credit_code;//统一社会信用代码
    private String legal_card_no;//法人身份证号
    private String ind_domain;//单位域名
    private String index_img;//首页图片
    private String logo;//单位logo
    private String email;//单位邮箱
    private String company_type;//单位类型
}
