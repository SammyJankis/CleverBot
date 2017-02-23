package com.arturoguillen.cleverbot.model;

import android.content.SharedPreferences;

import com.arturoguillen.cleverbot.Constants;
import com.arturoguillen.cleverbot.PrivateConstants;
import com.arturoguillen.cleverbot.entity.BotResponse;
import com.arturoguillen.cleverbot.entity.Message;
import com.arturoguillen.cleverbot.utils.DateUtils;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.observers.DisposableObserver;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by PC on 21/02/2017.
 */

public class CleverBotModel extends BaseModel {

    @Inject
    Retrofit retrofit;

    @Inject
    SharedPreferences sharedPreferences;

    public
    @Inject
    CleverBotModel() {

    }

    private interface CleverBotApi {
        @GET("getreply?key=" + PrivateConstants.API_KEY)
        Observable<BotResponse> getReply(
                @Query("cs") String cleverbotState,
                @Query("input") String input,
                @Query("callback") String callback);

    }

    public interface ResponseObserver {

        void onCompleted(Message message);

        void onError(Throwable e);
    }

    public Disposable getReply(String input, final ResponseObserver observer) {

        String cs = sharedPreferences.getString(Constants.CLEVERBOT_STATE, null);
        Observable<BotResponse> observable = retrofit.create(CleverBotApi.class).getReply(cs, input, "");

        return observable.
                subscribeOn(subscribeScheduler).
                flatMap(new Function<BotResponse, ObservableSource<Message>>() {
                    @Override
                    public ObservableSource<Message> apply(BotResponse botResponse) throws Exception {

                        Message message = new Message(botResponse.getOutput(), false, DateUtils.getDateFromBotResponse(botResponse));
                        return Observable.just(message);
                    }
                }).
                observeOn(AndroidSchedulers.mainThread()).
                subscribeWith(new DisposableObserver<Message>() {
                    @Override
                    public void onNext(Message message) {
                        observer.onCompleted(message);
                    }

                    @Override
                    public void onError(Throwable e) {
                        observer.onError(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
