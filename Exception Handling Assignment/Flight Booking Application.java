class SeatUnavailableException extends Exception{
    public SeatUnavailableException(String m){ super(m); }
}
class PaymentFailedException extends Exception{
    public PaymentFailedException(String m){ super(m); }
}
public class FlightBooking {

    static boolean seatAvailable = false;

    static void checkSeatAvailability() throws SeatUnavailableException {
        if(!seatAvailable)
            throw new SeatUnavailableException("No seats available!");
    }

    static void processPayment() throws PaymentFailedException {
        boolean paymentOk = false;
        if(!paymentOk)
            throw new PaymentFailedException("Payment failed.");
    }
    static void bookTicket() throws Exception {
        checkSeatAvailability();
        processPayment();
        System.out.println("Ticket booked successfully!");
    }
    public static void main(String[] args) {
        try {
            bookTicket();
        }
        catch(SeatUnavailableException e){
            System.out.println(e.getMessage());
        }
        catch(PaymentFailedException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Other error");
        }
        finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
