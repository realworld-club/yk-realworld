package com.example.realworld.config.error;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Error {

    private ErrorCode code;
    private List<String> body = new ArrayList<>();
}
