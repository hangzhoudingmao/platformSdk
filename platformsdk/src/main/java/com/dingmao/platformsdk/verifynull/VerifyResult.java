package com.dingmao.platformsdk.verifynull;

/**
 * Create by atu on 2020/8/20
 */
public class VerifyResult {
    private boolean isValid = true;
    private String msg;

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        this.isValid = false;
    }
}
