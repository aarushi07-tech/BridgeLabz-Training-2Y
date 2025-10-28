public class HotelBooking {
    // Attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this("Guest", "Standard", 1); // Chaining to parameterized constructor
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("🏨 Hotel Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    // Main method to test all constructors
    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Ananya Singh", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);

        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        System.out.println("\nCustom Booking:");
        customBooking.displayBooking();

        System.out.println("\nCopied Booking:");
        copiedBooking.displayBooking();
    }
}