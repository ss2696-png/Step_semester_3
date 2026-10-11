package data_structures.class_problems;

// Counts how many numbers in a list are even and how many are odd.
public class EvenOddCounter {

    public static int[] count(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Numbers must not be null");
        }
        int even = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            }
        }
        return new int[] {even, numbers.length - even};
    }
}
