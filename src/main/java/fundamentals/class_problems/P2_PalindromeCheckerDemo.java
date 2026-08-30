package fundamentals.class_problems;

// Verifies that all three palindrome approaches agree on sample inputs.
public class P2_PalindromeCheckerDemo {

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String[] inputs = {"madam", "hello", "racecar", "a"};
        for (String input : inputs) {
            checker.printReport(input);
        }
    }
}
