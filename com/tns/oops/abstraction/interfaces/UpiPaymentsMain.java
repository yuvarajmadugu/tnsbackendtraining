package com.tns.oops.abstraction.interfaces;

public class UpiPaymentsMain {
    public static void main(String[] args) {
        Payment ob = new UpiPayments();
        Payment.paymentMethod(); //static method

        ob.payments();
        ob.paymentReceipt(150.0);

    }
}
