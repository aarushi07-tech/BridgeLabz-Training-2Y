package programmingelements.Level1;
import java.util.Scanner;


public class KilometerToMiles {
     public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        double km;
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt(); 
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }


    
}
