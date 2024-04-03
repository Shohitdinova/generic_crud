package com.example.user_group.common.exception;

public class SmsAlreadySentException extends RuntimeException{
    public SmsAlreadySentException(String message) {
        super(message);
    }
}
