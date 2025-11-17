import java.util.*;
class Cart<T> {

    List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }
    void removeItem(T item) {
        items.remove(item);
    }
    void displayItems() {
        for (T i : items) {
            System.out.println(i);
        }
    }
}
class Electronics {
    public String toString() {
        return "Electronics Item";
    }
}
class Clothing {
    public String toString() {
        return "Clothing Item";
    }
}
class Book {
    public String toString() {
        return "Book Item";
    }
}
class TestCart {
    public static void main(String[] args) {
      
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics());
        eCart.addItem(new Electronics());
        eCart.displayItems();

        System.out.println("----------------");

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing());
        cCart.addItem(new Clothing());
        cCart.displayItems();

        // eCart.addItem(new Clothing());  // ❌ Not allowed
    }
}
