package com.dingmao.platformsdk;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;

/**
 * Create by atu on 2020/8/13
 */
public class GsonRequestConvert<T> {
    private Gson mGson;
    private TypeAdapter<T> adapter;
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json;charset=utf-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public GsonRequestConvert(Class<T> tClass) {
        mGson = new Gson();
        adapter = mGson.getAdapter(tClass);
    }

    public RequestBody convert(T value) throws IOException {
        Buffer buffer = new Buffer();
        Writer writer = new OutputStreamWriter(buffer.outputStream(), UTF_8);
        JsonWriter jsonWriter = mGson.newJsonWriter(writer);
        adapter.write(jsonWriter, value);
        jsonWriter.close();
        return RequestBody.create(MEDIA_TYPE,buffer.readByteString());
    }
}
