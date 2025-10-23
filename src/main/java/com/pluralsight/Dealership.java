package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles= new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public  void getVehicleByPrice(double minPrice, double maxPrice) {
        List<Vehicle> filtered = new ArrayList<>();

        for (Vehicle vehiclelist : vehicles) {
            if (vehiclelist.getPrice() >= minPrice && vehiclelist.getPrice() <= maxPrice) {
                filtered.add(vehiclelist);
            }
        }

        System.out.println("\n=== Vehicles priced between $" + minPrice + " and $" + maxPrice + " ===");
        displayResults(filtered);
    }

    private static void displayResults(List<Vehicle> vehicles) {

    }


}


