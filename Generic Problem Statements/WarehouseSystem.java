import java.util.*;
abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}
class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}
class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}
class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    void add(T item) {
        items.add(item);
    }
    List<T> getItems() {
        return items;
    }
}
class WarehouseSystem {
    static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem w : list) {
            System.out.println(w);
        }
    }
    public static void main(String[] args) {
        Storage<Electronics> e = new Storage<>();
        e.add(new Electronics("Laptop"));
        e.add(new Electronics("Mobile"));

        Storage<Groceries> g = new Storage<>();
        g.add(new Groceries("Rice"));
        g.add(new Groceries("Sugar"));

        Storage<Furniture> f = new Storage<>();
        f.add(new Furniture("Chair"));

        displayAll(e.getItems());
        displayAll(g.getItems());
        displayAll(f.getItems());
    }
}
