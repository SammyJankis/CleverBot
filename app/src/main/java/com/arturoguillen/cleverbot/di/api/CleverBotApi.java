package com.arturoguillen.cleverbot.di.api;

import com.arturoguillen.cleverbot.PrivateConstants;
import com.arturoguillen.cleverbot.entity.BotResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by arturo.guillen on 27/02/2017.
 */

public interface CleverBotApi {
    @GET("getreply?key=" + PrivateConstants.API_KEY)
    Observable<BotResponse> getReply(
            @Query("cs") String cleverbotState,
            @Query("input") String input,
            @Query("callback") String callback);

}
