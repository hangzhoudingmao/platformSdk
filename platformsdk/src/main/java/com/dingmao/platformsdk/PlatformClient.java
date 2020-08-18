package com.dingmao.platformsdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

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
import com.dingmao.platformsdk.login.LoginRequest;
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
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(codeRuleUpdateReq),callback);
    }

    /**
     * 编码规则分解-删除
     * @param codeRuledelReq
     * @param callback
     */
    public static void doCodeRuleDel(CodeRuledelReq codeRuledelReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(codeRuledelReq),callback);
    }

    /**
     * 规则分类-规则段-添加
     * @param ruleAddReq
     * @param callback
     */
    public static void doRuleAdd(RuleAddReq ruleAddReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(ruleAddReq),callback);
    }
    /**
     * 规则分类-规则段-编辑
     * @param ruleUpdateReq
     * @param callback
     */
    public static void doRuleUpdate(RuleUpdateReq ruleUpdateReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(ruleUpdateReq),callback);
    }
    /**
     * 规则分类-规则段-删除
     * @param ruledelReq
     * @param callback
     */
    public static void doRuleDel(RuledelReq ruledelReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(ruledelReq),callback);
    }
    /**
     * 规则分类-规则段-列表
     * @param ruleListReq
     * @param callback
     */
    public static void doRuleList(RuleListReq ruleListReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(ruleListReq),callback);
    }

    /**
     * 流水段维护--流水段添加
     * @param sectionAddReq
     * @param callback
     */
    public static void doSectionAdd(SectionAddReq sectionAddReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(sectionAddReq),callback);
    }

    /**
     * 流水段维护--流水段删除
     * @param sectionDelReq
     * @param callback
     */
    public static void doSectionDel(SectionDelReq sectionDelReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(sectionDelReq),callback);
    }

    /**
     * 规则分类-规则段-列表
     * @param sectionListReq
     * @param callback
     */
    public static void doSectionList(SectionListReq sectionListReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(sectionListReq),callback);
    }

    /**
     * 编码使用记录
     * @param codeRecordReq
     * @param callback
     */
    public static void doCodeRecord(CodeRecordReq codeRecordReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(codeRecordReq),callback);
    }

    /**
     * 规则分类-规则段-列表
     * @param codeUsageReq
     * @param callback
     */
    public static void doCodeUsage(CodeUsageReq codeUsageReq, PlatformCallback callback){
        OkHttpUtils.getInstance().doPost(ApiConstant.CODE_RULE_RESOLVE_ADD,obj2Json(codeUsageReq),callback);
    }


    /*****编码规则管理end********************************************************************************************/





    /*****系统资源start********************************************************************************************/
    /*****系统资源end********************************************************************************************/

    /*******************接入管理start********************************************************************************************/
    public static void doLogin(LoginRequest loginRequest, PlatformCallback callback){
        AccessManagement.doLogin(loginRequest,callback);
    }

    /*******************接入管理end********************************************************************************************/

    /*******************组织结构start********************************************************************************************/
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
    /*******************接口服务end********************************************************************************************/

    /*******************注册相关start********************************************************************************************/
    /*******************注册相关end********************************************************************************************/

    /**-------------**************大屏数据start********************************************************************************************/
    /*******************大屏数据end********************************************************************************************/

    /*******************通用实体start********************************************************************************************/
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