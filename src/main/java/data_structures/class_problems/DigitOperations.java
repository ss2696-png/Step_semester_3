package data_structures.class_problems;

// Digit utilities that sum and reverse the digits of a positive integer.
public class DigitOperations {

    public static int digitSum(int number) {
        requirePositive(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static long reverse(int number) {
        requirePositive(number);
        long reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    private static void requirePositive(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
    }
}
