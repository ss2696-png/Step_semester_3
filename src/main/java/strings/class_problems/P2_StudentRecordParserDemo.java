package strings.class_problems;

// Parses valid and invalid sample CSV lines.
public class P2_StudentRecordParserDemo {

    public static void main(String[] args) {
        StudentRecordParser parser = new StudentRecordParser();
        parser.parseStudentRecord("Ananya Verma,RA2211003010123,CSE");
        parser.parseStudentRecord("Ananya Verma,CSE");
    }
}
