package com.infosys.practice;

public class Account {
    private double balance = 500.00;
    public double getBalance(int accountID){
        // logic here
        return balance - 100;
    }
    public static void main(String[] args){
        Account accnt = new Account();
        double value = accnt.getBalance(123456);
        System.out.println(accnt.balance);
        System.out.println("The balance is:" + value);
    }
}
