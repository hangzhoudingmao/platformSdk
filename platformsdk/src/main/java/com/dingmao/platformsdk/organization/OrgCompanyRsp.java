package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class OrgCompanyRsp {
    /**
     * company_id : exercitation q
     * company_types : [{"value":"exercitation est","name":"elit velit enim cupidatat"},{"value":"deserunt ullamco","name":"pariatur fugiat dolore"},{"value":"in esse deserunt labore","name":"minim sit"}]
     * company_name : elit ad nulla ullamco dolore
     * company_type : nostrud
     * small_name : culpa aliquip magna
     * company_domain : magna officia reprehenderit Excepteur
     * company_logo : ipsum esse mollit
     * province : Ut id minim
     * province_no : in
     * city : pr
     * city_no : consectetur elit
     * area : incididunt
     * area_no : deserunt aliquip Ut
     * addr : laboris labore Lorem quis
     * jd : ex Excepteur
     * wd : veniam
     * mail : laborum amet nostrud sed magna
     * contact_name : in cillum Ut minim
     * contact_phone : esse
     * legal_name : Duis Lorem ea amet
     * legal_card_type : tempor sint eu in
     * credit_code : sint in in dolor Lorem
     * credit_img : ea pariatur culpa exercitation
     * create_date : laboris reprehenderit
     * create_id : minim ir
     * legal_card_no : cillum
     * index_img : tempor ad cillum
     * fax : aute do f
     */

    private String company_id;
    private String company_name;
    private String company_type;
    private String small_name;
    private String company_domain;
    private String company_logo;
    private String province;
    private String province_no;
    private String city;
    private String city_no;
    private String area;
    private String area_no;
    private String addr;
    private String jd;
    private String wd;
    private String mail;
    private String contact_name;
    private String contact_phone;
    private String legal_name;
    private String legal_card_type;
    private String credit_code;
    private String credit_img;
    private String create_date;
    private String create_id;
    private String legal_card_no;
    private String index_img;
    private String fax;
    private List<CompanyTypesBean> company_types;

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince_no() {
        return province_no;
    }

    public void setProvince_no(String province_no) {
        this.province_no = province_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_no() {
        return city_no;
    }

    public void setCity_no(String city_no) {
        this.city_no = city_no;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea_no() {
        return area_no;
    }

    public void setArea_no(String area_no) {
        this.area_no = area_no;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getLegal_name() {
        return legal_name;
    }

    public void setLegal_name(String legal_name) {
        this.legal_name = legal_name;
    }

    public String getLegal_card_type() {
        return legal_card_type;
    }

    public void setLegal_card_type(String legal_card_type) {
        this.legal_card_type = legal_card_type;
    }

    public String getCredit_code() {
        return credit_code;
    }

    public void setCredit_code(String credit_code) {
        this.credit_code = credit_code;
    }

    public String getCredit_img() {
        return credit_img;
    }

    public void setCredit_img(String credit_img) {
        this.credit_img = credit_img;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getCreate_id() {
        return create_id;
    }

    public void setCreate_id(String create_id) {
        this.create_id = create_id;
    }

    public String getLegal_card_no() {
        return legal_card_no;
    }

    public void setLegal_card_no(String legal_card_no) {
        this.legal_card_no = legal_card_no;
    }

    public String getIndex_img() {
        return index_img;
    }

    public void setIndex_img(String index_img) {
        this.index_img = index_img;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public List<CompanyTypesBean> getCompany_types() {
        return company_types;
    }

    public void setCompany_types(List<CompanyTypesBean> company_types) {
        this.company_types = company_types;
    }

    public static class CompanyTypesBean {
        /**
         * value : exercitation est
         * name : elit velit enim cupidatat
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
