package com.arturoguillen.cleverbot;

import com.arturoguillen.cleverbot.di.component.ChatComponent;
import com.arturoguillen.cleverbot.di.component.TestChatComponent;

/**
 * Created by arturo.guillen on 23/02/2017.
 */

public class TestApp extends App {

    private TestChatComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        //TODO: Verify that this work
        /*component = DaggerTestChatComponent.builder()
                .testNetModule(new TestNetModule())
                .dataModule(new DataModule(this))
                .build();*/
    }

    @Override
    public ChatComponent getComponent() {
        return component;
    }
}
