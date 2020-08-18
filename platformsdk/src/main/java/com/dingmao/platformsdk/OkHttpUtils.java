package com.dingmao.platformsdk;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;


import com.dingmao.platformsdk.callback.PlatformListCallback;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Create by atu on 2020/8/14
 */
public class OkHttpUtils {
    private static final String TAG = OkHttpUtils.class.getSimpleName();
    public static OkHttpUtils sOkhttpUtils;
    public static OkHttpClient mOkHttpClient;
    public static Handler mHandler;
    private static MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private OkHttpUtils() {
        mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new HttpLoggingInterceptor(message -> {
                    Log.e(TAG, "========" + message);
                }).setLevel(HttpLoggingInterceptor.Level.BODY))
                .addInterceptor(new HeaderInterceptor())
                .build();
    }

    public static synchronized Handler getHandler(){
        if (mHandler == null)
            mHandler = new Handler();
        return mHandler;
    }

    static OkHttpUtils getInstance(){
        return Inner.sOkhttpUtils;
    }

    private static class Inner{
        private static OkHttpUtils sOkhttpUtils = new OkHttpUtils();
    }

    /**
     * post提交数据
     * @param url
     * @param params
     * @param callback
     */
    void doPost(String url, String params, PlatformCallback callback){
        Request request = new Request.Builder().url(ApiConstant.BASE_URL + url)
                .post(RequestBody.create(JSON,params))
                .build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

    void doPost(String url, String params, PlatformListCallback callback){
        Request request = new Request.Builder().url(ApiConstant.BASE_URL + url)
                .post(RequestBody.create(JSON,params))
                .build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * post 提交文件
     * @param url
     * @param map
     * @param file
     * @param callback
     */
    void doPostFile(String url, Map<String,String> map,File file,PlatformCallback callback){
        MultipartBody.Builder requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM);
        if (file == null){
            callback.onFailed("文件不能为空");
            return;
        }
        RequestBody body = RequestBody.create(MediaType.parse("image/*"), file);
        requestBody.addFormDataPart("pic_file_apk",file.getName(),body);
        if (map != null){
            for (Map.Entry entry:map.entrySet()){
                requestBody.addFormDataPart(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()));
            }
        }
        Request request = new Request.Builder().url(ApiConstant.BASE_URL+url).post(requestBody.build()).build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * get请求
     * @param url
     * @param map
     * @param callback
     */
    void doGet(String url,Map<String,String> map,PlatformCallback callback){
        url = appendParams(url,map);
        Request request = new Request.Builder().url(url).build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * 拼接请求参数
     * @param url
     * @param map
     * @return
     */
    private static String appendParams(String url,Map<String,String> map){
        if (url == null || map == null || map.isEmpty()) return url;
        Uri.Builder builder = Uri.parse(url).buildUpon();
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            builder.appendQueryParameter(key,map.get(key));
        }
        return builder.build().toString();
    }

}
