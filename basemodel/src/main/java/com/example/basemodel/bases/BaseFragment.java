package com.example.basemodel.bases;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.basemodel.utils.CommonUtils;
import com.example.basemodel.utils.InstanceUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/5/8.
 */

public abstract class BaseFragment<P extends RxPresenter,M extends BaseModel> extends Fragment implements BaseView{

    public P mPresenter;
    public Context mContext;
    private Unbinder unbinder;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter= InstanceUtil.getInstance(this,0);
        if (this instanceof BaseView && mPresenter!=null){
            mPresenter.setVM(this,InstanceUtil.getInstance(this,1));
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (getLayoutId()==0){
            return null;
        }
        View view = inflater.inflate(getLayoutId(), container, false);
        unbinder= ButterKnife.bind(this,view);
        initView();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData(savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (unbinder!=null){
            unbinder.unbind();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null){
            mPresenter.onDetached();
        }
    }

    @Override
    public void showMsg(String msg) {
        CommonUtils.showToast(mContext,msg);
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

    /*
                                * 布局加载
                                * */
    protected abstract int getLayoutId();

    /*
    * 数据填充
    * */
    public abstract void initView();

    protected abstract void initData(Bundle savedInstanceState);
}
