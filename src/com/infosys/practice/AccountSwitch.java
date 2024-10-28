package com.infosys.practice;
import java.util.Scanner;

public class AccountSwitch {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Given Choice (1,2,3)");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Entry deposition");
                break;
            case 2:
                System.out.println("Display operation");
                break;
            case 3:
                System.out.println("Deposit operation");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }




}
