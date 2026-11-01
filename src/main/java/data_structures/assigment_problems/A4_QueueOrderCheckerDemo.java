package data_structures.assigment_problems;

public class A4_QueueOrderCheckerDemo {
    public static void main(String[] args) {
        System.out.println(QueueOrderChecker.firstBreak(new int[]{3, 5, 5, 8, 6, 9}) + " (6 comes after 8)");
        System.out.println(QueueOrderChecker.firstBreak(new int[]{1, 2, 2, 7}));
        System.out.println(QueueOrderChecker.firstBreak(new int[]{}));
        System.out.println(QueueOrderChecker.firstBreak(new int[]{4}));
    }
}
