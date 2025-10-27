package com.pluralsight;

import com.pluralsight.models.*;

public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(2);
        slowRide.setCargoCapacity(10);
        slowRide.setEngineSize(50);

        System.out.println("Moped's color: " + slowRide.getColor());
        System.out.println("Moped's Fuel Capacity: " + slowRide.getFuelCapacity());
        System.out.println("Moped's Passenger Count: " + slowRide.getNumberOfPassengers());
        System.out.println("Moped's Cargo Cap: " + slowRide.getCargoCapacity());
        System.out.println("Moped's Engine Size: " + slowRide.getEngineSize());

        System.out.println("\n****\n");

        Car elantra = new Car();
        elantra.setColor("Eletric Shadow");
        elantra.setCarType("Sedan");
        elantra.setFuelCapacity(12);
        elantra.setNumberOfPassengers(5);
        elantra.setNumberOfDoors(4);
        elantra.setMake("Hyundai");
        elantra.setModel("Elantra SEL");
        elantra.setYear(2023);

        System.out.println("Car Color: " + elantra.getColor());
        System.out.println("Car Make: " + elantra.getMake());
        System.out.println("Car Model: " + elantra.getModel());
        System.out.println("Car Release Year: " + elantra.getYear());
        System.out.println("Car Type: " + elantra.getCarType());
        System.out.println("Car Fuel Cap: " + elantra.getFuelCapacity());
        System.out.println("Car Num Pass: " + elantra.getNumberOfPassengers());
        System.out.println("Car Door Count: " + elantra.getNumberOfDoors());

        System.out.println("\n****\n");

        SemiTruck twuk = new SemiTruck();
        twuk.setColor("Big Red");
        twuk.setCargoWeight(0);
        twuk.setTrailerAttached(false);
        twuk.setHasSleepCabin(true);
        twuk.setFuelCapacity(90);

        System.out.println("Truck Color: " + twuk.getColor());
        System.out.println("Truck Cargo Weight: " + twuk.getCargoWeight());
        System.out.println("Is the trailer attached: " + twuk.isTrailerAttached());
        System.out.println("Does it have a sleep cabin: " + twuk.isHasSleepCabin());
        System.out.println("Truck Fuel Cap: " + twuk.getFuelCapacity());

        System.out.println("\n****\n");

        Hovercraft hover = new Hovercraft();
        hover.setColor("Gray");
        hover.setCargoCapacity(10000);
        hover.setNumberOfPassengers(100);
        hover.setHoverHeight(200);
        hover.setAmphibious(true);
        hover.setFuelCapacity(200);

        System.out.println("Hover color: " +hover.getColor());
        System.out.println("Hover cargo cap: " + hover.getCargoCapacity());
        System.out.println("Hover passenger count: " + hover.getNumberOfPassengers());
        System.out.println("Hover Height: " + hover.getHoverHeight());
        System.out.println("Is it water: " + hover.isAmphibious());
        System.out.println("Hover fuel cap: " + hover.getFuelCapacity());

    }


}
