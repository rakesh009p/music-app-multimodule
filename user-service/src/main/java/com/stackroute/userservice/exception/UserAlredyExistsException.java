package com.stackroute.userservice.exception;

public class UserAlredyExistsException extends Exception {
    private String message;

    public UserAlredyExistsException() {
    }

    public UserAlredyExistsException(String message) {
        this.message = message;
    }
}
