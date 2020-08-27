package com.dingmao.platformsdk.commonentity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/18
 */
@Getter
@Setter
public class EntityAddReq {
    private String entity_no;//实体编号，通过公共中心定义
    private String system_no;//系统编码
    private List<EntityReq> data;//


    @Setter
    @Getter
    public static class EntityReq{
        private String field_code;//字段编码,到公共中心去定义
        private String val;//字段值

    }

}
