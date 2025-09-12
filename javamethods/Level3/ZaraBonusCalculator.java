public class ZaraBonusCalculator {

    public static double[][] generateEmployeeData(int count) {
        double[][] data = new double[count][2];
        for (int i = 0; i < count; i++) {
            double salary = Math.random() * 90000 + 10000; // 5-digit salary
            int yearsOfService = (int)(Math.random() * 10) + 1; // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] result = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            int years = (int)employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    public static void displaySummary(double[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-12s %-10s %-12s %-12s%n", "Emp No", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int years = (int)employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-10d %-12.2f %-10d %-12.2f %-12.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total      %-12.2f %-10s %-12.2f %-12.2f%n",
                totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, bonusData);
    }
}