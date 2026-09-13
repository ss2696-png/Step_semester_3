package classes_objects.class_problems;

// Single student placement entry replacing three out-of-sync parallel arrays.
public class PlacementRecord {

    private final String studentName;
    private final String company;
    private final double packageLpa;

    public PlacementRecord(String studentName, String company, double packageLpa) {
        if (studentName == null || studentName.isBlank() || company == null || company.isBlank()) {
            throw new IllegalArgumentException("Student name and company are required");
        }
        if (packageLpa < 0) {
            throw new IllegalArgumentException("Package cannot be negative");
        }
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    public void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}
