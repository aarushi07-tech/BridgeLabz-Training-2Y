import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findFirstNonRepeatingCharacter(input);
        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
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

    public static char findFirstNonRepeatingCharacter(String str) {
        int[] frequency = new int[256];
        int length = getLength(str);

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        return 0;
    }
}