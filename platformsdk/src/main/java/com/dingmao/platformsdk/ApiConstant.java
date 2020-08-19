package com.dingmao.platformsdk;

/**
 * Create by atu on 2020/8/13
 */
public class ApiConstant {
    public static final String SYSTEM_NO = "warehouse";//系统编码
    protected static final String AUTH_CODE = "1F7514E9-FA11-CA29-FB8A-EEC6E1F534B7";//授权码

    public static final String BASE_URL = "http://test_console_api.ihibuilding.cn/";

    public static final String KEY_TOKEN = "KEY_TOKEN";
    public static final String KEY_REFRESH_TOKEN = "KEY_REFRESH_TOKEN";
    public static final String KEY_PHONE = "KEY_PHONE";
    public static final String KEY_SECRET = "KEY_SECRET";

    public static final int TYPE_SUCCESS = 999;
    public static final int TYPE_FAILUER = 1000;

    public static final int login_type = 1;
    public static final int common_type = 0;

    /**
     * ---------基础服务start--------------
     ***/
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

    /**
     * ---------编码规则管理start--------------
     ***/
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


    /**
     * --------系统资源start--------------
     ***/
    static final String SOURCE_CLASSIFICATION_LIST = "api/v1/source/b_sys_source_sort/get_source_sort_list";//系统资源--树
    static final String SOURCE_CLASSIFICATION_ADD = "api/v1/source/b_sys_source_sort/create_source_sort";//系统资源--分类添加
    static final String SOURCE_CLASSIFICATION_UPDATE = "api/v1/source/b_sys_source_sort/update_source_sort";//系统资源--分类修改
    static final String SOURCE_CLASSIFICATION_DELETE = "api/v1/source/b_sys_source_sort/delete_source_sort";//系统资源--分类删除

    static final String SOURCE_ADD = "api/v1/source/b_sys_source/create_source";//系统资源--资源添加
    static final String SOURCE_UPDATE = "api/v1/source/b_sys_source/update_source";//系统资源--资源修改
    static final String SOURCE_LIST = "api/v1/resource/b_sys_source/get_source_list";//系统资源--资源列表
    static final String SOURCE_QUERY = "api/v1/source/b_sys_source/get_source_data";//客户端获取资源信息
    /**--------系统资源end--------------***/


    /**********接入管理start**************************************/
    static final String LOGIN_KEY = "api/v1/access/access_system/get_key";//通过授权码换取密钥
    static final String VALID_KEY = "api/v1/access/access_system/valid_key";//验证密钥
    static final String LOGIN_PWD = "api/v1/access/login/do_login";//通用登录接口

    static final String LOGIN_CODE = "api/v1/access/login/do_login";//验证码登录
    static final String LOG_OUT = "api/v1/access/login/log_out";//通用登出接口
    static final String VALID_TOKEN = "api/v1/access/token/valid_token";//通用验证token
    static final String REFRESH_TOKEN = "api/v1/access/token/refresh_access_token";//通用刷新token
    static final String TRANSLATE_TOKEN = "api/v1/access/token/get_access_token_by_short";//短token获取长token
    static final String VALID_POWER = "api/v1/res/p_object/valid_privilege";//通用权限验证
    static final String SIMULATE_LOGIN = "api/v1/access/login/simulate_do_login";//模拟登录接口
    static final String EQUIPMENT_USABLE = "api/v1/system/b_equip/check_usable";//设备接入判定
    static final String EQUIPMENT_CREATE = "api/v1/system/b_equip/batch_create_equip";//设备备案

    /**********接入管理end**************************************/


    /**********通用实体start**************************************/
    static final String ENTITY_LIST = "api/v1/config/m_entity_data/edt_list";//获取数据
    static final String ENTITY_ADD = "api/v1/config/m_entity_det/create";//新增数据
    static final String ENTITY_UPDATE = "api/v1/config/m_entity_det/update";//修改数据
    static final String ENTITY_DELETE = "api/v1/config/m_entity_data/delete";//删除数据
    static final String ENTITY_LOG_ADD = "api/v1/config/m_bussi_log/create";//新增业务日志
    static final String ENTITY_LOG_LIST = "api/v1/config/m_bussi_log/ml_list";//获取业务日志
    /**********通用实体end**************************************/




