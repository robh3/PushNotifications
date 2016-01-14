package com.robh3.parsepush.app;

import android.app.Application;

import com.robh3.parsepush.helper.ParseUtils;

/**
 * Created by u0172450 on 1/13/2016.
 */
public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        // register with parse
        ParseUtils.registerParse(this);
    }


    public static synchronized MyApplication getInstance() {
        return mInstance;
    }
}
