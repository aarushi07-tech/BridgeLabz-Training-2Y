// File: BMICalculator.java

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get weight and height from the user
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in cm): ");
        double heightCm = scanner.nextDouble();

        // Step 2: Convert height from cm to meters
        double heightM = heightCm / 100.0;

        // Step 3: Calculate BMI using the formula
        double bmi = weight / (heightM * heightM);

        // Step 4: Determine the weight status
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Step 5: Display the result
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        scanner.close();
    }
}
