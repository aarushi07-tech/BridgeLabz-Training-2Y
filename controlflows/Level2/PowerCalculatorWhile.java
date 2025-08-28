// File: PowerCalculatorWhile.java

import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input
        System.out.print("Enter the base number (positive integer): ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = scanner.nextInt();

        // Validate inputs
        if (number <= 0 || power < 0) {
            System.out.println("Please enter a positive integer for base and a non-negative integer for power.");
        } else {
            int result = 1;
            int counter = 0;

            // Loop to calculate power
            while (counter != power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        scanner.close();
    }
}

