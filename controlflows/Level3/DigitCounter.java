// File: DigitCounter.java

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;                    // Step 2: Initialize count
        int originalNumber = number;     // Save original for display

        // Step 3: Handle 0 separately (as it has 1 digit)
        if (number == 0) {
            count = 1;
        } else {
            // Step 4: Use loop to count digits
            while (number != 0) {
                number = number / 10;    // Remove last digit
                count++;                 // Increment count
            }
        }

        // Step 5: Display the result
        System.out.println("The number of digits in " + originalNumber + " is: " + count);

        scanner.close();
    }
}

