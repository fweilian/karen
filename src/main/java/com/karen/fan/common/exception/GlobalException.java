package com.karen.fan.common.exception;

/**
 * @Date: 2015-07-12
 * @author: fan
 */
public class GlobalException extends Exception {
    private static final int errorCode = 900000;
    protected Object data;

    public GlobalException() {
    }

    public GlobalException(String message) {
        super(message);
    }

    public GlobalException(String message, Object data) {
        super(message);
        this.data = data;
    }


    public GlobalException(Throwable cause) {
        super(cause);
    }

    public GlobalException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobalException(String message, Throwable cause, Object data) {
        super(message, cause);
        this.data = data;
    }

    public GlobalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
