package arrays_methods.assigment_problems;

import java.util.Arrays;

// Picks draftable players with overloaded experience and fitness rules, then ranks them with Arrays.sort.
public class AutoDraftEngine {

    private static final int ESTABLISHED_MATCHES = 10;
    private static final int NEWCOMER_MATCHES = 5;

    public static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= ESTABLISHED_MATCHES;
    }

    public static boolean isDraftable(int matchesPlayed, boolean injured) {
        return isDraftable(matchesPlayed) || (matchesPlayed >= NEWCOMER_MATCHES && !injured);
    }

    public static String draftAndRank(Player[] players) {
        if (players == null) {
            return "No players drafted";
        }
        Player[] draftable = new Player[players.length];
        int count = 0;
        for (Player player : players) {
            if (player != null && isDraftable(player.getMatchesPlayed(), player.isInjured())) {
                draftable[count++] = player;
            }
        }
        if (count == 0) {
            return "No players drafted";
        }
        draftable = Arrays.copyOf(draftable, count);
        Arrays.sort(draftable);

        StringBuilder ranking = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            if (i > 0) {
                ranking.append(" | ");
            }
            ranking.append(i + 1).append(". ").append(draftable[i].getName());
        }
        return ranking.toString();
    }
}
