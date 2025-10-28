public class Circle {
    // Attribute
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    public void displayDetails() {
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Area: %.2f\n", getArea());
        System.out.printf("Circumference: %.2f\n", getCircumference());
    }

    // Main method to test both constructors
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();           // Uses default constructor
        Circle customCircle = new Circle(4.5);         // Uses parameterized constructor

        System.out.println("Default Circle:");
        defaultCircle.displayDetails();

        System.out.println("\nCustom Circle:");
        customCircle.displayDetails();
    }
}