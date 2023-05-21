package org.example.creational.factory;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory{

    public Animal createAnimal(){
        Random random = new Random();
        if (random.nextInt(2) == 1){
            return new Dog();
        }
        else return new Cat();
    }
}
