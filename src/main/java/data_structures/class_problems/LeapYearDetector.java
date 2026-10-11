package data_structures.class_problems;

// Applies the Gregorian leap year rules for 4, 100 and 400.
public class LeapYearDetector {

    public static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be positive");
        }
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
