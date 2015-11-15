package com.karen.fan.common.exception;

/**
 * @Date: 2015-07-05
 * @author: fan
 */
public class EmptyReturnException extends GlobalException {
    private static final int errorCode = 900003;
    public EmptyReturnException() {
        super();
    }

    public EmptyReturnException(String message) {
        super(message);
    }

    public EmptyReturnException(String message, Object data) {
        super(message, data);
    }

    public EmptyReturnException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyReturnException(String message, Throwable cause, Object data) {
        super(message, cause, data);
    }

    public EmptyReturnException(Throwable cause) {
        super(cause);
    }

    public EmptyReturnException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
