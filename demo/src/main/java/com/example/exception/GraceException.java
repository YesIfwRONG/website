package com.example.exception;

public class GraceException {
    public static void display(String errMsg){
        throw new MyCustomException(errMsg);
    }
}
