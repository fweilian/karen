package com.karen.fan.site.request;

import javax.servlet.http.HttpServletRequest;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
public class Request<T> {
    private HttpServletRequest httpRequest;
    private Long onlineUserId;
    private T data;

    public HttpServletRequest getHttpRequest() {
        return httpRequest;
    }

    public void setHttpRequest(HttpServletRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    public Long getOnlineUserId() {
        return onlineUserId;
    }

    public void setOnlineUserId(Long onlineUserId) {
        this.onlineUserId = onlineUserId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
