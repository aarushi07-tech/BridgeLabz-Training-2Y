// Superclass: Book
class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author extends Book
class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Show book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to test
public class LibraryDemo {
    public static void main(String[] args) {
        Author bookWithAuthor = new Author(
            "The Art of Clarity",
            2023,
            "Suhani Sharma",
            "A passionate developer and educator focused on making tech accessible."
        );

        bookWithAuthor.displayInfo();
    }
}