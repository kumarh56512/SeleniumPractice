package com.infosys.practice;

public class BankAccount {
    public static void main(String[] args) {
        double balance = 600;
        System.out.println("Amount to withdraw");
        double amount = 500;

        if(amount <= 0) {
            System.out.println("Withdwawal has failed because balance is negative");
        }
        else if(amount > balance) {
            System.out.println("Withdwawal has failed because balance is low");
        }
        else {
            balance -= amount;
            System.out.println("withdrawal has secceeded");
            System.out.println("Remaining balance is : " + balance);
        }
    }
}
