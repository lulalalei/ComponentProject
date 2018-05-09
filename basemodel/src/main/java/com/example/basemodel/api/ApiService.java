package com.example.basemodel.api;

import com.example.basemodel.bean.LoginInforBean;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * Created by Administrator on 2018/5/8.
 */

public interface ApiService {

    //密码登录
    @FormUrlEncoded
    @POST("login.action")
    Flowable<ResultApi<LoginInforBean>> login(@Field("type") int type,
                                              @Field("loginName") String loginName,
                                              @Field("loginPwd") String loginPwd);
}
