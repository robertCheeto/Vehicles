package com.pluralsight.models;

public class Vehicles {
    private String color, make, model;
    private int numberOfPassengers, cargoCapacity, fuelCapacity, year;

    public Vehicles(String color, String make, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int year) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nMake: " + make + "\nModel: " + model +
                "\nYear: " + year + "\nNumber of Passengers: " + numberOfPassengers;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


}
