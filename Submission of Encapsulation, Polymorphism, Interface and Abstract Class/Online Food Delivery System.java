import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + calculateTotalPrice());
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discountPercentage;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discountPercentage / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discountPercentage = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount: " + discountPercentage + "%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discountPercentage;
    private double additionalCharge;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.additionalCharge = 20.0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + additionalCharge) * getQuantity();
        return total - (total * discountPercentage / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discountPercentage = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: " + discountPercentage + "%";
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}

public class Main {
    public static void processOrder(List<FoodItem> items) {
        double orderTotal = 0;
        
        for (FoodItem item : items) {
            item.getItemDetails();
            
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            
            if (item instanceof NonVegItem) {
                System.out.println("Additional Charge: " + ((NonVegItem) item).getAdditionalCharge());
            }
            
            double itemTotal = item.calculateTotalPrice();
            orderTotal += itemTotal;
            System.out.println("Item Total: " + itemTotal);
            System.out.println("-------------------");
        }
        
        System.out.println("Order Total: " + orderTotal);
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        
        VegItem veg1 = new VegItem("Paneer Tikka", 250, 2);
        veg1.applyDiscount(10);
        
        NonVegItem nonVeg1 = new NonVegItem("Chicken Biryani", 300, 1);
        nonVeg1.applyDiscount(5);
        
        VegItem veg2 = new VegItem("Dal Makhani", 180, 3);
        veg2.applyDiscount(15);
        
        NonVegItem nonVeg2 = new NonVegItem("Butter Chicken", 350, 2);
        nonVeg2.applyDiscount(8);
        
        order.add(veg1);
        order.add(nonVeg1);
        order.add(veg2);
        order.add(nonVeg2);
        
        processOrder(order);
    }
}
