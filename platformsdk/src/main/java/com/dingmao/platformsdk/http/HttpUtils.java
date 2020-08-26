package com.dingmao.platformsdk.http;

import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * Author : Wang_ke
 * Description :
 * Date : 2020-08-06
 */
public class HttpUtils {

    private OkHttpClient okHttpClient;
    private Handler handler;
    private Gson gson;
    private static HttpUtils mInstance;
    private final HashMap<String, List<Cookie>> cookieStore = new HashMap<>();

    private HttpUtils() {
        //添加cookie
        okHttpClient = new OkHttpClient.Builder().cookieJar(new CookieJar() {
            @Override
            public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                cookieStore.put(url.host(), cookies);

            }

            @Override
            public List<Cookie> loadForRequest(HttpUrl url) {
                List<Cookie> cookies = cookieStore.get(url.host());
                return cookies != null ? cookies : new ArrayList<Cookie>();
            }
        }).build();
        handler = new Handler(Looper.getMainLooper());
        gson = new Gson();
    }

    /**
     * HttpUtils
     *
     * @return mInstance
     */
    public static HttpUtils getInstance() {
        if (mInstance == null) {
            synchronized (HttpUtils.class) {
                mInstance = new HttpUtils();
            }
        }
        return mInstance;
    }

    /**
     * get 无参同步请求
     *
     * @return response
     */
    private Response _doGetSync(String url) {
        Request request = new Request.Builder()
                .get()//默认get,可省略
                .url(url)
                .build();
        Response response = null;
        try {
            response = okHttpClient.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    /**
     * get 无参异步请求
     */
    private void _doGetAsync(String url, final ResultCallback callback) {
        final Request request = new Request.Builder()
                .url(url)
                .build();
        doRequest(callback, request);
    }

    /**
     * post 同步请求
     * form
     *
     * @return response
     */
    private Response _doPostSync(String url, Map<String, String> params) throws IOException {
        Param[] paramsArr = ParamUtils.map2Params(params);
        Request request = ParamUtils.buildPostRequest(url, paramsArr);
        return okHttpClient.newCall(request).execute();

    }

    /**
     * post 异步请求
     * form
     */

    private void _doPostAsync(String url, Map<String, String> params, final ResultCallback callback) {
        Param[] paramsArr = ParamUtils.map2Params(params);
        Request request = ParamUtils.buildPostRequest(url, paramsArr);
        doRequest(callback, request);
    }

    /**
     * 同步 post上传json对象
     *
     * @param url     url;
     * @param jsonStr json 字符串
     * @return 字符串
     * @throws IOException
     */
    private Response _doPostSync(String url, String jsonStr) throws IOException {
        String result = null;
        MediaType JSON = MediaType.parse("text/html;charset=utf-8");
        RequestBody requestBody = RequestBody.create(JSON, jsonStr);
        Request request = new Request.Builder().url(url).post(requestBody).build();
        return okHttpClient.newCall(request).execute();
    }

    /**
     * 异步 post上传json对象
     *
     * @param url      url
     * @param jsonStr  json数据字符串
     * @param callback callback
     */
    private void _doPostAsync(String url, String jsonStr, final ResultCallback callback) {
        MediaType JSON = MediaType.parse("text/html;charset=utf-8");
        RequestBody requestBody = RequestBody.create(JSON, jsonStr);
        Request request = new Request.Builder().url(url).post(requestBody).build();
        doRequest(callback, request);
    }

    /**
     * 异步基于post的多文件上传
     */
    private void _doUploadFileAsync(String url, final ResultCallback callback, File[] files, String[] fileKeys, Param... params) {
        Request request = ParamUtils.buildFormRequest(url, files, fileKeys, params);
        doRequest(callback, request);
    }

    /**
     * 异步基于post的文件上传，单文件不带参数上传
     *
     * @param url
     * @param callback
     * @param file
     * @param fileKey
     */
    private void _doUploadFileAsync(String url, ResultCallback callback, File file, String fileKey) {
        Request request = ParamUtils.buildFormRequest(url, new File[]{file}, new String[]{fileKey}, null);
        doRequest(callback, request);
    }

    /**
     * 异步基于post的文件上传，单文件且携带其他form参数上传
     *
     * @param url      接口地址
     * @param callback callback
     * @param file     file
     * @param fileKey  fileKey
     * @param params   params
     */
    private void _postDataFileAsync(String url, ResultCallback callback, File file, String fileKey, Param... params) {
        Request request = ParamUtils.buildFormRequest(url, new File[]{file}, new String[]{fileKey}, params);
        doRequest(callback, request);
    }


    /**
     * post 异步上传图片
     *
     * @param url      url
     * @param callback callback
     * @param file     file
     * @param fileKey  fileKey
     * @param map      map
     */
    private void _upLoadImg(String url, final ResultCallback callback, File file, String fileKey, Map<String, String> map) {
        Param[] params = ParamUtils.map2Params(map);
        getInstance()._postDataFileAsync(url, callback, file, fileKey, params);
    }

    /**
     * 异步下载文件
     */
    public void _downloadFileAsync(final String url, final String destFileDir,
                                    final ResultCallback callback) {
        final Request request = new Request.Builder().url(url).build();
        final Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {
                sendFailedStringCallback(request, e, callback);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                InputStream is = null;
                byte[] b = new byte[2048];
                int len;
                FileOutputStream fos = null;
                try {
                    is = response.body().byteStream();
                    File file = new File(destFileDir, getFileName(url));
                    fos = new FileOutputStream(file);
                    while ((len = is.read(b)) != -1) {
                        fos.write(b, 0, len);
                    }
                    fos.flush();
                    // 如果下载文件成功，第一个参数为文件的绝对路径
                    sendSuccessResultCallback(file.getAbsolutePath(), callback);
                } catch (Exception e) {
                    sendFailedStringCallback(response.request(), e, callback);
                } finally {
                    if (is != null) {
                        is.close();
                    }
                    if (fos != null) {
                        fos.close();
                    }
                }
            }

        });
    }

    private String getFileName(String path) {
        int separatorIndex = path.lastIndexOf("/");
        return (separatorIndex < 0) ? path : path.substring(separatorIndex + 1,
                path.length());
    }

    /***************************************************************** 外部调用***************************************************/
    /**
     * get 同步请求
     *
     * @param url 接口地址
     * @return response
     */
    public static Response doGetSync(String url) {
        return getInstance()._doGetSync(url);
    }

    /**
     * get 异步请求
     *
     * @param url 接口地址
     */
    public static void doGetAsync(String url, final ResultCallback callback) {
        getInstance()._doGetAsync(url, callback);
    }

    /**
     * post map集合 异步请求
     *
     * @param url      url
     * @param callback callback
     * @param params   params
     */
    public static void doPostAsync(String url, Map<String, String> params, final ResultCallback callback) {
        getInstance()._doPostAsync(url, params, callback);
    }

    /**
     * post 异步上传图片
     *
     * @param url      url
     * @param callback callback
     * @param file     file
     * @param fileKey  fileKey
     * @param map      map
     */
    public static void upLoadImg(String url, final ResultCallback callback, File file, String fileKey, Map<String, String> map) {
        getInstance()._upLoadImg(url, callback, file, fileKey, map);
    }


    /**
     * 请求回调处理方法并传递返回值
     *
     * @param callback Map类型请求参数
     * @param request  Request请求
     */
    private void doRequest(final ResultCallback callback, final Request request) {
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                sendFailedStringCallback(request, e, callback);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    final String string = response.body().string();
                    if (callback.mType == String.class) {
                        sendSuccessResultCallback(string, callback);
                    } else {
                        Object o = gson.fromJson(string, callback.mType);
                        sendSuccessResultCallback(o, callback);
                    }


                } catch (IOException e) {
                    sendFailedStringCallback(response.request(), e, callback);
                } catch (com.google.gson.JsonParseException e)//Json解析的错误
                {
                    sendFailedStringCallback(response.request(), e, callback);
                }
            }

        });
    }

    /**
     * 处理请求失败的回调信息方法
     *
     * @param e        错误信息
     * @param callback 回调类
     */
    private void sendFailedStringCallback(final Request request, final Exception e, final ResultCallback callback) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (callback != null)
                    callback.onError(request, e);
            }
        });
    }

    /**
     * 处理请求成功的回调信息方法
     *
     * @param object   服务器响应信息
     * @param callback 回调类
     */
    private void sendSuccessResultCallback(final Object object, final ResultCallback callback) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (callback != null) {
                    callback.onResponse(object);
                }
            }
        });
    }

}
