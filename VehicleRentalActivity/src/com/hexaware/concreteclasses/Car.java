package com.hexaware.concreteclasses;
import com.hexaware.abstractclasses.*;

public class Car extends Vehicle {
    public Car(String name, double rentalPrice) {
        super(name, rentalPrice);
    }

    @Override
    public void rentVehicle() {
        System.out.println("Car " + getName() + " rented for $" + getRentPrice());
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car " + getName() + " returned.");
    }
}
