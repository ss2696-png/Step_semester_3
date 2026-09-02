package classes_objects.assigment_problems;

// Creates one book record and prints its fields.
public class A1_BookRecordDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Clean Code";
        book.price = 650.0;
        System.out.println("Title: " + book.title + " | Price: Rs " + book.price);
    }
}
