package data_structures.class_problems;

// Prints the digit sum and reversed form of the sample number.
public class P5_DigitOperationsDemo {
    public static void main(String[] args) {
        int number = 4721;
        System.out.println("Sum of digits: " + DigitOperations.digitSum(number));
        System.out.println("Reverse: " + DigitOperations.reverse(number));
    }
}
