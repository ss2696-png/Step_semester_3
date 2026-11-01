package data_structures.class_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Detects duplicate transaction IDs with a HashSet, plus a slower sort-based alternative.
public class TransactionChecker {

    public static boolean hasDuplicate(String[] transactionIds) {
        if (transactionIds == null) {
            return false;
        }
        Set<String> seen = new HashSet<>();
        for (String id : transactionIds) {
            if (id != null && !seen.add(id)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDuplicateBySorting(String[] transactionIds) {
        if (transactionIds == null) {
            return false;
        }
        String[] copy = Arrays.copyOf(transactionIds, transactionIds.length);
        Arrays.sort(copy);
        for (int i = 1; i < copy.length; i++) {
            if (copy[i].equals(copy[i - 1])) {
                return true;
            }
        }
        return false;
    }
}
