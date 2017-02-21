package com.arturoguillen.cleverbot.presenter;

import android.os.Bundle;

/**
 * Created by PC on 11/02/2017.
 */
public interface BasePresenterInterface<V> {

    void onRestoreInstanceState(Bundle savedInstanceState);

    void onSaveInstanceState(Bundle outState);

}
