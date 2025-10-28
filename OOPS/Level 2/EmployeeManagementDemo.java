// Interface: Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract Class: Employee
abstract class Employee implements Department {
    private String employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters and Setters
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + department);
        System.out.println("Final Salary: " + calculateSalary());
    }

    // Interface methods
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Subclass: FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// Subclass: PartTimeEmployee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}

// Main class to test polymorphism
public class EmployeeManagementDemo {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("FT101", "Suhani Sharma", 50000, 10000);
        Employee emp2 = new PartTimeEmployee("PT202", "Arjun Mehta", 20000, 40, 300);

        emp1.assignDepartment("Engineering");
        emp2.assignDepartment("Support");

        Employee[] employees = { emp1, emp2 };

        for (Employee emp : employees) {
            System.out.println("----- Employee Details -----");
            emp.displayDetails();
            System.out.println();
        }
    }
}