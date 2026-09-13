package classes_objects.assigment_problems;

// Prints the sample library inventory stored in an array of BookInventory objects.
public class A1_BookInventoryDemo {

    public static void main(String[] args) {
        BookInventory[] shelf = {
            new BookInventory("Clean Code", "Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
            new BookInventory("Refactoring", "Martin Fowler", 0),
            new BookInventory("Design Patterns", "GoF", 2)
        };
        for (BookInventory book : shelf) {
            book.printEntry();
        }
    }
}
