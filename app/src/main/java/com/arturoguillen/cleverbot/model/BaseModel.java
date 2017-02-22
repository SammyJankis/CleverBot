package com.arturoguillen.cleverbot.model;


import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by arturo.guillen on 22/02/2017.
 */
public class BaseModel {
    protected Scheduler subscribeScheduler = Schedulers.io();
}
