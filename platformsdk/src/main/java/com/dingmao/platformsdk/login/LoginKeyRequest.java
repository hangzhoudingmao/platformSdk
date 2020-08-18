package com.dingmao.platformsdk.login;

/**
 * Create by atu on 2020/8/13
 */
public class LoginKeyRequest {
    private String system_no;
    private String auth_code;

    public LoginKeyRequest() {
    }

    public LoginKeyRequest(String system_no, String auth_code) {
        this.system_no = system_no;
        this.auth_code = auth_code;
    }

    public String getSystem_no() {
        return system_no;
    }

    public void setSystem_no(String system_no) {
        this.system_no = system_no;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }
}
