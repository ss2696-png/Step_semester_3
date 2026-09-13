package classes_objects.assigment_problems;

// One library book inventory entry replacing parallel title, author and copies arrays.
public class BookInventory {

    private final String title;
    private final String author;
    private final int copiesAvailable;

    public BookInventory(String title, String author, int copiesAvailable) {
        if (title == null || title.isBlank() || author == null || author.isBlank()) {
            throw new IllegalArgumentException("Title and author are required");
        }
        if (copiesAvailable < 0) {
            throw new IllegalArgumentException("Copies available cannot be negative");
        }
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public void printEntry() {
        System.out.println(title + " by " + author + " - " + copiesAvailable + " copies available");
    }
}
