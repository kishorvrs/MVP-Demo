package com.kishor.android.mvp.ui.login;

import com.kishor.android.mvp.ui.base.MvpPresenter;

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);

}