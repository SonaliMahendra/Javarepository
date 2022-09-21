package com.ivycomptech.PoymorphismAnimals;

public class AnimalsDriver {
    public static void main(String[] args) {
        Animals animals =new Animals();
        Animals herbivores=new Herbivores();
        Animals carnivores=new Carnivores();
        Animals omnivores=new Omnivores();

        animals.eats();
        herbivores.eats();
        carnivores.eats();
        omnivores.eats();
    }
}
