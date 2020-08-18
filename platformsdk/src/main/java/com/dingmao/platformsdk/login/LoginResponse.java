package com.dingmao.platformsdk.login;

/**
 * Create by atu on 2020/8/13
 */
public class LoginResponse {


    private String user_id;
    private String comp_id;
    private String domain_name;
    private String phone;
    private String org_no;
    private String dept_no;
    private String avatar;
    private String access_token;
    private String refresh_token;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getComp_id() {
        return comp_id;
    }

    public void setComp_id(String comp_id) {
        this.comp_id = comp_id;
    }

    public String getDomain_name() {
        return domain_name;
    }

    public void setDomain_name(String domain_name) {
        this.domain_name = domain_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrg_no() {
        return org_no;
    }

    public void setOrg_no(String org_no) {
        this.org_no = org_no;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "user_id='" + user_id + '\'' +
                ", comp_id='" + comp_id + '\'' +
                ", domain_name='" + domain_name + '\'' +
                ", phone='" + phone + '\'' +
                ", org_no='" + org_no + '\'' +
                ", dept_no='" + dept_no + '\'' +
                ", avatar='" + avatar + '\'' +
                ", access_token='" + access_token + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                '}';
    }
}
