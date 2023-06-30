package com.example.flaskhiringtest.FlaskHiringTest.exception;

public class NoBookRecordFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    public NoBookRecordFoundException(String message){
        super(message);
    }
}
