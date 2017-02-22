package com.arturoguillen.cleverbot.entity;

/**
 * Created by arturo.guillen on 22/02/2017.
 */

public class Message {

    public Message(String text, boolean itsMe) {
        this.text = text;
        this.itsMe = itsMe;
    }

    private String text;
    private boolean itsMe;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isItsMe() {
        return itsMe;
    }

    public void setItsMe(boolean itsMe) {
        this.itsMe = itsMe;
    }
}
