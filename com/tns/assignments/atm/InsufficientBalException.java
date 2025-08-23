package com.tns.assignments.atm;

public class InsufficientBalException extends Exception {
    public InsufficientBalException(String msg) {
        super(msg);
    }
}
