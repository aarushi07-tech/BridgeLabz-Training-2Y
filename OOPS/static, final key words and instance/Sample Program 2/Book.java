public class Book {
    // Static variable shared across all books
    private static String libraryName = "City Central Library";

    // Final variable: ISBN cannot be changed once assigned
    private final String isbn;

    // Instance variables
    private String title;
    private String author;

    // Constructor using 'this' to resolve ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("📚 Library Name: " + libraryName);
    }

    // Method to display book details using instanceof
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("📖 Book Details:");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("❌ Invalid book object.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");

        Book.displayLibraryName();
        System.out.println();

        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}