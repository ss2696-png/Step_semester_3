package data_structures.class_problems;

public class P1_LibraryCatalogDemo {
    public static void main(String[] args) {
        String[][] books = {
            {"0001112223", "Introduction to Algebra"},
            {"0002223334", "Beginning Python"},
            {"0003334445", "Classic Mythology"},
            {"0004445556", "Data and Society"},
            {"0005556667", "European History"}
        };
        LibraryCatalog catalog = new LibraryCatalog(books);
        System.out.println(catalog.findBook("0003334445"));
        System.out.println(catalog.findBook("0009998887"));
        System.out.println("Time: O(log n), Space: O(1) - the catalog is read far more than it changes, so keeping it sorted pays off.");
    }
}
