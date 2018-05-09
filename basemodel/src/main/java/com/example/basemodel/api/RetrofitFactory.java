package com.example.basemodel.api;

import com.example.basemodel.BuildConfig;
import com.example.basemodel.utils.LogUtil;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2018/5/8.
 */

public class RetrofitFactory {

    private static final String TAG = "RetrofitFactory";

    private static final int DEFAULT_TIME_OUT = 20;//超时时间 20s
    private static final int DEFAULT_READ_TIME_OUT = 20;
    private static final int DEFAULT_WRITE_TIME_OUT = 20;

    private static RetrofitFactory INSTANCE = null;

    private Retrofit mRetrofit;

    public RetrofitFactory() {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                LogUtil.d("okhttp","retrofitBack"+message);
            }
        });
        //HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();//换了一下这个方法
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        OkHttpClient client = new OkHttpClient.Builder()

                .addInterceptor(httpLoggingInterceptor)
                .addInterceptor(new BasicParamsInterceptor())
                .connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_WRITE_TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_READ_TIME_OUT, TimeUnit.SECONDS)
                //错误重连
                //.retryOnConnectionFailure(true)
                .build();


        // 创建Retrofit
        mRetrofit = new Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                //.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(new Converter.Factory() {
                    @Override
                    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
                        return new Converter<ResponseBody, String>() {

                            @Override
                            public String convert(ResponseBody value) throws IOException {
                                return value.string();
                            }
                        };
                    }
                })
                .baseUrl(BuildConfig.AlphaUrl)
                .build();
    }

    public static RetrofitFactory getINSTANCE() {

        if (INSTANCE == null)
            INSTANCE = new RetrofitFactory();
        return INSTANCE;
    }


    public <T> T create(Class<T> service) {
        return mRetrofit.create(service);
    }
}
