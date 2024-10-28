package com.ducat.automation.TrickyProblem;

public class ArrayReverse {
    public static void main(String[] args) {
        // Initialize an array

        int [] arr = {1, 4, 6, 7, 5};

        // Print the array in reverse order

        System.out.println("Array print in Reverse order");

        for( int i = arr.length - 1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
