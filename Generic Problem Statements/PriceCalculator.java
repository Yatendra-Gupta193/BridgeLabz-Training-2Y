import java.util.*;
class Product {
    double price;

    Product(double price) {
        this.price = price;
    }
    double getPrice() {
        return price;
    }
}
class Mobile extends Product {
    Mobile(double price) {
        super(price);
    }
}
class Laptop extends Product {
    Laptop(double price) {
        super(price);
    }
}
class PriceCalculator {

    static double calculateTotal(List<? extends Product> items) {
        double sum = 0;

        for (Product p : items) {
            sum += p.getPrice();
        }
        return sum;
    }
    public static void main(String[] args) {

        List<Mobile> mobiles = Arrays.asList(
            new Mobile(10000),
            new Mobile(15000)
        );
        List<Laptop> laptops = Arrays.asList(
            new Laptop(40000),
            new Laptop(55000)
        );
        System.out.println("Mobile Total = " + calculateTotal(mobiles));
        System.out.println("Laptop Total = " + calculateTotal(laptops));
    }
}
