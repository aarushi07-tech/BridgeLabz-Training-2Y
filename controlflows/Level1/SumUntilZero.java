// File: SumUntilZero.java

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        double number;

        // Prompt the user initially
        System.out.print("Enter a number (0 to stop): ");
        number = scanner.nextDouble();

        // Loop until user enters 0
        while (number != 0) {
            total += number;

            // Ask again inside the loop
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();
        }

        // Output the result
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}

