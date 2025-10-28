public class Book1 {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public Book1(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("✅ You have successfully borrowed \"" + title + "\" by " + author + ".");
        } else {
            System.out.println("❌ Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("📚 Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: ₹%.2f\n", price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Main method to test the class
    public static void main(String[] args) {
        Book1 book1 = new Book1("Wings of Fire", "A.P.J. Abdul Kalam", 299.00, true);
        Book1 book2 = new Book1("The Theory of Everything", "Stephen Hawking", 349.00, false);

        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();

        System.out.println();

        book2.displayDetails();
        book2.borrowBook(); // Should show not available
    }
}