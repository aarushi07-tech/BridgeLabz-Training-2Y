import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        boolean logic1 = isPalindromeIterative(input);
        boolean logic2 = isPalindromeRecursive(input, 0, getLength(input) - 1);
        boolean logic3 = isPalindromeUsingArray(input);

        System.out.println("Palindrome check using Logic 1 (Iterative): " + logic1);
        System.out.println("Palindrome check using Logic 2 (Recursive): " + logic2);
        System.out.println("Palindrome check using Logic 3 (Array Comparison): " + logic3);
        scanner.close();
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = getLength(str) - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static char[] reverseString(String str) {
        int length = getLength(str);
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = str.charAt(length - 1 - i);
        }
        return reversed;
    }

    public static boolean isPalindromeUsingArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = reverseString(str);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }
}