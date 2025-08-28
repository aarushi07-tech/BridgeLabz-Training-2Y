// File: StudentGrade.java

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks in Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = scanner.nextDouble();

        // Validate marks are between 0 and 100
        if (isValid(physics) && isValid(chemistry) && isValid(maths)) {
            // Calculate average/percentage
            double average = (physics + chemistry + maths) / 3.0;

            // Determine grade and remarks
            String grade;
            String remarks;

            if (average >= 90) {
                grade = "A+";
                remarks = "Outstanding performance!";
            } else if (average >= 80) {
                grade = "A";
                remarks = "Excellent work.";
            } else if (average >= 70) {
                grade = "B";
                remarks = "Good effort.";
            } else if (average >= 60) {
                grade = "C";
                remarks = "Satisfactory.";
            } else if (average >= 50) {
                grade = "D";
                remarks = "Needs Improvement.";
            } else {
                grade = "F";
                remarks = "Fail. Better luck next time.";
            }

            // Output
            System.out.println("\n--- Result ---");
            System.out.printf("Average Marks: %.2f%%\n", average);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);

        } else {
            System.out.println("Please enter valid marks (0 to 100) for all subjects.");
        }

        scanner.close();
    }

    // Helper method to validate marks
    public static boolean isValid(double marks) {
        return marks >= 0 && marks <= 100;
    }
}