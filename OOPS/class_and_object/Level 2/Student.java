public class Student {
    // Attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.printf("Marks: %.2f\n", marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method to test the class
    public static void main(String[] args) {
        Student student1 = new Student("Riya Sharma", 101, 87.5);
        Student student2 = new Student("Aman Verma", 102, 45.0);

        student1.displayDetails();
        System.out.println(); // For spacing
        student2.displayDetails();
    }
}