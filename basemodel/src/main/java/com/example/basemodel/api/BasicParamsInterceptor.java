package com.example.basemodel.api;

import android.util.Log;

import com.example.basemodel.utils.LogUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

/**
 * Created by Administrator on 2018/5/8.
 */

public class BasicParamsInterceptor implements Interceptor{

    public static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json;charset=UTF-8");

    public static String token;

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder requestBuilder = request.newBuilder();
        HttpUrl url = request.url();
        String params = url.encodedQuery();
        //requestBuilder.addHeader("channelCode", "android");
        //requestBuilder.addHeader("charset", "UTF-8");
        //requestBuilder.addHeader("signType", "MD5");
        requestBuilder.addHeader("Cookie", "token=" + token);

        JSONObject jsonObject = new JSONObject();
        if (request.body() instanceof FormBody) {
            FormBody oldFormBody = (FormBody) request.body();
            for (int i = 0; i < oldFormBody.size(); i++) {
                try {
                    jsonObject.put(oldFormBody.name(i), oldFormBody.value(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                jsonObject = new JSONObject(bodyToString(request.body()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        RequestBody body = RequestBody.create(MEDIA_TYPE_JSON, jsonObject.toString().getBytes());
        LogUtil.d("OkHttp", jsonObject.toString());
        // RequestBody body = generateMultipartRequestBody(MEDIA_TYPE_JSON, treeMap);
        requestBuilder.method(request.method(), body);
        request = requestBuilder.build();
        LogUtil.d("OkHttp", request.headers().toString());
        return chain.proceed(request);
    }

    /**
     * 生成类是表单的请求体
     */
    protected RequestBody generateMultipartRequestBody(MediaType type, Map<String, String> map) {
        StringBuilder builder = new StringBuilder();
        Iterator<String> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next();
            builder.append(key);
            builder.append("=");
            builder.append(map.get(key));
            builder.append("&");
        }

        builder.deleteCharAt(builder.length() - 1);
        Log.d("info", builder.toString());
        RequestBody body = RequestBody.create(type, builder.toString().getBytes());

        return body;
    }

    private static String bodyToString(final RequestBody request) {
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if (copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        } catch (final IOException e) {
            return "did not work";
        }
    }
}
