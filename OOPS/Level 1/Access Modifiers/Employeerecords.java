// Base class: Employee
class Employee {
    public int employeeID;           // Public: accessible anywhere
    protected String department;     // Protected: accessible in subclass
    private double salary;           // Private: accessible only within Employee

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        } else {
            System.out.println("❌ Invalid salary amount.");
        }
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("👔 Employee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.printf("Salary: ₹%.2f\n", salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("🧑‍💼 Manager Details:");
        System.out.println("Employee ID: " + employeeID);   // public
        System.out.println("Department: " + department);    // protected
        System.out.println("Team Name: " + teamName);
        System.out.printf("Salary: ₹%.2f\n", getSalary());  // private accessed via public method
    }
}

// Main class to test the system
public class Employeerecords {
    public static void main(String[] args) {
        Employee emp = new Employee(1001, "Finance", 55000.00);
        emp.displayEmployeeDetails();
        System.out.println();

        Manager mgr = new Manager(2001, "IT", 85000.00, "TechOps");
        mgr.displayManagerDetails();
        System.out.println();

        // Modify salary
        mgr.setSalary(90000.00);
        mgr.displayManagerDetails();
    }
}