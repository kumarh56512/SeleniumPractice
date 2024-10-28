package com.ducat.automation.intermediate;

public class InstanceObj {
    int i=10;
    {
        m1();
        System.out.println("first instance block");
    }
    InstanceObj ()
    {
        System.out.println("Inside constractor");
    }

    public static void main(String[] args) {
        InstanceObj test = new InstanceObj();
        InstanceObj test1 = new InstanceObj();
        System.out.println("Inside main ");
        System.out.println("value of j in main :  " + test.j);
    }
    public void m1()
    {
        System.out.println("value of j is : " + j);
    }
    {
        System.out.println("second inside block");
    }
    int j=20;
}
