package com.dingmao.platformsdk.commonentity;

/**
 * Create by atu on 2020/8/18
 */
public class LogAddReq {
    private String module;//业务模块名
    private String modular;//功能模块名
    private String action_type;//事件类型,使用标准码logActionType,add=新增,edit=修改,delete=删除,query=查询,auth=授权,assign=分配,rela=关联....按需添加
    private String action_name;//事件名称
    private String description;//事件描述，详细描述
    private String entrys;//实体集合，多个用","分开

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getModular() {
        return modular;
    }

    public void setModular(String modular) {
        this.modular = modular;
    }

    public String getAction_type() {
        return action_type;
    }

    public void setAction_type(String action_type) {
        this.action_type = action_type;
    }

    public String getAction_name() {
        return action_name;
    }

    public void setAction_name(String action_name) {
        this.action_name = action_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEntrys() {
        return entrys;
    }

    public void setEntrys(String entrys) {
        this.entrys = entrys;
    }
}
