// File: EmployeeBonusCalculator.java

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Input years of service
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check eligibility and calculate bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus. Years of service is less than or equal to 5.");
        }

        scanner.close();
    }
}

