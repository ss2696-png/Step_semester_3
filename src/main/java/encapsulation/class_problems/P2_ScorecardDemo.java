package encapsulation.class_problems;

// Runs the quiz scorecard sample from the practice sheet.
public class P2_ScorecardDemo {
    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        System.out.println("getScore() -> " + sc.getScore());

        boolean extra = sc.recordAnswer(true);
        System.out.println("5th answer accepted? " + extra + ", score still " + sc.getScore()
                + " out of " + sc.getTotalQuestions());
    }
}
