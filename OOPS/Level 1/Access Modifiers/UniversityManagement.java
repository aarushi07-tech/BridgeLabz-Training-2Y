// Base class: Student
class Student {
    public int rollNumber;           // Public: accessible everywhere
    protected String name;           // Protected: accessible in subclass
    private double CGPA;             // Private: accessible only within Student

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("🎓 Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.printf("CGPA: %.2f\n", CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA); // Call superclass constructor
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("🎓 Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);              // protected
        System.out.println("Specialization: " + specialization);
        System.out.printf("CGPA: %.2f\n", getCGPA());     // private accessed via public method
    }
}

// Main class to test the system
public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Riya Sharma", 8.7);
        s1.displayStudentDetails();
        System.out.println();

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Aman Verma", 9.2, "Data Science");
        pg1.displayPostgraduateDetails();
        System.out.println();

        // Modify CGPA
        pg1.setCGPA(9.5);
        pg1.displayPostgraduateDetails();
    }
}