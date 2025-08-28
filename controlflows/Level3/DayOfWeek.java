// File: DayOfWeek.java

public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Adjust month and year for Jan and Feb
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;       // Year of the century
        int j = y / 100;       // Zero-based century

        // Zeller's Congruence formula
        int h = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        // Map to 0=Sunday, 1=Monday, ..., 6=Saturday
        int dayOfWeek = (h + 6) % 7;

        System.out.println(dayOfWeek);
    }
}

