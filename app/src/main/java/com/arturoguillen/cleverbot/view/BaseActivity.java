package com.arturoguillen.cleverbot.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.arturoguillen.cleverbot.App;
import com.arturoguillen.cleverbot.di.component.NetComponent;


/**
 * Created by PC on 21/02/2017.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectComponent(((App) getApplication())
                .getComponent());
    }

    protected abstract void injectComponent(NetComponent component);
}
