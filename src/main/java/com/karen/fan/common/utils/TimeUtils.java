package com.karen.fan.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Date: 2015-06-07
 * @author: fan
 */
public class TimeUtils {

    /**
     * get current time
     * @return
     */
    public static String convertDateTimeToString(Date time) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time);
    }

    public static Long currentTime() {
        return System.currentTimeMillis();
    }

    public static Date currentDateTime() {
        return Calendar.getInstance().getTime();
    }
}
