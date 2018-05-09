package com.example.homemodel.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basemodel.api.BasicParamsInterceptor;
import com.example.basemodel.bases.BaseFragment;
import com.example.basemodel.bases.RxBus;
import com.example.basemodel.cans.Constants;
import com.example.basemodel.eventbean.TestEvent;
import com.example.homemodel.R;

import com.example.homemodel.R2;
import com.example.homemodel.m.HomeFragmentModel;
import com.example.homemodel.p.HomeFragmentPresenter;
import com.example.homemodel.v.HomeFragmentContract;
import com.example.routermodel.ReflectUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018/4/28.
 */

public class HomeFragment extends BaseFragment<HomeFragmentPresenter,HomeFragmentModel> implements View.OnClickListener,HomeFragmentContract.View{

    @BindView(R2.id.et_mobile)
    EditText et_mobile;
    @BindView(R2.id.et_pwd)
    EditText et_pwd;
    @BindView(R2.id.tv_login)
    TextView tv_login;
    @BindView(R2.id.tv_send_msg)
    TextView tv_send_msg;
    @BindView(R2.id.tv_home)
    TextView tv_home;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_layout;
    }

    @Override
    public void initView() {

        tv_login.setOnClickListener(this);
        tv_send_msg.setOnClickListener(this);
        tv_home.setOnClickListener(this);

    }

    @Override
    protected void initData(Bundle savedInstanceState) {

        Toast.makeText(mContext,"首页",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.tv_home) {
            //Toast.makeText(mContext,"首页",Toast.LENGTH_LONG).show();
            ReflectUtils.startActivityWithName(mContext,"com.example.customermodel.activities.CustomerDetailActivity");
        }else if (i==R.id.tv_login){
            mPresenter.login(9,et_mobile.getText().toString().trim(),et_pwd.getText().toString().trim());
        }else if (i==R.id.tv_send_msg){
            RxBus.getDefault().post(new TestEvent("RxBus发送测试内容",Constants.SEND_MESSAGE_TEST));
        }
    }

    @Override
    public void loginResult(String msg) {
        BasicParamsInterceptor.token=msg;
        //Toast.makeText(mContext,msg,Toast.LENGTH_LONG).show();
    }
}
