package com.ducat.automation.beginor;

public class TestDemo {
    public static void main(String[] args) {
        TestDemo obj = new TestDemo();
        obj.getClass();
        System.out.println(obj.getClass());
        Thread th = new Thread();
        System.out.println(th.getClass());
    }
}
