package com.tns.exception;

public class ThrowAndThrows {
    static void validate(int num) throws MyException{
        if(num < 0){
            throw new MyException("Negative not allowed");
        } else {
            System.out.println("Valid Age");
        }
    }

    public static void main(String[] args) {
        try{
            ThrowAndThrows.validate(-18);
        }catch (MyException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
