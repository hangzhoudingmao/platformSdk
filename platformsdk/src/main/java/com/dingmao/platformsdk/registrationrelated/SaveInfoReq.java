package com.dingmao.platformsdk.registrationrelated;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/24
 */
@Setter
@Getter
public class SaveInfoReq {
    @NotNull(fileName = "手机号")
    private String phone;//手机号
    @NotNull(fileName = "姓名")
    private String user_name;//姓名
    private String job_name;//岗位职务
    @NotNull(fileName = "单位类型")
    private String company_type;//单位类型
    @NotNull(fileName = "单位名称")
    private String company_name;//单位名称
    @NotNull(fileName = "省市区id")
    private String area_id;//省市区id，最后选中的area_id
    @NotNull(fileName = "详细地址")
    private String addr;//详细地址
    @NotNull(fileName = "法人姓名")
    private String legal_name;//法人姓名
    @NotNull(fileName = "统一社会信用代码")
    private String credit_code;//统一社会信用代码
    @NotNull(fileName = "统一社会信用代码")
    private String credit_img;//营业执照
    private String logo;//企业logo
    private String index_img;//首页封面图
    private String ind_domain;//二级域名
}
