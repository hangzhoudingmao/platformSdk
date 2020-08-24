package com.dingmao.platformsdk.coderulemanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 * 编码规则分解-修改
 */
@Setter
@Getter
public class CodeRuleUpdateReq {
    @NotNull(fileName = "名称")
    private String name;
    @NotNull(fileName = "标识id")
    private String rule_code_resolve_id;

}
