package com.arturoguillen.cleverbot;

import android.app.Application;

import com.arturoguillen.cleverbot.di.component.DaggerNetComponent;
import com.arturoguillen.cleverbot.di.component.NetComponent;
import com.arturoguillen.cleverbot.di.module.DataModule;
import com.arturoguillen.cleverbot.di.module.NetModule;


/**
 * Created by PC on 19/02/2017.
 */

public class App extends Application {
    private NetComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerNetComponent.builder()
                .netModule(new NetModule())
                .dataModule(new DataModule(this))
                .build();
    }

    public NetComponent getComponent() {
        return component;
    }
}
