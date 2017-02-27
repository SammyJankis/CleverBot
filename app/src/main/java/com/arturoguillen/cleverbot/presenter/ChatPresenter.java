package com.arturoguillen.cleverbot.presenter;

import android.os.Bundle;

import com.arturoguillen.cleverbot.entity.Message;
import com.arturoguillen.cleverbot.model.CleverBotModel;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;

/**
 * Created by PC on 21/02/2017.
 */

public class ChatPresenter extends BasePresenter implements ChatPresenterInterface<ChatView> {

    private ChatView view;

    private Disposable getReplyDisposable;
    @Inject
    CleverBotModel cleverBotModel;

    @Inject
    public ChatPresenter() {
    }

    public void sendMessageToBot(String input) {
        view.showProgressIndicator();
        getReplyDisposable = cleverBotModel.getReply(input, new CleverBotModel.ResponseObserver() {
            @Override
            public void onCompleted(Message message) {
                view.showResponse(message);
                view.hideProgressIndicator();
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
                view.hideProgressIndicator();
            }
        });
    }

    @Override
    public void attachView(ChatView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
        if (getReplyDisposable != null)
            getReplyDisposable.dispose();
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

    }
}
