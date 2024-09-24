package com.lasta.jvav.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response<T> {
    private int code;
    private String message;
    private T data;

    public static <T>Response<T> OK(T data) {
        return new Response<T>(0, "", data);
    }

    public static <T>Response<T> OK(String message, T data) {
        return new Response<T>(0, message, data);
    }

    public static <T>Response<T> OK(int code, String message, T data) {
        return new Response<T>(code, message, data);
    }

    public static <T>Response<T> Fail(int code, String message) {
        return new Response<T>(code, message, null);
    }
}
