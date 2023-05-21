package org.example.creational.builder;

public interface Builder {

    void reset();

    void setEngine(String engine);

    void setSeats(String seats);

    void setTripComputer(String tripComputer);

    void setGPS(String gps);

    Vehicle getVehicle();
}
