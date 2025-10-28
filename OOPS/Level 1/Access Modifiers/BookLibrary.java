// Base class: Book
class Book {
    public String ISBN;           // Public: accessible everywhere
    protected String title;       // Protected: accessible in subclass
    private String author;        // Private: accessible only within Book

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("📚 Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {
    private double fileSizeMB;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Method to display ebook details
    public void displayEBookDetails() {
        System.out.println("📱 EBook Details:");
        System.out.println("ISBN: " + ISBN);       // public
        System.out.println("Title: " + title);     // protected
        System.out.println("Author: " + getAuthor()); // private accessed via public method
        System.out.printf("File Size: %.2f MB\n", fileSizeMB);
    }
}

// Main class to test the system
public class BookLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("978-0140449136", "The Odyssey", "Homer");
        book1.displayBookDetails();
        System.out.println();

        EBook ebook1 = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 5.8);
        ebook1.displayEBookDetails();
        System.out.println();

        // Modify author using setter
        ebook1.setAuthor("J. Bloch");
        ebook1.displayEBookDetails();
    }
}