package com.ivycomptech.ExceptionExercise;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch;
        System.out.println("Enter the operator");
        ch = sc.next().charAt(0);
        String s = sc.next();
        s=null;
        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                try {
                    System.out.println(a / b);

                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage() + " : Exception is handled ");
                }
                break;
            default:
                System.out.println("Invalid expression");

        }
        try {
               System.out.println(s.length());
        } catch (NullPointerException n) {
            System.out.println(n.getMessage() + ": Exception is handled");
        }
    }
}

