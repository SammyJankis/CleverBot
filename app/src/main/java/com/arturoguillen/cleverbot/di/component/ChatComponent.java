package com.arturoguillen.cleverbot.di.component;

import com.arturoguillen.cleverbot.di.module.DataModule;
import com.arturoguillen.cleverbot.di.module.NetModule;
import com.arturoguillen.cleverbot.view.ChatActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by PC on 11/02/2017.
 */

@Singleton
@Component(modules = {NetModule.class, DataModule.class})
public interface ChatComponent {
    void inject(ChatActivity chatActivity);
}
