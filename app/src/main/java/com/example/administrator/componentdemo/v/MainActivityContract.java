package com.example.administrator.componentdemo.v;

import com.example.basemodel.bases.BaseModel;
import com.example.basemodel.bases.BaseView;
import com.example.basemodel.bases.RxPresenter;

/**
 * Created by Administrator on 2018/5/8.
 */

public interface MainActivityContract {

    interface Model extends BaseModel{

    }

    interface View extends BaseView{

        void responseMsg(String content);
    }

    abstract class Presenter extends RxPresenter<MainActivityContract.Model,MainActivityContract.View>{

    }

}
