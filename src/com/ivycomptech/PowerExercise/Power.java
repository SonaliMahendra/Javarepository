package com.ivycomptech.PowerExercise;

public class Power {
    public static void main(String[] args) {
        int num = 3, exponent = 4;
        long result = 1;
        while (exponent != 0) {
            result *= num;
            --exponent;
        }
        System.out.println("Answer = " + result);
    }
}

