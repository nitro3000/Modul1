package com.go2it.exceptions;

public class CustomRTException extends RuntimeException{
    public CustomRTException(){
    }
    public CustomRTException(String message){
        super(message);
    }
}
