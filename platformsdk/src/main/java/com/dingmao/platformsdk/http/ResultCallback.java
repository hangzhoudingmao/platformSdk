package com.dingmao.platformsdk.http;

import com.google.gson.internal.$Gson$Types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Request;

/**
 * Author : Wang_ke
 * Description :
 * Date : 2020-08-06
 */
public abstract class ResultCallback<T> {

    //这是请求数据的返回类型，包含常见的（Bean，List等）
    Type mType;

    public ResultCallback() {
        mType = getSuperclassTypeParameter(getClass());
    }

    /**
     * 通过反射想要的返回类型
     *
     * @param subclass
     * @return
     */
    static Type getSuperclassTypeParameter(Class<?> subclass) {
        Type superclass = subclass.getGenericSuperclass();
        if (superclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        ParameterizedType parameterized = (ParameterizedType) superclass;
        return $Gson$Types.canonicalize(parameterized.getActualTypeArguments()[0]);
    }

    //失败回调
    public abstract void onError(Request request, Exception e);

    //成功的回调
    public abstract void onResponse(T response);
}
