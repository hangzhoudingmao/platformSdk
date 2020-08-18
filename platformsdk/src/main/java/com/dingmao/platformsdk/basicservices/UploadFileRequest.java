package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 */
public class UploadFileRequest {
    private String rela_id;
    private String module;

    public UploadFileRequest(String rela_id, String module) {
        this.rela_id = rela_id;
        this.module = module;
    }

    public String getRela_id() {
        return rela_id;
    }

    public void setRela_id(String rela_id) {
        this.rela_id = rela_id;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
