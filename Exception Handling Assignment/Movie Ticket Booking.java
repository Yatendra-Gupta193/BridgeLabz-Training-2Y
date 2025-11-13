class InvalidSeatException extends Exception{
    public InvalidSeatException(String m){ super(m); }
}
class SeatAlreadyBookedException extends Exception{
    public SeatAlreadyBookedException(String m){ super(m); }
}
public class MovieBooking {
    static boolean[] seats = new boolean[11]; 

    public static void main(String[] args) {
        try {
            bookSeat(5);
            bookSeat(5);  
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void bookSeat(int seatNo)
            throws InvalidSeatException, SeatAlreadyBookedException {

        if(seatNo < 1 || seatNo > 10)
            throw new InvalidSeatException("Seat number does not exist");

        if(seats[seatNo])
            throw new SeatAlreadyBookedException("Seat already booked");

        seats[seatNo] = true;
        System.out.println("Seat booked: " + seatNo);
    }
}
