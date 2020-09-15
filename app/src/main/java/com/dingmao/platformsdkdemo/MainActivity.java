package com.dingmao.platformsdkdemo;


import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.dingmao.platformsdk.PlatformClient;
import com.dingmao.platformsdk.PlatformSDK;
import com.dingmao.platformsdk.callback.PlatformCallback;
import com.dingmao.platformsdk.callback.PlatformDownloadCallback;
import com.dingmao.platformsdk.callback.PlatformListCallback;
import com.dingmao.platformsdk.callback.PlatformStringCallback;
import com.dingmao.platformsdk.commonentity.EntityAddReq;
import com.dingmao.platformsdk.commonentity.LogListReq;
import com.dingmao.platformsdk.commonentity.LogListRsp;
import com.dingmao.platformsdk.configurationmanagement.CategTreeReq;
import com.dingmao.platformsdk.configurationmanagement.CategTreeRsp;
import com.dingmao.platformsdk.configurationmanagement.CodeAddReq;
import com.dingmao.platformsdk.configurationmanagement.CodeAddRsp;
import com.dingmao.platformsdk.configurationmanagement.CodeListReq;
import com.dingmao.platformsdk.configurationmanagement.CodeListRsp;
import com.dingmao.platformsdk.configurationmanagement.CodeMultiListReq;
import com.dingmao.platformsdk.configurationmanagement.CodeMultiListRsp;
import com.dingmao.platformsdk.configurationmanagement.CodeSortAddReq;
import com.dingmao.platformsdk.configurationmanagement.CodeSortAddRsp;
import com.dingmao.platformsdk.configurationmanagement.CodeSortDelReq;
import com.dingmao.platformsdk.configurationmanagement.CodeSortTreeRsp;
import com.dingmao.platformsdk.configurationmanagement.CodeSortUpdateReq;
import com.dingmao.platformsdk.configurationmanagement.CodeUpdateReq;
import com.dingmao.platformsdk.configurationmanagement.CodeUpdateRsp;
import com.dingmao.platformsdk.configurationmanagement.ParaAddReq;
import com.dingmao.platformsdk.configurationmanagement.ParaAddRsp;
import com.dingmao.platformsdk.configurationmanagement.ParaDelReq;
import com.dingmao.platformsdk.configurationmanagement.ParaListReq;
import com.dingmao.platformsdk.configurationmanagement.ParaListRsp;
import com.dingmao.platformsdk.configurationmanagement.ParaRsp;
import com.dingmao.platformsdk.configurationmanagement.ParaSortAddReq;
import com.dingmao.platformsdk.configurationmanagement.ParaSortAddRsp;
import com.dingmao.platformsdk.configurationmanagement.ParaSortDelReq;
import com.dingmao.platformsdk.configurationmanagement.ParaSortTreeReq;
import com.dingmao.platformsdk.configurationmanagement.ParaSortTreeRsp;
import com.dingmao.platformsdk.configurationmanagement.ParaSortUpdateReq;
import com.dingmao.platformsdk.configurationmanagement.ParaUpdateReq;
import com.dingmao.platformsdk.interfaceservice.ApiCreateReq;
import com.dingmao.platformsdk.interfaceservice.ApiCreateRsp;
import com.dingmao.platformsdk.interfaceservice.ServiceListReq;
import com.dingmao.platformsdk.interfaceservice.ServiceListRsp;
import com.dingmao.platformsdk.interfaceservice.ServiceTreeReq;
import com.dingmao.platformsdk.interfaceservice.SortCreateReq;
import com.dingmao.platformsdk.interfaceservice.SortCreateRsp;
import com.dingmao.platformsdk.interfaceservice.SortDelReq;
import com.dingmao.platformsdk.internal.util.StringUtils;
import com.dingmao.platformsdk.login.LoginByPwdReq;
import com.dingmao.platformsdk.login.LoginResponse;
import com.dingmao.platformsdk.registrationrelated.AuditListRsp;
import com.dingmao.platformsdk.registrationrelated.ScreenDataReq;
import com.dingmao.platformsdk.registrationrelated.ScreenDataRsp;
import com.dingmao.platformsdk.registrationrelated.UserAuditReq;
import com.dingmao.platformsdk.registrationrelated.VerifyCodeReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthAddReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthAddRsp;
import com.dingmao.platformsdk.resourcesmanagement.AuthDelReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthListReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthListRsp;
import com.dingmao.platformsdk.resourcesmanagement.AuthTempListReq;
import com.dingmao.platformsdk.resourcesmanagement.AuthTempListRsp;
import com.dingmao.platformsdk.resourcesmanagement.AuthUpdateReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuAddReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuAddRsp;
import com.dingmao.platformsdk.resourcesmanagement.MenuCateAddReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuCateAddRsp;
import com.dingmao.platformsdk.resourcesmanagement.MenuCateDelReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuCateUpdateReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuDelReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuListReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuListRsp;
import com.dingmao.platformsdk.resourcesmanagement.MenuTreeReq;
import com.dingmao.platformsdk.resourcesmanagement.MenuTreeRsp;
import com.dingmao.platformsdk.resourcesmanagement.MenuUpdateReq;
import com.dingmao.platformsdk.resourcesmanagement.ResSortAddReq;
import com.dingmao.platformsdk.resourcesmanagement.ResSortAddRsp;
import com.dingmao.platformsdk.resourcesmanagement.ResSortDelReq;
import com.dingmao.platformsdk.resourcesmanagement.ResSortTreeReq;
import com.dingmao.platformsdk.resourcesmanagement.ResSortTreeRsp;
import com.dingmao.platformsdk.resourcesmanagement.ResSortUpdateReq;
import com.dingmao.platformsdk.resourcesmanagement.TempAuthAssignReq;
import com.dingmao.platformsdk.resourcesmanagement.TempAuthDelReq;
import com.dingmao.platformsdk.resourcesmanagement.TempAuthListReq;
import com.dingmao.platformsdk.resourcesmanagement.TempAuthListRsp;
import com.dingmao.platformsdk.systemmanagement.BasicConfigReq;
import com.dingmao.platformsdk.systemmanagement.BasicConfigRsp;
import com.dingmao.platformsdk.systemmanagement.CheckUpdateReq;
import com.dingmao.platformsdk.systemmanagement.CheckUpdateRsp;
import com.dingmao.platformsdk.systemmanagement.SysAuthRsp;
import com.dingmao.platformsdk.systemmanagement.SysDelVerReq;
import com.dingmao.platformsdk.systemmanagement.SysInfoRsp;
import com.dingmao.platformsdk.systemmanagement.SysLogReq;
import com.dingmao.platformsdk.systemmanagement.SysLogRsp;
import com.dingmao.platformsdk.systemmanagement.SysPubVerReq;
import com.dingmao.platformsdk.systemmanagement.SysUpdateReq;
import com.dingmao.platformsdk.systemmanagement.SysUpdateVerReq;
import com.dingmao.platformsdk.systemmanagement.SysVersionReq;
import com.dingmao.platformsdk.systemmanagement.SysVersionRsp;
import com.dingmao.platformsdk.usermanagement.AssignAuthReq;
import com.dingmao.platformsdk.usermanagement.CompJobListReq;
import com.dingmao.platformsdk.usermanagement.JobAddReq;
import com.dingmao.platformsdk.usermanagement.ResetCodeReq;
import com.dingmao.platformsdk.usermanagement.UserAddReq;
import com.dingmao.platformsdk.usermanagement.UserAddRsp;
import com.dingmao.platformsdk.usermanagement.UserAuthReq;
import com.dingmao.platformsdk.usermanagement.UserAuthRsp;
import com.dingmao.platformsdk.usermanagement.UserDetailReq;
import com.dingmao.platformsdk.usermanagement.UserDetailRsp;
import com.dingmao.platformsdk.usermanagement.UserImprtReq;
import com.dingmao.platformsdk.usermanagement.UserJobListReq;
import com.dingmao.platformsdk.usermanagement.UserJobListRsp;
import com.dingmao.platformsdk.usermanagement.UserListReq;
import com.dingmao.platformsdk.usermanagement.UserListRsp;
import com.dingmao.platformsdk.usermanagement.UserMenuReq;
import com.dingmao.platformsdk.usermanagement.UserMenuRsp;
import com.dingmao.platformsdk.usermanagement.UserMultiListReq;
import com.dingmao.platformsdk.usermanagement.UserMultiListRsp;
import com.dingmao.platformsdk.usermanagement.UserStateReq;
import com.dingmao.platformsdk.usermanagement.UserUpdateReq;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    private List<String> datas = new ArrayList<>();
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlatformSDK.init(getApplication());
        String[] array = this.getResources().getStringArray(R.array.item);
        for (String str :
                array) {
            datas.add(str);
        }
        rv = findViewById(R.id.recyclerView);
        MainAdapter mainAdapter = new MainAdapter(this, datas);
        rv.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
        rv.setAdapter(mainAdapter);
    }

    public void login(View view) {
        /*PlatformClient.doLogin(new LoginByPwdReq("wareCsy", "hz123456"), new PlatformCallback<LoginResponse>() {
            @Override
            public void onSuccess(LoginResponse o) { }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                Log.e("onFailed",msg);
            }

            @Override
            public void onTokenInvalid(String msg) { }
        });*/
    }

    public void source(View view) {
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) { }

                    @Override
                    public void onNext(Boolean aBoolean) { }

                    @Override
                    public void onError(Throwable e) { }

                    @Override
                    public void onComplete() { }
                });
    }

    private String json = "{\"type\":\"object\",\"title\":\"empty object\",\"properties\":{\"rela_id\":{\"type\":\"string\",\"description\":\"业务关联id\"},\"module\":{\"type\":\"string\",\"description\":\"模块\"},\"file_path\":{\"type\":\"string\",\"description\":\"文件路径\"},\"file_id\":{\"type\":\"string\",\"description\":\"文件Id\"},\"is_delete\":{\"type\":\"string\",\"description\":\"是否被删除，使用标准码yn\"},\"start_time\":{\"type\":\"string\"},\"end_time\":{\"type\":\"string\"},\"create_id\":{\"type\":\"string\",\"description\":\"上传人Id\"},\"is_page\":{\"type\":\"string\",\"description\":\"是否分页（0：否，1：是）\"},\"page\":{\"type\":\"string\",\"description\":\"页码\"},\"page_size\":{\"type\":\"string\",\"description\":\"每页数量\"}},\"required\":[\"is_page\"]}";

    /*public void parse(View view) {
        Gson gson = new Gson();
        Map map = new Gson().fromJson(json, Map.class);
        for (Object m : map.entrySet()) {
            if ("properties".equals(((Map.Entry) m).getKey().toString())) {
                String json1 = gson.toJson(((Map.Entry) m).getValue());
                Log.e("====",json1);
                Map map1 = new Gson().fromJson(json1, Map.class);
                for (Object m1 : map1.entrySet()) {
                    Log.e("map1===", ((Map.Entry) m1).getKey().toString());
                    String json2 = gson.toJson(((Map.Entry) m1).getValue());
                    Map map2 = new Gson().fromJson(json2, Map.class);
                    for (Object m2: map2.entrySet()){
                        Log.e("map2===",m2.toString());
                    }
                }
            }
        }
    }*/

    //province_no=110000
    //city_no=110100
    //area_no=110101
    //user_id =505
    //system_id=72
    //"system_no":"warehouse"
    //"sys_ver_id":"235"
    //"object_no":"organization",
    //"object_id":"814"
    public void create(View view) {
//        doSortCreate();
//        screenTest();
//        doEntityAdd();
//        addModule();
    }

    private void addModule() {
        /*LogListReq request = new LogListReq();
        request.setIs_page("1");
        request.setModule("user");
        StringUtils.obj2Json(request);

        PlatformClient.doLogList(request, new PlatformCallback<LogListRsp>() {
            @Override
            public void onSuccess(LogListRsp logListRsp) {

            }

            @Override
            public void onFailed(String msg) {

            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });*/
    }

    public void doEntityAdd(){
        EntityAddReq request = new EntityAddReq();
        request.setEntity_no("test");
//        request.setSystem_no(ApiConstant.SYSTEM_NO);
        EntityAddReq.EntityReq entityReq = new EntityAddReq.EntityReq();
        entityReq.setField_code("name");
        entityReq.setVal("kxl");
        List<EntityAddReq.EntityReq> list = new ArrayList<>();
        list.add(entityReq);
        request.setData(list);

        PlatformClient.doEntityAdd(request,new PlatformStringCallback() {
            @Override
            public void onSuccess(String o) {
                Log.e("=====","o = " + o);
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }



            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

            /*@Override
            public void onTokenInvalid(String msg) {

            }*/
        });
    }

    private void addScreenData() {

    }

    public void screenTest(){
        List<ScreenDataReq.Conditions> condiList = new ArrayList<>();
        //"dim1", "=", "31"
        ScreenDataReq.Conditions conditions1 = new ScreenDataReq.Conditions();
        conditions1.setCond_field("dim1");
        conditions1.setCond_operation("=");
        conditions1.setCond_value("31");

        ScreenDataReq.Conditions conditions2 = new ScreenDataReq.Conditions();
        conditions2.setCond_field("dim2");
        conditions2.setCond_operation(">=");
        conditions2.setCond_value("2020-01-01");

        ScreenDataReq.Conditions conditions3 = new ScreenDataReq.Conditions();
        conditions3.setCond_field("dim2");
        conditions3.setCond_operation("<=");
        conditions3.setCond_value("2021-01-01");

        condiList.add(conditions1);
        condiList.add(conditions2);
        condiList.add(conditions3);

        List<ScreenDataReq.Indexs> indexList = new ArrayList<>();
        ScreenDataReq.Indexs index1 = new ScreenDataReq.Indexs();
        index1.setIndex_field("dim2");
        index1.setIndex_operation("date_format(?,'%m')");
        index1.setAis("月份");

        ScreenDataReq.Indexs index2 = new ScreenDataReq.Indexs();
        index2.setIndex_field("index1");
        index2.setIndex_operation("sum(?)");
        index2.setAis("index1");

        indexList.add(index1);
        indexList.add(index2);

        ScreenDataReq.Dims dims = new ScreenDataReq.Dims();
        dims.setDim_field("dim2");
        dims.setDim_operation("date_format(?,'%Y-%m')");
        List<ScreenDataReq.Dims> dimList = new ArrayList<>();
        dimList.add(dims);
        ScreenDataReq req = new ScreenDataReq();
        req.setIndex_no("yearOrderStat");
        req.setConditions(condiList);
        req.setIndexs(indexList);
        req.setDims(dimList);
        PlatformClient.doGetScreenData(req, new PlatformCallback<ScreenDataRsp>() {
            @Override
            public void onSuccess(ScreenDataRsp o) {
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doCompAudit(){
        UserAuditReq request = new UserAuditReq();
        PlatformClient.doAuditList(new PlatformCallback<AuditListRsp>() {
            @Override
            public void onSuccess(AuditListRsp o) {
                Log.e("=====","o = " + o);
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onListSuccess(List<AuditListRsp> list) {

            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }


    public void doVerifyCode(){
        VerifyCodeReq request = new VerifyCodeReq();
        request.setPhone("17681840403");
        request.setUsage_code("2");
//        request.setSystem_no(ApiConstant.SYSTEM_NO);
//        request.setTemplate_no(ApiConstant.TEMPLETE_CODE_LOGIN);
        request.setUser_type("4");
        PlatformClient.doVerifyCode(request,new PlatformStringCallback() {
            @Override
            public void onSuccess(String o) {
                Log.e("=====","o = " + o);
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }



            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }


        });
    }

    public void doApiCreate(){
        ApiCreateReq request = new ApiCreateReq();
        request.setSort_no("test");
        request.setApi_name("test");
        request.setApi_url("/");
        PlatformClient.doApiCreate(request,new PlatformCallback<ApiCreateRsp>() {
            @Override
            public void onSuccess(ApiCreateRsp o) {
                Log.e("=====","o = " + o);
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onListSuccess(List<ApiCreateRsp> list) {
                Log.e("=====","List = " + list);
                Toast.makeText(MainActivity.this,list+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doServiceList(){
        ServiceListReq request = new ServiceListReq();
        request.setSort_no("test");
        request.setIs_page("1");
        PlatformClient.doServiceList(request,new PlatformCallback<ServiceListRsp>() {
            @Override
            public void onSuccess(ServiceListRsp o) {
                Log.e("=====","o = " + o);
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onListSuccess(List<ServiceListRsp> list) {
                Log.e("=====","List = " + list);
                Toast.makeText(MainActivity.this,list+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doSortDel(){
        SortDelReq request = new SortDelReq();
        request.setApi_sort_id("45");
        PlatformClient.doSortDel(request,new PlatformStringCallback() {
            @Override
            public void onSuccess(String o) {
                Log.e("=====","o = " + o);
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }



            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }


        });
    }



    public void doSortCreate(){
        SortCreateReq request = new SortCreateReq();
        request.setSort_name("test");
        request.setSort_no("test");
        PlatformClient.doSortCreate(request,new PlatformCallback<SortCreateRsp>() {
            @Override
            public void onSuccess(SortCreateRsp o) {
                Log.e("=====","o = " + o);
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onListSuccess(List<SortCreateRsp> list) {
                Log.e("=====","List = " + list);
                Toast.makeText(MainActivity.this,list+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doServiceTree(){
        ServiceTreeReq request = new ServiceTreeReq();

        PlatformClient.doServiceTree(request,new PlatformCallback<ServiceTreeReq>() {
            @Override
            public void onSuccess(ServiceTreeReq o) {
                Log.e("=====","o = " + o);
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onListSuccess(List<ServiceTreeReq> list) {
                Log.e("=====","o = " + list);
                Toast.makeText(MainActivity.this,list+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doCategTree(){
        CategTreeReq request = new CategTreeReq();

        PlatformClient.doCategTree(request,new PlatformCallback<CategTreeRsp>() {
            @Override
            public void onSuccess(CategTreeRsp o) {
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doParaDel(){
        ParaDelReq request = new ParaDelReq();
        request.setPara_id("52");
        PlatformClient.doParaDel(request,new PlatformStringCallback() {
            @Override
            public void onSuccess(String o) {
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

        });
    }

    public void doParaUpdate(){
        ParaUpdateReq request = new ParaUpdateReq();
        request.setPara_id("52");
        request.setPara_value("test11");
        request.setPara_name("test11");
        PlatformClient.doParaUpdate(request,new PlatformStringCallback() {
            @Override
            public void onSuccess(String o) {
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

        });
    }

    public void doParaAdd(){
        ParaAddReq request = new ParaAddReq();
        request.setPara_name("test");
        request.setPara_value("test");
        request.setPara_code("1");
        request.setSyspara_sort_id("23");
        PlatformClient.doParaAdd(request,new PlatformCallback<ParaAddRsp>() {
            @Override
            public void onSuccess(ParaAddRsp o) {
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doPara(){
        Map<String,String> request = new HashMap<>();
        request.put("para_code","1");
        PlatformClient.doPara(request,new PlatformCallback<ParaRsp>() {
            @Override
            public void onSuccess(ParaRsp o) {
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doParaList(){
        ParaListReq request = new ParaListReq();
        request.setPara_type("1");
        request.setIs_page("1");
        PlatformClient.doParaList(request,new PlatformCallback<ParaListRsp>() {
            @Override
            public void onSuccess(ParaListRsp o) {
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg+"",Toast.LENGTH_SHORT).show();
                Log.e("=====","o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doParaSortDel(){
        ParaSortDelReq request = new ParaSortDelReq();
        request.setPara_sort_id("42");
        PlatformClient.doParaSortDel(request,new PlatformStringCallback() {
            @Override
            public void onSuccess(String o) {
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Log.e("=====","o = " + msg);
            }

        });
    }

    public void doParaSortUpdate(){
        ParaSortUpdateReq request = new ParaSortUpdateReq();
        request.setPara_sort_id("42");
        request.setPara_sort_name("测试");
        request.setIs_valud("1");
        request.setP_para_type("1");
        request.setPara_type("1");
        PlatformClient.doParaSortUpdate(request,new PlatformStringCallback() {
            @Override
            public void onSuccess(String o) {
                Toast.makeText(MainActivity.this,o+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Log.e("=====","o = " + msg);
            }

        });
    }

    public void doParaSortAdd(){
        ParaSortAddReq request = new ParaSortAddReq();
        request.setPara_sort_name("test");
        request.setIs_valud("1");
        request.setP_para_type("1");
        request.setPara_type("1");
        PlatformClient.doParaSortAdd(request,new PlatformCallback<ParaSortAddRsp>() {
            @Override
            public void onSuccess(ParaSortAddRsp o) {
                System.out.println("o = " + o);
            }

            @Override
            public void onFailed(String msg) {
                Log.e("=====","o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doParaSortTree(){
        ParaSortTreeReq request = new ParaSortTreeReq();

        PlatformClient.doParaSortTree(new PlatformCallback<ParaSortTreeRsp>() {
            @Override
            public void onSuccess(ParaSortTreeRsp o) {
                System.out.println("o = " + o);
            }

            @Override
            public void onFailed(String msg) {
                System.out.println("o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doCodeUpdate(){
        CodeUpdateReq request = new CodeUpdateReq();
        List<CodeUpdateReq.CodeObjReq> list = new ArrayList<>();
        CodeUpdateReq.CodeObjReq codeObjReq = new CodeUpdateReq.CodeObjReq();
        codeObjReq.setName("物料");
        codeObjReq.setValue("1");
        codeObjReq.setCode_id("832");
        list.add(codeObjReq);
        request.setData(list);
        PlatformClient.doCodeUpdate(request,new PlatformCallback<CodeUpdateRsp>() {
            @Override
            public void onSuccess(CodeUpdateRsp o) {
                System.out.println("o = " + o);
            }

            @Override
            public void onFailed(String msg) {
                System.out.println("o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doCodeAdd(){
        CodeAddReq request = new CodeAddReq();
        List<CodeAddReq.CodeObjReq> list = new ArrayList<>();
        CodeAddReq.CodeObjReq codeObjReq = new CodeAddReq.CodeObjReq();
        codeObjReq.setCode_sort_id("300");
        codeObjReq.setCode_type("test");
        codeObjReq.setName("测试");
        codeObjReq.setValue("test");
        list.add(codeObjReq);
        request.setData(list);
        PlatformClient.doCodeAdd(request,new PlatformCallback<CodeAddRsp>() {
            @Override
            public void onSuccess(CodeAddRsp o) {
                System.out.println("o = " + o);
            }

            @Override
            public void onFailed(String msg) {
                System.out.println("o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doCodeMultiList(){
        CodeMultiListReq request = new CodeMultiListReq();
//        request.setCode_type("storeAppWork");
        PlatformClient.doCodeMultiList(new PlatformListCallback<CodeMultiListRsp>() {
            @Override
            public void onSuccess(List<CodeMultiListRsp> o) {
                System.out.println("o = " + o);
            }

            @Override
            public void onFailed(String msg) {
                System.out.println("o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void doCodeList(){
        CodeListReq request = new CodeListReq();
        request.setCode_type("115");
        PlatformClient.doCodeList(request,new PlatformCallback<CodeListRsp>() {
            @Override
            public void onSuccess(CodeListRsp o) {
                System.out.println("o = " + o);
            }

            @Override
            public void onFailed(String msg) {
                System.out.println("o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doCodeSortDel(){
        CodeSortDelReq request = new CodeSortDelReq();
        request.setCode_sort_id("417");
        PlatformClient.doCodeSortDel(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void doCodeSortUpdate(){
        CodeSortUpdateReq request = new CodeSortUpdateReq();
        request.setCode_type("test");
        request.setSort_name("测试123");
        request.setCode_sort_id("417");
        PlatformClient.doCodeSortUpdate(request, new PlatformCallback<CodeSortAddRsp>() {
            @Override
            public void onSuccess(CodeSortAddRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onListSuccess(List<CodeSortAddRsp> list) {
                Toast.makeText(MainActivity.this,list + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }


        });
    }

    private void doCodeSortAdd(){
        CodeSortAddReq request = new CodeSortAddReq();
        request.setCode_type("test");
        request.setSort_name("测试");
        PlatformClient.doCodeSortAdd(request, new PlatformCallback<CodeSortAddRsp>() {
            @Override
            public void onSuccess(CodeSortAddRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onListSuccess(List<CodeSortAddRsp> list) {
                Toast.makeText(MainActivity.this,list + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }


        });
    }

    public void doCodeSortTree(){
        PlatformClient.doCodeSortTree(new PlatformCallback<CodeSortTreeRsp>() {
            @Override
            public void onSuccess(CodeSortTreeRsp o) {
                System.out.println("o = " + o);
            }

            @Override
            public void onFailed(String msg) {
                System.out.println("o = " + msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doTempAuthList(){
        TempAuthAssignReq request = new TempAuthAssignReq();
        request.setAuth_template_id("66");
        request.setObject_ids("682");
        PlatformClient.doTempAuthList(request, new PlatformListCallback<TempAuthAssignReq>() {
            @Override
            public void onSuccess(List<TempAuthAssignReq> msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }


        });
    }

    private void doTempAuthDel(){
        TempAuthDelReq request = new TempAuthDelReq();
        request.setObject_id("682");
        request.setAuth_template_id("66");
        PlatformClient.doTempAuthDel(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void doAuthTempAdd(){
        TempAuthListReq request = new TempAuthListReq();
        request.setAuth_template_id("66");
        PlatformClient.doTempAuthList(request, new PlatformCallback<TempAuthListRsp>() {
            @Override
            public void onSuccess(TempAuthListRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onListSuccess(List<TempAuthListRsp> list) {
                Toast.makeText(MainActivity.this,list + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }


        });
    }

    private void doAuthTempList(){
        AuthTempListReq request = new AuthTempListReq();
        request.setIs_page("1");
        PlatformClient.doAuthTempList(request, new PlatformCallback<AuthTempListRsp>() {
            @Override
            public void onSuccess(AuthTempListRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doMenuCateDel(){
        MenuCateDelReq request = new MenuCateDelReq();
        request.setMenu_id("584");
        PlatformClient.doMenuCateDel(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void doMenuCateUpdate(){
        MenuCateUpdateReq request = new MenuCateUpdateReq();
        request.setMenu_id("584");
        request.setMenu_name("测试");
        PlatformClient.doMenuCateUpdate(request, new PlatformCallback<MenuCateAddRsp>() {
            @Override
            public void onSuccess(MenuCateAddRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doMenuCateAdd(){
        MenuCateAddReq request = new MenuCateAddReq();
        request.setMenu_name("测试123");
        request.setMenu_no("test");
        PlatformClient.doMenuCateAdd(request, new PlatformCallback<MenuCateAddRsp>() {
            @Override
            public void onSuccess(MenuCateAddRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doMenuTree(){
        MenuTreeReq request = new MenuTreeReq();
        request.setIs_tab("2");
        PlatformClient.doMenuTree(request,new PlatformListCallback<MenuTreeRsp>() {
            @Override
            public void onSuccess(List<MenuTreeRsp> msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doMenuDel(){
        MenuDelReq request = new MenuDelReq();
        request.setMenu_id("583");
        PlatformClient.doMenuDel(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

        });
    }



    private void doMenuUpdate(){
        MenuUpdateReq request = new MenuUpdateReq();
        request.setObject_id("741");
        request.setMenu_name("测试123");
        request.setMenu_id("583");
        request.setP_menu_no("wareManagement");
        request.setMenu_type("1");
        request.setRoute_url("/");
        PlatformClient.doMenuUpdate(request, new PlatformCallback<AuthAddRsp>() {
            @Override
            public void onSuccess(AuthAddRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doMenuAdd(){
        MenuAddReq request = new MenuAddReq();
        request.setObject_id("741");
        request.setMenu_no("test");
        request.setMenu_name("测试");
        request.setP_menu_no("wareManagement");
        request.setMenu_type("1");
        request.setRoute_url("/");
        PlatformClient.doMenuAdd(request, new PlatformCallback<MenuAddRsp>() {
            @Override
            public void onSuccess(MenuAddRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doMenuList(){
        MenuListReq request = new MenuListReq();
        PlatformClient.doMenuList(new PlatformListCallback<MenuListRsp>() {
            @Override
            public void onSuccess(List<MenuListRsp> msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doAuthDel(){
        AuthDelReq request = new AuthDelReq();
        request.setObject_id("815");
        PlatformClient.doAuthDel(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void doAuthUpdate(){
        AuthUpdateReq request = new AuthUpdateReq();
        request.setObject_name("测试123");
        request.setObject_id("815");
        request.setP_object_no("organization");
        request.setObject_sort("1");
        request.setIs_menu("1");
        request.setIs_priv("1");
        request.setIs_flow("0");
        request.setIs_samp("0");
        PlatformClient.doAuthUpdate(request, new PlatformCallback<AuthAddRsp>() {
            @Override
            public void onSuccess(AuthAddRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doAuthAdd(){
        AuthAddReq request = new AuthAddReq();
        request.setObject_name("测试");
        request.setObject_no("test");
        request.setObject_sort("1");
        request.setP_object_no("organization");
        request.setIs_menu("1");
        request.setIs_priv("1");
        request.setIs_flow("0");
        request.setIs_samp("0");
        PlatformClient.doAuthAdd(request, new PlatformCallback<AuthAddRsp>() {
            @Override
            public void onSuccess(AuthAddRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doAuthList(){
        AuthListReq request = new AuthListReq();
        request.setObject_no("organization");
        request.setIs_page("1");
        PlatformClient.doAuthList(request, new PlatformCallback<AuthListRsp>() {
            @Override
            public void onSuccess(AuthListRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doResSortDel(){
        ResSortDelReq request = new ResSortDelReq();
        request.setObject_id("814");
        PlatformClient.doResSortDel(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void doResSortUpdate(){
        ResSortUpdateReq request = new ResSortUpdateReq();
        request.setObject_id("814");
        request.setObject_name("测试123");
        PlatformClient.doResSortUpdate(request, new PlatformCallback<ResSortAddRsp>() {
            @Override
            public void onSuccess(ResSortAddRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doResSortAdd(){
        ResSortAddReq request = new ResSortAddReq();
        request.setObject_no("test");
        request.setObject_name("测试");
        PlatformClient.doResSortAdd(request, new PlatformCallback<ResSortAddRsp>() {
            @Override
            public void onSuccess(ResSortAddRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doResTree(){
        ResSortTreeReq request = new ResSortTreeReq();
        request.setType("menu");
        PlatformClient.doResTree(request, new PlatformListCallback<ResSortTreeRsp>() {
            @Override
            public void onSuccess(List<ResSortTreeRsp> msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doBasicConfig(){
        BasicConfigReq request = new BasicConfigReq();
        request.setSystem_no("warehouse");
        PlatformClient.doBasicConfig(request, new PlatformCallback<BasicConfigRsp>() {
            @Override
            public void onSuccess(BasicConfigRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void downApk(){
        Map<String,String> map = new HashMap<>();
        map.put("system_no","warehouse");
        map.put("system_type","app");
        map.put("ver","1.2.3");
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        PlatformClient.doDownloadApk(map,absolutePath,new PlatformDownloadCallback() {
            @Override
            public void onSuccess(String o) {
                Log.e("======",o);
                Toast.makeText(MainActivity.this,o + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDownProgress(int progress) {
                Log.e("======",progress + "");
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void doCheckUpdate(){
        CheckUpdateReq request = new CheckUpdateReq();
        request.setVer("1.2.0");
        PlatformClient.doCheckUpdate(request, new PlatformCallback<CheckUpdateRsp>() {
            @Override
            public void onSuccess(CheckUpdateRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doSysDelVer(){
        SysDelVerReq request = new SysDelVerReq();
        request.setSys_ver_id("235");
        PlatformClient.doSysDelVer(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void doSysUpdateVer(){
        SysUpdateVerReq request = new SysUpdateVerReq();
        request.setSystem_type("app");
        request.setSys_ver_id("235");
        request.setVer_content("测试235");
        PlatformClient.doSysUpdateVer(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void doSysPubVer(){
        SysPubVerReq request = new SysPubVerReq();
        request.setSystem_type("app");
        request.setVer("1.2.3");
        request.setVer_content("测试");
        PlatformClient.doSysPubVer(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void doSysVersion(){
        SysVersionReq request = new SysVersionReq();
        request.setIs_page("1");
        request.setSystem_type("app");
        request.setVer("1.2.3");
        PlatformClient.doSysVersion(request, new PlatformCallback<SysVersionRsp>() {
            @Override
            public void onSuccess(SysVersionRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doSysLog(){
        SysLogReq request = new SysLogReq();
        request.setIs_page("1");
        PlatformClient.doSysLog(request, new PlatformCallback<SysLogRsp>() {
            @Override
            public void onSuccess(SysLogRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doSysAuth(){
        Map<String,String> map = new HashMap<>();
        map.put("id","505");
        map.put("auth_sys_type","1");
        map.put("is_page","1");
        PlatformClient.doSysAuth(map, new PlatformCallback<SysAuthRsp>() {
            @Override
            public void onSuccess(SysAuthRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doSysUpdate(){
        SysUpdateReq request = new SysUpdateReq();
        request.setSystem_id("72");
        PlatformClient.doSysUpdate(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void doSysInfo(){
        PlatformClient.doSysInfo( new PlatformCallback<SysInfoRsp>() {
            @Override
            public void onSuccess(SysInfoRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doUserUpdate(){
        UserUpdateReq request = new UserUpdateReq();
        request.setUser_id("505");
        request.setUser_name("atu");
        PlatformClient.doUserUpdate(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void doUserDetail(){
        UserDetailReq request = new UserDetailReq();
        request.setUser_id("505");
        PlatformClient.doUserDetail(request, new PlatformCallback<UserDetailRsp>() {
            @Override
            public void onSuccess(UserDetailRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doAssignAuth(){
        AssignAuthReq request = new AssignAuthReq();
        request.setUser_id("505");
        request.setObject_ids("1");
        PlatformClient.doAssignAuth(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void doUserAuth(){
        UserAuthReq request = new UserAuthReq();
        request.setUser_id("505");
        PlatformClient.doUserAuth(request, new PlatformCallback<UserAuthRsp>() {
            @Override
            public void onSuccess(UserAuthRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doUserMenu(){
        UserMenuReq request = new UserMenuReq();
        PlatformClient.doUserMenu(request, new PlatformCallback<UserMenuRsp>() {
            @Override
            public void onSuccess(UserMenuRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doUserMultiList(){
        UserMultiListReq request = new UserMultiListReq();
        request.setIs_page("1");
        request.setType("3");
        request.setIds("216");
        PlatformClient.doUserMultiList(request, new PlatformCallback<UserMultiListRsp>() {
            @Override
            public void onSuccess(UserMultiListRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doUserList(){
        UserListReq request = new UserListReq();
        request.setIs_page("1");
        request.setPhone("17681840403");
        PlatformClient.doUserList(request, new PlatformCallback<UserListRsp>() {
            @Override
            public void onSuccess(UserListRsp msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private void doUserPwd(){
        ResetCodeReq request = new ResetCodeReq();
        request.setUser_id("504");
        request.setNew_password("123456");
        PlatformClient.doResetPwdByCode(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void doUserState(){
        UserStateReq request = new UserStateReq();
        request.setUser_id("504");
        request.setType("1");
        PlatformClient.doUserState(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void doJobAdd(){
        JobAddReq request = new JobAddReq();
        request.setUser_id("504");
        request.setJob_id("0");
        PlatformClient.doJobAdd(request, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void doUserJobByUser(){
        UserJobListReq request = new UserJobListReq();
        request.setUser_id("504");
        PlatformClient.doUserJobByUser(request, new PlatformCallback<UserJobListRsp>() {
            @Override
            public void onSuccess(UserJobListRsp t) {
                Toast.makeText(MainActivity.this,t + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    /**
     * 批量导入用户（通过json）
     */
    private void doUserImprt(){
        UserImprtReq request = new UserImprtReq();
        request.setPhone("17681840403");
        request.setUser_name("kxl");
        List<UserImprtReq> list = new ArrayList<>();
        list.add(request);
        PlatformClient.doUserImprt(list, new PlatformStringCallback() {
            @Override
            public void onSuccess(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this,msg + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void doUserTempDown(){
        CompJobListReq request = new CompJobListReq();
//        request.setUser_id("504");
        Map<String,String> map = new HashMap<>();
        map.put("file_name","systemUser.xls");
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        PlatformClient.doUserTempDown(map,absolutePath,new PlatformDownloadCallback() {
            @Override
            public void onSuccess(String o) {
                Log.e("======",o);
                Toast.makeText(MainActivity.this,o + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDownProgress(int progress) {

            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }

            /*@Override
            public void onTokenInvalid(String msg) {

            }*/
        });
    }

    /**
     * 批量导入账户(通过excel)
     */
    private void doImprt() throws IOException {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        File file = new File(absolutePath + "/a.xls");
        Map<String,String> map = new HashMap<>();
        map.put("comp_id","0");
        PlatformClient.doImptByExcel(map,file,"excels", new PlatformCallback<Object>() {
            @Override
            public void onSuccess(Object o) {

            }

            @Override
            public void onFailed(String msg) {

            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    public void addUser(){
        UserAddReq request = new UserAddReq();
        request.setPhone("17681840403");
        request.setUser_name("atu");
        PlatformClient.doUserAdd(request, new PlatformCallback<UserAddRsp>() {
            @Override
            public void onSuccess(UserAddRsp o) {

            }

            @Override
            public void onFailed(String msg) {

            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    public void select(View view) {
// 进入相册 以下是例子：用不到的api可以不写
        PictureSelector.create(MainActivity.this)
                .openGallery(PictureMimeType.ofAll())//全部.PictureMimeType.ofAll()、图片.ofImage()、视频.ofVideo()、音频.ofAudio()
                .maxSelectNum(1)// 最大图片选择数量 int
                .minSelectNum(1)// 最小选择数量 int
                .imageSpanCount(4)// 每行显示个数 int
                .selectionMode(PictureConfig.SINGLE)// 多选 or 单选 PictureConfig.MULTIPLE or PictureConfig.SINGLE
                .previewImage(true)// 是否可预览图片 true or false
                .previewVideo(false)// 是否可预览视频 true or false
                .enablePreviewAudio(false) // 是否可播放音频 true or false
                .isCamera(false)// 是否显示拍照按钮 true or false
                .imageFormat(PictureMimeType.PNG)// 拍照保存图片格式后缀,默认jpeg
                .isZoomAnim(true)// 图片列表点击 缩放效果 默认true
                .sizeMultiplier(0.5f)// glide 加载图片大小 0~1之间 如设置 .glideOverride()无效
                .setOutputCameraPath("/CustomPath")// 自定义拍照保存路径,可不填
                .enableCrop(false)// 是否裁剪 true or false
                .compress(true)// 是否压缩 true or false
//                .glideOverride()// int glide 加载宽高，越小图片列表越流畅，但会影响列表图片浏览的清晰度
                .withAspectRatio(1,1)// int 裁剪比例 如16:9 3:2 3:4 1:1 可自定义
//                .hideBottomControls()// 是否显示uCrop工具栏，默认不显示 true or false
//                .isGif()// 是否显示gif图片 true or false
//                .freeStyleCropEnabled()// 裁剪框是否可拖拽 true or false
//                .circleDimmedLayer()// 是否圆形裁剪 true or false
//                .showCropFrame()// 是否显示裁剪矩形边框 圆形裁剪时建议设为false   true or false
//                .showCropGrid()// 是否显示裁剪矩形网格 圆形裁剪时建议设为false    true or false
//                .openClickSound()// 是否开启点击声音 true or false
//                .selectionMedia()// 是否传入已选图片 List<LocalMedia> list
//                .previewEggs()// 预览图片时 是否增强左右滑动图片体验(图片滑动一半即可看到上一张是否选中) true or false
//                .cropCompressQuality()// 裁剪压缩质量 默认90 int
                .minimumCompressSize(100)// 小于100kb的图片不压缩
                .synOrAsy(true)//同步true或异步false 压缩 默认同步
//                .cropWH()// 裁剪宽高比，设置如果大于图片本身宽高则无效 int
//                .rotateEnabled() // 裁剪是否可旋转图片 true or false
//                .scaleEnabled()// 裁剪是否可放大缩小图片 true or false
//                .videoQuality()// 视频录制质量 0 or 1 int
                .videoMaxSecond(15)// 显示多少秒以内的视频or音频也可适用 int
                .videoMinSecond(10)// 显示多少秒以内的视频or音频也可适用 int
//                .recordVideoSecond()//视频秒数录制 默认60s int
                .isDragFrame(false)// 是否可拖动裁剪框(固定)
                .forResult(PictureConfig.CHOOSE_REQUEST);//结果回调onActivityResult code
    }

    private List<LocalMedia> selectList = new ArrayList<>();
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        List<LocalMedia> images;
        if (resultCode == RESULT_OK) {
            if (requestCode == PictureConfig.CHOOSE_REQUEST) {// 图片选择结果回调

                images = PictureSelector.obtainMultipleResult(data);
                selectList.addAll(images);

                //selectList = PictureSelector.obtainMultipleResult(data);

                // 例如 LocalMedia 里面返回三种path
                // 1.media.getPath(); 为原图path
                // 2.media.getCutPath();为裁剪后path，需判断media.isCut();是否为true
                // 3.media.getCompressPath();为压缩后path，需判断media.isCompressed();是否为true
                // 如果裁剪并压缩了，以取压缩路径为准，因为是先裁剪后压缩的

            }
        }
    }


    public void show(View view) {
        Glide.with(this)
                .load(selectList.get(0).getPath())
                .into((ImageView) findViewById(R.id.image));
    }
}
