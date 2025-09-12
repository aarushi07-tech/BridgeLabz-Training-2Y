import java.util.Scanner;

public class NumberClassifier {

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        if (number <= 0) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        if (number <= 0) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        if (number < 0) return false;
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Perfect Number: " + (isPerfectNumber(number) ? "Yes" : "No"));
        System.out.println("Abundant Number: " + (isAbundantNumber(number) ? "Yes" : "No"));
        System.out.println("Deficient Number: " + (isDeficientNumber(number) ? "Yes" : "No"));
        System.out.println("Strong Number: " + (isStrongNumber(number) ? "Yes" : "No"));

        scanner.close();
    }
}