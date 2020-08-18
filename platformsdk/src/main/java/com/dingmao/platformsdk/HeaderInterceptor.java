package com.dingmao.platformsdk;

import android.util.Log;


import com.dingmao.platformsdk.internal.util.SPUtils;

import java.io.IOException;
import java.nio.charset.Charset;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

import static okhttp3.internal.Util.UTF_8;


/**
 * Created by Ke_Wang on 2019/6/5.
 */

public class HeaderInterceptor implements Interceptor {
    private static final String TAG = "Request";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        RequestBody body = original.body();
        if (body!=null) {
            printParams(original.body());
        }
        Log.e("token", SPUtils.get(ApiConstant.KEY_TOKEN,"").toString());
        Request.Builder requestBuilder = original.newBuilder()
                .addHeader("access-token", SPUtils.get(ApiConstant.KEY_TOKEN,"").toString())
                .addHeader("key", SPUtils.get(ApiConstant.KEY_SECRET,"").toString());
        Request request = requestBuilder.build();
        return chain.proceed(request);
    }

    private void printParams(RequestBody body) {
        Buffer buffer = new Buffer();
        try {
            body.writeTo(buffer);
            Charset charset = Charset.forName("UTF-8");
            MediaType contentType = body.contentType();
            if (contentType != null) {
                charset = contentType.charset(UTF_8);
            }
            String params = buffer.readString(charset);
            Log.i(TAG, "请求参数： | " + params);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
