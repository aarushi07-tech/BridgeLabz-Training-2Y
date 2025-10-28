public class Product {
    // Static variable shared across all products
    private static double discount = 10.0; // Default discount in percentage

    // Final variable: productID cannot be changed once assigned
    private final String productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to resolve ambiguity
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
            System.out.println("✅ Discount updated to " + discount + "%");
        } else {
            System.out.println("❌ Invalid discount value. Must be between 0 and 100.");
        }
    }

    // Method to calculate total price after discount
    public double calculateTotalPrice() {
        double total = price * quantity;
        double discountedTotal = total - (total * discount / 100);
        return discountedTotal;
    }

    // Method to display product details using instanceof
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("🛒 Product Details:");
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.printf("Price: ₹%.2f\n", price);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Total after %.1f%% discount: ₹%.2f\n", discount, calculateTotalPrice());
        } else {
            System.out.println("❌ Invalid product object.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Product p1 = new Product("P101", "Wireless Mouse", 799.00, 2);
        Product p2 = new Product("P102", "Laptop Stand", 1299.00, 1);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        Product.updateDiscount(15.0); // Update discount for all products
        System.out.println();

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
    }
}