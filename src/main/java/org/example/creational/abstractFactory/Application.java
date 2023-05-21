package org.example.creational.abstractFactory;

import java.util.Scanner;

public class Application {
    void getAnimalDetails(AnimalFactory factory){
        factory.createAnimal().bark();
        factory.createFood().foodName();
    }
    public static void main(String[] args) {
        AnimalFactory factory;
        Scanner myObj = new Scanner(System.in);
        String animalType = myObj.nextLine();

        if (animalType.equals("Dog")){
            factory = new DogFactory();
        }
        else if(animalType.equals("Cat")){
            factory = new CatFactory();
        }
        else return;

        Application obj = new Application();
        obj.getAnimalDetails(factory);



    }
}
