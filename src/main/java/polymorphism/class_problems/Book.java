package polymorphism.class_problems;

// Book borrowed for 14 days.
public class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }

    @Override
    protected int borrowDays() {
        return 14;
    }
}
