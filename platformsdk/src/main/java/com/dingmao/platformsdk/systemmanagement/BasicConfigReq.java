package com.dingmao.platformsdk.systemmanagement;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/26
 * site_config_id传参时，其他参数不传；
 * site_config_id参数不传时，system_no参数必传，company_id参数非必传。
 */
@Setter
@Getter
public class BasicConfigReq {
    private String system_no;//系统编码
    private String company_id;//单位id
    private String site_config_id;//站点配置id
}
