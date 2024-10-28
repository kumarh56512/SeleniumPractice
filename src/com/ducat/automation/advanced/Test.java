package com.ducat.automation.advanced;

public class Test {
    Test()
    {
        super();
        System.out.println("inside constractor");

    }
    Test(int i)
    {
        super();
        System.out.println(i);

    }
    Test(String str)
    {
        super();
        System.out.println(str);

    }
    public static void main(String[] args)
    {
        Test obj = new Test();
        Test obj1 = new Test(10);
        Test obj2 = new Test("Harendra");
        System.out.println("outside the constractor");
    }
}
