package org.example.creational.abstractFactory;

public class DogFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    @Override
    public Food createFood() {
        return new DogFood();
    }
}
