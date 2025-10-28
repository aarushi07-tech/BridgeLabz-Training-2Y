public class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket() {
        this.isBooked = false; // Initially, ticket is not booked
    }

    // Method to book a ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        if (!isBooked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("🎬 Movie Ticket Details:");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.printf("Price: ₹%.2f\n", price);
        } else {
            System.out.println("No ticket has been booked yet.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.displayTicketDetails(); // Before booking
        System.out.println();

        ticket.bookTicket("Jawan", "A12", 250.00);
        System.out.println();

        ticket.displayTicketDetails(); // After booking
    }
}
