package com.dingmao.platformsdk.insertmanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/18
 */
@Setter
@Getter
public class EquipCheckReq {

    @NotNull(fileName = "设备mac地址")
    private String mac;//设备mac地址

}
