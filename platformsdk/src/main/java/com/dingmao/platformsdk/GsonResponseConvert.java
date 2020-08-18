package com.dingmao.platformsdk;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;

import java.io.IOException;

import okhttp3.ResponseBody;

/**
 * Create by atu on 2020/8/13
 */
public class GsonResponseConvert<T> {
    private final Gson gson;
    private final TypeAdapter<T> adapter;

    public GsonResponseConvert(Class<T> tClass) {
        this.gson = new Gson();
        this.adapter = gson.getAdapter(tClass);
    }

    public T convert(ResponseBody body) throws IOException {
        JsonReader jsonReader = gson.newJsonReader(body.charStream());
        return adapter.read(jsonReader);
    }
}
