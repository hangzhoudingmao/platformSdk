package com.dingmao.platformsdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.dingmao.platformsdk.basicservices.AreaTreeRequest;
import com.dingmao.platformsdk.basicservices.BoxAreaRequest;
import com.dingmao.platformsdk.basicservices.BoxCityRequest;
import com.dingmao.platformsdk.basicservices.BoxProvinceRequest;
import com.dingmao.platformsdk.basicservices.BoxStreeRequest;
import com.dingmao.platformsdk.basicservices.CheckCodeRequest;
import com.dingmao.platformsdk.basicservices.FileDeleteRequest;
import com.dingmao.platformsdk.basicservices.FileListRequest;
import com.dingmao.platformsdk.basicservices.SendCodeRequest;
import com.dingmao.platformsdk.basicservices.SendMsgRequest;
import com.dingmao.platformsdk.basicservices.SmsListRequest;
import com.dingmao.platformsdk.basicservices.SmsTempCreateRequest;
import com.dingmao.platformsdk.basicservices.SmsTempGetRequest;
import com.dingmao.platformsdk.basicservices.TableDataRequest;
import com.dingmao.platformsdk.callback.PlatformListCallback;
import com.dingmao.platformsdk.callback.PlatformStringCallback;
import com.dingmao.platformsdk.coderulemanagement.CodeRecordReq;
import com.dingmao.platformsdk.coderulemanagement.CodeRuleAddReq;
import com.dingmao.platformsdk.coderulemanagement.CodeRuleResolveReq;
import com.dingmao.platformsdk.coderulemanagement.CodeRuleUpdateReq;
import com.dingmao.platformsdk.coderulemanagement.CodeRuledelReq;
import com.dingmao.platformsdk.coderulemanagement.CodeUsageReq;
import com.dingmao.platformsdk.coderulemanagement.RuleAddReq;
import com.dingmao.platformsdk.coderulemanagement.RuleListReq;
import com.dingmao.platformsdk.coderulemanagement.RuleUpdateReq;
import com.dingmao.platformsdk.coderulemanagement.RuledelReq;
import com.dingmao.platformsdk.coderulemanagement.SectionAddReq;
import com.dingmao.platformsdk.coderulemanagement.SectionDelReq;
import com.dingmao.platformsdk.coderulemanagement.SectionListReq;
import com.dingmao.platformsdk.commonentity.EntityAddReq;
import com.dingmao.platformsdk.commonentity.EntityDelReq;
import com.dingmao.platformsdk.commonentity.EntityListReq;
import com.dingmao.platformsdk.commonentity.EntityUpdateReq;
import com.dingmao.platformsdk.commonentity.LogAddReq;
import com.dingmao.platformsdk.commonentity.LogListReq;
import com.dingmao.platformsdk.insertmanagement.CheckPowerReq;
import com.dingmao.platformsdk.insertmanagement.EquipCheckReq;
import com.dingmao.platformsdk.insertmanagement.EquipCreateReq;
import com.dingmao.platformsdk.insertmanagement.SimulateLoginReq;
import com.dingmao.platformsdk.insertmanagement.TranslateTokenReq;
import com.dingmao.platformsdk.insertmanagement.ValidTokenReq;
import com.dingmao.platformsdk.interfaceservice.ApiCreateReq;
import com.dingmao.platformsdk.interfaceservice.ApiDelReq;
import com.dingmao.platformsdk.interfaceservice.ApiLogReq;
import com.dingmao.platformsdk.interfaceservice.ApiUpdateReq;
import com.dingmao.platformsdk.interfaceservice.AuthCodeReq;
import com.dingmao.platformsdk.interfaceservice.ServiceListReq;
import com.dingmao.platformsdk.interfaceservice.ServiceTreeReq;
import com.dingmao.platformsdk.interfaceservice.SortCreateReq;
import com.dingmao.platformsdk.interfaceservice.SortDelReq;
import com.dingmao.platformsdk.interfaceservice.SortUpdateReq;
import com.dingmao.platformsdk.login.LoginByCodeReq;
import com.dingmao.platformsdk.login.LoginByPwdReq;
import com.dingmao.platformsdk.login.ValidKeyReq;
import com.dingmao.platformsdk.organization.AccountAddReq;
import com.dingmao.platformsdk.organization.AccountListReq;
import com.dingmao.platformsdk.organization.BelongOrgListReq;
import com.dingmao.platformsdk.organization.DeptDelReq;
import com.dingmao.platformsdk.organization.DeptMultiListReq;
import com.dingmao.platformsdk.organization.DeptSubListReq;
import com.dingmao.platformsdk.organization.DeptUpdateReq;
import com.dingmao.platformsdk.organization.JobDelReq;
import com.dingmao.platformsdk.organization.JobPowerListReq;
import com.dingmao.platformsdk.organization.JobUpdateReq;
import com.dingmao.platformsdk.organization.ObsListReq;
import com.dingmao.platformsdk.organization.ObsPowerListReq;
import com.dingmao.platformsdk.organization.ObsRelaDelReq;
import com.dingmao.platformsdk.organization.ObsRelaListReq;
import com.dingmao.platformsdk.organization.ObsUserDelReq;
import com.dingmao.platformsdk.organization.OrgCheckCompReq;
import com.dingmao.platformsdk.organization.OrgCompDeptMultiReq;
import com.dingmao.platformsdk.organization.OrgCompDeptReq;
import com.dingmao.platformsdk.organization.OrgCompDomainReq;
import com.dingmao.platformsdk.organization.OrgCompListReq;
import com.dingmao.platformsdk.organization.OrgCompUpdateReq;
import com.dingmao.platformsdk.organization.OrgCompanyReq;
import com.dingmao.platformsdk.organization.OrgDelReq;
import com.dingmao.platformsdk.organization.OrgJobAddReq;
import com.dingmao.platformsdk.organization.OrgJobListReq;
import com.dingmao.platformsdk.organization.OrgMultiListReq;
import com.dingmao.platformsdk.organization.OrgObsAddDeptReq;
import com.dingmao.platformsdk.organization.OrgObsAddJobReq;
import com.dingmao.platformsdk.organization.OrgObsAddOrgReq;
import com.dingmao.platformsdk.organization.OrgObsAddReq;
import com.dingmao.platformsdk.organization.OrgSubListReq;
import com.dingmao.platformsdk.organization.OrgTreeReq;
import com.dingmao.platformsdk.organization.OrgUpdateReq;
import com.dingmao.platformsdk.organization.SubDeptListReq;
import com.dingmao.platformsdk.systemresources.SourceAddReq;
import com.dingmao.platformsdk.systemresources.SourceDataReq;
import com.dingmao.platformsdk.systemresources.SourceListReq;
import com.dingmao.platformsdk.systemresources.SourceSortAddReq;
import com.dingmao.platformsdk.systemresources.SourceSortDelReq;
import com.dingmao.platformsdk.systemresources.SourceSortUpdateReq;
import com.dingmao.platformsdk.systemresources.SourceUpdateReq;
import com.google.gson.Gson;

