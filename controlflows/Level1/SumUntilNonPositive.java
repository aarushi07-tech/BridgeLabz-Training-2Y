// File: SumUntilNonPositive.java

import java.util.Scanner;

public class SumUntilNonPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            // Input from the user
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();

            // Break the loop if number is 0 or negative
            if (number <= 0) {
                break;
            }

            // Add to total
            total += number;
        }

        // Output the result
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}

