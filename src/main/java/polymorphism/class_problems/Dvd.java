package polymorphism.class_problems;

// DVD borrowed for 7 days.
public class Dvd extends LibraryItem {
    public Dvd(String title) {
        super(title);
    }

    @Override
    protected int borrowDays() {
        return 7;
    }
}
