package com.karen.fan.common.exception;

/**
 * @Date: 2015-07-12
 * @author: fan
 */
public class RequestException extends GlobalException {
    private static final int errorCode = 900001;

    public RequestException() {
        super();
    }

    public RequestException(String message) {
        super(message);
    }

    public RequestException(String message, Object data) {
        super(message, data);
    }

    public RequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestException(String message, Throwable cause, Object data) {
        super(message, cause, data);
    }

    public RequestException(Throwable cause) {
        super(cause);
    }

    public RequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

