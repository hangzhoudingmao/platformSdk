package com.dingmao.platformsdk.insertmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

/**
 * Create by atu on 2020/8/18
 */
public class EquipCheckReq {

    @NotNull(fileName = "设备mac地址")
    private String mac;//设备mac地址

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
