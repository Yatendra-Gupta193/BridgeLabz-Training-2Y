import java.util.List;
import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + ": $" + product.getPrice());
        }
        System.out.println("Total: $" + getTotalPrice());
    }
}

class Customer {
    private String name;
    private String email;
    private List<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Order placeOrder(int orderId) {
        Order order = new Order(orderId, this);
        orders.add(order);
        return order;
    }

    public void displayOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order order : orders) {
            order.displayOrder();
            System.out.println();
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "john@email.com");
        Customer customer2 = new Customer("Jane Smith", "jane@email.com");

        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Mouse", 29.99);
        Product product3 = new Product("Keyboard", 79.99);

        Order order1 = customer1.placeOrder(1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = customer2.placeOrder(2);
        order2.addProduct(product1);
        order2.addProduct(product3);

        customer1.displayOrders();
        customer2.displayOrders();
    }
}
