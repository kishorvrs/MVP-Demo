package com.kishor.android.mvp.utils;

import android.app.Application;

import com.kishor.android.mvp.model.DataManager;
import com.kishor.android.mvp.model.SharedPrefsHelper;

public class MvpApp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);

    }

    public DataManager getDataManager() {
        return dataManager;
    }

}