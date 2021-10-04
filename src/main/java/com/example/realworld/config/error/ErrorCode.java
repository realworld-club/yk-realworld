package com.example.realworld.config.error;

public enum ErrorCode {

    UNAUTHORIZED(401, "a request requires authentication but it isn't provided"),
    FORBIDDEN(403, "a request may be valid but the user doesn't have permissions to perform the action"),
    NOT_FOUND(404, "a resource can't be found to fulfill the request");

    ErrorCode(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    private Integer status;
    private String message;
}
