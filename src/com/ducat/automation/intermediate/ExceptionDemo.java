package com.ducat.automation.intermediate;

public class ExceptionDemo {
    public static void main(String[] args) {
        m1(-2);

    }
    public static void m1(int age) {
        if(age < 0)
        {
            throw new ArithmeticException("Age can not be negative");
        }



        //throw new ArithmeticException();
        //throw new NullPointerException();

    }
}
