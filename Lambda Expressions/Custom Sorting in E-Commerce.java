import java.util.*;
public class ECommerceSorting {
    static class Product {
        String name;
        double price, rating, discount;
        
        Product(String name, double price, double rating, double discount) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discount = discount;
        }      
        public String toString() {
            return name + " - $" + price + " (Rating: " + rating + ")";
        }
    }  
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 999.99, 4.5, 10),
            new Product("Phone", 699.99, 4.2, 15),
            new Product("Tablet", 449.99, 4.0, 20)
        );     
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Price Low to High:");
        products.forEach(System.out::println);
        
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nRating High to Low:");
        products.forEach(System.out::println);
        
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nDiscount High to Low:");
        products.forEach(System.out::println);
    }
}
