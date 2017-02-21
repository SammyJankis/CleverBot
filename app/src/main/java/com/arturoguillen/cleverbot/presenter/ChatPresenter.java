package com.arturoguillen.cleverbot.presenter;

import android.os.Bundle;

import com.arturoguillen.cleverbot.model.CleverBotModel;

import javax.inject.Inject;

/**
 * Created by PC on 21/02/2017.
 */

public class ChatPresenter extends BasePresenter implements ChatPresenterInterface<ChatView> {

    private ChatView view;

    @Inject
    CleverBotModel cleverBotModel;


    @Inject
    public ChatPresenter() {

    }

    @Override
    public void attachView(ChatView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

    }
}
