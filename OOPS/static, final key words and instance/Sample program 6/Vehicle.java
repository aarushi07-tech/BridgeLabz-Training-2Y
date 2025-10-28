public class Vehicle {
    // Static variable shared across all vehicles
    private static double registrationFee = 5000.00;

    // Final variable: registrationNumber cannot be changed once assigned
    private final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to resolve ambiguity
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
            System.out.printf("✅ Registration fee updated to ₹%.2f\n", registrationFee);
        } else {
            System.out.println("❌ Invalid fee. Must be non-negative.");
        }
    }

    // Method to display vehicle details using instanceof
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("🚗 Vehicle Registration Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.printf("Registration Fee: ₹%.2f\n", registrationFee);
        } else {
            System.out.println("❌ Object is not a valid Vehicle.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP32AB1234", "Rohit Sharma", "Car");
        Vehicle v2 = new Vehicle("DL10XY5678", "Anjali Mehta", "Scooter");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(6000.00);
        System.out.println();

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}