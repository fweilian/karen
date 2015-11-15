package com.karen.fan.common.utils;

import com.alibaba.fastjson.JSON;

import java.util.Random;

/**
 * @Date: 2015-06-07
 * @author: fan
 */
public class StringUtils {

    public static String ObjectToJsonString(Object object) {
        return JSON.toJSONString(object);
    }

    /**
     * check whether the given Object is empty
     * @param str
     * @return
     */
    public static boolean isEmpty(Object str) {
        return (str == null || "".equals(str));
    }

    public static String random(int digit) {
        if(digit > 0) {
            Random random = new Random();
            Double max = Math.pow(10, digit);
            return String.format("%" + digit + "d", random.nextInt(max.intValue() - 1));
        }
        return "";
    }


}
