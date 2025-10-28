interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery at 80%");
    }
}

class Car implements Vehicle {
    public void displaySpeed() { System.out.println("Car speed: 100 km/h"); }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() { System.out.println("Electric Car speed: 90 km/h"); }
    public void displayBattery() { System.out.println("Battery at 90%"); }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new ElectricCar();
        v1.displaySpeed(); v1.displayBattery();
        v2.displaySpeed(); v2.displayBattery();
    }
}
