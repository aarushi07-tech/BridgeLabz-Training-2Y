public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("📚 Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: ₹%.2f\n", price);
    }

    // Main method to test both constructors
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("The Alchemist", "Paulo Coelho", 399.00);

        defaultBook.displayDetails();
        System.out.println(); // For spacing
        customBook.displayDetails();
    }
}