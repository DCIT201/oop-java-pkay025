package VRMS;

public class RentalTransaction {
    public RentalTransaction(Customer customer, Vehicle vehicle, int days) {

    }

    public Vehicle getVehicle() {
        return null;
    }

    public class rentaltransaction {
        private final Customer customer;
        private final Vehicle vehicle;
        private final int rentalDays;
        private final double totalCost;

        public rentaltransaction(Customer customer, Vehicle vehicle, int rentalDays) {
            this.customer = customer;
            this.vehicle = vehicle;
            this.rentalDays = rentalDays;
            this.totalCost = vehicle.calculateRentalCost(rentalDays);
        }

        public double getTotalCost() {
            return this.totalCost;
        }

        public String toString() {
            String var10000 = String.valueOf(this.customer);
            return "RentalTransaction{customer=" + var10000 + ", vehicle=" + String.valueOf(this.vehicle) + ", rentalDays=" + this.rentalDays + ", totalCost=" + this.totalCost + "}";
        }

        public Vehicle getVehicle() {
            return this.vehicle;
        }
    }



}
