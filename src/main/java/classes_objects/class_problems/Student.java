package classes_objects.class_problems;

// Student whose college name and head count are shared across all instances via static members.
public class Student {

    private static String collegeName = "SRM Institute of Science and Technology";
    private static int studentCount = 0;

    private final String name;
    private final double attendance;

    public Student(String name, double attendance) {
        if (attendance < 0 || attendance > 100) {
            throw new IllegalArgumentException("Attendance must be between 0 and 100");
        }
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }

    public String getName() {
        return name;
    }

    public double getAttendance() {
        return attendance;
    }
}
