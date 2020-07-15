package com.kishor.android.mvp.ui.login;

import com.kishor.android.mvp.model.DataManager;
import com.kishor.android.mvp.ui.base.BasePresenter;

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }

}