package com.ducat.automation.TrickyProblem;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("value os a is : " + a + " value of b : " + b);
    }
}
