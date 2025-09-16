class ShoppingCartSystem {
    private static double discount = 0.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + (price - (price * discount / 100)));
    }
    public static void validateProduct(Object obj) {
        if (obj instanceof Product) {
            ((Product) obj).displayDetails();
        } else {
            System.out.println("Invalid product object");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 1001, 999.99, 5);
        Product prod2 = new Product("Mouse", 1002, 25.50, 10);
        
        Product.updateDiscount(15.0);
        
        Product.validateProduct(prod1);
        Product.validateProduct("Test String");
    }
}
