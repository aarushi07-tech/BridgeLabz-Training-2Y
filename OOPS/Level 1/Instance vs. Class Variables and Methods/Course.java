public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in weeks
    private double fee;

    // Class variable (shared by all Course objects)
    private static String instituteName = "EduTech Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("📘 Course Details:");
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.printf("Fee: ₹%.2f\n", fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("✅ Institute name updated to: " + instituteName);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 4999.00);
        Course c2 = new Course("Data Structures", 6, 3999.00);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("SkillForge Institute");
        System.out.println();

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}