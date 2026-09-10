package arrays_methods.class_problems;

// Shortlists and ranks the sample placement batch from the practice sheet.
public class P5_PlacementShortlisterDemo {

    public static void main(String[] args) {
        Candidate[] batch = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        System.out.println(PlacementShortlister.shortlistAndRank(batch));

        System.out.println("isEligible(7.0): " + PlacementShortlister.isEligible(7.0));
        System.out.println("isEligible(6.6, 55): " + PlacementShortlister.isEligible(6.6, 55));

        try {
            new Candidate("Ghost", 11.0, 50);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
