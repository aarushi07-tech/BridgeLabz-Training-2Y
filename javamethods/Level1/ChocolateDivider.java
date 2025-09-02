import java.util.Scanner;

public class ChocolateDivider {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among zero children.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("Each child gets: " + result[1] + " chocolates");
            System.out.println("Remaining chocolates: " + result[0]);
        }
        scanner.close();
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[] { remainder, quotient };
    }
}
