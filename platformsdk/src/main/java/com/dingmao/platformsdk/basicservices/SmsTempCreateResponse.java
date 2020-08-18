package com.dingmao.platformsdk.basicservices;

/**
 * Create by atu on 2020/8/17
 */
public class SmsTempCreateResponse {

    /**
     * template_id : proident enim anim Duis qui
     * template_no : ad pariatur ut in
     * content : id nostrud cupidatat aute amet
     * status : reprehenderit
     */

    private String template_id;
    private String template_no;
    private String content;
    private String status;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getTemplate_no() {
        return template_no;
    }

    public void setTemplate_no(String template_no) {
        this.template_no = template_no;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
