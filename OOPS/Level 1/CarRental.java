public class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 1500.00; // Fixed rate per day

    // Default constructor
    public CarRental() {
        this("Unknown Customer", "Standard Model", 1); // Constructor chaining
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return DAILY_RATE * rentalDays;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("🚗 Car Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.printf("Total Cost: ₹%.2f\n", calculateTotalCost());
    }

    // Main method to test the class
    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Ravi Kumar", "Hyundai Creta", 5);

        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        System.out.println("\nCustom Rental:");
        customRental.displayRentalDetails();
    }
}