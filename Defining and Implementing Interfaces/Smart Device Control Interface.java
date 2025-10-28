interface SmartDevice {
    void turnOn();
    void turnOff();
}
class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}
class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV is ON"); }
    public void turnOff() { System.out.println("TV is OFF"); }
}
public class Main1 {
    public static void main(String[] args) {
        SmartDevice d1 = new Light();
        SmartDevice d2 = new TV();
        d1.turnOn(); d1.turnOff();
        d2.turnOn(); d2.turnOff();
    }
}
