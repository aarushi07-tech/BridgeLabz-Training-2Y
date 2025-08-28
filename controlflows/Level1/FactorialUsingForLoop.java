// File: FactorialUsingForLoop.java

import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check for natural number (positive integer)
        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            long factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Output
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}

