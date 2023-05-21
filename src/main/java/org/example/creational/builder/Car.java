package org.example.creational.builder;

public class Car implements Vehicle{
    private String engine;
    private String sets;
    private String Trip;
    private String GPS;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public String getTrip() {
        return Trip;
    }

    public void setTrip(String trip) {
        Trip = trip;
    }

    public String getGPS() {
        return GPS;
    }

    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", sets='" + sets + '\'' +
                ", Trip='" + Trip + '\'' +
                ", GPS='" + GPS + '\'' +
                '}';
    }
}
