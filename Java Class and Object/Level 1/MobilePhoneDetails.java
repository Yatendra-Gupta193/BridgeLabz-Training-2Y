public class MobilePhoneDetails {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("Samsung", "Galaxy S21", 70000);
        m.display();
    }
}
