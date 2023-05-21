package org.example.creational.builder;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new BusBuilder();
        director.constructBus(builder);
        System.out.println(builder.getVehicle().toString());
    }
}
