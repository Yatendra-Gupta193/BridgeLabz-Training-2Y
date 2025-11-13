import java.util.Random;

// Custom Exceptions
class OutOfStockException extends Exception {
    public OutOfStockException(String msg) { super(msg); }
}
class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) { super(msg); }
}
class Order {
    Random rand = new Random();

    void placeOrder() throws OutOfStockException, PaymentFailedException {
        int event = rand.nextInt(2); // 0 or 1

        if (event == 0) {
            throw new OutOfStockException("Order Failed: Product is OUT OF STOCK!");
        } else {
            throw new PaymentFailedException("Order Failed: PAYMENT FAILED!");
        }
    }
}
public class OrderProcessing {
    public static void main(String[] args) {
        Order o = new Order();

        try {
            o.placeOrder();
        }
        catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
        catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
