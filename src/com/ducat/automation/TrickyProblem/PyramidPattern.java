package com.ducat.automation.TrickyProblem;

public class PyramidPattern {
    public static void main(String[] args) {

        int rows = 5;  // You can change the number of rows here

        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars to center the pyramid
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }

            // Print stars with a space
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
