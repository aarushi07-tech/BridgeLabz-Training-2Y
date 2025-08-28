// File: SumNaturalNumbersComparison.java

import java.util.Scanner;

public class SumNaturalNumbersComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if n is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Output
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct and match.");
                } else {
                System.out.println("Mismatch in computations!");
            }
        }

        scanner.close();
    }
}

