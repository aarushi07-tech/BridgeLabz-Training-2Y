public class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: ₹%.2f\n", price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 74999.00);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 89999.00);

        phone1.displayDetails();
        System.out.println(); // Just for spacing
        phone2.displayDetails();
    }
}