// File: FizzBuzzWhile.java

import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if positive integer
        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            int i = 1;
            // Loop from 1 to number using while loop
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }

        scanner.close();
    }
}

