package com.test.exception;

import org.springframework.http.HttpStatus;

public class ResponseErrorMessage {
    private HttpStatus code;
    private String message;

    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
