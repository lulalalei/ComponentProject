package com.example.homemodel.p;

import com.example.basemodel.api.DefaultObserver;
import com.example.basemodel.api.ResultApi;
import com.example.basemodel.bean.LoginInforBean;
import com.example.homemodel.v.HomeFragmentContract;

/**
 * Created by Administrator on 2018/5/8.
 */

public class HomeFragmentPresenter extends HomeFragmentContract.Presenter{


    @Override
    public void onAttached() {

    }

    @Override
    public void login(int type, String loginName, String loginPwd) {
        addSubscribe(mModel.login(type,loginName,loginPwd)
                .subscribeWith(new DefaultObserver<ResultApi<LoginInforBean>>(mView){

                    @Override
                    public void onSuccess(ResultApi<LoginInforBean> response) {
                        LoginInforBean output = response.getOutput();
                        if (output==null){
                            mView.showMsg("没有token");
                        }else {
                            mView.loginResult(output.getToken());
                        }
                    }
                }));
    }

}
