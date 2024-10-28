package com.ducat.automation.TrickyProblem;

public class CountNumberOfDigit {

    public static void main(String[] args) {

        int num = 1234776556;
        int count = 0;

        while(num >0)
        {
            num = num/10;
            count++;
        }
        System.out.println("Number od digits is : " +count);
    }
}
