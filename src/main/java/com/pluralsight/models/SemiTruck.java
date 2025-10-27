package com.pluralsight.models;

public class SemiTruck extends Vehicles {
    private boolean isTrailerAttached, hasSleepCabin;
    private double cargoWeight;

    public SemiTruck(String color, String make, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int year, boolean isTrailerAttached, boolean hasSleepCabin, double cargoWeight) {
        super(color, make, model, numberOfPassengers, cargoCapacity, fuelCapacity, year);
        this.isTrailerAttached = isTrailerAttached;
        this.hasSleepCabin = hasSleepCabin;
        this.cargoWeight = cargoWeight;
    }

    public boolean isTrailerAttached() {
        return isTrailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        isTrailerAttached = trailerAttached;
    }

    public boolean isHasSleepCabin() {
        return hasSleepCabin;
    }

    public void setHasSleepCabin(boolean hasSleepCabin) {
        this.hasSleepCabin = hasSleepCabin;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

}
