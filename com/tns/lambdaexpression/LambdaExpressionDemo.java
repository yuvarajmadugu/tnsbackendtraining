package com.tns.lambdaexpression;


import com.tns.functionalinterface.MyFunctionalInterface;

public class LambdaExpressionDemo {
    //Lambda Expression = A shorter way of writing implementations of functional interfaces.
    //Syntax:
    //  (parameters) -> expression or (parameters) -> { statements }

    public static void main(String[] args) {
        MyFunctionalInterface lamdaobj = (msg) -> {
            System.out.println("Lambda Implementation: " +msg);
        };

        lamdaobj.displayMsg("Hello from Lambda.");
    }
}
