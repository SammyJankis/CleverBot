package com.arturoguillen.cleverbot.presenter;

import android.os.Bundle;

import com.arturoguillen.cleverbot.entity.BotResponse;
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
            public void onCompleted(BotResponse botResponse) {
                view.showResponse(botResponse.getOutput());
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
        getReplyDisposable.dispose();
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

    }
}
