package data_structures.class_problems;

// Sorted ISBN catalog searched with binary search in O(log n) time and O(1) space.
public class LibraryCatalog {

    private final String[][] catalog;

    public LibraryCatalog(String[][] catalog) {
        if (catalog == null) {
            throw new IllegalArgumentException("Catalog cannot be null");
        }
        this.catalog = catalog;
    }

    public String findBook(String targetIsbn) {
        if (targetIsbn == null) {
            return "Not Found";
        }
        int low = 0;
        int high = catalog.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = catalog[mid][0].compareTo(targetIsbn);
            if (cmp == 0) {
                return catalog[mid][1];
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return "Not Found";
    }
}
