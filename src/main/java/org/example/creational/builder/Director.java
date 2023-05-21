package org.example.creational.builder;

public class Director {

    public void constructBus(Builder builder){
        builder.setEngine("Volvo Engine");
        builder.setSeats("50");
        builder.setGPS("True");
        builder.setTripComputer("True");
    }

    public void constructCar(Builder builder){
        builder.setEngine("Honda Engine");
        builder.setSeats("5");
        builder.setGPS("True");
        builder.setTripComputer("False");
    }
}
