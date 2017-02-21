package com.arturoguillen.cleverbot.model;

import com.arturoguillen.cleverbot.entity.BotResponse;

import java.util.Observable;

import javax.inject.Inject;

import retrofit2.Retrofit;
import retrofit2.http.GET;

/**
 * Created by PC on 21/02/2017.
 */

public class CleverBotModel {

    @Inject
    Retrofit retrofit;

    public @Inject CleverBotModel() {

    }

    private interface CleverBotApi{
        @GET("")
        Observable<BotResponse> getReply();

    }

    public void getResponse(){
        retrofit.create(CleverBotApi.class).getReply();
    }
}
