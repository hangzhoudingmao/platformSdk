package com.dingmao;

import lombok.Data;

@Data
public class ListJsonBean {
    private String method;//请求方式
    private String path;//请求路径
    private String res_body_type;//响应体类型 只需要json格式
    private String res_body;//响应体
    private String req_body_type;//请求体类型 只要json格式
    private String req_body_other;//请求体
}
