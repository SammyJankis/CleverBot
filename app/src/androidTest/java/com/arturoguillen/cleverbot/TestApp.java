package com.arturoguillen.cleverbot;

import com.arturoguillen.cleverbot.di.component.ChatComponent;
import com.arturoguillen.cleverbot.di.component.DaggerTestChatComponent;
import com.arturoguillen.cleverbot.di.module.DataModule;
import com.arturoguillen.cleverbot.di.module.TestNetModule;

/**
 * Created by arturo.guillen on 23/02/2017.
 */

public class TestApp extends App {

    @Override
    protected ChatComponent createComponent() {
        return DaggerTestChatComponent.builder()
                .testNetModule(new TestNetModule())
                .dataModule(new DataModule(this))
                .build();
    }
}
