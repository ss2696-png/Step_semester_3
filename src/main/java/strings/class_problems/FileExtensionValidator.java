package strings.class_problems;

// Accepts uploads only when the file has an allowed extension.
public class FileExtensionValidator {

    private static final String[] ACCEPTED_EXTENSIONS = {"pdf", "docx", "zip"};

    public String validateFileExtension(String filename) {
        int dot = filename.lastIndexOf('.');
        if (dot <= 0 || dot == filename.length() - 1) {
            return "Rejected — invalid file type";
        }
        String extension = filename.substring(dot + 1);
        for (String accepted : ACCEPTED_EXTENSIONS) {
            if (accepted.equalsIgnoreCase(extension)) {
                return "Accepted";
            }
        }
        return "Rejected — invalid file type";
    }
}
