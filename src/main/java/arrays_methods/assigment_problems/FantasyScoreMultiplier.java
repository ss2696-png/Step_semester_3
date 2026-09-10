package arrays_methods.assigment_problems;

// Applies captain and vice-captain point multipliers directly to a fantasy lineup's score array.
public class FantasyScoreMultiplier {

    private static final double CAPTAIN_MULTIPLIER = 2.0;
    private static final double VICE_CAPTAIN_MULTIPLIER = 1.5;

    public static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        if (playerScores == null) {
            throw new IllegalArgumentException("Player scores cannot be null");
        }
        if (captainIndex == viceCaptainIndex) {
            throw new IllegalArgumentException("Captain and vice-captain must be different players");
        }
        if (captainIndex < 0 || captainIndex >= playerScores.length
                || viceCaptainIndex < 0 || viceCaptainIndex >= playerScores.length) {
            throw new IllegalArgumentException("Captain or vice-captain index is out of range");
        }
        playerScores[captainIndex] *= CAPTAIN_MULTIPLIER;
        playerScores[viceCaptainIndex] *= VICE_CAPTAIN_MULTIPLIER;
    }
}
