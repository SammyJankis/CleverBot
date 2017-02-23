package com.arturoguillen.cleverbot.di.module;

import com.arturoguillen.cleverbot.entity.BotResponse;
import com.arturoguillen.cleverbot.model.CleverBotModel;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import retrofit2.Retrofit;

/**
 * Created by arturo.guillen on 23/02/2017.
 */
@Module
public class TestNetModule {

    @Provides
    @Singleton
    Retrofit provideRetrofit(BotResponse fakeBotResponse) {
        Retrofit mockRetrofit = Mockito.mock(Retrofit.class);
        Mockito.when(mockRetrofit.create((CleverBotModel.CleverBotApi.class)).getReply(Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).
                thenReturn(Observable.just(fakeBotResponse));
        return null;
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
