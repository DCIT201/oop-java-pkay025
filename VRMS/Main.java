package VRMS;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        RentalAgency rentalAgency = new RentalAgency();
        Vehicle car1 = new Car("C001", "Toyota Camry", (double)50.0F, true);
        Vehicle motorcycle1 = new Motorcycle("M001", "Harley Davidson", (double)30.0F, false);
        Vehicle truck1 = new Truck("T001", "Ford F-150", (double)70.0F, (double)1000.0F);
        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(motorcycle1);
        rentalAgency.addVehicle(truck1);
        Customer customer = new Customer("CUST001", "John Doe");
        RentalTransaction transaction = rentalAgency.rentVehicle(customer, 3);
        if (transaction != null) {
            System.out.println("Vehicle rented successfully: " + transaction.getVehicle().getModel());
        } else {
            System.out.println("No vehicles available for rent.");
        }

        if (transaction != null) {
            rentalAgency.returnVehicle(transaction);
            System.out.println("Vehicle returned successfully: " + transaction.getVehicle().getModel());
        }

        System.out.println("Available vehicles:");

        for(Vehicle vehicle : rentalAgency.getAvailableVehicles()) {
            System.out.println(vehicle.getModel());
        }

    }
}
