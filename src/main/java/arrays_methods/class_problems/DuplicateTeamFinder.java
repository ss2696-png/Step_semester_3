package arrays_methods.class_problems;

// Finds the first team name registered twice using plain nested loops.
public class DuplicateTeamFinder {

    public static String findDuplicateTeam(String[] teamNames) {
        if (teamNames == null) {
            return "No Duplicates Found";
        }
        for (int i = 0; i < teamNames.length; i++) {
            if (teamNames[i] == null) {
                continue;
            }
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }
}
