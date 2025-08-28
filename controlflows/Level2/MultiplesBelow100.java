// File: MultiplesBelow100.java

import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Number must be positive and less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Loop backward from 100 down to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
