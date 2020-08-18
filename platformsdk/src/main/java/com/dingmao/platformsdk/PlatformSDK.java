package com.dingmao.platformsdk;

import android.app.Application;
import android.content.Context;

/**
 * Create by atu on 2020/8/13
 */
public class PlatformSDK {
    private static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    public static void init(Application application){
        sContext = application;
    }
}
