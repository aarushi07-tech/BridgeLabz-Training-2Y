package programmingelements.Level1;

import java.util.Scanner;

public class UniversityFee {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        
        double fee, discountPercent, discountAmount, finalFee;
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();
        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();
        discountAmount = (fee * discountPercent) / 100;
        finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }

}