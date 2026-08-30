package fundamentals.assigment_problems;

// Flags seat numbers that were assigned to more than one student.
public class SeatDuplicationChecker {

    public void checkDuplicateSeats(int[] seatNumbers) {
        int[] duplicates = new int[seatNumbers.length];
        int count = 0;
        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j] && !contains(duplicates, count, seatNumbers[i])) {
                    duplicates[count++] = seatNumbers[i];
                }
            }
        }
        if (count == 0) {
            System.out.println("No Duplicate Seats Found");
            return;
        }
        StringBuilder found = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i > 0) {
                found.append(", ");
            }
            found.append(duplicates[i]);
        }
        System.out.println("Duplicate Seat Number Found: " + found);
    }

    private boolean contains(int[] values, int size, int target) {
        for (int i = 0; i < size; i++) {
            if (values[i] == target) {
                return true;
            }
        }
        return false;
    }
}
