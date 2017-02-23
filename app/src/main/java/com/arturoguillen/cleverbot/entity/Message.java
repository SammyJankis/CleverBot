package com.arturoguillen.cleverbot.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by arturo.guillen on 22/02/2017.
 */

public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    public Message(String text, boolean itsMe, Date date) {
        this.text = text;
        this.itsMe = itsMe;
        this.date = date;
    }

    private String text;
    private boolean itsMe;
    private Date date;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
