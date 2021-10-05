package com.example.realworld.config.error;

public enum ErrorCode {


    // UNAUTHORIZED(401, "a request requires authentication but it isn't provided"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "a request may be valid but the user doesn't have permissions to perform the action"),
    NOT_FOUND(404, "a resource can't be found to fulfill the request"),
    UNEXPECTED_ERROR(422, "Unexpected error");

    ErrorCode(Integer status, String description) {
        this.status = status;
        this.description = description;
    }

    private Integer status;
    private String description;
}
