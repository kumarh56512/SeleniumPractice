package com.ducat.automation.TrickyProblem;

import java.util.Random;

public class GenerateRandomNumbersAndString {

    public static void main(String[] args) {
        //Approach 1

        Random rand = new Random();

        int rand_num = rand.nextInt(1000);
        System.out.println(rand_num);

        double rand_dbl = rand.nextDouble();  // range 0.0 to 1.0 by default.
        System.out.println(rand_dbl);

    }
}
