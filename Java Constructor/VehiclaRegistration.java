public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
