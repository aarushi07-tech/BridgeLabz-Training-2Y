import java.util.Scanner;
import java.util.Arrays;

public class DigitInspector {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseArray(digits);
        boolean isPalin = isPalindrome(digits);
        boolean isDuck = isDuckNumber(digits);

        System.out.println("Digit count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.print("Reversed Digits: ");
        for (int d : reversedDigits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Palindrome Number: " + (isPalin ? "Yes" : "No"));
        System.out.println("Duck Number: " + (isDuck ? "Yes" : "No"));

        scanner.close();
    }
}