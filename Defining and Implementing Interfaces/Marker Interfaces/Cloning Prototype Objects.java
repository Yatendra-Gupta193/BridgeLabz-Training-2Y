class Product implements Cloneable {
    String name = "Laptop";

    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws Exception {
        Product p1 = new Product();
        Product p2 = p1.clone();
        System.out.println("Original: " + p1.name + ", Clone: " + p2.name);
    }
}
