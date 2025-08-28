// File: LeapYear.java

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get year input
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Validate the year
        if (year < 1582) {
            System.out.println("The LeapYear check is only valid for year >= 1582 (Gregorian calendar).");
        } else {
            // ----------- PART 1: Using multiple if-else statements -----------
            System.out.println("\n[Using multiple if-else statements]");

            if (year % 4 != 0) {
                System.out.println(year + " is not a Leap Year.");
            } else if (year % 100 != 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

            // ----------- PART 2: Using a single if statement with logical operators -----------
            System.out.println("\n[Using one if statement with logical condition]");

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        scanner.close();
    }
}
