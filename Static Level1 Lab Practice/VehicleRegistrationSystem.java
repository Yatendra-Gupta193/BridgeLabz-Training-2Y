class VehicleRegistrationSytsem {
    private static double registrationFee = 100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String registrationNumber, String vehicleType) {
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }
    public static void checkVehicle(Object obj) {
        if (obj instanceof Vehicle) {
            ((Vehicle) obj).displayDetails();
        } else {
            System.out.println("Not a Vehicle instance");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John Doe", "ABC123", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "XYZ789", "Motorcycle");
        
        Vehicle.updateRegistrationFee(150.0);
        
        Vehicle.checkVehicle(vehicle1);
        Vehicle.checkVehicle("Test String");
    }
}
