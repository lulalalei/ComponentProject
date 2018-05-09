package com.example.administrator.componentdemo.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.example.administrator.componentdemo.R;
import com.example.administrator.componentdemo.m.MainActivityModel;
import com.example.administrator.componentdemo.p.MainActivityPresenter;
import com.example.administrator.componentdemo.v.MainActivityContract;
import com.example.basemodel.bases.BaseActivity;
import com.example.basemodel.utils.CommonUtils;
import com.example.basemodel.widget.BottomBar;
import com.example.routermodel.ReflectUtils;

public class MainActivity extends BaseActivity<MainActivityPresenter,MainActivityModel> implements MainActivityContract.View{

    FrameLayout tab_content;
    BottomBar bb_navigation;

    private Fragment homeFragment,customerFragment,contactFragment,mineFragment;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        tab_content= (FrameLayout) findViewById(R.id.tab_content);
        bb_navigation=(BottomBar)findViewById(R.id.bb_navigation);
        bb_navigation.changeTab(0);

        homeFragment = ReflectUtils.getFragment("com.example.homemodel.fragments.HomeFragment");
        customerFragment = ReflectUtils.getFragment("com.example.customermodel.fragments.CustomerFragment");
        contactFragment = ReflectUtils.getFragment("com.example.contactmodel.fragments.ContactFragment");
        mineFragment = ReflectUtils.getFragment("com.example.minemodel.fragments.MineFragment");
        if (homeFragment == null || customerFragment == null || contactFragment == null || mineFragment == null) {
            CommonUtils.showToast(this, "业务组件单独调试不应该跟其他业务Module产生交互，如果你依然想要在运行期依赖其它组件，那么请参考MainModule");
            return;
        }

        //需要先添加,否则不显示
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(R.id.tab_content, homeFragment);
        beginTransaction.add(R.id.tab_content, customerFragment);
        beginTransaction.add(R.id.tab_content, contactFragment);
        beginTransaction.add(R.id.tab_content, mineFragment);
        hideFragments(beginTransaction);
        beginTransaction.show(homeFragment);
        beginTransaction.commit();

        bb_navigation.setListener(new BottomBar.ChangeListener() {
            @Override
            public void changeTab2(int tab) {
                // 先隐藏掉所有的Fragment，以防止有多个Fragment显示在界面上的情况
                FragmentTransaction transaction = obtainFragmentTransaction();
                hideFragments(transaction);
                switch (tab) {
                    case 0:
                        if (homeFragment == null) {
                            // 如果HomeFragment为空，则创建一个并添加到界面上
                            homeFragment = ReflectUtils.getFragment("com.example.homemodel.fragments.HomeFragment");
                            transaction.add(R.id.tab_content, homeFragment, "HomeFragment");
                        } else {
                            // 如果HomeFragment为空，则直接将它显示出来
                            transaction.show(homeFragment);
                        }
                        transaction.commit();
                        break;
                    case 1:
                        // 当点击了消息tab时，改变控件的图片和文字颜色
                        if (customerFragment == null) {
                            // 如果MessageFragment为空，则创建一个并添加到界面上
                            customerFragment = ReflectUtils.getFragment("com.example.customermodel.fragments.CustomerFragment");
                            transaction.add(R.id.tab_content, customerFragment, "CustomerFragment");
                        } else {
                            // 如果MessageFragment不为空，则直接将它显示出来
                            transaction.show(customerFragment);
                        }
                        transaction.commit();
                        break;
                    case 2:
                        // 当点击了消息tab时，改变控件的图片和文字颜色
                        if (contactFragment == null) {
                            // 如果MessageFragment为空，则创建一个并添加到界面上
                            contactFragment = ReflectUtils.getFragment("com.example.contactmodel.fragments.ContactFragment");
                            //exfs.add(mineFragment);
                            transaction.add(R.id.tab_content, contactFragment, "ContactFragment");
                        } else {
                            // 如果MessageFragment不为空，则直接将它显示出来
                            transaction.show(contactFragment);
                        }
                        transaction.commit();
                        break;
                    case 3:
                        // 当点击了消息tab时，改变控件的图片和文字颜色
                        if (mineFragment == null) {
                            // 如果MessageFragment为空，则创建一个并添加到界面上
                            mineFragment = ReflectUtils.getFragment("com.example.minemodel.fragments.MineFragment");
                            //exfs.add(mineFragment);
                            transaction.add(R.id.tab_content, mineFragment, "MineFragment");
                        } else {
                            // 如果MessageFragment不为空，则直接将它显示出来
                            transaction.show(mineFragment);
                        }
                        transaction.commit();
                        break;
                }
            }
        });
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initdata() {

    }

    private FragmentTransaction obtainFragmentTransaction() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        return ft;
    }

    /**
     * 将所有的Fragment都置为隐藏状态。
     *
     * @param transaction 用于对Fragment执行操作的事务
     */
    private void hideFragments(FragmentTransaction transaction) {
        if (homeFragment != null) {
            transaction.hide(homeFragment);
        }
        if (customerFragment != null) {
            transaction.hide(customerFragment);
        }
        if (contactFragment != null) {
            transaction.hide(contactFragment);
        }
        if (mineFragment != null) {
            transaction.hide(mineFragment);
        }
    }

    @Override
    public void responseMsg(String content) {
        CommonUtils.showToast(this,"接收成功: "+content);
    }
}
