package com.dingmao.platformsdk.internal.util;

import android.util.Log;


import com.dingmao.platformsdk.PlatformSDK;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Create by atu on 2020/8/17
 */
public class JsonParseUtils {

    public static void parseJson(){
        try {
            InputStream inputStream = PlatformSDK.getContext().getAssets().open("api.json");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line);
            }
            inputStream.close();
            bufferedReader.close();
            JSONArray jsonArray = new JSONArray(stringBuilder.toString());
            for (int i = 0;i < jsonArray.length();i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Log.e("name===",jsonObject.getString("name"));
                JSONArray list = jsonObject.getJSONArray("list");
                for (int j = 0;j < list.length();j++){
                    JSONObject jsonObject1 = list.getJSONObject(j);
                    String reqType = jsonObject1.getString("req_body_type");
                    if (reqType.equals("json")){
                        String reqStr = jsonObject1.getString("req_body_other");
                        JSONObject reqObj = new JSONObject(reqStr);
                        Log.e("reqObj====",reqObj.toString());
                        JSONObject properties = reqObj.getJSONObject("properties");
                        Log.e("properties====",properties.toString());
//                        Field[] declaredFields = properties.getClass().getDeclaredFields();
                        /*for (int k = 0;k<declaredFields.length;k++){
                            Log.e("declaredFields====",declaredFields[k].getName());
                        }*/
                    }
                }
                return;

            }

        } catch (IOException e) {
            Log.e("getAssets",e.getMessage());
            e.printStackTrace();
        } catch (JSONException e) {
            Log.e("JSONObject",e.getMessage());
            e.printStackTrace();
        }
    }
}
