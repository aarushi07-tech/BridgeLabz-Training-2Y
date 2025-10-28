public class Person {
    // Attributes
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("👤 Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Person original = new Person("Aarav", 28);
        Person clone = new Person(original); // Using copy constructor

        System.out.println("Original Person:");
        original.displayDetails();

        System.out.println("\nCloned Person:");
        clone.displayDetails();
    }
}