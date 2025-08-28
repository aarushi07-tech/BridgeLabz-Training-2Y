// File: HarshadNumber.java

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;                  // To hold the sum of digits
        int originalNumber = number; // Preserve the original number

        // Step 2: Calculate sum of digits
        while (number != 0) {
            int digit = number % 10;   // Get last digit
            sum += digit;              // Add to sum
            number = number / 10;      // Remove last digit
        }

        // Step 3: Check if original number is divisible by sum of its digits
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        scanner.close();
    }
}

