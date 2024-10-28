package com.ducat.automation.TrickyProblem;

public class ArrayReference {
    public static void array_method() {
        // Initialize an array

        int [] array = {5, 3, 7, 9, 4, 1};
        System.out.println(array);
        System.out.println(array.length);
        // Loop through the array and print index and value

        System.out.println("Array elements with their indices:");
        for(int i=0; i<array.length; i++) {
            System.out.println("Index: " + i + ", Value: " + array[i]);
        }
       // Now array print in reverse

        System.out.println();

        for (int i=array.length - 1; i>=0; i--) {
            System.out.println("Index: " + i + ", Value: " + array[i]);
        }
    }
    public static void main(String[] args) {
        array_method();
    }
}
