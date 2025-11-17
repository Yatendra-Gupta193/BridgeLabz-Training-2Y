import java.util.*;
class BookCategory {
    public String toString() {
        return "Book Category";
    }
}
class ClothingCategory {
    public String toString() {
        return "Clothing Category";
    }
}
class GadgetCategory {
    public String toString() {
        return "Gadget Category";
    }
}
class Product<T> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String toString() {
        return name + " - " + price;
    }
}
class OnlineMarketplace {
    static <T extends Product<?>> 
    void applyDiscount(T p, double percent) {
        p.price = p.price - (p.price * percent / 100);
    }
    public static void main(String[] args) {

        Product<BookCategory> book = 
            new Product<>("Java Book", 500, new BookCategory());

        Product<ClothingCategory> shirt = 
            new Product<>("Shirt", 800, new ClothingCategory());

        Product<GadgetCategory> phone = 
            new Product<>("Phone", 15000, new GadgetCategory());

        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        applyDiscount(phone, 5);

        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}
