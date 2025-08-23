package com.tns.assignments.atm;

public class InvalidPinException extends Exception{
    public InvalidPinException(String msg) {
        super(msg);
    }
}
