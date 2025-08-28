// File: FactorsFinder.java

import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if positive integer
        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            // Loop from 1 to number (inclusive)
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}

