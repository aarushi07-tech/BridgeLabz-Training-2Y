import java.util.Scanner;

public class TriangleRun {
    public static double calculateRounds(double side1, double side2, double side3, double targetDistanceMeters) {
        double perimeter = side1 + side2 + side3;
        return targetDistanceMeters / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();
        double targetDistance = 5000;
        double rounds = calculateRounds(side1, side2, side3, targetDistance);
        System.out.printf("To complete a 5 km run, the athlete must run %.2f rounds around the triangular park.\n", rounds);
        sc.close();
    }
}