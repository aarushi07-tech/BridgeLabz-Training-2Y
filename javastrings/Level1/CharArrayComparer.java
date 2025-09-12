import java.util.Scanner;

public class CharArrayComparer {

    public static char[] getCharsManually(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] manualChars = getCharsManually(input);
        char[] builtInChars = input.toCharArray();
        boolean areEqual = compareCharArrays(manualChars, builtInChars);

        System.out.println("Characters using manual method:");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }
        System.out.println("\nCharacters using toCharArray():");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println("\nAre both arrays equal? " + areEqual);

        scanner.close();
    }
}