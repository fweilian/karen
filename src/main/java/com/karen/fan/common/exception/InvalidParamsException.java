package com.karen.fan.common.exception;

/**
 * @Date: 2015-07-12
 * @author: fan
 */
public class InvalidParamsException extends GlobalException {
    private static final int errorCode = 900002;

    public InvalidParamsException() {
        super();
    }

    public InvalidParamsException(String message) {
        super(message);
    }

    public InvalidParamsException(String message, Object data) {
        super(message, data);
    }

    public InvalidParamsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParamsException(String message, Throwable cause, Object data) {
        super(message, cause, data);
    }

    public InvalidParamsException(Throwable cause) {
        super(cause);
    }

    public InvalidParamsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
