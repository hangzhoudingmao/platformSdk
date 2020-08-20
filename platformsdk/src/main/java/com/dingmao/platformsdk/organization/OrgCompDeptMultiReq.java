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

    public List<OrgDeptMultiReq> getMulti_para() {
        return multi_para;
    }

    public void setMulti_para(List<OrgDeptMultiReq> multi_para) {
        this.multi_para = multi_para;
    }

    @Setter
    @Getter
    public static class OrgDeptMultiReq{
        private String company_name;//单位名称
        private String company_type;//单位类型
        private String business_type;//业务范围，多个用英文逗号拼接
        private String company_domain;//单位域名

        /*public String getCompany_name() {
            return company_name;
        }

        public void setCompany_name(String company_name) {
            this.company_name = company_name;
        }

        public String getCompany_type() {
            return company_type;
        }

        public void setCompany_type(String company_type) {
            this.company_type = company_type;
        }

        public String getBusiness_type() {
            return business_type;
        }

        public void setBusiness_type(String business_type) {
            this.business_type = business_type;
        }

        public String getCompany_domain() {
            return company_domain;
        }

        public void setCompany_domain(String company_domain) {
            this.company_domain = company_domain;
        }*/
    }
}
