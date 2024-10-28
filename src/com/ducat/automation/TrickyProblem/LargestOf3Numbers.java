package com.ducat.automation.TrickyProblem;
import java.util.Scanner;

public class LargestOf3Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number to find largest number");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
            // Approach 1
        /*if(a>b && a>c){
            System.out.println("largest number is :" +a);
        } else if (b>a && b>c) {
            System.out.println("largest number is :" +b);
        }
        else {
            System.out.println("largest number is :" +c);
        }*/

        // Approach 2  Ternary operator

        /*int largest1=a>b?a:b;   //largest of a & b
        int largest2=c>largest1?c:largest1;   // largest of c & largest1

        System.out.println(largest2+" is largest number");*/

        //Approach 3

        int largest=c>(a>b?a:b)?c:(a>b?a:b);

        System.out.println(largest+" is largest number");




    }
}


