package com.example.flaskhiringtest.FlaskHiringTest.exception;

public class NoMemberFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    public NoMemberFoundException(String message){
        super(message);
    }
}
