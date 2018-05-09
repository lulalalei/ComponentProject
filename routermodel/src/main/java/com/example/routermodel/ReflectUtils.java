package com.example.routermodel;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.example.basemodel.utils.CommonUtils;

/**
 * Created by Administrator on 2018/4/28.
 */

public class ReflectUtils {

    private static final String TAG = "ReflectUtils";//logt

    public static Fragment getFragment(String name){
        Fragment fragment;
        try {
            Class fragmentClass = Class.forName(name);
            fragment= (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "getFragment: error---->"+e.toString());
            return null;
        }
        return fragment;
    }

    public static Object getModuleCall(String name){
        Object object;
        try {
            Class aClass = Class.forName(name);
            object = aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "getModuleCall: error---->"+e.toString());
            return null;
        }
        return object;
    }

    public static void startActivityWithName(Context context,String name){
        try {
            Class aClass = Class.forName(name);
            startActivity(context,aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            CommonUtils.showToast(context,"业务组件单独调试不应该跟其他业务Module产生交互,如果你仍然想要在运行期依赖其他组件,那么请参考appModule");
            Log.d(TAG, "startActivityWithName: error---->"+e.toString());
        }
    }

    public static void startActivity(Context context, Class aClass) {
        context.startActivity(getIntent(context,aClass));
    }

    private static Intent getIntent(Context context, Class aClass) {
        return new Intent(context,aClass);
    }
}
