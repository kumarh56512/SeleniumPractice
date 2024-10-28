package com.infosys.practice;

public class ShortCircuitNot {
    public static void main(String[] args) {
        double balance = 2000;
        System.out.println("Amount to Withdraw");
        double amount = 500, limit = 10000, minbal = 500;
        if(!(amount < 0)) { // Using NOT
            if(amount <= limit && (balance - amount) > minbal) {
                balance -= amount;
                System.out.println("Withdrawal has succeeded");
            }
        }
    }
}
