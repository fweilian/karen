package com.karen.fan.site.request;

import com.karen.fan.common.exception.GlobalException;
import com.karen.fan.common.exception.InvalidParamsException;
import com.karen.fan.common.utils.JsonUtils;
import com.karen.fan.common.utils.StringUtils;
import com.karen.fan.site.request.vo.NullDataRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.ParameterizedType;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
public class RequestParser {
    private static final Logger LOGGER = LoggerFactory.getLogger(RequestParser.class);

    public <T extends Request> T parseRequest(HttpServletRequest httpRequest, Class<T> target) throws GlobalException {
        String d = httpRequest.getParameter("d");
        LOGGER.info("request URL={}, request params, d={}", httpRequest.getRequestURI(), d);

        T result = null;

        try {
            result = target.newInstance();
            result.setHttpRequest(httpRequest);
            if(target == NullDataRequest.class) {
                return result;
            }
            if(!StringUtils.isEmpty(d)) {
                ParameterizedType parameterizedType = (ParameterizedType) target.getGenericSuperclass();
                Class<T> tClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];
                LOGGER.info("class={}, target={}", tClass, target);
                Object data = JsonUtils.toObject(d, tClass);
                result.setData(data);
            }


        } catch (Exception e) {
            LOGGER.error("parse request failed.", e);
            throw new InvalidParamsException("invalid params");
        }
        return result;
    }
}
