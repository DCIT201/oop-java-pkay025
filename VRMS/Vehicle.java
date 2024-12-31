package VRMS;

import java.util.UUID;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }

    public Vehicle() {
        String randomVehicleId = UUID.randomUUID().toString();
        this.vehicleId = randomVehicleId.substring(0, 8);
    }

    public String getVehicleId() {
        return this.vehicleId;
    }

    public String getModel() {
        return this.model;
    }

    public double getBaseRentalRate() {
        return this.baseRentalRate;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public abstract double calculateRentalCost(int var1);

    public abstract boolean isAvailableForRental();

    public String toString() {
        return "Vehicle{vehicleId='" + this.vehicleId + "', model='" + this.model + "', baseRentalRate=" + this.baseRentalRate + ", isAvailable=" + this.isAvailable + "}";
    }
}