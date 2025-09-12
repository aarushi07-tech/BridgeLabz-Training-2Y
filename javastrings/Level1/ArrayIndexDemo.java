import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] names) {
        System.out.println("Accessing out-of-bound index: " + names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing out-of-bound index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        System.out.print("Enter 3 names: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.next();
        }

        // generateException(names); // Uncomment to see the exception

        handleException(names);
        scanner.close();
    }
}