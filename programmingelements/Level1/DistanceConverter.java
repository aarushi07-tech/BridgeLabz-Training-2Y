import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double feet = scanner.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance is " + yards + " yards and " + miles + " miles.");

        scanner.close();
    }
}