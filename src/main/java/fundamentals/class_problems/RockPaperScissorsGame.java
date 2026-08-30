package fundamentals.class_problems;

import java.util.Random;

// Plays Rock-Paper-Scissors rounds against the computer and keeps a scoreboard.
public class RockPaperScissorsGame {

    private static final String[] MOVES = {"Rock", "Paper", "Scissors"};
    private final Random random = new Random();

    private int wins;
    private int losses;
    private int draws;

    public String randomMove() {
        return MOVES[random.nextInt(MOVES.length)];
    }

    public String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            draws++;
            return "Draw";
        }
        boolean playerWins = (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors"))
                || (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock"))
                || (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"));
        if (playerWins) {
            wins++;
            return "Player Wins";
        }
        losses++;
        return "Computer Wins";
    }

    public void playMatch(String[] playerMoves, String[] computerMoves) {
        System.out.printf("%-6s | %-12s | %-14s | %s%n", "Round", "Player Move", "Computer Move", "Result");
        for (int i = 0; i < playerMoves.length; i++) {
            String computer = computerMoves != null ? computerMoves[i] : randomMove();
            String result = playRound(playerMoves[i], computer);
            System.out.printf("%-6d | %-12s | %-14s | %s%n", i + 1, playerMoves[i], computer, result);
        }
        printSummary();
    }

    public double getWinPercentage() {
        int total = wins + losses + draws;
        return total == 0 ? 0 : wins * 100.0 / total;
    }

    public void printSummary() {
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, getWinPercentage());
    }
}
