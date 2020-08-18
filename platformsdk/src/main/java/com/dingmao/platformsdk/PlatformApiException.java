package com.dingmao.platformsdk;

/**
 * Create by atu on 2020/8/12
 */
public class PlatformApiException extends Exception {

    private static final long serialVersionUID = -238091758285157331L;
    private String errCode;
    private String errMsg;

    public PlatformApiException() {
    }

    public PlatformApiException(String errCode, String errMsg) {
        super(errCode+":"+errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public PlatformApiException(String message) {
        super(message);
    }

    public PlatformApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlatformApiException(Throwable cause) {
        super(cause);
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
