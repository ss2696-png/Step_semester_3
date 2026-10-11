package data_structures.class_problems;

// Prints factorials for the sample inputs.
public class P7_FactorialDemo {
    public static void main(String[] args) {
        int[] inputs = {5, 0};
        for (int n : inputs) {
            System.out.println(FactorialCalculator.factorial(n));
        }
    }
}
