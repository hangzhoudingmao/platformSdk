package com.dingmao.platformsdk.coderulemanagement;

import com.dingmao.platformsdk.verifynull.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by atu on 2020/8/17
 */
@Getter
@Setter
public class CodeRuledelReq {
    @NotNull(fileName = "标识id")
    private String rule_code_resolve_id;

}
