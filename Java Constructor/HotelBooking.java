public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("Ravi", "Deluxe", 3);
        HotelBooking hb3 = new HotelBooking(hb2);

        hb1.display();
        hb2.display();
        hb3.display();
    }
}
