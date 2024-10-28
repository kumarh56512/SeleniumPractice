package com.ducat.automation.TrickyProblem;

public class SwapingNumber {

    // swaping two number with 5 various technique

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swaping value is " + a+ " " + b);

        // Logic 1 - using third variable t

       /* int t=a;
        a = t;
        a = b;
        b = t;*/



        //Logic 2 - Without using third variable use + & - operator.
        /*a = a+b; //10+20=30
        b = a-b; //30-20=10
        a = a-b; //30-10=20*/


        //Logic 3 - Without using third variable using multiplication  & division.
        // here value of a and b should not be zero.

       /* a = a*b; //10*20=200
        b = a/b; //200/20=10
        a = a/b; //200/10=20 */

        // Logic 4 - using bitwise XOR (^)

        /*a = a^b; // a^b = 30
        b = a^b; // a^b = 10
        a = a^b; // a^b = 20*/

        //Logic 5 -
        //a=10 , b=20

        b=a+b-(a=b);

        System.out.println("After swaping value is " +a+ " "+b);
    }
}
