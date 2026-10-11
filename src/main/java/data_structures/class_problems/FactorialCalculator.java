package data_structures.class_problems;

// Computes n! iteratively, with 0! defined as 1.
public class FactorialCalculator {
    private static final int MAX_LONG_INPUT = 20;

    public static long factorial(int n) {
        if (n < 0 || n > MAX_LONG_INPUT) {
            throw new IllegalArgumentException("n must be between 0 and " + MAX_LONG_INPUT);
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
