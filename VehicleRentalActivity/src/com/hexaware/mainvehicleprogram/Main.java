package com.hexaware.mainvehicleprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.hexaware.abstractclasses.*;
import com.hexaware.concreteclasses.*;

public class Main {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private static User currentUser;

    public static void main(String[] args) {
        // Initialize vehicles
        vehicles.add(new Car("Toyota Camry", 50));
        vehicles.add(new Bike("Yamaha FZ", 15));
        vehicles.add(new Truck("Ford F-150", 80));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        currentUser = new User(username);

        while (true) {
            System.out.println("\n1. View Available Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Return a Vehicle");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewAvailableVehicles();
                    break;
                case 2:
                    rentVehicle(scanner);
                    break;
                case 3:
                    returnVehicle(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("- " + vehicle.getName() + ": $" + vehicle.getRentPrice());
        }
    }

    private static void rentVehicle(Scanner scanner) {
        System.out.println("Enter the name of the vehicle to rent:");
        String vehicleName = scanner.next();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getName().equalsIgnoreCase(vehicleName)) {
                currentUser.rentVehicle(vehicle);
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    private static void returnVehicle(Scanner scanner) {
        System.out.println("Enter the name of the vehicle to return:");
        String vehicleName = scanner.next();
        for (Vehicle vehicle : currentUser.getRentedVehicles()) {
            if (vehicle.getName().equalsIgnoreCase(vehicleName)) {
                currentUser.returnVehicle(vehicle);
                return;
            }
        }
        System.out.println("Vehicle not rented by user.");
    }
}

