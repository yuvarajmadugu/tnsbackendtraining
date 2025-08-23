package com.tns.exception;

public class MyException extends Exception {
    // Custom Exception
    public MyException(String message) {
            super(message); // call parent constructor to store the message
    }
}
