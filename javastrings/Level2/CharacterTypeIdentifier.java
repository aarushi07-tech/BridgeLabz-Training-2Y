
import java.util.Scanner;

public class CharacterTypeIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = analyzeCharacters(input);
        displayTable(result);
        scanner.close();
    }

    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
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

    public static String[][] analyzeCharacters(String str) {
        int length = getLength(str);
        String[][] table = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            table[i][0] = String.valueOf(ch);
            table[i][1] = checkCharacterType(ch);
        }

        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }
}