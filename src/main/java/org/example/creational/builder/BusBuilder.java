package org.example.creational.builder;

public class BusBuilder implements Builder{
    Vehicle bus;
    public BusBuilder() {
        this.bus = new Bus();
    }

    @Override
    public void reset() {
        this.bus = new Bus();
    }

    @Override
    public void setEngine(String engine) {
        this.bus.setEngine(engine);
    }

    @Override
    public void setSeats(String seats) {
        this.bus.setSets(seats);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.bus.setTrip(tripComputer);
    }

    @Override
    public void setGPS(String gps) {
        this.bus.setGPS(gps);
    }

    @Override
    public Vehicle getVehicle() {
        return this.bus;
    }

}
