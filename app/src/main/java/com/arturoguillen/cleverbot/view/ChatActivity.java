package com.arturoguillen.cleverbot.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.arturoguillen.cleverbot.R;
import com.arturoguillen.cleverbot.di.component.NetComponent;
import com.arturoguillen.cleverbot.presenter.ChatPresenter;
import com.arturoguillen.cleverbot.presenter.ChatView;

import javax.inject.Inject;

/**
 * Created by PC on 11/02/2017.
 */

public class ChatActivity extends BaseActivity implements ChatView {

    @Inject
    ChatPresenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.attachView(this);
        setContentView(R.layout.activtiy_chat);
    }

    @Override
    protected void injectComponent(NetComponent component) {
        component.inject(this);
    }

    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }

    @Override
    public void showProgressIndicator() {

    }

    @Override
    public void showMessage(int stringId) {

    }

    @Override
    public void hideProgressIndicator() {

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            presenter.onRestoreInstanceState(savedInstanceState);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        presenter.onSaveInstanceState(outState);
    }

    @Override
    public Context getContext() {
        return this;
    }
}
