package com.karen.fan.common.exception;

/**
 * @Date: 2015-06-07
 * @author: fan
 */
public class GlobleException extends GlobalException {
    private static final int errorCode = 801000;
    protected Object data;

    public GlobleException() {
    }

    public GlobleException(String message) {
        super(message);
    }

    public GlobleException(String message, Object data) {
        super(message);
        this.data = data;
    }


    public GlobleException(Throwable cause) {
        super(cause);
    }

    public GlobleException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobleException(String message, Throwable cause, Object data) {
        super(message, cause);
        this.data = data;
    }

    public GlobleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
