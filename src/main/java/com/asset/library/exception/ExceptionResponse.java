package com.asset.library.exception;

import java.util.Date;

public class ExceptionResponse {
    private Integer status;
    private String error;
    private String message;
    private String path;


    public ExceptionResponse(Integer status, String error, String message, String path) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }


    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }
}

