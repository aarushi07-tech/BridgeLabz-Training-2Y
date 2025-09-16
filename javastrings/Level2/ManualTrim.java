import java.util.Scanner;

public class ManualTrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        int[] bounds = findTrimBounds(input);
        String trimmedManual = manualSubstring(input, bounds[0], bounds[1]);
        String trimmedBuiltIn = input.trim();

        boolean isEqual = compareStrings(trimmedManual, trimmedBuiltIn);

        System.out.println("Manual Trim Result: '" + trimmedManual + "'");
        System.out.println("Built-in Trim Result: '" + trimmedBuiltIn + "'");
        System.out.println("Are both results equal? " + isEqual);
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

    public static int[] findTrimBounds(String str) {
        int length = getLength(str);
        int start = 0;
        int end = length - 1;

        while (start < length && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        int len1 = getLength(str1);
        int len2 = getLength(str2);

        if (len1 != len2) {
            return false;
        }

        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}