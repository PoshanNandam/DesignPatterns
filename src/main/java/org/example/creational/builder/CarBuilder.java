package org.example.creational.builder;

public class CarBuilder implements Builder{
    Vehicle car;

    CarBuilder(){
        this.car = new Car();
    }
    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setSeats(String seats) {
        car.setSets(seats);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        car.setTrip(tripComputer);
    }

    @Override
    public void setGPS(String gps) {
        car.setGPS(gps);
    }

    @Override
    public Vehicle getVehicle() {
        return this.car;
    }

}
