package com.arturoguillen.cleverbot.di.component;

import com.arturoguillen.cleverbot.di.module.DataModule;
import com.arturoguillen.cleverbot.di.module.TestNetModule;
import com.arturoguillen.cleverbot.view.ChatActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by arturo.guillen on 23/02/2017.
 */

@Singleton
@Component(modules = {TestNetModule.class, DataModule.class})
public interface TestChatComponent extends ChatComponent {
}
