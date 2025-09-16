import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] eligibilityTable = checkVotingEligibility(ages);
        displayTable(eligibilityTable);
        scanner.close();
    }

    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90); // generates 0 to 89
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            table[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                table[i][1] = "false";
            } else if (ages[i] >= 18) {
                table[i][1] = "true";
            } else {
                table[i][1] = "false";
            }
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }
}