package com.example.jumpyjump.saleleri.common.base;

public interface BaseMvpPresenter<V extends BaseView> {
    void attach(V view);

    void detach();

    boolean isDetach();
}
