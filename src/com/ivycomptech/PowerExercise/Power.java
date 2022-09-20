package com.ivycomptech.PowerExercise;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base and exponent:");
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = " + result);
    }
}

