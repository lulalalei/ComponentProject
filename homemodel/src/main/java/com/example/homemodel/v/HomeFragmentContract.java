package com.example.homemodel.v;

import com.example.basemodel.api.ResultApi;
import com.example.basemodel.bases.BaseModel;
import com.example.basemodel.bases.BasePresenter;
import com.example.basemodel.bases.BaseView;
import com.example.basemodel.bases.RxPresenter;
import com.example.basemodel.bean.LoginInforBean;

import io.reactivex.Flowable;


/**
 * Created by Administrator on 2018/5/8.
 */

public interface HomeFragmentContract {

    interface Model extends BaseModel{

        Flowable<ResultApi<LoginInforBean>> login(int type, String loginName, String loginPwd);
    }

    interface View extends BaseView{

        void loginResult(String msg);

    }

    abstract class Presenter extends RxPresenter<HomeFragmentContract.Model,HomeFragmentContract.View> {

        public abstract void login(int type,String loginName,String loginPwd);

    }
}
