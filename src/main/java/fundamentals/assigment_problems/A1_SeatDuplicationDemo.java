package fundamentals.assigment_problems;

// Checks sample exam hall seat lists for duplicates.
public class A1_SeatDuplicationDemo {

    public static void main(String[] args) {
        SeatDuplicationChecker checker = new SeatDuplicationChecker();
        checker.checkDuplicateSeats(new int[]{101, 102, 103, 102, 105});
        checker.checkDuplicateSeats(new int[]{101, 102, 103, 104, 105});
        checker.checkDuplicateSeats(new int[]{110, 111, 110, 112, 111, 110});
    }
}
