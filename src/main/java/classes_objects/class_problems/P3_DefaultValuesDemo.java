package classes_objects.class_problems;

// Prints a fresh LibraryCard's fields to reveal their default values.
public class P3_DefaultValuesDemo {
    public static void main(String[] args) {
        LibraryCard card = new LibraryCard();
        System.out.println("Holder: " + card.holderName);
        System.out.println("Books Issued: " + card.booksIssued);
        System.out.println("Active: " + card.active);
    }
}
