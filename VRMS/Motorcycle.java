package VRMS;
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean b) {
        super(vehicleId, model, baseRentalRate);
        this.hasSidecar = this.hasSidecar;
    }

    public double calculateRentalCost(int days) {
        return this.getBaseRentalRate() * (double)days * 0.9;
    }

    public boolean isAvailableForRental() {
        return this.isAvailable();
    }

    public String toString() {
        String var10000 = this.getModel();
        return "Motorcycle{model='" + var10000 + "', hasSidecar=" + this.hasSidecar + "}";
    }
}