package com.pluralsight.models;

public class Hovercraft extends Vehicles {
    private boolean isAmphibious;
    private double hoverHeight;

    public Hovercraft(String color, String make, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int year, boolean isAmphibious, double hoverHeight) {
        super(color, make, model, numberOfPassengers, cargoCapacity, fuelCapacity, year);
        this.isAmphibious = isAmphibious;
        this.hoverHeight = hoverHeight;
    }

    @Override
    public String toString() {
        return "Hovercraft | Is It Amphibious: " + isAmphibious +
                " Hover Height (ft): " + hoverHeight + "\n" + super.toString();
    }

    public boolean isAmphibious() {
        return isAmphibious;
    }

    public void setAmphibious(boolean amphibious) {
        isAmphibious = amphibious;
    }

    public double getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(double hoverHeight) {
        this.hoverHeight = hoverHeight;
    }

}
