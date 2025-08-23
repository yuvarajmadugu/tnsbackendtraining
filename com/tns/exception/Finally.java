package com.tns.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc = null;
        try{
            sc = new Scanner(System.in);

            System.out.print("Enter numerator: ");
            int num1 = sc.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = sc.nextInt();

            int result = num1 / num2; // may cause ArithmeticException
            System.out.println("Result: " + result);
        }catch (ArithmeticException | InputMismatchException e) {
            System.err.println("Error: " + e.getMessage());
        }finally {
            if(sc != null){
                sc.close();
                System.out.println("Scanner Closed");
            }
        }
    }
}
