package com.arturoguillen.cleverbot.presenter;

import android.content.Context;

/**
 * Created by PC on 21/02/2017.
 */

public interface ChatView {
    void showProgressIndicator();

    void showMessage(int stringId);

    void hideProgressIndicator();

    Context getContext();
}
