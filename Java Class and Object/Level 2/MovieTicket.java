public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    void bookTicket() {
        System.out.println("Ticket booked for " + movieName + " Seat No: " + seatNumber + " Price: " + price);
    }
    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MovieTicket m = new MovieTicket("Avengers", 12, 300);
        m.bookTicket();
        m.display();
    }
}
