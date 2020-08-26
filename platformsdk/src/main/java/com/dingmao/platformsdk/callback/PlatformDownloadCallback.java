package com.dingmao.platformsdk.callback;

import android.os.Environment;
import android.os.Handler;

import com.dingmao.platformsdk.OkHttpUtils;
import com.dingmao.platformsdk.internal.util.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Create by atu on 2020/8/25
 */
public abstract class PlatformDownloadCallback implements Callback {

    private Handler mHandler = OkHttpUtils.getHandler();

    public abstract void onFailed(String msg);
    public abstract void onSuccess(String msg);
    public abstract void onDownProgress(int progress);

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        String body = response.body().toString();

        InputStream is = null;
        byte[] b = new byte[2048];
        int len;
        FileOutputStream fos = null;
        try {
            is = response.body().byteStream();
            long total = response.body().contentLength();
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), StringUtils.getFileName());
            fos = new FileOutputStream(file);
            long sum = 0;
            while ((len = is.read(b)) != -1) {
                fos.write(b, 0, len);
                sum += len;
                int progress = (int) ((sum * 1.0) / total * 100);
                mHandler.post(() ->{
                    onDownProgress(progress);
                });
            }
            fos.flush();
            // 如果下载文件成功，第一个参数为文件的绝对路径
            mHandler.post(() -> {
                onSuccess(file.getAbsolutePath());

            });
        } catch (Exception e) {
            mHandler.post(() -> {
                onFailed(e.getMessage());
            });
        } finally {
            if (is != null) {
                is.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }

    @Override
    public void onFailure(Call call, IOException e) {
        mHandler.post(() -> {
            onFailed(e.getMessage());
        });
    }

}
