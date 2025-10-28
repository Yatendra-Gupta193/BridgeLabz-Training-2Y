interface PaymentProcessor {
    void pay(double amount);
    default void refund(double amount) {
        System.out.println("Refunded ₹" + amount);
    }
}

class UPI implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor upi = new UPI();
        upi.pay(500);
        upi.refund(200);
    }
}
