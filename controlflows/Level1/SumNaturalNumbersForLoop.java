// File: SumNaturalNumbersForLoop.java

import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if it's a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Output both sums
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

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

