package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class OrgCompDomainRsp {
    /**
     * company_types : [{"value":"p","name":"dolore enim nostrud in irure"}]
     * company_name : esse pariatur
     * company_type : non adipisicing proident
     * small_name : dolor deserunt dolore ullamco
     * company_domain : eiusmod dolor reprehenderit aute ut
     * company_logo : ea labore sint velit
     * index_img : commodo cillum tempor
     * company_id : reprehenderit Duis
     * title : non ul
     * theme : veniam mollit ut culpa reprehenderit
     * color : laborum adipisicing aliqua Lorem in
     * style : ut qui
     * copyright : ipsum veniam nisi quis irure
     * icp_no : laborum ea irure consectetur
     */

    private String company_name;
    private String company_type;
    private String small_name;
    private String company_domain;
    private String company_logo;
    private String index_img;
    private String company_id;
    private String title;
    private String theme;
    private String color;
    private String style;
    private String copyright;
    private String icp_no;
    private List<CompanyTypesBean> company_types;

    public String getCompany_name() {
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

    public String getSmall_name() {
        return small_name;
    }

    public void setSmall_name(String small_name) {
        this.small_name = small_name;
    }

    public String getCompany_domain() {
        return company_domain;
    }

    public void setCompany_domain(String company_domain) {
        this.company_domain = company_domain;
    }

    public String getCompany_logo() {
        return company_logo;
    }

    public void setCompany_logo(String company_logo) {
        this.company_logo = company_logo;
    }

    public String getIndex_img() {
        return index_img;
    }

    public void setIndex_img(String index_img) {
        this.index_img = index_img;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getIcp_no() {
        return icp_no;
    }

    public void setIcp_no(String icp_no) {
        this.icp_no = icp_no;
    }

    public List<CompanyTypesBean> getCompany_types() {
        return company_types;
    }

    public void setCompany_types(List<CompanyTypesBean> company_types) {
        this.company_types = company_types;
    }

    public static class CompanyTypesBean {
        /**
         * value : p
         * name : dolore enim nostrud in irure
         */

        private String value;
        private String name;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
