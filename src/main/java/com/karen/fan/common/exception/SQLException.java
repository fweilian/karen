package com.karen.fan.common.exception;

/**
 * @Date: 2015-07-05
 * @author: fan
 */
public class SQLException extends GlobalException {
    private static final int errorCode = 900004;

    public SQLException() {
        super();
    }

    public SQLException(String message) {
        super(message);
    }

    public SQLException(String message, Object data) {
        super(message, data);
    }

    public SQLException(String message, Throwable cause) {
        super(message, cause);
    }

    public SQLException(String message, Throwable cause, Object data) {
        super(message, cause, data);
    }

    public SQLException(Throwable cause) {
        super(cause);
    }

    public SQLException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
