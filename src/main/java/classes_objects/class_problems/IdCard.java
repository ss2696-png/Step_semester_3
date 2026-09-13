package classes_objects.class_problems;

// Library ID card used to show the difference between shared references and separate objects.
public class IdCard {

    String name;
    int booksIssued;

    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}