    /**********组织结构start**************************************/
    static final String ORG_COMPANYDEPT = "api/v1/org/company/companydept";//通过名称反查组织信息
    static final String ORG_GET_COMPANY = "api/v1/org/company/get_company";//获取主单位信息
    static final String ORG_CHECK_COMPANY_EXISTS = "api/v1/org/company/check_company_exists";//根据单位id检查单位是否存在
    //根据单位类型/名称/域名/业务范围检查单位是否存在  同上
    static final String ORG_UPDATE_COMPANY = "api/v1/org/company/update_company";//编辑单位信息
    static final String ORG_GET_COMPANY_BY_DOMAIN = "api/v1/org/company/get_company_by_domain";//通过域名获取单位信息
    static final String ORG_GET_LIST = "api/v1/org/company/get_list";//获取子系统下单位列表
    static final String ORG_GET_ORG_TREE = "api/v1/org/node/get_org_tree";//获取组织结构树
    static final String ORG_CREATE_OBS = "api/v1/org/o_org/create_obs";//组织树-添加(组织/部门/岗位)-添加组织（子单位）
    static final String ORG_UPDATE_ORG = "api/v1/org/o_org/update_org";//组织树-组织(子单位)-修改
    static final String ORG_DELETE_ORG = "api/v1/org/o_org/delete_org";//组织树-组织(子单位)-删除
    static final String ORG_UPDATE_DEPT = "api/v1/org/o_dept/update_dept";//组织树-部门-修改
    static final String ORG_DELETE_DEPT = "api/v1/org/o_dept/delete_dept";//组织树-部门-删除
    static final String ORG_UPDATE_JOB = "api/v1/org/o_job/update_job";//组织树-岗位-修改
    static final String ORG_DELETE_JOB = "api/v1/org/o_job/delete_job";//组织树-岗位-删除
    static final String ORG_GET_ACCOUNT_LIST = "api/v1/org/p_job_user/get_account_list";//组织树-岗位-分配人员-列表
    static final String ORG_BATCH_CREATE_JOB_USER = "api/v1/org/p_job_user/batch_create_job_user";//组织树-岗位-分配人员-保存
    static final String ORG_GET_AUTH_JOB_LIST = "api/v1/org/p_auth_job_rela/get_auth_job_list";//组织树-岗位-分配权限模板-列表
    static final String ORG_BATCH_CREATE_AUTH_JOB_RELA = "api/v1/org/p_auth_job_rela/batch_create_auth_job_rela";//组织树-岗位-分配权限模板-保存
    static final String ORG_GET_JOB_USER_LIST = "api/v1/res/p_job_user/get_job_user_list";//obs组织结构树-人员列表
    static final String ORG_DELETE_JOB_USER = "api/v1/res/p_job_user/delete_job_user";//obs组织结构树-人员列表-删除
    static final String ORG_GET_AUTH_JOB_RELA_LIST = "api/v1/res/p_auth_job_rela/get_auth_job_rela_list";//obs组织结构树-权限清单
    static final String ORG_DELETE_AUTH_JOB_RELA = "api/v1/res/p_auth_job_rela/delete_auth_job_rela";//obs组织结构树-权限清单-删除
    static final String ORG_GET_AUTH_OBJECT_RELA_LIST = "api/v1/res/p_auth_object_rela/get_auth_object_rela_list";//obs组织结构树-权限清单-资源数量（权限项列表）
    static final String ORG_GET_OBJECT = "api/v1/org/job/get_object";//获取岗位权限
    static final String ORG_GET_CURRENT_AND_SUB_ORG_LIST = "api/v1/org/o_org/get_current_and_sub_org_list";//组织-根据组织编码获取组织及所有下级组织
    static final String ORG_GET_ORG_LIST_BY_NOS = "api/v1/org/o_org/get_org_list_by_nos";//组织-根据组织编码（支持多个）获取组织信息（列表）
    static final String ORG_GET_CURRENT_AND_SUB_DEPT_LIST = "api/v1/org/o_dept/get_current_and_sub_dept_list";//部门-根据部门编码获取部门及所有下级部门
    static final String ORG_GET_CURRENT_AND_SUB_DEPT_BY_NOS_LIST = "api/v1/org/o_dept/get_current_and_sub_dept_by_nos_list";//部门-根据组织编码获取部门及所有下级部门
    static final String ORG_GET_DEPT_LIST_BY_IDS = "api/v1/org/o_dept/get_dept_list_by_ids";//部门-根据部门id（支持多个）获取部门列表
    static final String ORG_GET_ORG_LIST_BY_DEPT = "api/v1/org/o_org/get_org_list_by_dept";//根据部门表字段参数获取所属组织信息（支持批量）

    /**********组织结构end*************************************



     //     static final String = "";//


     /**********接口服务start**************************************/
    static final String SERVICE_GET_TREE = "api/v1/service/a_api/get_tree";//获取服务分类结构树
    static final String SERVICE_SORT_ADD = "api/v1/service/a_api_sort/create_api_sort";//新增服务分类
    static final String SERVICE_SORT_UPDATE = "api/v1/service/a_api_sort/update_api_sort";//修改分类
    static final String SERVICE_SORT_DELETE = "api/v1/service/a_api_sort/delete_api_sort";//删除分类
    static final String SERVICE_GET_LIST = "api/v1/service/a_api/get_list";//获取接口列表
    static final String SERVICE_API_CREATE = "api/v1/service/a_api/create_api";//发布接口
    static final String SERVICE_API_UPDATE = "api/v1/service/a_api/update_api";//修改接口
    static final String SERVICE_API_DELETE = "api/v1/service/a_api/delete_api";//删除接口
    static final String SERVICE_GET_API_LOG_LIST = "api/v1/service/a_api_log/get_api_log_list";//获取接口调用日志
    static final String SERVICE_RESET_AUTHCODE = "api/v1/service/a_access/reset_authcode";//重置授权码

    /**********接口服务end**************************************/
}
