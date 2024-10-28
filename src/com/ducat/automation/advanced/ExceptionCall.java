package com.ducat.automation.advanced;

public class ExceptionCall {

    public  void  doshift() {
        System.out.println("insde  do stuff method");
        domorestuff();
        System.out.println("after do more stuff method");
    }
    public  void domorestuff() {
        System.out.println("Inside do more stuff  method");
        //int x= 10/0;

        System.out.println("Inside do more stuff after do more stuff method call");
    }

    public static void main(String[] args) {
        ExceptionCall obj = new ExceptionCall();

        obj.doshift();

    }

}
