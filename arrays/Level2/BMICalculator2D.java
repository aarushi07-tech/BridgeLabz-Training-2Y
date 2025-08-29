import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            do {
                System.out.print("Enter height in meters (positive value): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive number. Please try again.");
                }
            } while (personData[i][0] <= 0);
            do {
                System.out.print("Enter weight in kilograms (positive value): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive number. Please try again.");
                }
            } while (personData[i][1] <= 0);
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.printf("Height: %.2f m\n", personData[i][0]);
            System.out.printf("Weight: %.2f kg\n", personData[i][1]);
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }
        scanner.close();
    }
}