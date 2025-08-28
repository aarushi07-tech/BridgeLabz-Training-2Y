// File: PowerCalculator.java

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input
        System.out.print("Enter the base number (positive integer): ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = scanner.nextInt();

        // Validate inputs
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers for base and non-negative integer for power.");
        } else {
            int result = 1;

            // Calculate power using for loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        scanner.close();
    }
}


