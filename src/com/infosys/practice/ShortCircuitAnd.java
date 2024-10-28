package com.infosys.practice;

public class ShortCircuitAnd {
    public static void main(String[] args) {
        double balance = 2600;
        System.out.println("Amount to withdraw");
        double amount = 2300, limit = 10000, minbal = 500;
        if(amount <= limit && (balance - amount) > minbal) {
            balance -= amount;
            System.out.println("Withdrawal has succeeded");
        }
        else {
            System.out.println("Withdrawal has failed");
        }
    }
}
