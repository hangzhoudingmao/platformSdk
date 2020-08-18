package com.dingmao.platformsdk;

/**
 * Create by atu on 2020/8/13
 */
public class ApiConstant {
    public static final String SYSTEM_NO = "warehouse";//系统编码
    protected static final String AUTH_CODE = "1F7514E9-FA11-CA29-FB8A-EEC6E1F534B7";//授权码

    public static final String BASE_URL = "http://test_console_api.ihibuilding.cn/";

    static final String LOGIN = "api/v1/access/login/do_login";
    static final String LOGIN_KEY = "api/v1/access/access_system/get_key";

    public static final String KEY_TOKEN = "KEY_TOKEN";
    public static final String KEY_REFRESH_TOKEN = "KEY_REFRESH_TOKEN";
    public static final String KEY_PHONE = "KEY_PHONE";
    public static final String KEY_SECRET = "KEY_SECRET";

    public static final int TYPE_SUCCESS = 999;
    public static final int TYPE_FAILUER = 1000;

    public static final int login_type = 1;
    public static final int common_type = 0;

    /**---------基础服务start--------------***/
    static final String UPLOAD_FILE = "api/v1/base/file/upload_file";//上传文件
    static final String DUMP_TABLE_DATA = "aapi/v1/dump/dump_table_data";//导出权限项、菜单、标准码表数据SQL脚本
    static final String GET_FILE_LIST = "api/v1/base/file/get_list";//获取文件列表
    static final String DELETE_FILE = "api/v1/base/file/delete_file";//删除文件
    static final String UPLOAD_LOG = "api/v1/access/log/upload_log";//日志上报
    static final String SEND_SMS = "api/v1/base/sms/send_sms";//发送短信
    static final String BATCH_SEND_SMS = "api/v1/base/sms/batch_send_sms";//发送短信_群发
    static final String GET_SMS_LIST = "api/v1/base/sms/get_list";//获取短信发送记录
    static final String CREATE_SMS_TEMPLATE = "api/v1/base/sms_template/create_sms_template";//申请短信模板
    static final String GET_TEMPLATE_LIST = "api/v1/base/sms_template/get_list";//获取短信模板
    static final String SEND_VALIDCODE = "api/v1/base/sms_validcode/send_validcode";//发送验证码
    static final String SMS_VALIDCODE = "api/v1/base/sms_validcode/validcode";//验证码校验
    static final String GET_AREA_TREE = "api/v1/base/area/get_tree";//获取区域树
    static final String GET_AREA_BOX_LIST = "api/v1/base/area/get_area_box_list";//区域-下拉框-省列表
    static final String GET_THIRD_APP_DETAIL = "api/v1/base/third_app/get_third_app_detail";//获取OSS地址
    /**---------基础服务end--------------***/

    /**---------编码规则管理start--------------***/
    static final String CODE_RULE_RESOLVE_LIST = "api/v1/rule/b_rule_code_resolve/get_resolve_list";    //编码规则分解-树
    static final String CODE_RULE_RESOLVE_ADD = "api/v1/rule/b_rule_code_resolve/create_code_resolve";    //编码规则分解-添加
    static final String CODE_RULE_RESOLVE_UPDATE = "api/v1/rule/b_rule_code_resolve/update_code_resolve";    //编码规则分解-修改
    static final String CODE_RULE_RESOLVE_DELETE = "api/v1/rule/b_rule_code_resolve/delete_code_resolve";    //编码规则分解-删除

    static final String CODE_CLASSIFICATION_ADD = "api/v1/rule/b_rule_code/create_rule";    //规则分类-规则段-添加
    static final String CODE_CLASSIFICATION_UPDATE = "api/v1/rule/b_rule_code/update_rule";    //规则分类-规则段-修改
    static final String CODE_CLASSIFICATION_DELETE = "api/v1/rule/b_rule_code/delete_rule";    //规则分类-规则段-删除
    static final String CODE_CLASSIFICATION_LIST = "api/v1/rule/b_rule_code/get_rule_list";    //规则分类-规则段列表

    static final String PIPELINE_SECTION_ADD = "api/v1/rule/b_pipeline_section/create_section";    //流水段维护--流水段添加
    static final String PIPELINE_SECTION_DELETE = "api/v1/rule/b_pipeline_section/delete_section";    //流水段维护--流水段删除
    static final String PIPELINE_SECTION_LIST = "api/v1/rule/b_pipeline_section/get_section_list";    //流水段维护--流水段列表

    static final String CODE_USAGE_RECORD = "api/v1/rule/b_rule_code_record/get_code_record_list";    //编码使用记录
    static final String CODE_USAGE = "/api/v1/rule/b_rule_code_record/create_apply_rule";    //编码使用
    /**--------编码规则管理end--------------***/

}
