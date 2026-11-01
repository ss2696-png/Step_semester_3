package data_structures.class_problems;

public class P3_TransactionCheckerDemo {
    public static void main(String[] args) {
        String[] batchOne = {"TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004"};
        String[] batchTwo = {"TXN2001", "TXN2002", "TXN2003"};
        System.out.println(TransactionChecker.hasDuplicate(batchOne));
        System.out.println(TransactionChecker.hasDuplicate(batchTwo));
        System.out.println("HashSet: O(n) time, O(n) space");
        System.out.println("Sort alternative: " + TransactionChecker.hasDuplicateBySorting(batchOne)
                + " - O(n log n) time, less extra memory");
    }
}
