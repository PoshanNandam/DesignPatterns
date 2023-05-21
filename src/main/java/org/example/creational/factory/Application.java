package org.example.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("Random Barks ......");
        AnimalFactory factory = new RandomAnimalFactory();
        List<Animal> barks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            barks.add(factory.createAnimal());
        }

        for (int i = 0; i < 10; i++) {
            barks.get(i).bark();
        }

        System.out.println("Fixed Patter Barks ......");

        factory = new FixedPatternAnimalFactory();
        barks.clear();

        for (int i = 0; i < 10; i++) {
            barks.add(factory.createAnimal());
        }

        for (int i = 0; i < 10; i++) {
            barks.get(i).bark();
        }
    }
}
