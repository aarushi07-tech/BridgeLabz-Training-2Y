// File: EmployeeBonus.java

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        // Take years of service input
        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();

        // Calculate bonus if years of service > 5
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus. Years of service must be more than 5 to get a bonus.");
        }

        scanner.close();
    }
}
