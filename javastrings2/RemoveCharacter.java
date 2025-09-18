import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.nextLine().charAt(0);

        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != toRemove) {
                result.append(c);
            }
        }

        System.out.println("Modified String: \"" + result.toString() + "\"");
        scanner.close();
    }
}