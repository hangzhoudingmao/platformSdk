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
import com.dingmao.platformsdk.callback.PlatformDownloadCallback;
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
import com.dingmao.platformsdk.configurationmanagement.CategTreeReq;
import com.dingmao.platformsdk.configurationmanagement.CodeAddReq;
import com.dingmao.platformsdk.configurationmanagement.CodeDelReq;
import com.dingmao.platformsdk.configurationmanagement.CodeListReq;
import com.dingmao.platformsdk.configurationmanagement.CodeMultiListReq;
import com.dingmao.platformsdk.configurationmanagement.CodeSortAddReq;
import com.dingmao.platformsdk.configurationmanagement.CodeSortDelReq;
import com.dingmao.platformsdk.configurationmanagement.CodeSortUpdateReq;
import com.dingmao.platformsdk.configurationmanagement.CodeUpdateReq;
import com.dingmao.platformsdk.configurationmanagement.ParaAddReq;
import com.dingmao.platformsdk.configurationmanagement.ParaDelReq;
import com.dingmao.platformsdk.configurationmanagement.ParaSortAddReq;
import com.dingmao.platformsdk.configurationmanagement.ParaSortDelReq;
import com.dingmao.platformsdk.configurationmanagement.ParaListReq;
import com.dingmao.platformsdk.configurationmanagement.ParaReq;
import com.dingmao.platformsdk.configurationmanagement.ParaSortTreeReq;
import com.dingmao.platformsdk.configurationmanagement.ParaSortUpdateReq;
import com.dingmao.platformsdk.configurationmanagement.ParaUpdateReq;
import com.dingmao.platformsdk.http.HttpUtils;
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
import com.dingmao.platformsdk.internal.util.StringUtils;
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
import com.dingmao.platformsdk.registrationrelated.CodeRegReq;
import com.dingmao.platformsdk.registrationrelated.CompAuditReq;
import com.dingmao.platformsdk.registrationrelated.CompDetailReq;
import com.dingmao.platformsdk.registrationrelated.PwdRegReq;
import com.dingmao.platformsdk.registrationrelated.RegAddReq;
import com.dingmao.platformsdk.registrationrelated.RegDetailReq;
import com.dingmao.platformsdk.registrationrelated.RegListReq;
import com.dingmao.platformsdk.registrationrelated.RegReq;
import com.dingmao.platformsdk.registrationrelated.RegUpdateReq;
import com.dingmao.platformsdk.registrationrelated.SaveInfoReq;
import com.dingmao.platformsdk.registrationrelated.ScreenDataReq;
import com.dingmao.platformsdk.registrationrelated.SendCodeReq;
import com.dingmao.platformsdk.registrationrelated.UserAuditReq;
import com.dingmao.platformsdk.registrationrelated.VerifyCodeReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthAddReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthDelReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthListReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthTempAddReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthTempDelReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthTempListReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthTempUpdateReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthUpdateReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuAddReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuCateAddReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuCateDelReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuCateUpdateReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuDelReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuListReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuTreeReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuUpdateReq;
import com.dingmao.platformsdk.resourcesmanagement.ResSortAddReq;
import com.dingmao.platformsdk.resourcesmanagement.ResSortDelReq;
import com.dingmao.platformsdk.resourcesmanagement.ResSortTreeReq;
import com.dingmao.platformsdk.resourcesmanagement.ResSortUpdateReq;
import com.dingmao.platformsdk.resourcesmanagement.TempAuthAssignReq;
import com.dingmao.platformsdk.resourcesmanagement.TempAuthDelReq;
import com.dingmao.platformsdk.resourcesmanagement.TempAuthListReq;
import com.dingmao.platformsdk.screendata.ScreenWriteDataReq;
import com.dingmao.platformsdk.systemmanagement.BasicConfigReq;
import com.dingmao.platformsdk.systemmanagement.CheckUpdateReq;
import com.dingmao.platformsdk.systemmanagement.SysAuthReq;
import com.dingmao.platformsdk.systemmanagement.SysDelVerReq;
import com.dingmao.platformsdk.systemmanagement.SysLogReq;
import com.dingmao.platformsdk.systemmanagement.SysPubVerReq;
import com.dingmao.platformsdk.systemmanagement.SysUpdateReq;
import com.dingmao.platformsdk.systemmanagement.SysUpdateVerReq;
import com.dingmao.platformsdk.systemmanagement.SysVersionReq;
import com.dingmao.platformsdk.systemresources.SourceAddReq;
import com.dingmao.platformsdk.systemresources.SourceDataReq;
import com.dingmao.platformsdk.systemresources.SourceListReq;
import com.dingmao.platformsdk.systemresources.SourceSortAddReq;
import com.dingmao.platformsdk.systemresources.SourceSortDelReq;
import com.dingmao.platformsdk.systemresources.SourceSortUpdateReq;
import com.dingmao.platformsdk.systemresources.SourceUpdateReq;
import com.dingmao.platformsdk.usermanagement.AssignAuthReq;
import com.dingmao.platformsdk.usermanagement.CompJobListReq;
import com.dingmao.platformsdk.usermanagement.CompUserListReq;
import com.dingmao.platformsdk.usermanagement.JobAddReq;
import com.dingmao.platformsdk.usermanagement.ResetCodeReq;
import com.dingmao.platformsdk.usermanagement.ResetPwdReq;
import com.dingmao.platformsdk.usermanagement.UserAddReq;
import com.dingmao.platformsdk.usermanagement.UserAuthReq;
import com.dingmao.platformsdk.usermanagement.UserDelReq;
import com.dingmao.platformsdk.usermanagement.UserDetailReq;
import com.dingmao.platformsdk.usermanagement.UserImprtReq;
import com.dingmao.platformsdk.usermanagement.UserJobDelReq;
import com.dingmao.platformsdk.usermanagement.UserJobListReq;
import com.dingmao.platformsdk.usermanagement.UserListReq;
import com.dingmao.platformsdk.usermanagement.UserMenuReq;
import com.dingmao.platformsdk.usermanagement.UserMultiListReq;
import com.dingmao.platformsdk.usermanagement.UserStateReq;
import com.dingmao.platformsdk.usermanagement.UserUpdateReq;
import com.google.gson.Gson;

