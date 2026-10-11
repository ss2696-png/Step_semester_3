package data_structures.class_problems;

// Prints even and odd counts for the sample list.
public class P3_EvenOddDemo {
    public static void main(String[] args) {
        int[] result = EvenOddCounter.count(new int[] {3, 8, 12, 5, 7, 10});
        System.out.println("Even: " + result[0] + " Odd: " + result[1]);
    }
}
