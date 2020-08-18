package com.dingmao.platformsdk.basicservices;

import java.util.List;

/**
 * Create by atu on 2020/8/17
 */
public class SendMsgRequest {
    private String template_no;
    private String phone;
    private String rela_id;
    private String usage;
    private List<SendMsgKeys> keys;

    public List<SendMsgKeys> getKeys() {
        return keys;
    }

    public void setKeys(List<SendMsgKeys> keys) {
        this.keys = keys;
    }

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

    public class SendMsgKeys{
        private String name;
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
