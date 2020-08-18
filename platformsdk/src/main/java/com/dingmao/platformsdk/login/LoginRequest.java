package com.dingmao.platformsdk.login;

/**
 * Create by atu on 2020/8/13
 */
public class LoginRequest {
    private String user_no;
    private String password;
    private String login_type;
    private String system_no;

    public LoginRequest(String user_no, String password) {
        this.user_no = user_no;
        this.password = password;
    }

    public String getUser_no() {
        return user_no;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    public String getLogin_type() {
        return login_type;
    }

    public void setLogin_type(String login_type) {
        this.login_type = login_type;
    }

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
