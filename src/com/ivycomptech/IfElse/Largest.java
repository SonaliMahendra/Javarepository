package com.ivycomptech.IfElse;
import java.util.Scanner;
public class Largest {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter 3 numbers:");
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int n3 = s.nextInt();
            if( n1 >= n2 && n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else if (n2 >= n1 && n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
    }
