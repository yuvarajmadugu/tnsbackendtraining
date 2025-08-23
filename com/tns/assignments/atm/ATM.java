package com.tns.assignments.atm;

public class ATM{
    private double balance = 100000.00;
    private final int savedPin = 1234;

    // Validate PIN
    public void validatePin(int enteredPin) throws InvalidPinException {
        if (enteredPin != savedPin) {
            throw new InvalidPinException("Invalid PIN entered!");
        }
        System.out.println("PIN validated successfully.");
    }

    // Withdraw money
    public void withdraw(double amount) throws InsufficientBalException {
        if (amount > balance) {
            throw new InsufficientBalException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal of Rs. " + amount + " successful.");
        System.out.println("Remaining Balance: Rs. " + balance);
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Rs. " + amount + " deposited successfully.");
        System.out.println("Updated Balance: Rs. " + balance);
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

}