import org.json.JSONArray;

import java.io.File;
import java.util.HashMap;
import java.util.List;

/**
 * Create by atu on 2020/8/12
 * @desc 对外暴露请求
 */
public class PlatformClient {
    private static final String TAG = PlatformClient.class.getSimpleName();

    public static final int MESSAGE_SUCCESS = 0X1;
    public static final int MESSAGE_FAILURE = 0X2;

    /****************************基础服务start*********************************************************************************/

    /**
     * 上传文件
     * @param map
     * @param file
     * @param callback
     */
    public static void doUploadFile(HashMap<String,String> map, File file,PlatformCallback callback){
        OkHttpUtils.getInstance().doPostFile(ApiConstant.UPLOAD_FILE,map,file,callback);
    }

    /**
     * 导出权限项、菜单、标准码表数据SQL脚本
     * @param dataRequest
     * @param callback
     */
    public static void doExportTable(TableDataRequest dataRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.DUMP_TABLE_DATA, obj2Json(dataRequest),callback);
    }

    /**
     * 获取文件列表
     */
    public static void doGetList(FileListRequest fileListRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_FILE_LIST, obj2Json(fileListRequest),callback);
    }


    /**
     * 删除文件
     */
    public static void doDeleteFile(FileDeleteRequest fileDeleteRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.DELETE_FILE, obj2Json(fileDeleteRequest),callback);
    }

    /**
     * 上传日志
     */
    public static void doUploadLog(List list,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.UPLOAD_LOG, list2Json(list),callback);
    }

    /**
     * 发送短信
     */

    public static void doSendMsg(SendMsgRequest sendMsgRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SEND_SMS,obj2Json(sendMsgRequest),callback);
    }

    /**
     * 群发短信
     * @param list
     * @param callback
     */
    public static void doSendSms(List list, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.BATCH_SEND_SMS,list2Json(list),callback);
    }
    /**
     * 获取短信发送记录
     */
    public static void doSmsList(SmsListRequest smsListRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_SMS_LIST,obj2Json(smsListRequest),callback);
    }

    /**
     * 短信模版创建
     * @param mSmsTempCreateRequest
     * @param callback
     */
    public static void doSmsTempCreate(SmsTempCreateRequest mSmsTempCreateRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CREATE_SMS_TEMPLATE,obj2Json(mSmsTempCreateRequest),callback);
    }

    /**
     * 获取短信模板
     * @param smsTempGetRequest
     * @param callback
     */
    public static void doSmsTempGet(SmsTempGetRequest smsTempGetRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_TEMPLATE_LIST,obj2Json(smsTempGetRequest),callback);
    }

    /**
     * 发送验证码
     * @param sendCodeRequest
     * @param callback
     */
    public static void doSendCode(SendCodeRequest sendCodeRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SEND_VALIDCODE,obj2Json(sendCodeRequest),callback);
    }

    /**
     * 校验验证码
     * @param mCheckCodeRequest
     * @param callback
     */
    public static void doCheckCode(CheckCodeRequest mCheckCodeRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SMS_VALIDCODE,obj2Json(mCheckCodeRequest),callback);
    }

    /**
     * 获取区域树
     * @param areaTreeRequest
     * @param callback
     */
    public static void doAreaTree(AreaTreeRequest areaTreeRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_AREA_TREE,obj2Json(areaTreeRequest),callback);
    }

    /**
     * 区域-下拉框-省列表
     * @param mAreaBoxProRequest
     * @param callback
     */
    public static void doProvince(BoxProvinceRequest mAreaBoxProRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_AREA_BOX_LIST,obj2Json(mAreaBoxProRequest),callback);
    }

    /**
     * 区域-下拉框-市列表
     * @param boxCityRequest
     * @param callback
     */
    public static void doCity(BoxCityRequest boxCityRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_AREA_BOX_LIST,obj2Json(boxCityRequest),callback);
    }

    /**
     * 区域-下拉框-区列表
     * @param boxAreaRequest
     * @param callback
     */
    public static void doArea(BoxAreaRequest boxAreaRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_AREA_BOX_LIST,obj2Json(boxAreaRequest),callback);
    }

    /**
     * 区域-下拉框-区列表
     * @param boxStreeRequest
     * @param callback
     */
    public static void doStree(BoxStreeRequest boxStreeRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_AREA_BOX_LIST,obj2Json(boxStreeRequest),callback);
    }

    public static void doOSS(PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_THIRD_APP_DETAIL,null,callback);
    }
    /****基础服务end********************************************************************************************/



    /*****编码规则管理start********************************************************************************************/

    /**
     * 编码规则分解-树
     * @param callback
     */
    public static void doCodeRuleResolve(PlatformListCallback callback){
        doCodeRuleResolve(null,callback);
    }

    public static void doCodeRuleResolve(CodeRuleResolveReq codeRuleResolveReq, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_LIST,obj2Json(codeRuleResolveReq),callback);
    }

    /**
     * 编码规则分解-添加
     * @param codeRuleAddReq
     * @param callback
     */
    public static void doCodeRuleAdd(CodeRuleAddReq codeRuleAddReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(codeRuleAddReq),callback);
    }

    /**
     * 编码规则分解-修改
     * @param codeRuleUpdateReq
     * @param callback
     */
    public static void doCodeRuleUpdate(CodeRuleUpdateReq codeRuleUpdateReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_UPDATE,obj2Json(codeRuleUpdateReq),callback);
    }

    /**
     * 编码规则分解-删除
     * @param codeRuledelReq
     * @param callback
     */
    public static void doCodeRuleDel(CodeRuledelReq codeRuledelReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_DELETE,obj2Json(codeRuledelReq),callback);
    }

    /**
     * 规则分类-规则段-添加
     * @param ruleAddReq
     * @param callback
     */
    public static void doRuleAdd(RuleAddReq ruleAddReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_CLASSIFICATION_ADD,obj2Json(ruleAddReq),callback);
    }
    /**
     * 规则分类-规则段-编辑
     * @param ruleUpdateReq
     * @param callback
     */
    public static void doRuleUpdate(RuleUpdateReq ruleUpdateReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_CLASSIFICATION_UPDATE,obj2Json(ruleUpdateReq),callback);
    }
    /**
     * 规则分类-规则段-删除
     * @param ruledelReq
     * @param callback
     */
    public static void doRuleDel(RuledelReq ruledelReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_CLASSIFICATION_DELETE,obj2Json(ruledelReq),callback);
    }
    /**
     * 规则分类-规则段-列表
     * @param ruleListReq
     * @param callback
     */
    public static void doRuleList(RuleListReq ruleListReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_CLASSIFICATION_LIST,obj2Json(ruleListReq),callback);
    }

    /**
     * 流水段维护--流水段添加
     * @param sectionAddReq
     * @param callback
     */
    public static void doSectionAdd(SectionAddReq sectionAddReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.PIPELINE_SECTION_ADD,obj2Json(sectionAddReq),callback);
    }

    /**
     * 流水段维护--流水段删除
     * @param sectionDelReq
     * @param callback
     */
    public static void doSectionDel(SectionDelReq sectionDelReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.PIPELINE_SECTION_DELETE,obj2Json(sectionDelReq),callback);
    }

    /**
     * 规则分类-规则段-列表
     * @param sectionListReq
     * @param callback
     */
    public static void doSectionList(SectionListReq sectionListReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.PIPELINE_SECTION_LIST,obj2Json(sectionListReq),callback);
    }

    /**
     * 编码使用记录
     * @param codeRecordReq
     * @param callback
     */
    public static void doCodeRecord(CodeRecordReq codeRecordReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_USAGE_RECORD,obj2Json(codeRecordReq),callback);
    }

    /**
     * 编码使用
     * @param codeUsageReq
     * @param callback
     */
    public static void doCodeUsage(CodeUsageReq codeUsageReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_USAGE,obj2Json(codeUsageReq),callback);
    }


    /*****编码规则管理end********************************************************************************************/





    /*****系统资源start********************************************************************************************/

    /**
     * 系统资源--树
     * @param callback
     */
    public static void doSourceTree(PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SOURCE_CLASSIFICATION_LIST,null,callback);
    }

    /**
     * 系统资源--分类添加
     * @param callback
     */
    public static void doSourceSortAdd(SourceSortAddReq sourceSortAddReq,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SOURCE_CLASSIFICATION_ADD,obj2Json(sourceSortAddReq),callback);
    }

    /**
     * 系统资源--分类修改
     * @param callback
     */
    public static void doSourceSortUpdate(SourceSortUpdateReq sourceSortUpdateReq,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SOURCE_CLASSIFICATION_UPDATE,obj2Json(sourceSortUpdateReq),callback);
    }

    /**
     * 系统资源--分类删除
     * @param callback
     */
    public static void doSourceSortDel(SourceSortDelReq sourceSortDelReq,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SOURCE_CLASSIFICATION_DELETE,obj2Json(sourceSortDelReq),callback);
    }

    /**
     * 系统资源--资源添加
     * @param callback
     */
    public static void doSourceAdd(SourceAddReq sourceAddReq,PlatformCallback callback){
        Log.e("doSourceAdd====",obj2Json(sourceAddReq));
        OkHttpUtils.getInstance().doPost(ApiConstant.SOURCE_ADD,obj2Json(sourceAddReq),callback);
    }

    /**
     * 系统资源--资源修改
     * @param callback
     */
    public static void doSourceUpdate(SourceUpdateReq sourceUpdateReq,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SOURCE_UPDATE,obj2Json(sourceUpdateReq),callback);
    }

    /**
     * 系统资源--资源列表
     * @param callback
     */
    public static void doSourceList(SourceListReq sourceListReq,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SOURCE_LIST,obj2Json(sourceListReq),callback);
    }

    /**
     * 系统资源--树
     * @param callback
     */
    public static void doSourceQuery(SourceDataReq sourceDataReq,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SOURCE_QUERY,obj2Json(sourceDataReq),callback);
    }

    /*****系统资源end********************************************************************************************/





    /*******************接入管理start********************************************************************************************/

    /**
     * 验证秘钥
     * @param validKeyReq
     * @param callback
     */
    public static void doValidKey(ValidKeyReq validKeyReq,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.VALID_KEY,obj2Json(validKeyReq),callback);
    }

    /**
     * 密码登录
     * @param loginRequest
     * @param callback
     */
    public static void doLogin(LoginByPwdReq loginRequest, PlatformCallback callback){
        AccessManagement.doLoginByPwd(loginRequest,callback);
    }

    /**
     * 验证码登录
     * @param loginRequest
     * @param callback
     */
    public static void doLogin(LoginByCodeReq loginRequest, PlatformCallback callback){
        AccessManagement.doLoginByCode(loginRequest,callback);
    }

    /**
     * 登出
     * @param callback
     */
    public static void doLogout(PlatformStringCallback callback){
        AccessManagement.doLogout(ApiConstant.LOG_OUT,callback);
    }

    /**
     * 验证token
     * @param callback
     */
    public static void doValidToken(ValidTokenReq validTokenReq, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.VALID_TOKEN,obj2Json(validTokenReq),callback);
    }

    /**
     * 通用刷新token
     * @param callback
     */
    public static void doRefreshToken(PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REFRESH_TOKEN,callback);
    }

    /**
     * 短token获取长token
     * @param translateTokenReq
     * @param callback
     */
    public static void doTransToken(TranslateTokenReq translateTokenReq,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.TRANSLATE_TOKEN,obj2Json(translateTokenReq),callback);
    }

    /**
     * 通用权限验证
     * @param checkPowerReq
     * @param callback
     */
    public static void doCheckPower(CheckPowerReq checkPowerReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.VALID_POWER,obj2Json(checkPowerReq),callback);
    }

    /**
     * 模拟登录
     * @param simulateLoginReq
     * @param callback
     */
    public static void doLogin(SimulateLoginReq simulateLoginReq,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SIMULATE_LOGIN,obj2Json(simulateLoginReq),callback);
    }

    /**
     * 设备接入判定
     * @param equipCheckReq
     * @param callback
     */
    public static void doEquipCheck(EquipCheckReq equipCheckReq, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.EQUIPMENT_USABLE,obj2Json(equipCheckReq),callback);
    }

    /**
     * 设备备案
     * @param equipCreateReq
     * @param callback
     */
    public static void doEquipCreate(EquipCreateReq equipCreateReq, PlatformCallback callback){
        Log.e("equipCreateReq===",obj2Json(equipCreateReq));
        OkHttpUtils.getInstance().doPost(ApiConstant.EQUIPMENT_CREATE,obj2Json(equipCreateReq),callback);
    }
    /*******************接入管理end********************************************************************************************/



    /*******************组织结构start********************************************************************************************/

    /**
     * 通过名称反查组织信息
     * @param orgCompDeptReq
     * @param callback
     */
    public static void doOrgDept(OrgCompDeptReq orgCompDeptReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_COMPANYDEPT,obj2Json(orgCompDeptReq),callback);
    }

    /**
     * 获取主单位信息
     * @param request
     * @param callback
     */
    public static void doOrgCompany(OrgCompanyReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_COMPANY,obj2Json(request),callback);
    }

    /**
     * 根据单位id检查单位是否存在
     * @param request
     * @param callback
     */
    public static void doOrgCompExist(OrgCheckCompReq request, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_CHECK_COMPANY_EXISTS,obj2Json(request),callback);
    }

    /**
     * 根据单位类型/名称/域名/业务范围检查单位是否存在
     * @param request
     * @param callback
     */
    public static void doOrgCompExist(OrgCompDeptMultiReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_CHECK_COMPANY_EXISTS,obj2Json(request),callback);
    }

    /**
     * 编辑单位信息
     * @param request
     * @param callback
     */
    public static void doOrgCompUpdate(OrgCompUpdateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_UPDATE_COMPANY,obj2Json(request),callback);
    }

    /**
     * 在访问平台登录页面的时候使用
     * 通过域名获取单位信息
     * @param request
     * @param callback
     */
    public static void doOrgCompDomain(OrgCompDomainReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_COMPANY_BY_DOMAIN,obj2Json(request),callback);
    }

    /**
     * 获取子系统下单位列表
     * @param request
     * @param callback
     */
    public static void doOrgCompList(OrgCompListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_LIST,obj2Json(request),callback);
    }

    /**
     * 获取组织结构树
     * @param request
     * @param callback
     */
    public static void doOrgTree(OrgTreeReq request, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_ORG_TREE,obj2Json(request),callback);
    }

    /**
     * 组织树-添加(组织/部门/岗位)-添加组织（子单位）
     * @param request
     * @param callback
     */
    public static void doOrgObsAdd(OrgObsAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_CREATE_OBS,obj2Json(request),callback);
    }

    /**
     * 组织树-添加(组织/部门/岗位)-添加部门（组织下）
     * @param request
     * @param callback
     */
    public static void doOrgObsAdd(OrgObsAddOrgReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_CREATE_OBS,obj2Json(request),callback);
    }

    /**
     * 组织树-添加(组织/部门/岗位)-添加部门（部门下）
     * @param request
     * @param callback
     */
    public static void doOrgObsAdd(OrgObsAddDeptReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_CREATE_OBS,obj2Json(request),callback);
    }

    /**
     * 组织树-添加(组织/部门/岗位)-添加岗位
     * @param request
     * @param callback
     */
    public static void doOrgObsAdd(OrgObsAddJobReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_CREATE_OBS,obj2Json(request),callback);
    }

    /**
     * 组织树-组织(子单位)-修改
     * @param request
     * @param callback
     */
    public static void doOrgUpdate(OrgUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_UPDATE_ORG,obj2Json(request),callback);
    }

    /**
     * 组织树-组织(子单位)-删除
     * @param request
     * @param callback
     */
    public static void doOrgDel(OrgDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_DELETE_ORG,obj2Json(request),callback);
    }

    /**
     * 组织树-部门-修改
     * @param request
     * @param callback
     */
    public static void doDeptUpdate(DeptUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_UPDATE_DEPT,obj2Json(request),callback);
    }

    /**
     * 组织树-部门-修改
     * @param request
     * @param callback
     */
    public static void doDeptDel(DeptDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_DELETE_DEPT,obj2Json(request),callback);
    }

    /**
     * 组织树-岗位-修改
     * @param request
     * @param callback
     */
    public static void doJobUpdate(JobUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_UPDATE_JOB,obj2Json(request),callback);
    }

    /**
     * 组织树-岗位-删除
     * @param request
     * @param callback
     */
    public static void doJobDel(JobDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_DELETE_JOB,obj2Json(request),callback);
    }

    /**
     * 组织树-岗位-分配人员-列表
     * @param request
     * @param callback
     */
    public static void doAccountList(AccountListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_ACCOUNT_LIST,obj2Json(request),callback);
    }

    /**
     * 组织树-岗位-分配人员-保存
     * @param request
     * @param callback
     */
    public static void doAccountAdd(AccountAddReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_BATCH_CREATE_JOB_USER,obj2Json(request),callback);
    }

    /**
     * 组织树-岗位-分配权限模板-列表
     * @param request
     * @param callback
     */
    public static void doOrgJobList(OrgJobListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_AUTH_JOB_LIST,obj2Json(request),callback);
    }

    /**
     * 组织树-岗位-分配权限模板-保存
     * @param request
     * @param callback
     */
    public static void doOrgJobAdd(OrgJobAddReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_BATCH_CREATE_AUTH_JOB_RELA,obj2Json(request),callback);
    }

    /**
     * obs组织结构树-人员列表
     * @param request
     * @param callback
     */
    public static void doObsList(ObsListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_JOB_USER_LIST,obj2Json(request),callback);
    }

    /**
     * obs组织结构树-人员列表-删除
     * @param request
     * @param callback
     */
    public static void doObsUserDel(ObsUserDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_DELETE_JOB_USER,obj2Json(request),callback);
    }

    /**
     * obs组织结构树-权限清单
     * @param request
     * @param callback
     */
    public static void doObsRelaList(ObsRelaListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_AUTH_JOB_RELA_LIST,obj2Json(request),callback);
    }

    /**
     * obs组织结构树-权限清单-删除
     * @param request
     * @param callback
     */
    public static void doObsRelaDel(ObsRelaDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_DELETE_AUTH_JOB_RELA,obj2Json(request),callback);
    }

    /**
     * obs组织结构树-权限清单-资源数量（权限项列表）
     * @param request
     * @param callback
     */
    public static void doObsPowerList(ObsPowerListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_AUTH_OBJECT_RELA_LIST,obj2Json(request),callback);
    }

    /**
     * 获取岗位权限
     * @param request
     * @param callback
     */
    public static void doJobPowerList(JobPowerListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_OBJECT,obj2Json(request),callback);
    }

    /**
     * 组织-根据组织编码获取组织及所有下级组织
     * @param request
     * @param callback
     */
    public static void doOrgSubList(OrgSubListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_CURRENT_AND_SUB_ORG_LIST,obj2Json(request),callback);
    }

    /**
     * 组织-根据组织编码（支持多个）获取组织信息（列表）
     * @param request
     * @param callback
     */
    public static void doOrgMultiList(OrgMultiListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_ORG_LIST_BY_NOS,obj2Json(request),callback);
    }

    /**
     * 组织-根据组织编码获取组织及所有下级组织
     * @param request
     * @param callback
     */
    public static void doDeptSubList(DeptSubListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_CURRENT_AND_SUB_DEPT_LIST,obj2Json(request),callback);
    }

    /**
     * 部门-根据组织编码获取部门及所有下级部门
     * @param request
     * @param callback
     */
    public static void doSubDeptList(SubDeptListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_CURRENT_AND_SUB_DEPT_BY_NOS_LIST,obj2Json(request),callback);
    }

    /**
     * 组织-根据组织编码获取组织及所有下级组织
     * @param request
     * @param callback
     */
    public static void doDeptMultiList(DeptMultiListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_DEPT_LIST_BY_IDS,obj2Json(request),callback);
    }

    /**
     * 根据部门表字段参数获取所属组织信息（支持批量）
     * @param request
     * @param callback
     */
    public static void doBelongOrgList(BelongOrgListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_ORG_LIST_BY_DEPT,obj2Json(request),callback);
    }


    /*******************组织结构end********************************************************************************************/

    /*******************用户管理start********************************************************************************************/
    /*******************用户管理end********************************************************************************************/

    /*******************系统管理********************************************************************************************/
    /*******************系统管理end********************************************************************************************/

    /*******************资源管理start********************************************************************************************/
    /*******************资源管理end********************************************************************************************/

    /*******************配置管理start********************************************************************************************/
    /*******************配置管理end********************************************************************************************/

    /*******************接口服务start********************************************************************************************/

    /**
     * 获取服务分类结构树
     * @param request
     * @param callback
     */
    public static void doServiceTree(ServiceTreeReq request, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_GET_TREE,obj2Json(request),callback);
    }

    /**
     * 添加分类
     * @param request
     * @param callback
     */
    public static void doSortCreate(SortCreateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_SORT_ADD,obj2Json(request),callback);
    }

    /**
     * 更新分类
     * @param request
     * @param callback
     */
    public static void doSortUpdate(SortUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_SORT_UPDATE,obj2Json(request),callback);
    }

    /**
     * 删除分类
     * @param request
     * @param callback
     */
    public static void doSortDel(SortDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_SORT_DELETE,obj2Json(request),callback);
    }

    /**
     * 获取接口列表
     * @param request
     * @param callback
     */
    public static void doServiceList(ServiceListReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_GET_LIST,obj2Json(request),callback);
    }

    /**
     * 发布接口
     * @param request
     * @param callback
     */
    public static void doApiCreate(ApiCreateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_API_CREATE,obj2Json(request),callback);
    }

    /**
     * 修改接口
     * @param request
     * @param callback
     */
    public static void doApiUpdate(ApiUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_API_UPDATE,obj2Json(request),callback);
    }

    /**
     * 删除分类
     * @param request
     * @param callback
     */
    public static void doApiDel(ApiDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_API_DELETE,obj2Json(request),callback);
    }

    /**
     * 获取接口调用日志
     * @param request
     * @param callback
     */
    public static void doApiLog(ApiLogReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_GET_API_LOG_LIST,obj2Json(request),callback);
    }

    /**
     * 重置授权码
     * @param request
     * @param callback
     */
    public static void doResetAuthCode(AuthCodeReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_GET_API_LOG_LIST,obj2Json(request),callback);
    }
    /*******************接口服务end********************************************************************************************/



    /*******************注册相关start********************************************************************************************/
    /*******************注册相关end********************************************************************************************/

    /**-------------**************大屏数据start********************************************************************************************/
    /*******************大屏数据end********************************************************************************************/

    /*******************通用实体start********************************************************************************************/

    /**
     * 获取数据
     * @param entityListReq
     * @param callback
     */
    public static void doEntityList(EntityListReq entityListReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ENTITY_LIST,obj2Json(entityListReq),callback);
    }

    /**
     * 新增数据
     * @param entityListReq
     * @param callback
     */
    public static void doEntityAdd(EntityAddReq entityListReq, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ENTITY_ADD,obj2Json(entityListReq),callback);
    }

    /**
     * 修改数据
     * @param entityListReq
     * @param callback
     */
    public static void doEntityUpdate(EntityUpdateReq entityListReq, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ENTITY_UPDATE,obj2Json(entityListReq),callback);
    }

    /**
     * 删除数据
     * @param entityListReq
     * @param callback
     */
    public static void doEntityDel(EntityDelReq entityListReq, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ENTITY_DELETE,obj2Json(entityListReq),callback);
    }

    /**
     * 新增业务日志
     * @param logAddReq
     * @param callback
     */
    public static void doLogAdd(LogAddReq logAddReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ENTITY_LOG_ADD,obj2Json(logAddReq),callback);
    }

    /**
     * 获取业务日志
     * @param logListReq
     * @param callback
     */
    public static void doLogList(LogListReq logListReq, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ENTITY_LOG_LIST,obj2Json(logListReq),callback);
    }


    /*******************通用实体end********************************************************************************************/



    private static Handler sHandler;

    public static Handler getMainHandler() {
        synchronized (PlatformClient.class) {
            if (sHandler == null) {
                sHandler = new InnerHander(Looper.getMainLooper());
            }
            return sHandler;
        }
    }

    public static class InnerHander extends Handler{

        InnerHander(Looper mainLooper) {
            super(mainLooper);
        }

        @Override
        public void handleMessage(Message msg) {
            DataResult dataResult = (DataResult) msg.obj;
            switch (msg.what){
                case MESSAGE_SUCCESS:{
                    dataResult.mCallback.onSuccess(dataResult.t);
                    break;
                }
                case MESSAGE_FAILURE:
                    dataResult.mCallback.onFailed(dataResult.msg);
                    break;
            }
        }
    }

    public static class DataResult<T>{
        final T t;
        final PlatformCallback<T> mCallback;
        String msg;
        int type;

        public DataResult(T t, PlatformCallback<T> callback) {
            this.t = t;
            this.mCallback = callback;
        }

        DataResult(T t, PlatformCallback<T> callback, String msg, int type) {
            this.t = t;
            mCallback = callback;
            this.msg = msg;
            this.type = type;
        }
    }

    private static String obj2Json(Object o){
        return new Gson().toJson(o);
    }

    private static String list2Json(List<Object> list){
        JSONArray jsonArray = new JSONArray(list);
        return jsonArray.toString();
    }

}