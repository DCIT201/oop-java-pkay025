package VRMS;

public class RentalTransaction {
    public class RentalTransaction {
        private final Customer customer;
        private final Vehicle vehicle;
        private final int rentalDays;
        private final double totalCost;

        public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
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
