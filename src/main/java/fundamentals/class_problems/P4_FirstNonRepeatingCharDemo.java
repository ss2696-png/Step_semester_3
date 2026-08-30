package fundamentals.class_problems;

// Runs the unique letter hunt on the sample words.
public class P4_FirstNonRepeatingCharDemo {

    public static void main(String[] args) {
        FirstNonRepeatingChar finder = new FirstNonRepeatingChar();
        finder.printResult("swiss");
        finder.printResult("aabbcc");
        finder.printResult("level up");
    }
}
