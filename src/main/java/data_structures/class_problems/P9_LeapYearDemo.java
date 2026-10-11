package data_structures.class_problems;

// Reports whether each sample year is a leap year.
public class P9_LeapYearDemo {
    public static void main(String[] args) {
        int[] years = {2024, 1900, 2000};
        for (int year : years) {
            System.out.println(LeapYearDetector.isLeapYear(year) ? "Leap year" : "Not a leap year");
        }
    }
}