import org.json.JSONArray;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public static void doUploadFile(Map<String,String> map, File file,String fileKey,PlatformCallback callback){
        OkHttpUtils.getInstance().doPostFile(ApiConstant.UPLOAD_FILE,map,file,fileKey,callback);
    }

    /**
     * 导出权限项、菜单、标准码表数据SQL脚本
     * @param dataRequest
     * @param callback
     */
    public static void doExportTable(TableDataRequest dataRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.DUMP_TABLE_DATA, obj2Json(dataRequest),callback,StringUtils.ObjNotNull(dataRequest));
    }

    /**
     * 获取文件列表
     */
    public static void doFileList(FileListRequest fileListRequest, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_FILE_LIST, obj2Json(fileListRequest),callback);
    }


    /**
     * 删除文件
     */
    public static void doDeleteFile(FileDeleteRequest request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.DELETE_FILE, obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 上传日志
     */
    public static void doUploadLog(List list,PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.UPLOAD_LOG, list2Json(list),callback);
    }

    /**
     * 发送短信
     */

    public static void doSendMsg(SendMsgRequest request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SEND_SMS,obj2Json(request),callback);
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
    public static void doSmsList(SmsListRequest request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_SMS_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 短信模版创建
     * @param request
     * @param callback
     */
    public static void doSmsTempCreate(SmsTempCreateRequest request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CREATE_SMS_TEMPLATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
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
        OkHttpUtils.getInstance().doPost(ApiConstant.SEND_VALIDCODE,obj2Json(sendCodeRequest),callback,StringUtils.ObjNotNull(sendCodeRequest));
    }

    /**
     * 校验验证码
     * @param mCheckCodeRequest
     * @param callback
     */
    public static void doCheckCode(CheckCodeRequest mCheckCodeRequest, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SMS_VALIDCODE,obj2Json(mCheckCodeRequest),callback,StringUtils.ObjNotNull(mCheckCodeRequest));
    }

    /**
     * 获取区域树
     * @param areaTreeRequest
     * @param callback
     */
    public static void doAreaTree(AreaTreeRequest areaTreeRequest, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_AREA_TREE,obj2Json(areaTreeRequest),callback);
    }

    /**
     * 区域-下拉框-省列表
     * @param mAreaBoxProRequest
     * @param callback
     */
    public static void doProvince(BoxProvinceRequest mAreaBoxProRequest, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_AREA_BOX_LIST,obj2Json(mAreaBoxProRequest),callback,StringUtils.ObjNotNull(mAreaBoxProRequest));
    }

    /**
     * 区域-下拉框-市列表
     * @param boxCityRequest
     * @param callback
     */
    public static void doCity(BoxCityRequest boxCityRequest, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_AREA_BOX_LIST,obj2Json(boxCityRequest),callback,StringUtils.ObjNotNull(boxCityRequest));
    }

    /**
     * 区域-下拉框-区列表
     * @param boxAreaRequest
     * @param callback
     */
    public static void doArea(BoxAreaRequest boxAreaRequest, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_AREA_BOX_LIST,obj2Json(boxAreaRequest),callback,StringUtils.ObjNotNull(boxAreaRequest));
    }

    /**
     * 区域-下拉框-街道列表
     * @param boxStreeRequest
     * @param callback
     */
    public static void doStree(BoxStreeRequest boxStreeRequest, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_AREA_BOX_LIST,obj2Json(boxStreeRequest),callback,StringUtils.ObjNotNull(boxStreeRequest));
    }

    public static void doOSS(PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.GET_THIRD_APP_DETAIL,"",callback);
    }
    /****基础服务end********************************************************************************************/



    /*****编码规则管理start********************************************************************************************/

    /**
     * 编码规则分解-树
     * @param callback
     */
    public static void doCodeRuleResolve(PlatformCallback callback){
        doCodeRuleResolve(null,callback);
    }

    public static void doCodeRuleResolve(CodeRuleResolveReq codeRuleResolveReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_LIST,obj2Json(codeRuleResolveReq),callback);
    }

    /**
     * 编码规则分解-添加
     * @param codeRuleAddReq
     * @param callback
     */
    public static void doCodeRuleAdd(CodeRuleAddReq codeRuleAddReq, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(codeRuleAddReq),callback,StringUtils.ObjNotNull(codeRuleAddReq));
    }

    /**
     * 编码规则分解-修改
     * @param codeRuleUpdateReq
     * @param callback
     */
    public static void doCodeRuleUpdate(CodeRuleUpdateReq codeRuleUpdateReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_UPDATE,obj2Json(codeRuleUpdateReq),callback,StringUtils.ObjNotNull(codeRuleUpdateReq));
    }

    /**
     * 编码规则分解-删除
     * @param codeRuledelReq
     * @param callback
     */
    public static void doCodeRuleDel(CodeRuledelReq codeRuledelReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_DELETE,obj2Json(codeRuledelReq),callback,StringUtils.ObjNotNull(codeRuledelReq));
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
        OkHttpUtils.getInstance().doPost(ApiConstant.SOURCE_CLASSIFICATION_LIST,"",callback);
    }

    /**
     * 系统资源--分类添加
     * @param callback
     */
    public static void doSourceSortAdd(SourceSortAddReq sourceSortAddReq,PlatformStringCallback callback){
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
    public static void doValidKey(ValidKeyReq validKeyReq,PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.VALID_KEY,obj2Json(validKeyReq),callback,StringUtils.ObjNotNull(validKeyReq));
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
     * @param request
     * @param callback
     */
    public static void doLogin(LoginByCodeReq request, PlatformCallback callback){
        AccessManagement.doLoginByCode(request,callback);
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
    public static void doValidToken(ValidTokenReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.VALID_TOKEN,obj2Json(request),callback);
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
     * @param request
     * @param callback
     */
    public static void doTransToken(TranslateTokenReq request,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.TRANSLATE_TOKEN,obj2Json(request),callback);
    }

    /**
     * 通用权限验证
     * @param request
     * @param callback
     */
    public static void doCheckPower(CheckPowerReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.VALID_POWER,obj2Json(request),callback);
    }

    /**
     * 模拟登录
     * @param request
     * @param callback
     */
    public static void doLogin(SimulateLoginReq request,PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SIMULATE_LOGIN,obj2Json(request),callback);
    }

    /**
     * 设备接入判定
     * @param request
     * @param callback
     */
    public static void doEquipCheck(EquipCheckReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.EQUIPMENT_USABLE,obj2Json(request),callback, StringUtils.ObjNotNull(request));
    }

    /**
     * 设备备案
     * @param request
     * @param callback
     */
    public static void doEquipCreate(EquipCreateReq request, PlatformCallback callback){
        Log.e("equipCreateReq===",obj2Json(request));
        OkHttpUtils.getInstance().doPost(ApiConstant.EQUIPMENT_CREATE,obj2Json(request),callback);
    }
    /*******************接入管理end********************************************************************************************/



    /*******************组织结构start********************************************************************************************/

    /**
     * 通过名称反查组织信息
     * @param request
     * @param callback
     */
    public static void doOrgDept(OrgCompDeptReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_COMPANYDEPT,obj2Json(request),callback);
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
    public static void doOrgCompExist(OrgCompDeptMultiReq request, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_CHECK_COMPANY_EXISTS,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 编辑单位信息
     * @param request
     * @param callback
     */
    public static void doOrgCompUpdate(OrgCompUpdateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_UPDATE_COMPANY,obj2Json(request),callback,StringUtils.ObjNotNull(request));
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
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
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
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_DELETE_JOB,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 组织树-岗位-分配人员-列表
     * @param request
     * @param callback
     */
    public static void doAccountList(AccountListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_ACCOUNT_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 组织树-岗位-分配人员-保存
     * @param request
     * @param callback
     */
    public static void doAccountAdd(AccountAddReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_BATCH_CREATE_JOB_USER,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 组织树-岗位-分配权限模板-列表
     * @param request
     * @param callback
     */
    public static void doOrgJobList(OrgJobListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_AUTH_JOB_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 组织树-岗位-分配权限模板-保存
     * @param request
     * @param callback
     */
    public static void doOrgJobAdd(OrgJobAddReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_BATCH_CREATE_AUTH_JOB_RELA,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * obs组织结构树-人员列表
     * @param request
     * @param callback
     */
    public static void doObsList(ObsListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_JOB_USER_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * obs组织结构树-人员列表-删除
     * @param request
     * @param callback
     */
    public static void doObsUserDel(ObsUserDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_DELETE_JOB_USER,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * obs组织结构树-权限清单
     * @param request
     * @param callback
     */
    public static void doObsRelaList(ObsRelaListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_AUTH_JOB_RELA_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * obs组织结构树-权限清单-删除
     * @param request
     * @param callback
     */
    public static void doObsRelaDel(ObsRelaDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_DELETE_AUTH_JOB_RELA,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * obs组织结构树-权限清单-资源数量（权限项列表）
     * @param request
     * @param callback
     */
    public static void doObsPowerList(ObsPowerListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_AUTH_OBJECT_RELA_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取岗位权限
     * @param request
     * @param callback
     */
    public static void doJobPowerList(JobPowerListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_OBJECT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 组织-根据组织编码获取组织及所有下级组织
     * @param request
     * @param callback
     */
    public static void doOrgSubList(OrgSubListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_CURRENT_AND_SUB_ORG_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 组织-根据组织编码（支持多个）获取组织信息（列表）
     * @param request
     * @param callback
     */
    public static void doOrgMultiList(OrgMultiListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_ORG_LIST_BY_NOS,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 组织-根据组织编码获取组织及所有下级组织
     * @param request
     * @param callback
     */
    public static void doDeptSubList(DeptSubListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_CURRENT_AND_SUB_DEPT_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 部门-根据组织编码获取部门及所有下级部门
     * @param request
     * @param callback
     */
    public static void doSubDeptList(SubDeptListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_CURRENT_AND_SUB_DEPT_BY_NOS_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 组织-根据组织编码获取组织及所有下级组织
     * @param request
     * @param callback
     */
    public static void doDeptMultiList(DeptMultiListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_DEPT_LIST_BY_IDS,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 根据部门表字段参数获取所属组织信息（支持批量）
     * @param request
     * @param callback
     */
    public static void doBelongOrgList(BelongOrgListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.ORG_GET_ORG_LIST_BY_DEPT,obj2Json(request),callback);
    }

    /**
     * 根据部门表字段参数获取所属组织信息（支持批量）
     * @param callback
     */
    public static void doBelongOrgList(PlatformCallback callback){
        doBelongOrgList(null,callback);
    }
    /*******************组织结构end********************************************************************************************/



    /*******************用户管理start********************************************************************************************/

    /**
     * 新增用户
     * @param request
     * @param callback
     */
    public static void doUserAdd(UserAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_ADD,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除用户与岗位关系
     * @param request
     * @param callback
     */
    public static void doUserJobDel(UserJobDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_JOB_DELETE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 根据单位id获取本单位下用户列表
     * @param request
     * @param callback
     */
    public static void doCompUserList(CompUserListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_LIST_BY_COMPANY,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除用户与岗位关系
     * @param request
     * @param callback
     */
    public static void doUserDel(UserDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_DELETE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 根据单位id获取岗位列表
     * @param request
     * @param callback
     */
    public static void doUserJobByComp(CompJobListReq request, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_JOB_LIST_BY_COMPANY,obj2Json(request),callback);
    }

    public static void doUserJobByComp(PlatformListCallback callback){
        doUserJobByComp(null,callback);
    }

    /**
     * 导入用户模板下载
     * @param map
     * @param path
     * @param callback
     */
    public static void doUserTempDown(Map<String,String> map,String path, PlatformDownloadCallback callback){
        OkHttpUtils.getInstance().doDownloadFile(ApiConstant.USER_DOWNLOAD,map,path,callback);
    }

    public static void doImptByExcel(Map<String,String> map,File file,String fileKey,PlatformCallback callback){
        OkHttpUtils.getInstance().doPostFile(ApiConstant.USER_IMPORT_EXCEL,map,file,fileKey,callback);
    }

    /**
     * 批量导入用户（通过json）
     * @param request
     * @param callback
     */
    public static void doUserImprt(List<UserImprtReq> request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_IMPORT_JSON,list2Json(request),callback);
    }

    /**
     * 根据用户id获取岗位列表
     * @param request
     * @param callback
     */
    public static void doUserJobByUser(UserJobListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_JOB_LIST_BY_USER,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 调整用户岗位
     * @param request
     * @param callback
     */
    public static void doJobAdd(JobAddReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_JOB_ADD,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 禁用/恢复 用户
     * @param request
     * @param callback
     */
    public static void doUserState(UserStateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_STATUS_UPDATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 重置用户密码-旧密码
     * @param request
     * @param callback
     */
    public static void doResetPwd(ResetPwdReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_RESET_PWD_BY_PWD,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 重置密码-验证码
     * @param request
     * @param callback
     */
    public static void doResetPwdByCode(ResetCodeReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_RESET_PWD_BY_CODE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取用户列表
     * @param request
     * @param callback
     */
    public static void doUserList(UserListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 根据部门/岗位/用户id集合获取用户列表（支持单/多个）
     * @param request
     * @param callback
     */
    public static void doUserMultiList(UserMultiListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_LIST_BY_MULTI,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取用户菜单
     * @param request
     * @param callback
     */
    public static void doUserMenu(UserMenuReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_GET_MENU,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取用户权限
     * @param request
     * @param callback
     */
    public static void doUserAuth(UserAuthReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_GET_AUTHS,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 分配用户权限
     * @param request
     * @param callback
     */
    public static void doAssignAuth(AssignAuthReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_ASSIGN_OBJECT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取用户详情
     * @param request
     * @param callback
     */
    public static void doUserDetail(UserDetailReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_GET_DETAIL,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改个人信息
     * @param request
     * @param callback
     */
    public static void doUserUpdate(UserUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.USER_EDIT_USER,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }
    /*******************用户管理end********************************************************************************************/




    /*******************系统管理********************************************************************************************/

    /**
     * 获取系统信息
     * @param callback
     */
    public static void doSysInfo(PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SYSTEM_GET_INFO,"",callback);
    }

    /**
     * 修改系统信息
     * @param callback
     */
    public static void doSysUpdate(SysUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SYSTEM_EDIT_INFO,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 系统-单位/账号授权子系统列表
     * @param callback
     */
    public static void doSysAuth(Map<String,String> map, PlatformCallback callback){
        OkHttpUtils.getInstance().doGet(ApiConstant.SYSTEM_GET_AUTH_SYS_LIST,map,callback);
    }

    /**
     * 获取系统日志
     * @param callback
     */
    public static void doSysLog(SysLogReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SYSTEM_GET_LOG,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取系统版本
     * @param callback
     */
    public static void doSysVersion(SysVersionReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SYSTEM_GET_VERSION,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 发布版本
     * @param callback
     */
    public static void doSysPubVer(SysPubVerReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SYSTEM_PUBLISH_VERSION,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 编辑版本
     * @param callback
     */
    public static void doSysUpdateVer(SysUpdateVerReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SYSTEM_UPDATE_VERSION,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除版本
     * @param callback
     */
    public static void doSysDelVer(SysDelVerReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SYSTEM_DELETE_VERSION,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 检查版本是否需要更新
     * @param request
     * @param callback
     */
    public static void doCheckUpdate(CheckUpdateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SYSTEM_CHECK_VERSION,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 下载安装包
     * @param map
     * @param path
     * @param callback
     */
    public static void doDownloadApk(Map<String, String> map, String path, PlatformDownloadCallback callback){
        OkHttpUtils.getInstance().doDownloadFile(ApiConstant.SYSTEM_DOWNLOAD_LAST_VERSION,map,path,callback);
    }

    public static void doBasicConfig(BasicConfigReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SYSTEM_GET_SITE_CONFIG_DETAIL,obj2Json(request),callback);
    }

    /*******************系统管理end********************************************************************************************/

    public static <T> void doPost(String url,Object o,PlatformCallback<T> callback){
        OkHttpUtils.getInstance().doPost(url,obj2Json(o),callback);
    }

    /*******************资源管理start********************************************************************************************/

    /**
     * 获取权限项分类树
     * @param request
     * @param callback
     */
    public static void doResTree(ResSortTreeReq request, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_SORT_TREE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 新增权限项分类
     * @param request
     * @param callback
     */
    public static void doResSortAdd(ResSortAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_CREATE_OBJECT_CATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改权限项分类树
     * @param request
     * @param callback
     */
    public static void doResSortUpdate(ResSortUpdateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_UPDATE_OBJECT_CATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除权限项分类树
     * @param request
     * @param callback
     */
    public static void doResSortDel(ResSortDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_DELETE_OBJECT_CATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取权限列表
     * @param request
     * @param callback
     */
    public static void doAuthList(AuthListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_AUTH_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 添加权限项
     * @param request
     * @param callback
     */
    public static void doAuthAdd(AuthAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_CREATE_OBJECT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改权限项
     * @param request
     * @param callback
     */
    public static void doAuthUpdate(AuthUpdateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_UPDATE_OBJECT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除权限项
     * @param request
     * @param callback
     */
    public static void doAuthDel(AuthDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_DELETE_OBJECT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }


    /**
     * 获取菜单列表
     * @param request
     * @param callback
     */
    public static void doMenuList(MenuListReq request, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_MENU_LIST,obj2Json(request),callback);
    }

    public static void doMenuList(PlatformListCallback callback){
        doMenuList(null,callback);
    }

    /**
     * 新增菜单
     * @param request
     * @param callback
     */
    public static void doMenuAdd(MenuAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_CREATE_MENU,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改菜单
     * @param request
     * @param callback
     */
    public static void doMenuUpdate(MenuUpdateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_UPDATE_MENU,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除菜单
     * @param request
     * @param callback
     */
    public static void doMenuDel(MenuDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_DELETE_MENU,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取菜单目录树
     * @param request
     * @param callback
     */
    public static void doMenuTree(MenuTreeReq request, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_MENU_TREE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 新增菜单目录
     * @param request
     * @param callback
     */
    public static void doMenuCateAdd(MenuCateAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_CREATE_MENU_CATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改菜单目录
     * @param request
     * @param callback
     */
    public static void doMenuCateUpdate(MenuCateUpdateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_UPDATE_MENU_CATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除菜单目录
     * @param request
     * @param callback
     */
    public static void doMenuCateDel(MenuCateDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_DELETE_MENU_CATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取权限模板列表
     * @param request
     * @param callback
     */
    public static void doAuthTempList(AuthTempListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_TEMPLATE_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 添加权限模板
     * @param request
     * @param callback
     */
    public static void doAuthTempAdd(AuthTempAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_TEMPLATE_CREATE_TPL,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改权限模板
     * @param request
     * @param callback
     */
    public static void doAuthTempUpdate(AuthTempUpdateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_TEMPLATE_UPDATE_TPL,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除权限模板
     * @param request
     * @param callback
     */
    public static void doAuthTempDel(AuthTempDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_TEMPLATE_DELETE_TPL,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取权限模板权限集合
     * @param request
     * @param callback
     */
    public static void doTempAuthList(TempAuthListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_TEMPLATE_TPL_OBJECTS,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除权限模板权限
     * @param request
     * @param callback
     */
    public static void doTempAuthDel(TempAuthDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_TEMPLATE_DELETE_TPL_OBJECT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 分配权限模板权限
     * @param request
     * @param callback
     */
    public static void doTempAuthList(TempAuthAssignReq request, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.RESOURCE_TEMPLATE_CREATE_TPL_OBJECT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }
    /*******************资源管理end********************************************************************************************/




    /*******************配置管理start********************************************************************************************/

    /**
     * 获取标准码分类结构树
     * @param callback
     */
    public static void doCodeSortTree(PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_GET_DIR_TREE,"",callback);
    }

    /**
     * 新增标准代码分类
     * @param request
     * @param callback
     */
    public static void doCodeSortAdd(CodeSortAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_ADD_CODE_SORT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改标准代码分类
     * @param request
     * @param callback
     */
    public static void doCodeSortUpdate(CodeSortUpdateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_EDIT_CODE_SORT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除标准代码分类
     * @param request
     * @param callback
     */
    public static void doCodeSortDel(CodeSortDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_DELETE_CODE_SORT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取代码值列表
     * @param callback
     */
    public static void doCodeList(CodeListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_GET_CODELIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取代码值列表(多个)
     * @param callback
     */
    public static void doCodeMultiList(CodeMultiListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_GET_CODES_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 新增代码值
     * @param request
     * @param callback
     */
    public static void doCodeAdd(CodeAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_ADD_CODES,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改代码值
     * @param request
     * @param callback
     */
    public static void doCodeUpdate(CodeUpdateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_EDIT_CODE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除代码值
     * @param request
     * @param callback
     */
    public static void doCodeDel(CodeDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_DELETE_CODE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取标准码分类结构树
     * @param callback
     */
    public static void doParaSortTree(ParaSortTreeReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_GET_TREE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 新增参数分类
     * @param request
     * @param callback
     */
    public static void doParaSortAdd(ParaSortAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_ADD_PARA_SORT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改参数分类
     * @param request
     * @param callback
     */
    public static void doParaSortUpdate(ParaSortUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_EDIT_PARA_SORT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除参数分类
     * @param request
     * @param callback
     */
    public static void doParaSortDel(ParaSortDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_DELETE_PARA_SORT,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取参数列表
     * @param callback
     */
    public static void doParaList(ParaListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_GET_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取参数值
     * @param callback
     */
    public static void doPara(Map<String,String> map, PlatformCallback callback){
        OkHttpUtils.getInstance().doGet(ApiConstant.CONFIG_GET_PARA,map,callback);
    }

    /**
     * 新增参数分类
     * @param request
     * @param callback
     */
    public static void doParaAdd(ParaAddReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_ADD_PARA,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改参数分类
     * @param request
     * @param callback
     */
    public static void doParaUpdate(ParaUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_EDIT_PARA,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除参数分类
     * @param request
     * @param callback
     */
    public static void doParaDel(ParaDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_DELETE_PARA,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取通用分类结构树
     * @param request
     * @param callback
     */
    public static void doCategTree(CategTreeReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CONFIG_GET_CATEG_TREE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /*******************配置管理end********************************************************************************************/




    /*******************接口服务start********************************************************************************************/
    /**
     * 获取服务分类结构树
     * @param request
     * @param callback
     */
    public static void doServiceTree(ServiceTreeReq request, PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_GET_TREE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 添加分类
     * @param request
     * @param callback
     */
    public static void doSortCreate(SortCreateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_SORT_ADD,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 更新分类
     * @param request
     * @param callback
     */
    public static void doSortUpdate(SortUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_SORT_UPDATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除分类
     * @param request
     * @param callback
     */
    public static void doSortDel(SortDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_SORT_DELETE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取接口列表
     * @param request
     * @param callback
     */
    public static void doServiceList(ServiceListReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_GET_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 发布接口
     * @param request
     * @param callback
     */
    public static void doApiCreate(ApiCreateReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_API_CREATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 修改接口
     * @param request
     * @param callback
     */
    public static void doApiUpdate(ApiUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_API_UPDATE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 删除分类
     * @param request
     * @param callback
     */
    public static void doApiDel(ApiDelReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_API_DELETE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 获取接口调用日志
     * @param request
     * @param callback
     */
    public static void doApiLog(ApiLogReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_GET_API_LOG_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 重置授权码
     * @param request
     * @param callback
     */
    public static void doResetAuthCode(AuthCodeReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SERVICE_RESET_AUTHCODE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }
    /*******************接口服务end********************************************************************************************/





    /*******************注册相关start********************************************************************************************/

    /**
     * 登录前获取验证码（注册、修改密码等）
     * @param request
     * @param callback
     */
    public static void doVerifyCode(VerifyCodeReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_CREATE_VALIDATE_CODE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 登录前获取验证码（注册、修改密码等）
     * @param request
     * @param callback
     */
    public static void doSendCode(SendCodeReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_SEND_VALIDATE_CODE,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * （验证码）直接注册帐号-无需token
     * @param request
     * @param callback
     */
    public static void doCodeReg(CodeRegReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_USER_REGISTER,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * （密码）直接注册帐号-无需token
     * @param request
     * @param callback
     */
    public static void doPwdReg(PwdRegReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_USER_REGISTER_PWD,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 注册
     * @param request
     * @param callback
     */
    public static void doReg(RegReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 登录前获取验证码（注册、修改密码等）
     * @param request
     * @param callback
     */
    public static void doRegAdd(RegAddReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_CREATE_USER_REG,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 完善资料
     * @param request
     * @param callback
     */
    public static void doSaveInfo(SaveInfoReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_SAVE_FILL_REGISTER_INFO,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 完善资料
     * @param request
     * @param callback
     */
    public static void doRegList(RegListReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_GET_USER_REG_LIST,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 注册用户-详情
     * @param request
     * @param callback
     */
    public static void doRegDetail(RegDetailReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_GET_USER_REG_DETAIL,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 单位入驻-详情
     * @param request
     * @param callback
     */
    public static void doCompDetail(CompDetailReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_GET_COMPANY_APPLY_DETAIL,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 注册用户-修改（审核是否通过）
     * @param request
     * @param callback
     */
    public static void doRegUpdate(RegUpdateReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_UPDATE_USER_REG,obj2Json(request),callback);
    }

    /**
     * 单位入驻-审核
     * @param request
     * @param callback
     */
    public static void doCompAudit(CompAuditReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_AUDIT_UPDATE_COMPANY_APPLY,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 注册用户审核--普通用户审核是否通过
     * @param request
     * @param callback
     */
    public static void doUserAudit(UserAuditReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_UPDATE_USER_REG_STAFF,obj2Json(request),callback,StringUtils.ObjNotNull(request));
    }

    /**
     * 审核记录
     * @param callback
     */
    public static void doAuditList(PlatformListCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.REGISTER_GET_USER_REG_AUDIT_LIST,"",callback);
    }

    /*******************注册相关end********************************************************************************************/




    /****************大屏数据start********************************************************************************************/

    /**
     * 大屏--获取数据
     * @param request
     * @param callback
     */
    public static void doGetScreenData(ScreenDataReq request, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SCREEN_GET_INDEX_DATA_LIST,obj2Json(request),callback);
    }

    /**
     * 大屏数据--数据写入
     * @param request
     * @param callback
     */
    public static void doPostScreenData(ScreenWriteDataReq request, PlatformStringCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.SCREEN_CREATE_DATA,obj2Json(request),callback);
    }

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

    private static <T> String list2Json(List<T> list){
        return new Gson().toJson(list);
//        JSONArray jsonArray = new JSONArray(list);
//        return jsonArray.toString();
    }

}