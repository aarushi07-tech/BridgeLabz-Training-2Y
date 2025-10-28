public class Patient {
    // Static variable shared among all patients
    private static String hospitalName = "Lotus Care Hospital";
    private static int totalPatients = 0;

    // Final variable: patientID cannot be changed once assigned
    private final String patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to resolve ambiguity
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment total patient count
    }

    // Static method to get total number of patients
    public static void getTotalPatients() {
        System.out.println("🏥 Total Patients Admitted at " + hospitalName + ": " + totalPatients);
    }

    // Method to display patient details using instanceof
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("🩺 Patient Details:");
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("❌ Invalid patient object.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Patient p1 = new Patient("PT001", "Riya Sharma", 34, "Migraine");
        Patient p2 = new Patient("PT002", "Aman Verma", 45, "Diabetes");

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
        System.out.println();

        Patient.getTotalPatients();
    }
}
