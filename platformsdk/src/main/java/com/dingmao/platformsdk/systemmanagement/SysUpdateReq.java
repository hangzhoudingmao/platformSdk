package com.dingmao.platformsdk.systemmanagement;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/20
 */
@Getter
@Setter
public class SysUpdateReq {
    private String system_id;//系统iD
    private String system_name;//系统名称
    private String domain_name;//主域名
    private String api_domain;//api域名
    private String port;//端口
    private String api_port;//api端口
    private String description;//描述
    private String logo;//logo


}
