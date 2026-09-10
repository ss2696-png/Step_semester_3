package arrays_methods.assigment_problems;

// Detects a player tapped twice into a fantasy lineup using pairwise nested-loop comparison.
public class DuplicatePickChecker {

    public static String findDuplicatePick(String[] playerNames) {
        if (playerNames == null) {
            return "No Duplicates Found";
        }
        for (int i = 0; i < playerNames.length; i++) {
            if (playerNames[i] == null) {
                continue;
            }
            for (int j = i + 1; j < playerNames.length; j++) {
                if (playerNames[i].equals(playerNames[j])) {
                    return "Duplicate Found: " + playerNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }
}
