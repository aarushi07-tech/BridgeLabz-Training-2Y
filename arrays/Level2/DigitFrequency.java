import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int[] frequency = new int[10];
        long temp = Math.abs(number); 
        while (temp > 0) {
            int digit = (int)(temp % 10);
            frequency[digit]++;
            temp /= 10;
        }
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
        sc.close();
    }
}