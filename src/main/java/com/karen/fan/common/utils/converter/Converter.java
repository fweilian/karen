package com.karen.fan.common.utils.converter;

import com.alibaba.fastjson.JSON;

/**
 * @Date: 2015-06-07
 * @author: fan
 */
public class Converter {

    /**
     * json to object
     * @param json
     * @param clazz
     * @return
     */
    public static Object JsonToObject(String json, Class<?> clazz) {
        Object object = null;
        try {
            object = JSON.parseObject(json, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
