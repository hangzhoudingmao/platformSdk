package com.dingmao.platformsdk.organization;

import java.util.List;

/**
 * Create by atu on 2020/8/19
 */
public class OrgCompListRsp {
    /**
     * total_page : 2.5882540836694896E7
     * total_count : -3.5767802657909706E7
     * list : [{"company_id":"ut amet velit in in","company_type":"laborum","company_name":"sed nisi","small_name":"enim ex nisi Ut Lorem","company_domain":"amet anim cupidatat commodo","company_logo":"elit dolore","province":"in ut laboris Excepteur","province_no":"aliquip occaecat dolore labore exercitation","city":"id eu ipsum deserunt","city_no":"culpa aliquip","area":"in","area_no":"laborum ut sunt do","addr":"Duis ut cillum voluptate","jd":"Duis aliqua veniam","wd":"tempor ve","mail":"minim","contact_name":"laborum Ut dolor","contact_phone":"aliquip velit fugiat","legal_name":"nisi sed ullam","legal_card_type":"sint p","credit_code":"eu mollit","credit_img":"proident do","create_date":null,"create_id":null,"legal_card_no":"consectetur sint in","business_type":"et reprehenderit magna"},{"company_id":"nisi et deserunt cupidatat","company_type":"ipsum et ad amet","company_name":"id ex non","small_name":"ullamco quis nisi","company_domain":"ut eiusmod aliquip ex","company_logo":"aute ","province":"adipisicing irure ex eu minim","province_no":"nisi exercitation","city":"laboris velit elit tempor","city_no":"qui","area":"cupidatat ut sunt ","area_no":"esse sint c","addr":"dolore aliqua veniam nostrud qui","jd":"dolor","wd":"Excepteur ad con","mail":"dolore dolor","contact_name":"aliqua in et dolore magna","contact_phone":"pariatur id eiusmod","legal_name":"aliqua exercitation","legal_card_type":"Excepteur","credit_code":"amet ea voluptate","credit_img":"ipsum sunt tempor aliqua non","create_date":null,"create_id":null,"legal_card_no":"qui","business_type":"voluptate mollit laborum fugiat in"}]
     */

    private double total_page;
    private double total_count;
    private List<ListBean> list;

    public double getTotal_page() {
        return total_page;
    }

    public void setTotal_page(double total_page) {
        this.total_page = total_page;
    }

    public double getTotal_count() {
        return total_count;
    }

    public void setTotal_count(double total_count) {
        this.total_count = total_count;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * company_id : ut amet velit in in
         * company_type : laborum
         * company_name : sed nisi
         * small_name : enim ex nisi Ut Lorem
         * company_domain : amet anim cupidatat commodo
         * company_logo : elit dolore
         * province : in ut laboris Excepteur
         * province_no : aliquip occaecat dolore labore exercitation
         * city : id eu ipsum deserunt
         * city_no : culpa aliquip
         * area : in
         * area_no : laborum ut sunt do
         * addr : Duis ut cillum voluptate
         * jd : Duis aliqua veniam
         * wd : tempor ve
         * mail : minim
         * contact_name : laborum Ut dolor
         * contact_phone : aliquip velit fugiat
         * legal_name : nisi sed ullam
         * legal_card_type : sint p
         * credit_code : eu mollit
         * credit_img : proident do
         * create_date : null
         * create_id : null
         * legal_card_no : consectetur sint in
         * business_type : et reprehenderit magna
         */

        private String company_id;
        private String company_type;
        private String company_name;
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
        private Object create_date;
        private Object create_id;
        private String legal_card_no;
        private String business_type;

        public String getCompany_id() {
            return company_id;
        }

        public void setCompany_id(String company_id) {
            this.company_id = company_id;
        }

        public String getCompany_type() {
            return company_type;
        }

        public void setCompany_type(String company_type) {
            this.company_type = company_type;
        }

        public String getCompany_name() {
            return company_name;
        }

        public void setCompany_name(String company_name) {
            this.company_name = company_name;
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

        public Object getCreate_date() {
            return create_date;
        }

        public void setCreate_date(Object create_date) {
            this.create_date = create_date;
        }

        public Object getCreate_id() {
            return create_id;
        }

        public void setCreate_id(Object create_id) {
            this.create_id = create_id;
        }

        public String getLegal_card_no() {
            return legal_card_no;
        }

        public void setLegal_card_no(String legal_card_no) {
            this.legal_card_no = legal_card_no;
        }

        public String getBusiness_type() {
            return business_type;
        }

        public void setBusiness_type(String business_type) {
            this.business_type = business_type;
        }
    }
}
