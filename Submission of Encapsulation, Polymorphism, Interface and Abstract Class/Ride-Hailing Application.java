import java.util.*;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }
    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public void setRatePerKm(double ratePerKm) { this.ratePerKm = ratePerKm; }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS {
    private String currentLocation;
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.2;
    }
    @Override
    public String getCurrentLocation() { return currentLocation; }
    @Override
    public void updateLocation(String location) { this.currentLocation = location; }
}

class Bike extends Vehicle implements GPS {
    private String currentLocation;
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8;
    }
    @Override
    public String getCurrentLocation() { return currentLocation; }
    @Override
    public void updateLocation(String location) { this.currentLocation = location; }
}

class Auto extends Vehicle implements GPS {
    private String currentLocation;
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 1.1;
    }
    @Override
    public String getCurrentLocation() { return currentLocation; }
    @Override
    public void updateLocation(String location) { this.currentLocation = location; }
}

public class Main {
    public static void calculateFares(List<Vehicle> vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            if (vehicle instanceof GPS) {
                System.out.println("Location: " + ((GPS) vehicle).getCurrentLocation());
            }
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        
        Car car = new Car("C001", "John", 10);
        car.updateLocation("Location A");
        
        Bike bike = new Bike("B001", "Mike", 5);
        bike.updateLocation("Location B");
        
        Auto auto = new Auto("A001", "Sam", 7);
        auto.updateLocation("Location C");
        
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);
        
        calculateFares(vehicles, 15);
    }
}
