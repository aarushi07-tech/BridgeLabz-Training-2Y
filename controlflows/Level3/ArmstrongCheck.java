// File: ArmstrongCheck.java

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize variables
        int originalNumber = number;  // Store original number
        int sum = 0;  // To store the sum of cubes of digits

        // Step 3: Use while loop to process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;          // Get the last digit
            sum += digit * digit * digit;             // Cube and add to sum
            originalNumber = originalNumber / 10;     // Remove last digit
        }

        // Step 4: Check if sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}
