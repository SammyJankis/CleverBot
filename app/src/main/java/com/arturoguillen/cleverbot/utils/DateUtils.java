package com.arturoguillen.cleverbot.utils;

import com.arturoguillen.cleverbot.entity.BotResponse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by arturo.guillen on 23/02/2017.
 */

public class DateUtils {

    public static Date getDateFromBotResponse(BotResponse botResponse) throws ParseException {
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("s/m/H/d/M/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String second = botResponse.getTimeSecond();
        String minute = botResponse.getTimeMinute();
        String hour = botResponse.getTimeHour();
        String day = botResponse.getTimeDay();
        String month = botResponse.getTimeMonth();
        String year = botResponse.getTimeYear();

        String date = second + "/" + minute + "/" + hour + "/" + day + "/" + month + "/" + year;

        calendar.setTime(sdf.parse(date));

        return calendar.getTime();
    }

    public static String getStringFromDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

        return sdf.format(date);
    }
}
