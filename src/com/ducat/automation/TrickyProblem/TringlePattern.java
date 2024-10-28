package com.ducat.automation.TrickyProblem;


import java.util.Scanner;

public class TringlePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows number : ");
        int rows = sc.nextInt();
        // You can change the number of rows here

        for (int i = 1; i <= rows; i++) {
            // Print stars for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
