package com.ducat.automation.TrickyProblem;

public class EvenOddfromArray {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6};

        // Extracting even numbers.................

        System.out.println("Even number in array.........");
        for(int i=0; i<a.length;i++)
        {
            if(a[i]%2==0)
                System.out.println(a[i]);
        }
        System.out.println("Odd Number in array.......");
        for(int i =0; i<a.length;i++)
        {
            if(a[i]%2!=0)
                System.out.println(a[i]);
        }
    }
}
