// File: GreatestFactor.java

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Input must be greater than 1 to have factors other than itself.");
        } else {
            int greatestFactor = 1;

            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

        scanner.close();
    }
}

