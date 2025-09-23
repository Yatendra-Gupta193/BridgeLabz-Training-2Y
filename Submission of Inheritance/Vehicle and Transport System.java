class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(int maxSpeed, String fuelType, double cargoCapacity) {
        super(maxSpeed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Cargo Capacity: " + cargoCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Has Sidecar: " + hasSidecar);
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        
        vehicles[0] = new Car(200, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15.5);
        vehicles[2] = new Motorcycle(180, "Petrol", false);
        
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
