package data_structures.assigment_problems;

import java.util.Arrays;

// Insertion sort for the library shelf that prints the shelf after each book is placed.
public class BookShelf {

    public static void shelf(int[] books) {
        for (int i = 1; i < books.length; i++) {
            int book = books[i];
            int j = i - 1;
            while (j >= 0 && books[j] > book) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = book;
            System.out.println("After placing " + book + ": " + Arrays.toString(books));
        }
    }
}
