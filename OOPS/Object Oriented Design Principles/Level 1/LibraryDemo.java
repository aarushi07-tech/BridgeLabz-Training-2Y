import java.util.ArrayList;

// Book class (Independent)
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class (Aggregates Books)
class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayInfo();
        }
        System.out.println();
    }
}

// Main class to demonstrate aggregation
public class LibraryDemo {
    public static void main(String[] args) {
        // Create independent Book objects
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Thinking in Java", "Bruce Eckel");

        // Create Library objects
        Library libA = new Library("City Library");
        Library libB = new Library("University Library");

        // Add books to libraries
        libA.addBook(book1);
        libA.addBook(book2);

        libB.addBook(book2); // Same book in another library
        libB.addBook(book3);

        // Display books in each library
        libA.showBooks();
        libB.showBooks();
    }
}