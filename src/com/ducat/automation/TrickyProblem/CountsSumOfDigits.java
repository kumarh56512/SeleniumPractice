package com.ducat.automation.TrickyProblem;

public class CountsSumOfDigits {

    public static void main(String[] args) {

        int num = 123456789;
        int sum =0;

        while(num>0)
        {
            sum=sum+num%10;
            num = num/10;
        }
        System.out.println("sum of digit in the number is :" +sum);
    }
}
