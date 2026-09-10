package arrays_methods.assigment_problems;

// Fantasy league player ranked by batting average for the auto-draft.
public class Player implements Comparable<Player> {

    private final String name;
    private final int matchesPlayed;
    private final double battingAverage;
    private final boolean injured;

    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Player name cannot be blank");
        }
        if (matchesPlayed < 0) {
            throw new IllegalArgumentException("Matches played cannot be negative");
        }
        if (battingAverage < 0) {
            throw new IllegalArgumentException("Batting average cannot be negative");
        }
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    public String getName() {
        return name;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public boolean isInjured() {
        return injured;
    }

    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, battingAverage);
    }
}
