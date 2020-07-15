package com.kishor.android.mvp.ui.main;

import com.kishor.android.mvp.ui.base.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();

}