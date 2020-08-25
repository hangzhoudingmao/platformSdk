package com.dingmao.platformsdk.callback;

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
public abstract class PlatformDownloadCallback {


    public abstract void onFailed(String msg);
    public abstract void onSuccess(String msg);

}
