package fundamentals.class_problems;

// Runs a fixed five-round demo match and one random match.
public class P1_RockPaperScissorsDemo {

    public static void main(String[] args) {
        String[] player = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        String[] computer = {"Scissors", "Paper", "Rock", "Paper", "Rock"};

        System.out.println("Demo match with fixed moves:");
        new RockPaperScissorsGame().playMatch(player, computer);

        System.out.println();
        System.out.println("Match against a random computer:");
        new RockPaperScissorsGame().playMatch(player, null);
    }
}
