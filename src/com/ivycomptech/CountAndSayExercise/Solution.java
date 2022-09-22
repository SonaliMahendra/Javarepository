package com.ivycomptech.CountAndSayExercise;
import java.util.Scanner;
public class Solution extends CountAndSay{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Solution solution=new Solution();
        System.out.println(solution.countAndSay(num));
    }
    }

