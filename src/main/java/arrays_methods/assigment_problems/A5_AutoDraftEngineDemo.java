package arrays_methods.assigment_problems;

// Runs the auto-draft on the sample player pool from the assignment sheet.
public class A5_AutoDraftEngineDemo {

    public static void main(String[] args) {
        Player[] pool = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };
        System.out.println(AutoDraftEngine.draftAndRank(pool));

        System.out.println("isDraftable(10): " + AutoDraftEngine.isDraftable(10));
        System.out.println("isDraftable(6, true): " + AutoDraftEngine.isDraftable(6, true));
    }
}
