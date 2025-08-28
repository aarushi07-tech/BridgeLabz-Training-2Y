// File: AbundantNumber.java

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0; // Step 2: Initialize sum of proper divisors

        // Step 3: Find divisors and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Step 4: Check if sum of divisors > number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        scanner.close();
    }
}

