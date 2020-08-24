package com.dingmao.platformsdk.organization;

import com.dingmao.platformsdk.verifynull.NotNull;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Setter
@Getter
public class OrgCompDeptMultiReq {
    @NotNull(fileName = "集合")
    private List<OrgDeptMultiReq> multi_para;


    @Setter
    @Getter
    public static class OrgDeptMultiReq{
        private String company_name;//单位名称
        private String company_type;//单位类型
        private String business_type;//业务范围，多个用英文逗号拼接
        private String company_domain;//单位域名
    }
}
