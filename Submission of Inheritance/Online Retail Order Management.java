class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order("001", "2024-01-15");
        System.out.println(order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder("002", "2024-01-16", "TRK123456");
        System.out.println(shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder = new DeliveredOrder("003", "2024-01-17", "TRK789012", "2024-01-20");
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
