package com.pluralsight.models;

public class SemiTruck extends Vehicles {
    private boolean isTrailerAttached, hasSleepCabin;
    private double cargoWeight;

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
