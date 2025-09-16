import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        String[][] bmiReport = generateBMIReport(data);
        displayReport(bmiReport);
        scanner.close();
    }

    public static String[][] computeBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }

    public static String[][] generateBMIReport(double[][] data) {
        return computeBMIAndStatus(data);
    }

    public static void displayReport(String[][] report) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < report.length; i++) {
            System.out.println((i + 1) + "\t" + report[i][0] + "\t\t" + report[i][1] + "\t\t" + report[i][2] + "\t" + report[i][3]);
        }
    }
}