package VRMS;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double v) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity = this.loadCapacity;
    }

    public double calculateRentalCost(int days) {
        return this.getBaseRentalRate() * (double)days * 1.2;
    }

    public boolean isAvailableForRental() {
        return this.isAvailable();
    }

    public String toString() {
        String var10000 = this.getModel();
        return "Truck{model='" + var10000 + "', loadCapacity=" + this.loadCapacity + "}";
    }
}