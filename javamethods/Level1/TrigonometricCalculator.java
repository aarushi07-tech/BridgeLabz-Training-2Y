import java.util.Scanner;

public class TrigonometricCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();
        double[] results = calculateTrigonometricFunctions(angleInDegrees);
        System.out.printf("Sine(%.2f°) = %.4f%n", angleInDegrees, results[0]);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angleInDegrees, results[1]);
        System.out.printf("Tangent(%.2f°) = %.4f%n", angleInDegrees, results[2]);
        scanner.close();
    }
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); 
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] { sine, cosine, tangent };
    }
}