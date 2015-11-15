package com.karen.fan.common.utils;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @Date: 2015-10-02
 * @author: fan
 */
public class JsonUtils {

    public static String toJson(Object source) {
        return JSON.toJSONString(source);
    }

    public static Object toObject(String source, Class<?> target) {
        return JSON.parseObject(source, target);
    }

    public static <T> List<T> toArrayObject(String source, Class<T> target) {
        return JSON.parseArray(source, target);
    }
}
