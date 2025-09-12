import java.util.Scanner;

public class NumberAnalyzer {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 == number2) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("Number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is positive and odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than last number.");
        } else if (result == 0) {
            System.out.println("First and last numbers are equal.");
        } else {
            System.out.println("First number is less than last number.");
        }

        scanner.close();
    }
}