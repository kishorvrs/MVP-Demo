package com.kishor.android.mvp.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.kishor.android.mvp.ui.login.LoginActivity;
import com.kishor.android.mvp.ui.main.MainActivity;
import com.kishor.android.mvp.R;
import com.kishor.android.mvp.model.DataManager;
import com.kishor.android.mvp.ui.base.BaseActivity;
import com.kishor.android.mvp.utils.MvpApp;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();

        mSplashPresenter = new SplashPresenter(dataManager);

        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();

    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}