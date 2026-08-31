package strings.class_problems;

// Validates a few sample assignment uploads.
public class P3_FileExtensionDemo {

    public static void main(String[] args) {
        FileExtensionValidator validator = new FileExtensionValidator();
        String[] files = {"Assignment1.PDF", "notes.txt", "project.final.Zip", "README"};
        for (String file : files) {
            System.out.println(file + " -> " + validator.validateFileExtension(file));
        }
    }
}
