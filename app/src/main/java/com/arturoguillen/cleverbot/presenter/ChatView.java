package com.arturoguillen.cleverbot.presenter;

import android.content.Context;

import com.arturoguillen.cleverbot.entity.Message;

/**
 * Created by PC on 21/02/2017.
 */

public interface ChatView {
    void showProgressIndicator();

    void showMessage(int stringId);

    void hideProgressIndicator();

    void showResponse(Message message);

    Context getContext();
}
