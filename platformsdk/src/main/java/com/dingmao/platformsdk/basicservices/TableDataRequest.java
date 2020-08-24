package com.dingmao.platformsdk.basicservices;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 导出权限项、菜单、标准码表数据SQL脚本
 */
@Setter
@Getter
public class TableDataRequest {
    @NotNull(fileName = "系统编码")
    private String system_no;

}
