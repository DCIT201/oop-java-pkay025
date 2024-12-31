package VRMS;

import java.util.ArrayList;
import java.util.List;

    public class RentalAgency {
        private List<Vehicle> vehicleFleet = new ArrayList();

        public RentalAgency() {
        }

        public void addVehicle(Vehicle vehicle) {
            this.vehicleFleet.add(vehicle);
        }

        public Vehicle findAvailableVehicle() {
            for(Vehicle vehicle : this.vehicleFleet) {
                if (vehicle.isAvailableForRental()) {
                    return vehicle;
                }
            }

            return null;
        }

        public RentalTransaction rentVehicle(Customer customer, int days) {
            Vehicle vehicle = this.findAvailableVehicle();
            if (vehicle != null) {
                vehicle.setAvailable(false);
                RentalTransaction transaction = new RentalTransaction(customer, vehicle, days);
                customer.addRental(transaction);
                return transaction;
            } else {
                return null;
            }
        }

        public void returnVehicle(RentalTransaction transaction) {
            Vehicle vehicle = transaction.getVehicle();
            vehicle.setAvailable(true);
        }

        public List<Vehicle> getAllVehicles() {
            return this.vehicleFleet;
        }

        public List<Vehicle> getAvailableVehicles() {
            List<Vehicle> availableVehicles = new ArrayList();

            for(Vehicle vehicle : this.vehicleFleet) {
                if (vehicle.isAvailableForRental()) {
                    availableVehicles.add(vehicle);
                }
            }

            return availableVehicles;
        }

        public void processRental(Customer customer, Vehicle car, int i) {
        }
    }

