package com.arturoguillen.cleverbot;

import android.app.Application;

import com.arturoguillen.cleverbot.di.component.ChatComponent;
import com.arturoguillen.cleverbot.di.component.DaggerChatComponent;
import com.arturoguillen.cleverbot.di.module.DataModule;
import com.arturoguillen.cleverbot.di.module.NetModule;


/**
 * Created by PC on 19/02/2017.
 */

public class App extends Application {
    private ChatComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerChatComponent.builder()
                .netModule(new NetModule())
                .dataModule(new DataModule(this))
                .build();
    }

    public ChatComponent getComponent() {
        return component;
    }
}
