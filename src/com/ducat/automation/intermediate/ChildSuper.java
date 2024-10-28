package com.ducat.automation.intermediate;

public class ChildSuper extends ParendtSuper {
    int y = 100;
    String str="Harendra";

    public  void m1()
    {
        System.out.println("Inside child class");
       super.m1();
      //  super.str="hi";
       // this.str="its me";

        System.out.println(super.str);
        System.out.println(this.str);
    }
    public static void main(String[] args) {
      new ChildSuper().m1();
        System.out.println();
    }

}
