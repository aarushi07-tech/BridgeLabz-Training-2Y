package programmingelements.Level1;

import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double baseCm, heightCm;
        System.out.print("Enter the base of the triangle in centimeters: ");
        baseCm = input.nextDouble();

        System.out.print("Enter the height of the triangle in centimeters: ");
        heightCm = input.nextDouble();


        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaInches2 = areaCm2 / 6.4516;

    
        double totalInches = heightCm / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;


        System.out.println("Your Height in cm is " + heightCm + 
            " while in feet is " + feet + " and inches is " + String.format("%.2f", inches));
        System.out.println("Area of the triangle is " + String.format("%.2f", areaCm2) + 
            " square cm and " + String.format("%.2f", areaInches2) + " square inches");

        
        input.close();
    }
}
