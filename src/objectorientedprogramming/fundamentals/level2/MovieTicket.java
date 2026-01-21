package objectorientedprogramming.fundamentals.level2;

/*
 * Program: Movie Ticket Booking
 * Description: Books a movie ticket and
 * displays ticket details.
 */
public class MovieTicket {

    // Movie name
    String movieName;

    // Seat number
    int seatNumber;

    // Ticket price
    double price;

    // Method to book ticket
    void bookTicket(String name, int seat, double cost) {
        movieName = name;
        seatNumber = seat;
        price = cost;
    }

    // Method to display ticket details
    void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }

    public static void main(String[] args) {
        // Creating MovieTicket object
        MovieTicket ticket = new MovieTicket();

        // Booking ticket
        ticket.bookTicket("Inception", 12, 250);

        // Displaying details
        ticket.displayTicketDetails();
    }
}
