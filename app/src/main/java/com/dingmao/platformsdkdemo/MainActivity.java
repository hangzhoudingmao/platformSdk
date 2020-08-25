package com.dingmao.platformsdkdemo;


import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.dingmao.platformsdk.PlatformCallback;
import com.dingmao.platformsdk.PlatformClient;
import com.dingmao.platformsdk.PlatformSDK;
import com.dingmao.platformsdk.callback.PlatformDownloadCallback;
import com.dingmao.platformsdk.callback.PlatformListCallback;
import com.dingmao.platformsdk.callback.PlatformStringCallback;
import com.dingmao.platformsdk.internal.util.StringUtils;
import com.dingmao.platformsdk.login.LoginByPwdReq;
import com.dingmao.platformsdk.login.LoginResponse;
import com.dingmao.platformsdk.organization.AccountAddReq;
import com.dingmao.platformsdk.organization.AccountListReq;
import com.dingmao.platformsdk.organization.AccountListRsp;
import com.dingmao.platformsdk.organization.BelongOrgListReq;
import com.dingmao.platformsdk.organization.BelongOrgListRsp;
import com.dingmao.platformsdk.organization.DeptDelReq;
import com.dingmao.platformsdk.organization.DeptMultiListReq;
import com.dingmao.platformsdk.organization.DeptMultiListRsp;
import com.dingmao.platformsdk.organization.DeptSubListReq;
import com.dingmao.platformsdk.organization.DeptSubListRsp;
import com.dingmao.platformsdk.organization.DeptUpdateReq;
import com.dingmao.platformsdk.organization.JobDelReq;
import com.dingmao.platformsdk.organization.JobPowerListReq;
import com.dingmao.platformsdk.organization.JobPowerListRsp;
import com.dingmao.platformsdk.organization.JobUpdateReq;
import com.dingmao.platformsdk.organization.ObsListReq;
import com.dingmao.platformsdk.organization.ObsListRsp;
import com.dingmao.platformsdk.organization.ObsPowerListReq;
import com.dingmao.platformsdk.organization.ObsPowerListRsp;
import com.dingmao.platformsdk.organization.ObsRelaDelReq;
import com.dingmao.platformsdk.organization.ObsRelaListReq;
import com.dingmao.platformsdk.organization.ObsRelaListRsp;
import com.dingmao.platformsdk.organization.ObsUserDelReq;
import com.dingmao.platformsdk.organization.OrgCheckCompReq;
import com.dingmao.platformsdk.organization.OrgCheckCompRsp;
import com.dingmao.platformsdk.organization.OrgCompDeptMultiReq;
import com.dingmao.platformsdk.organization.OrgCompDomainReq;
import com.dingmao.platformsdk.organization.OrgCompListReq;
import com.dingmao.platformsdk.organization.OrgCompListRsp;
import com.dingmao.platformsdk.organization.OrgCompUpdateReq;
import com.dingmao.platformsdk.organization.OrgCompUpdateRsp;
import com.dingmao.platformsdk.organization.OrgDelReq;
import com.dingmao.platformsdk.organization.OrgJobAddReq;
import com.dingmao.platformsdk.organization.OrgJobListReq;
import com.dingmao.platformsdk.organization.OrgJobListRsp;
import com.dingmao.platformsdk.organization.OrgMultiListReq;
import com.dingmao.platformsdk.organization.OrgMultiListRsp;
import com.dingmao.platformsdk.organization.OrgObsAddDeptReq;
import com.dingmao.platformsdk.organization.OrgObsAddJobReq;
import com.dingmao.platformsdk.organization.OrgObsAddOrgReq;
import com.dingmao.platformsdk.organization.OrgObsAddReq;
import com.dingmao.platformsdk.organization.OrgObsAddRsp;
import com.dingmao.platformsdk.organization.OrgSubListReq;
import com.dingmao.platformsdk.organization.OrgSubListRsp;
import com.dingmao.platformsdk.organization.OrgTreeReq;
import com.dingmao.platformsdk.organization.OrgTreeRsp;
import com.dingmao.platformsdk.organization.OrgUpdateReq;
import com.dingmao.platformsdk.organization.SubDeptListReq;
import com.dingmao.platformsdk.organization.SubDeptListRsp;
import com.dingmao.platformsdk.usermanagement.CompJobListReq;
import com.dingmao.platformsdk.usermanagement.CompJobListRsp;
import com.dingmao.platformsdk.usermanagement.CompUserListReq;
import com.dingmao.platformsdk.usermanagement.CompUserListRsp;
import com.dingmao.platformsdk.usermanagement.UserAddReq;
import com.dingmao.platformsdk.usermanagement.UserAddRsp;
import com.dingmao.platformsdk.usermanagement.UserDelReq;
import com.dingmao.platformsdk.usermanagement.UserJobDelReq;
import com.dingmao.platformsdk.usermanagement.UserJobListRsp;
import com.google.gson.Gson;
import com.hu.freemarkerlibs.Generator;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlatformSDK.init(getApplication());

    }

    public void login(View view) {
        PlatformClient.doLogin(new LoginByPwdReq("wareCsy", "hz123456"), new PlatformCallback<LoginResponse>() {
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
        });
    }

    public void source(View view) {
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Boolean aBoolean) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

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

    //province_no=110000
    //city_no=110100
    //area_no=110101
    public void create(View view) {
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
            public void onFailed(String msg) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }

            /*@Override
            public void onTokenInvalid(String msg) {

            }*/
        });
    }

    public void freemarker(View view) {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        Log.e("===absolutePath===",absolutePath);
        File file = new File(absolutePath);
        if (!file.exists()){
            file.mkdir();
        }
        String tempFile = absolutePath + "/main.ftl";
        if (!new File(tempFile).exists()){
            try {
                InputStream open = getResources().getAssets().open("temp.ftl");
                FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
                byte[] buffer = new byte[7168];
                int count = 0;
                while ((count = open.read()) > 0){
                    fileOutputStream.write(buffer,0,count);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                open.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        TempUtils tempUtils = new TempUtils();
        try {
            tempUtils.create(absolutePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
