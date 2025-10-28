import java.util.ArrayList;
import java.util.Iterator;

class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.printf("%s - ₹%.2f x %d = ₹%.2f\n", itemName, price, quantity, getTotalCost());
    }
}

public class ShoppingCart {
    private ArrayList<CartItem> cart;

    // Constructor
    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cart.add(item);
        System.out.println(itemName + " added to cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        Iterator<CartItem> iterator = cart.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println(itemName + " removed from cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart.");
        }
    }

    // Method to display total cost
    public void displayTotalCost() {
        double total = 0;
        System.out.println("\n🛒 Cart Summary:");
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getTotalCost();
        }
        System.out.printf("Total Cost: ₹%.2f\n", total);
    }

    // Main method to test the class
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

        myCart.addItem("Laptop", 55000.00, 1);
        myCart.addItem("Mouse", 799.00, 2);
        myCart.addItem("Notebook", 45.00, 5);

        myCart.displayTotalCost();
        System.out.println();

        myCart.removeItem("Mouse");
        System.out.println();

        myCart.displayTotalCost();
    }
}