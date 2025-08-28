// File: LeapYearSimple.java

import java.util.Scanner;

public class LeapYearSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get year input
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Validate year range (Gregorian calendar)
        if (year >= 1582) {
            // Single if condition using logical AND (&&) and OR (||)
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        }

        scanner.close();
    }
}
