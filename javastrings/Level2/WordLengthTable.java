import java.util.Scanner;

public class WordLengthTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] words = splitIntoWords(input);
        String[][] wordLengthTable = getWordLengthTable(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < wordLengthTable.length; i++) {
            String word = wordLengthTable[i][0];
            int length = Integer.parseInt(wordLengthTable[i][1]);
            System.out.println(word + "\t" + length);
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

    public static String[] splitIntoWords(String str) {
        int length = getLength(str);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            int end = (i < spaceCount) ? spaceIndexes[i] : length;
            String word = "";
            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }
}