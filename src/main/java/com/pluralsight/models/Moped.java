package com.pluralsight.models;

public class Moped extends Vehicles {
    private int engineSize;
    private boolean hasPedalAssist;

    public Moped(String color, String make, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int year, int engineSize, boolean hasPedalAssist) {
        super(color, make, model, numberOfPassengers, cargoCapacity, fuelCapacity, year);
        this.engineSize = engineSize;
        this.hasPedalAssist = hasPedalAssist;
    }

    @Override
    public String toString() {
        return "\nMoped | " + "Engine Size (CCs): " + engineSize + " Has Pedal Assist: " + hasPedalAssist + "\n" + super.toString();
    }

    public boolean isHasPedalAssist() {
        return hasPedalAssist;
    }

    public void setHasPedalAssist(boolean hasPedalAssist) {
        this.hasPedalAssist = hasPedalAssist;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

}
