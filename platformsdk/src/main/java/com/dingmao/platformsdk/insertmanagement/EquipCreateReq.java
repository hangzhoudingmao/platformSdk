package com.dingmao.platformsdk.insertmanagement;

import java.util.List;

/**
 * Create by atu on 2020/8/18
 */
public class EquipCreateReq {
    private List<EquipReq> data;

    public List<EquipReq> getData() {
        return data;
    }

    public void setData(List<EquipReq> data) {
        this.data = data;
    }

    public static class EquipReq{
        private String mac;//mac地址
        private String equip_no;//设备编号
        private String equip_type;//设备类型
        private String equip_name;//设备名称

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public String getEquip_no() {
            return equip_no;
        }

        public void setEquip_no(String equip_no) {
            this.equip_no = equip_no;
        }

        public String getEquip_type() {
            return equip_type;
        }

        public void setEquip_type(String equip_type) {
            this.equip_type = equip_type;
        }

        public String getEquip_name() {
            return equip_name;
        }

        public void setEquip_name(String equip_name) {
            this.equip_name = equip_name;
        }
    }
}
