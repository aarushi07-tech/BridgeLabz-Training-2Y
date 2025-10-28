public class Item {
    // Attributes
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price: ₹%.2f\n", price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Item item = new Item("A101", "Wireless Mouse", 799.00);
        item.displayItemDetails();

        int quantity = 3; // You can change this value
        double totalCost = item.calculateTotalCost(quantity);
        System.out.printf("Total Cost for %d units: ₹%.2f\n", quantity, totalCost);
    }
}
