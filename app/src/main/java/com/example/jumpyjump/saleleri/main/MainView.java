package com.example.jumpyjump.saleleri.main;

import com.example.jumpyjump.saleleri.common.base.BaseView;

public interface MainView extends BaseView {
    void showFeed();

    void showNextFeed(int page);

    void showError();

    void showEmpty();
}
