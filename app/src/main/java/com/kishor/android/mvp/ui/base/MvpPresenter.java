package com.kishor.android.mvp.ui.base;

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

}