package com.arturoguillen.cleverbot.di.module;

import com.arturoguillen.cleverbot.di.api.CleverBotApi;
import com.arturoguillen.cleverbot.entity.BotResponse;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;

/**
 * Created by arturo.guillen on 23/02/2017.
 */
@Module
public class TestNetModule {

    @Provides
    @Singleton
    CleverBotApi provideCleverBotApi(BotResponse fakeBotResponse) {
        CleverBotApi mockCleverBotApi = Mockito.mock(CleverBotApi.class);
        Mockito.when(mockCleverBotApi.getReply(Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenReturn(Observable.just(fakeBotResponse));
        return mockCleverBotApi;
    }

    @Provides
    BotResponse provideFakeBotResponse() {
        BotResponse botResponse = new BotResponse();
        botResponse.setOutput("output");
        botResponse.setInput("input");
        botResponse.setCs("cs");
        botResponse.setTimeYear("1987");
        botResponse.setTimeMonth("8");
        botResponse.setTimeDay("13");
        botResponse.setTimeHour("7");
        botResponse.setTimeMinute("7");
        botResponse.setTimeSecond("7");
        return botResponse;
    }
}
