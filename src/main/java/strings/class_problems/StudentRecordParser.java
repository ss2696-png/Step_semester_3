package strings.class_problems;

// Parses a student registration CSV line into a formatted record.
public class StudentRecordParser {

    private static final int EXPECTED_FIELDS = 3;

    public String formatRecord(String csvLine) {
        String[] fields = csvLine.split(",");
        if (fields.length != EXPECTED_FIELDS) {
            return "Invalid Record";
        }
        return "Name: " + fields[0].trim() + " | Roll No: " + fields[1].trim() + " | Dept: " + fields[2].trim();
    }

    public void parseStudentRecord(String csvLine) {
        System.out.println(formatRecord(csvLine));
    }
}
