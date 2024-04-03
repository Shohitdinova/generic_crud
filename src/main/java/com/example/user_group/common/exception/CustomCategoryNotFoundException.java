package com.example.user_group.common.exception;

public class CustomCategoryNotFoundException extends RuntimeException{

    public CustomCategoryNotFoundException(String message){
        super(message);
    }
}
