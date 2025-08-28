// File: FactorsFinderWhile.java

import java.util.Scanner;

public class FactorsFinderWhile {
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
            int counter = 1;

            // Run while loop till counter <= number
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }

        scanner.close();
    }
}
