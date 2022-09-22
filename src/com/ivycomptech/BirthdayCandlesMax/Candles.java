package com.ivycomptech.BirthdayCandlesMax;

public class Candles {
    public void birthdayCakeCandles(int[] candles) {
        int count=1;
        int max=-1;
        for (int i: candles) {
            if (candles[i] > max) {
                max = candles[i];
            } else if (candles[i] == max) {
                count++;
            }
        }
        System.out.println(count);
    }

    }
