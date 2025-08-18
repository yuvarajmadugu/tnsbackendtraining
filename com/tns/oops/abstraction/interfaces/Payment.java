package com.tns.oops.abstraction.interfaces;
//interfaces demo
public interface Payment {
    /*
    void display{
      //concrete methods are not allowed in interfaces
    }
    */

    void payments(); //abstract method

    //default method:
    default void paymentReceipt(double amt){
        System.out.println("Received payment of $"+amt);
    }

    //static method: // accessed not via object instead class name
    static void paymentMethod(){
        System.out.println("Payment credited");
    }
}
