// File: GreatestFactorWhile.java

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Input must be greater than 1 to have factors other than itself.");
        } else {
            int greatestFactor = 1;
            int counter = number - 1;

            // Loop while counter >= 1
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;  // exit loop once greatest factor is found
                }
                counter--;
            }

            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

        scanner.close();
    }
}
