public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared by all Vehicle objects)
    private static double registrationFee = 5000.00; // Default fee

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("🚘 Vehicle Registration Details:");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.printf("Registration Fee: ₹%.2f\n", registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.printf("✅ Registration fee updated to ₹%.2f\n", registrationFee);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Amit Sharma", "Car");
        Vehicle v2 = new Vehicle("Neha Verma", "Motorcycle");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(6000.00); // Update fee for all vehicles
        System.out.println();

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}