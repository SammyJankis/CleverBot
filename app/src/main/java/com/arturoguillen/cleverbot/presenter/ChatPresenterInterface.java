package com.arturoguillen.cleverbot.presenter;

/**
 * Created by PC on 21/02/2017.
 */

public interface ChatPresenterInterface<V> {

    void attachView(V view);

    void detachView();
}
