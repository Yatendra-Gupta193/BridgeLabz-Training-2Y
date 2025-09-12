public class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    void addItem(int qty) {
        quantity += qty;
    }
    void removeItem(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
        } else {
            System.out.println("Not enough items to remove");
        }
    }
    double totalCost() {
        return price * quantity;
    }
    void display() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }
    public static void main(String[] args) {
        CartItem c = new CartItem("Laptop", 50000, 1);
        c.addItem(1);
        c.removeItem(1);
        c.display();
    }
}
