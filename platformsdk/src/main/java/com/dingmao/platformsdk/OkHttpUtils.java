package com.dingmao.platformsdk;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;


import com.dingmao.platformsdk.callback.FlushTokenCallback;
import com.dingmao.platformsdk.callback.PlatformDownloadCallback;
import com.dingmao.platformsdk.callback.PlatformListCallback;
import com.dingmao.platformsdk.callback.PlatformStringCallback;
import com.dingmao.platformsdk.insertmanagement.RefreshTokenRsp;
import com.dingmao.platformsdk.internal.util.SPUtils;
import com.dingmao.platformsdk.internal.util.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
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
        mHandler = getHandler();
    }

    public static synchronized Handler getHandler() {
        if (mHandler == null)
            mHandler = new Handler(Looper.getMainLooper());
        return mHandler;
    }

    static OkHttpUtils getInstance() {
        return Inner.sOkhttpUtils;
    }

    private static class Inner {
        private static OkHttpUtils sOkhttpUtils = new OkHttpUtils();
    }

    /**
     * post处理返回对象
     *
     * @param url
     * @param params
     * @param callback
     */
    void doPost(String url, String params, PlatformCallback callback) {
        doPost(url, params, callback, "");
    }

    /**
     * post处理返回对象
     *
     * @param url
     * @param params
     * @param callback
     */
    void doPost(String url, String params, PlatformCallback callback, String tip) {
        if (!StringUtils.isEmpty(tip)) {
            callback.onFailed(tip);
            return;
        }
        Request request = new Request.Builder().url(ApiConstant.BASE_URL + url)
                .post(RequestBody.create(JSON, params))
                .build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

    void doPost(String url, String params, PlatformStringCallback callback) {
        doPost(url, params, callback, "");
    }

    void doPost(String url, String params, PlatformStringCallback callback, String tip) {
        if (!StringUtils.isEmpty(tip)) {
            callback.onFailed(tip);
            return;
        }
        Request request = new Request.Builder().url(ApiConstant.BASE_URL + url)
                .post(RequestBody.create(JSON, params))
                .build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * 刷新token使用
     *
     * @param url
     * @param callback
     */
    void doPost(String url, PlatformStringCallback callback) {
        Request request = new Request
                .Builder()
                .url(ApiConstant.BASE_URL + url)
                .addHeader("refresh_token", SPUtils.get(ApiConstant.KEY_REFRESH_TOKEN, "").toString())
                .post(RequestBody.create(JSON, ""))
                .build();
        mOkHttpClient.newCall(request).enqueue(new FlushTokenCallback<RefreshTokenRsp>() {
            @Override
            public void onSuccess(RefreshTokenRsp refreshTokenRsp) {
                SPUtils.put(ApiConstant.KEY_TOKEN, refreshTokenRsp.getAccess_token());
                callback.onSuccess("刷新成功");
            }

            @Override
            public void onFailed(String msg) {
                callback.onFailed(msg);
            }
        });
    }

    /**
     * post 处理返回数组对象
     *
     * @param url
     * @param params
     * @param callback
     */
    void doPost(String url, String params, PlatformListCallback callback) {
        doPost(url, params, callback, "");
    }

    /**
     * post 处理返回数组对象
     *
     * @param url
     * @param params
     * @param callback
     */
    void doPost(String url, String params, PlatformListCallback callback, String tip) {
        if (!StringUtils.isEmpty(tip)) {
            callback.onFailed(tip);
            return;
        }
        Request request = new Request.Builder().url(ApiConstant.BASE_URL + url)
                .post(RequestBody.create(JSON, params))
                .build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * post 提交文件
     *
     * @param url
     * @param file
     * @param callback
     */
    void doPostFile(String url, File file, String fileKey, PlatformCallback callback) {
        doPostFile(url, null, file, fileKey, callback);
    }

    /**
     * post 提交文件
     *
     * @param url
     * @param map
     * @param file
     * @param callback
     */
    void doPostFile(String url, Map<String, String> map, File file, String fileKey, PlatformCallback callback) {
        MultipartBody.Builder requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM);
        if (file == null) {
            callback.onFailed("文件不能为空");
            return;
        }
        RequestBody body = RequestBody.create(MediaType.parse("image/*"), file);
        requestBody.addFormDataPart(fileKey, file.getName(), body);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                requestBody.addFormDataPart(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }
        }
        Request request = new Request.Builder().url(ApiConstant.BASE_URL + url).post(requestBody.build()).build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * get请求
     *
     * @param url
     * @param map
     * @param callback
     */
    void doGet(String url, Map<String, String> map, PlatformCallback callback) {
        url = appendParams(ApiConstant.BASE_URL + url, map);
        Request request = new Request.Builder().url(url).build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * 下载文件
     * @param url
     * @param map
     * @param path
     * @param callback
     */
    void doDownloadFile(String url, Map<String, String> map, String path, PlatformDownloadCallback callback) {
        String newUrl = appendParams(ApiConstant.BASE_URL + url, map);
        Request request = new Request.Builder().url(newUrl).build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

    /**
     * 拼接请求参数
     *
     * @param url
     * @param map
     * @return
     */
    private static String appendParams(String url, Map<String, String> map) {
        if (url == null || map == null || map.isEmpty()) return url;
        Uri.Builder builder = Uri.parse(url).buildUpon();
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            builder.appendQueryParameter(key, map.get(key));
        }
        return builder.build().toString();
    }

}
