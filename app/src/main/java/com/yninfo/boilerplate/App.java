package com.yninfo.boilerplate;

import android.app.Application;

import com.orhanobut.logger.Logger;

/**
 * Created by zhaozhiping on 2016/6/17.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init("ajskldjf").hideThreadInfo().methodCount(3);
    }
}
