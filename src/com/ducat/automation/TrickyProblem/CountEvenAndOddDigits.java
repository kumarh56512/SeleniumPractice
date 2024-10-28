package com.ducat.automation.TrickyProblem;

public class CountEvenAndOddDigits {

    public static void main(String[] args) {
        int num = 56712;
        int even_count =0;
        int odd_count =0;

        while(num>0)
        {
            int rem=num%10;

            if(rem%2==0)
            {
                even_count++;
                System.out.println("even number is :" +rem);
            }
            else
            {
                odd_count++;
                System.out.println("odd number is :" +rem);
            }
            num=num/10;
        }
        System.out.println("Number of even Numbers is :" +even_count);
        System.out.println("Number of odd Numbers is :" +odd_count);
    }
}
