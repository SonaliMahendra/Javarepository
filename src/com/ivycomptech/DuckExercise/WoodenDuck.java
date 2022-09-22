package com.ivycomptech.DuckExercise;

public class WoodenDuck extends Duck implements Decoratable{

    @Override
    public void decorate() {
        System.out.println("It can be used for decoration");
    }
}
