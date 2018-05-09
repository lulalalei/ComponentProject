package com.example.homemodel.m;

import com.example.basemodel.api.ApiService;
import com.example.basemodel.api.ResultApi;
import com.example.basemodel.api.RetrofitFactory;
import com.example.basemodel.bases.RxSchedulers;
import com.example.basemodel.bean.LoginInforBean;
import com.example.homemodel.v.HomeFragmentContract;

import io.reactivex.Flowable;

/**
 * Created by Administrator on 2018/5/8.
 */

public class HomeFragmentModel implements HomeFragmentContract.Model{

    private ApiService service;

    public HomeFragmentModel() {
        service = RetrofitFactory.getINSTANCE().create(ApiService.class);
    }

    @Override
    public Flowable<ResultApi<LoginInforBean>> login(int type, String loginName, String loginPwd) {
        return service.login(type,loginName,loginPwd).compose(RxSchedulers.<ResultApi<LoginInforBean>>io_main());
    }
}
