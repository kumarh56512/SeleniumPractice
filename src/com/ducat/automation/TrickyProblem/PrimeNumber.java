package com.ducat.automation.TrickyProblem;

public class PrimeNumber {
    public static void main(String[] args) {

        int num = 19;
        int count = 0;

        if(num>1)
        {
            for(int i=1;i<=num;i++) {
                if (num % i == 0)

                    count++;
            }
                if(count==2)
                {
                    System.out.println("prime number");
                }
                else
                {
                    System.out.println("Not prime number");
                }
            }
            else
            {
                System.out.println("Not prime number");
            }
        }
    }
