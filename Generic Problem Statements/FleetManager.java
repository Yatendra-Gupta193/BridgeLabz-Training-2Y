import java.util.*;
class Vehicle {
    public String toString() {
        return "Vehicle";
    }
}
class Truck extends Vehicle {
    public String toString() {
        return "Truck";
    }
}
class Bike extends Vehicle {
    public String toString() {
        return "Bike";
    }
}
class FleetManager<T extends Vehicle> {

    List<T> list = new ArrayList<>();
    void addVehicle(T v) {
        list.add(v);
    }
    void showFleet() {
        for (T v : list) {
            System.out.println(v);
        }
    }
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck());
        truckFleet.addVehicle(new Truck());
        truckFleet.showFleet();

        System.out.println("-----");

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike());
        bikeFleet.showFleet();
    }
}
