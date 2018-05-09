package com.example.customermodel.interfacesimpl;

import android.content.Context;

import com.example.basemodel.utils.CommonUtils;
import com.example.routermodel.CustomerModuleService;

/**
 * Created by Administrator on 2018/5/2.
 */

public class CustomerModuleServiceImpl implements CustomerModuleService{

    private Context context;

    @Override
    public void initContext(Context context) {
        this.context=context;
    }

    @Override
    public void getCustomerInfo() {
        //TODO 此处应该为异步操作,如果需要获取网络数据,则需要开启线程,拿到数据后再回调给调用者
        CommonUtils.showToast(context,"张三的个人信息!");
    }
}
