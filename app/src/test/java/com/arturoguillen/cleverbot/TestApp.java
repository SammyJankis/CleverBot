package com.arturoguillen.cleverbot;

import com.arturoguillen.cleverbot.di.component.ChatComponent;
import com.arturoguillen.cleverbot.di.component.TestChatComponent;
import com.arturoguillen.cleverbot.di.module.DataModule;
import com.arturoguillen.cleverbot.di.module.TestNetModule;

/**
 * Created by arturo.guillen on 23/02/2017.
 */

public class TestApp extends App {

    private TestChatComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        //TODO : https://labs.ribot.co.uk/fast-and-reliable-ui-tests-on-android-17c261b8220c#.ty4tejuw2
        component = DaggerTestChatComponent.builder()
                .testNetModule(new TestNetModule())
                .dataModule(new DataModule(this))
                .build();
    }

    @Override
    public ChatComponent getComponent() {
        return component;
    }
}
