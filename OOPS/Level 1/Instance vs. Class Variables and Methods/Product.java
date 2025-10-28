public class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all instances)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment count whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("🛍️ Product Details:");
        System.out.println("Name: " + productName);
        System.out.printf("Price: ₹%.2f\n", price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("📦 Total Products Created: " + totalProducts);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Product p1 = new Product("Bluetooth Speaker", 2499.00);
        Product p2 = new Product("Smart Watch", 4999.00);
        Product p3 = new Product("Power Bank", 1299.00);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();
        p3.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}