package com.pluralsight.models;

public class Car extends Vehicles {
    private int numberOfDoors;
    private String carType;

    public Car(String color, String make, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int year, int numberOfDoors, String carType) {
        super(color, make, model, numberOfPassengers, cargoCapacity, fuelCapacity, year);
        this.numberOfDoors = numberOfDoors;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car | Car Type: "  + carType + " Number of Doors: " + numberOfDoors + "\n" + super.toString();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


}
