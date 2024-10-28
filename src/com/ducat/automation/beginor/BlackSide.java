package com.ducat.automation.beginor;

public class BlackSide {
    public static void main(String[] args) {

     m1();


    }
    public static void m1() {
        m2();
        System.out.println("inside m1");


    }

    public static void m2() {
        m1();
        System.out.println(" inside m2 ");

    }
}
