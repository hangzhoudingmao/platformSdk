package com.dingmao.platformsdkdemo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.dingmao.platformsdk.PlatformCallback;
import com.dingmao.platformsdk.PlatformClient;
import com.dingmao.platformsdk.PlatformSDK;
import com.dingmao.platformsdk.insertmanagement.EquipCreateReq;
import com.dingmao.platformsdk.insertmanagement.EquipCreateRsp;
import com.dingmao.platformsdk.organization.OrgCompDeptMultiReq;
import com.dingmao.platformsdk.systemmanagement.SysDelVerReq;
import com.google.gson.Gson;
import com.hu.freemarkerlibs.Generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlatformSDK.init(getApplication());
    }

    public void login(View view) {
        /*PlatformClient.doLogin(new LoginByPwdReq("gly2", "hz123456"), new PlatformCallback<LoginResponse>() {
            @Override
            public void onSuccess(LoginResponse o) {

            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                Log.e("onFailed",msg);
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });*/
        OrgCompDeptMultiReq q = new OrgCompDeptMultiReq();
        OrgCompDeptMultiReq.OrgDeptMultiReq  e = new OrgCompDeptMultiReq.OrgDeptMultiReq();

        List list= new ArrayList();
        list.add(e);
        q.setMulti_para(list);
        PlatformClient.doOrgCompExist(q, new PlatformCallback() {
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

    public void source(View view) {
        EquipCreateReq equipCreateReq = new EquipCreateReq();

        ArrayList<EquipCreateReq.EquipReq> list = new ArrayList<>();
        EquipCreateReq.EquipReq equipReq = new EquipCreateReq.EquipReq();
        equipReq.setMac("00:00:11:22");
        equipReq.setEquip_name("测试");
        list.add(equipReq);
        equipCreateReq.setData(list);
        PlatformClient.doEquipCreate(equipCreateReq, new PlatformCallback<EquipCreateRsp>() {
            @Override
            public void onSuccess(EquipCreateRsp o) {

            }

            @Override
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTokenInvalid(String msg) {

            }
        });
    }

    private String json = "{\"type\":\"object\",\"title\":\"empty object\",\"properties\":{\"rela_id\":{\"type\":\"string\",\"description\":\"业务关联id\"},\"module\":{\"type\":\"string\",\"description\":\"模块\"},\"file_path\":{\"type\":\"string\",\"description\":\"文件路径\"},\"file_id\":{\"type\":\"string\",\"description\":\"文件Id\"},\"is_delete\":{\"type\":\"string\",\"description\":\"是否被删除，使用标准码yn\"},\"start_time\":{\"type\":\"string\"},\"end_time\":{\"type\":\"string\"},\"create_id\":{\"type\":\"string\",\"description\":\"上传人Id\"},\"is_page\":{\"type\":\"string\",\"description\":\"是否分页（0：否，1：是）\"},\"page\":{\"type\":\"string\",\"description\":\"页码\"},\"page_size\":{\"type\":\"string\",\"description\":\"每页数量\"}},\"required\":[\"is_page\"]}";

    public void parse(View view) {
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
    }

    public void create(View view) {}

    public void freemarker(View view) {
        /*HashMap<String,Object> beanMap = new HashMap<>();
        beanMap.put("beanName","User");
        List<Map<String,String>> paramList = new ArrayList<>();
        for (int i=0;i<4;i++){//有多少个属性就遍历几次
            Map<String,String> tmpParamMap = new HashMap<>();
            tmpParamMap.put("fieldNote","fieldNote" + i);
            tmpParamMap.put("type","String");
            tmpParamMap.put("field","field" + i);
            paramList.add(tmpParamMap);
        }
        beanMap.put("attrs",paramList);
        try {

        } catch (Exception e) {
            Log.e("exception===",e.getMessage());
            e.printStackTrace();
        }*/
        Generator daoGenerator = null;
        try {
            daoGenerator = new Generator("myJavaFile.ftl");
            daoGenerator.generate(new File("checkTest"), "com.example.abc","Test",11233,"man","Jeck");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
