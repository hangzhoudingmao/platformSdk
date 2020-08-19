package com.dingmao.platformsdk.commonentity;

/**
 * Create by atu on 2020/8/18
 */
public class LogListReq {
    private String orders;//排序字段，遵从sql语法，默认主键排序，多个用英文逗号拼接，例：log_id desc,module asc
    private String is_page;//是否分页，0：否，1：是，此处值为1
    private String page;//当前页码，默认1
    private String page_size;//每页条数，默认10
    private String start_time;//创建开始日期 格式支持YYYY-MM_DD 和YYYY-MM-DD hh:mm:ss
    private String end_time;//创建截至日期 格式支持YYYY-MM_DD 和YYYY-MM-DD hh:mm:ss
    private String module;//业务模块名
    private String modular;//功能模块名
    private String action_type;//事件类型,使用标准码logActionType,add=新增,edit=修改,delete=删除,query=查询,auth=授权,assign=分配,rela=关联....按需添加
    private String action_name;//事件名称，在日期输入的情况下，允许模糊
    private String description;//日志详情，在日期输入的情况下，允许模糊
    private String entrys;//实体名称，允许输入单个实体名，支持模糊匹配

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public String getIs_page() {
        return is_page;
    }

    public void setIs_page(String is_page) {
        this.is_page = is_page;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

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
