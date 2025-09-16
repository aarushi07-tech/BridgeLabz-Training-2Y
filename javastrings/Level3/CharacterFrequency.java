import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencyTable = getCharacterFrequency(input);
        displayFrequency(frequencyTable);
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

    public static String[][] getCharacterFrequency(String str) {
        int[] freq = new int[256];
        int length = getLength(str);

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        boolean[] added = new boolean[256];
        String[][] result = new String[length][2];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (!added[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                added[ch] = true;
                index++;
            }
        }

        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void displayFrequency(String[][] table) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }
}