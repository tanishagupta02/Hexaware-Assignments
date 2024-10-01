package com.hexaware.concreteclasses;
import com.hexaware.abstractclasses.*;

public class Bike extends Vehicle {
    public Bike(String name, double rentalPrice) {
        super(name, rentalPrice);
    }

    @Override
    public void rentVehicle() {
        System.out.println("Bike " + getName() + " rented for $" + getRentPrice());
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike " + getName() + " returned.");
    }
}
