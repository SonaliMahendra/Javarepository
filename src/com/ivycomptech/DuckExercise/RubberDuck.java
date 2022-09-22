package com.ivycomptech.DuckExercise;

public class RubberDuck extends Duck implements Noise,Squeezable{
    @Override
    public void makeNoise() {
        System.out.println("It can make noise");
    }

    @Override
    public void squeeze() {
        System.out.println("It can be squeezed");
    }
}
