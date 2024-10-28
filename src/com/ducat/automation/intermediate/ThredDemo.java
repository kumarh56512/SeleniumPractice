package com.ducat.automation.intermediate;

public class ThredDemo {
    public static void main(String[] args) throws InterruptedException {
        m1();

    }
    public static void m1() throws InterruptedException {
        m2();
    }
    public static void m2() throws InterruptedException {
        Thread.sleep(1);
    }

}
