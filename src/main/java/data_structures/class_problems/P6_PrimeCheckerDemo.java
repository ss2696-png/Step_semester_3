package data_structures.class_problems;

// Reports whether each sample number is prime.
public class P6_PrimeCheckerDemo {
    public static void main(String[] args) {
        int[] numbers = {29, 21};
        for (int number : numbers) {
            System.out.println(number + (PrimeChecker.isPrime(number) ? " is prime" : " is not prime"));
        }
    }
}
