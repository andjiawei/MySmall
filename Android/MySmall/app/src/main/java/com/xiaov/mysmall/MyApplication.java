package com.xiaov.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * 描述:
 * 作者：zhangjiawei
 * 时间：2017/2/6
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Small.preSetUp(this);
    }
}
