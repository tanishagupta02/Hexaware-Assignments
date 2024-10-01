package com.hexaware.concreteclasses;
import com.hexaware.abstractclasses.*;
public class Truck extends Vehicle {
    public Truck(String name, double rentalPrice) {
        super(name, rentalPrice);
    }

    @Override
    public void rentVehicle() {
        System.out.println("Truck " + getName() + " rented for $" + getRentPrice());
    }

    @Override
    public void returnVehicle() {
        System.out.println("Truck " + getName() + " returned.");
    }
}
