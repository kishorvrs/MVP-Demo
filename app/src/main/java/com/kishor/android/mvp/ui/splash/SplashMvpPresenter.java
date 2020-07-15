package com.kishor.android.mvp.ui.splash;

import com.kishor.android.mvp.ui.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}