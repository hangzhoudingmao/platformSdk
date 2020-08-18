package com.dingmao.platformsdk;

/**
 * Create by atu on 2020/8/14
 */
public abstract class LoginKeyCallback<T> {
    abstract void onKeySuccess(T t);
    abstract void onKeyFailed(String msg);
}
