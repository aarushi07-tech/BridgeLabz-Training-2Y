import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }
        String[] results = new String[number];
        for (int i = 0; i < number; i++) {
            int value = i + 1; 
            if (value % 3 == 0 && value % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (value % 3 == 0) {
                results[i] = "Fizz";
            } else if (value % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(value);
            }
        }
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }
        scanner.close();
    }
}