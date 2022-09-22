package com.ivycomptech.DuckExercise;

public class DuckDriver {
    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck();
        RubberDuck rubberDuck=new RubberDuck();
        WoodenDuck woodenDuck=new WoodenDuck();

        mallardDuck.sell();
        mallardDuck.shape();
        mallardDuck.fly();
        mallardDuck.makeNoise();
        mallardDuck.swim();
        mallardDuck.walk();

        rubberDuck.sell();
        rubberDuck.shape();
        rubberDuck.squeeze();
        rubberDuck.makeNoise();
        woodenDuck.sell();
        woodenDuck.decorate();
        woodenDuck.decorate();



    }
}
