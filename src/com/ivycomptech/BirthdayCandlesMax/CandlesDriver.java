package com.ivycomptech.BirthdayCandlesMax;


import java.util.Scanner;

public class CandlesDriver extends Candles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] candles = new int[length];
        for (int i = 0; i < length; i++) {
            candles[i] = sc.nextInt();
        }
        Candles candles1=new Candles();
        candles1.birthdayCakeCandles(candles);
    }
}
