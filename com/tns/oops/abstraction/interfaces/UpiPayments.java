package com.tns.oops.abstraction.interfaces;

import java.util.Scanner;

public class UpiPayments implements Payment{

    @Override
    public void payments(){
        System.out.println("Payment done via UPI");
    }

    public static void main(String[] args) {

        final int savedpwd = 123;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter password:");
        double password = sc.nextInt();
        if(password==savedpwd){
            System.out.println("Access money");
        }else {
            System.out.println("Wrong password");
        }
    }
}
