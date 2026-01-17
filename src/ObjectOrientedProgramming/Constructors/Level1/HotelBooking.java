package ObjectOrientedProgramming.Constructors.Level1;

/*
 * Program: Hotel Booking System
 * Description: Demonstrates all types of constructors.
 */
public class HotelBooking {

    // Guest name
    String guestName;

    // Room type
    String roomType;

    // Number of nights
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Method to display booking details
    void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking("Jayanthi", "Deluxe", 3);
        HotelBooking booking2 = new HotelBooking(booking1);

        booking2.displayBooking();
    }
}
