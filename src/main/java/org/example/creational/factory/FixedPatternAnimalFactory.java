package org.example.creational.factory;

public class FixedPatternAnimalFactory implements AnimalFactory{
    int count;

    FixedPatternAnimalFactory(){
        count = 0;
    }
    @Override
    public Animal createAnimal() {
        this.count++;
        if(count%4==1 || count%4==2){
            return new Dog();
        }
        else{
            return new Cat();
        }
    }
}
