package com.hexaware.concreteclasses;

import java.util.ArrayList;
import java.util.List;
import com.hexaware.abstractclasses.*;
public class User {
    private String username;
    private List<Vehicle> rentedVehicles;

    public User(String username) {
        this.username = username;
        this.rentedVehicles = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void rentVehicle(Vehicle vehicle) {
        rentedVehicles.add(vehicle);
        vehicle.rentVehicle();
    }

    public void returnVehicle(Vehicle vehicle) {
        if (rentedVehicles.remove(vehicle)) {
            vehicle.returnVehicle();
        } else {
            System.out.println("Vehicle not rented by user.");
        }
    }

    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }
}

