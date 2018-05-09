package com.example.basemodel.bases;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.support.multidex.MultiDex;

/**
 * Created by Administrator on 2018/5/2.
 */

public class BaseApplication extends Application{

    private static Context context;

    private static BaseApplication instance;

    public static final Context getAppContext() {
        return context;
    }

    public static BaseApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        instance = this;

        /**
         * 解决Android7.0 FileUriExposedException问题
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());
        }
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 65535
        MultiDex.install(this);
    }
}
