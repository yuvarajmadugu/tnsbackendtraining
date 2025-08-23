package com.tns.assignments.atm;

import java.util.Scanner;

public class ATMMain {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM userobj = new ATM();

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        try {
            userobj.validatePin(enteredPin);

            int option;
            do {
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        userobj.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        try {
                            userobj.withdraw(withdrawAmount);
                        } catch (InsufficientBalException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        userobj.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using our ATM.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter among 1, 2, 3, or 4.");
                }
            } while (option != 4);

        } catch (InvalidPinException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

