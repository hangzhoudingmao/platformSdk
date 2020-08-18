package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 */
public class SmsListRequest {
    private String template_no;
    private String phone;
    private String rela_id;
    private String usage;
    private String content;
    private String start_time;
    private String end_time;
    private String sms_id;
    private String is_page;
    private String page;
    private String pag_size;

    public String getTemplate_no() {
        return template_no;
    }

    public void setTemplate_no(String template_no) {
        this.template_no = template_no;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRela_id() {
        return rela_id;
    }

    public void setRela_id(String rela_id) {
        this.rela_id = rela_id;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getSms_id() {
        return sms_id;
    }

    public void setSms_id(String sms_id) {
        this.sms_id = sms_id;
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

    public String getPag_size() {
        return pag_size;
    }

    public void setPag_size(String pag_size) {
        this.pag_size = pag_size;
    }
}
