package com.example.basemodel.bases;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.example.basemodel.utils.CommonUtils;
import com.example.basemodel.utils.InstanceUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/5/8.
 */

public abstract class BaseActivity<P extends BasePresenter,M extends BaseModel> extends AppCompatActivity implements BaseView{

    public P mPresenter;
    public Context mContext;
    private Unbinder unbinder;

    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(getLayoutId());

        unbinder= ButterKnife.bind(this);
        mContext=this;

        mPresenter= InstanceUtil.getInstance(this,0);
        if (this instanceof BaseView && mPresenter!=null) {
            mPresenter.setVM(this,InstanceUtil.getInstance(this,1));
        }
        this.initView();
        this.initListener();
        this.initdata();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null){
            mPresenter.onDetached();
        }
        if (unbinder!=null){
            unbinder.unbind();
        }


    }

    /*
            * 加载布局文件*/
    public abstract int getLayoutId();

    /**
     * 初始化控件
     */
    public abstract void initView();


    public abstract void initListener();

    /**
     * 初始数据
     */
    public abstract void initdata();

    @Override
    public void showMsg(String msg) {
        CommonUtils.showToast(this,msg);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dissmissLoading() {

    }

    @Override
    public void haveLoginInOtherDevices() {

    }
}
