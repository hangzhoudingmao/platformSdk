package com.dingmao.platformsdk.insertmanagement;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/18
 */
@Getter
@Setter
public class EquipCreateReq {
    private List<EquipReq> data;


    @Getter
    @Setter
    public static class EquipReq{
        private String mac;//mac地址
        private String equip_no;//设备编号
        private String equip_type;//设备类型
        private String equip_name;//设备名称

    }
}
