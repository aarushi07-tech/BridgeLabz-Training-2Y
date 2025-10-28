public class Employee {
    // Static variable shared by all employees
    private static String companyName = "TechNova Solutions";
    private static int totalEmployees = 0;

    // Final variable: cannot be changed once assigned
    private final int id;

    // Instance variables
    private String name;
    private String designation;

    // Constructor using 'this' to resolve ambiguity
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++; // Increment total employee count
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("🏢 Total Employees at " + companyName + ": " + totalEmployees);
    }

    // Method to display employee details using instanceof
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("👔 Employee Details:");
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("❌ Invalid employee object.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Aarav Mehta", "Software Engineer");
        Employee emp2 = new Employee(102, "Neha Kapoor", "Project Manager");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        System.out.println();

        Employee.displayTotalEmployees();
    }
}