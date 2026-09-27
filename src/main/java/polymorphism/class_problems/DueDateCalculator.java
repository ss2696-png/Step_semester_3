package polymorphism.class_problems;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Reads borrowed items and prints each title with its due date.
public class DueDateCalculator {
    public static final LocalDate CURRENT_DATE = LocalDate.of(2023, 10, 26);

    public static LibraryItem create(String type, String title) {
        switch (type) {
            case "BOOK": return new Book(title);
            case "DVD": return new Dvd(title);
            case "MAGAZINE": return new Magazine(title);
            default: throw new IllegalArgumentException("Unknown item type: " + type);
        }
    }

    public static List<LibraryItem> read(Scanner in) {
        int n = Integer.parseInt(in.nextLine().trim());
        List<LibraryItem> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> tokens = LineTokenizer.tokenize(in.nextLine().trim());
            items.add(create(tokens.get(0), tokens.get(1)));
        }
        return items;
    }

    public static String process(List<LibraryItem> items) {
        StringBuilder out = new StringBuilder();
        for (LibraryItem item : items) {
            out.append(item.getTitle()).append(": ").append(item.dueDate(CURRENT_DATE)).append('\n');
        }
        return out.toString().trim();
    }
}
