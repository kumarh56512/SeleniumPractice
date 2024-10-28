package com.infosys.practice;
import java.util.Scanner;

public class AcountDoWhile {
    public static void main(String[] args) {
        double balance = 0;
        double minbal = 500;
        double depositAmt = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the amount to be deposit");
            depositAmt = sc.nextDouble();
        }
        while(depositAmt < minbal);
        balance = depositAmt;
        System.out.println("Your deposit was successful");


    }
}
