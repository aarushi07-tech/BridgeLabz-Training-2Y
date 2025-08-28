// File: PrimeCheck.java

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number to check if it is a prime: ");
        int number = scanner.nextInt();

        boolean isPrime = true;  // Assume prime by default

        // Prime numbers must be greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        scanner.close();
    }
}

