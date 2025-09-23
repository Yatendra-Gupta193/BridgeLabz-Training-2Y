class Vehicle {
    private int maxSpeed;
    private String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Charging electric vehicle: " + getModel());
    }
}

class Petro1Vehicle extends Vehicle implements Refuelable {
    public Petro1Vehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println("Refueling petrol vehicle: " + getModel());
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(180, "Tesla Model S");
        Petro1Vehicle pv = new Petro1Vehicle(220, "Ford Mustang");

        ev.charge();
        pv.refuel();

        System.out.println("Electric vehicle model: " + ev.getModel());
        System.out.println("Petrol vehicle max speed: " + pv.getMaxSpeed());
    }
}
