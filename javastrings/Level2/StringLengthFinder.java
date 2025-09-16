import java.util.Scanner;

public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        int customLength = getLengthWithoutUsingLength(input);
        int builtInLength = input.length();

        System.out.println("Length without using length(): " + customLength);
        System.out.println("Length using length(): " + builtInLength);
    }

    public static int getLengthWithoutUsingLength(String str) {
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
   
}