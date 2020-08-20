package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Setter
@Getter
public class OrgCompUpdateReq {
    @NotNull(fileName = "单位id")
    private String company_id;//单位id
    private String company_type;//单位类型
    private String company_name;//单位名称
    private String small_name;//单位简称
    private String company_domain;//单位域名
    private String company_logo;//单位logo
    private String area_id;//省市区id
    private String addr;//详细地址
    private String jd;//经度
    private String wd;//纬度
    private String mail;//单位邮箱
    private String contact_name;//负责人名称
    private String contact_phone;//负责人电话
    private String legal_name;//法人姓名
    private String legal_card_type;//法人证件类型
    private String credit_code;//统一社会信用代码
    private String credit_img;//营业执照
    private String legal_card_no;//法人证件号码
    private String image_picture;//首页图片
    private String fax;//传真
    private String legal_phone;//法人电话

}
