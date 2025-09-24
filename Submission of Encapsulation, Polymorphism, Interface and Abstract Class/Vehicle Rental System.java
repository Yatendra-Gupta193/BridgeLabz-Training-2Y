import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance - Comprehensive";
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance - Third Party";
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.25;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance - Commercial";
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new Car("CAR001", 2000));
        vehicles.add(new Bike("BIKE001", 500));
        vehicles.add(new Truck("TRUCK001", 5000));
        vehicles.add(new Car("CAR002", 2500));
        
        int rentalDays = 5;
        
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = 0;
            String insuranceDetails = "No Insurance";
            
            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance() * rentalDays;
                insuranceDetails = ((Insurable) vehicle).getInsuranceDetails();
            }
            
            double totalCost = rentalCost + insuranceCost;
            
            System.out.println("Vehicle: " + vehicle.getType() + " (" + vehicle.getVehicleNumber() + ")");
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            System.out.println("Insurance: " + insuranceDetails);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + totalCost);
            System.out.println("-------------------");
        }
    }
}
