package com.example.patientManagementSystem.authentication.exception;

public class UserAlreadyExistsException extends Exception{
    private String message;

    public UserAlreadyExistsException() {
    }

    public UserAlreadyExistsException(String message) {
        super(message);
        this.message = "User Already Exists";
    }
}

