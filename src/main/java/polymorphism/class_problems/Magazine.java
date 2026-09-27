package polymorphism.class_problems;

// Magazine borrowed for 3 days.
public class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }

    @Override
    protected int borrowDays() {
        return 3;
    }
}
