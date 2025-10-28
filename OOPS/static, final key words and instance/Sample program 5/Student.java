public class Student {
    // Static variable shared across all students
    private static String universityName = "Global Institute of Technology";
    private static int totalStudents = 0;

    // Final variable: rollNumber cannot be changed once assigned
    private final int rollNumber;

    // Instance variables
    private String name;
    private char grade;

    // Constructor using 'this' to resolve ambiguity
    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++; // Increment total student count
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("🏫 Total Students Enrolled at " + universityName + ": " + totalStudents);
    }

    // Method to update grade with instanceof check
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("✅ Grade updated for " + name + " to " + grade);
        } else {
            System.out.println("❌ Invalid student object.");
        }
    }

    // Method to display student details with instanceof check
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("🎓 Student Details:");
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("❌ Invalid student object.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aarav Singh", 'A');
        Student s2 = new Student(102, "Meera Patel", 'B');

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();

        s2.updateGrade('A');
        System.out.println();

        Student.displayTotalStudents();
    }
}
