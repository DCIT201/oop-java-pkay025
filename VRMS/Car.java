package VRMS;

public class Car extends Vehicle {
    private boolean hasGPS;

    public Car(String vehicleId, String model, double baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate);
        this.hasGPS = hasGPS;
    }

    public Car(String g1, String toyotaCorolla, int baseRentalRate) {
    }

    public double calculateRentalCost(int days) {
        return this.getBaseRentalRate() * (double)days;
    }

    public boolean isAvailableForRental() {
        return this.isAvailable();
    }

    public String toString() {
        String var10000 = this.getModel();
        return "Car{model='" + var10000 + "', hasGPS=" + this.hasGPS + "}";
    }
}

