package data_structures.class_problems;

// Checks primality by trial division up to the square root.
public class PrimeChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            throw new IllegalArgumentException("Number must be greater than 1");
        }
        for (int divisor = 2; (long) divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
