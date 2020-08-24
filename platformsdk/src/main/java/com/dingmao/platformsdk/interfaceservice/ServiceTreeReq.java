package com.dingmao.platformsdk.interfaceservice;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/19
 */
@Setter
@Getter
public class ServiceTreeReq {
    private String sort_no;//服务分类编号，不传入则获取全部分类
}
