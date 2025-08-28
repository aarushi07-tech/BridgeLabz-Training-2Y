// File: FactorialCalculator.java

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if number is positive
        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            long factorial = 1;  // Use long for large results
            int i = 1;

            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Output
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}

