package programmingelements.Level1;

public class Pendistribution {
    public static void main(String[] args) {
        // Total pens and students
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        // Display result using a single print statement
        System.out.println(
            "The Pen Per Student is " + pensPerStudent +
            " and the remaining pen not distributed is " + remainingPens
        );
    }

    
}
