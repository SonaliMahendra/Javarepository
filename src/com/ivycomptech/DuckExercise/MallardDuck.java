package com.ivycomptech.DuckExercise;

public class MallardDuck extends Duck implements Flyable,Swimmable,Noise,Walkable{

    @Override
    public void fly() {
        System.out.println("It can fly");
    }

    @Override
    public void swim() {
        System.out.println("It can swim");
    }

    @Override
    public void makeNoise() {
        System.out.println("It can make noise");
    }

    @Override
    public void walk() {
        System.out.println("It can walk");
    }
}
