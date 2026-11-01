package data_structures.assigment_problems;

// Counting sort for dice rolls from 1 to 6 that never compares two throws directly.
public class DiceTally {

    private static final int FACES = 6;

    public static int[] diceSort(int[] rolls) {
        int[] count = new int[FACES + 1];
        for (int roll : rolls) {
            if (roll < 1 || roll > FACES) {
                throw new IllegalArgumentException("Invalid roll: " + roll);
            }
            count[roll]++;
        }
        StringBuilder counts = new StringBuilder("Counts:");
        for (int v = 1; v <= FACES; v++) {
            counts.append(' ').append(v).append(':').append(count[v]);
        }
        System.out.println(counts);
        int[] sorted = new int[rolls.length];
        int index = 0;
        for (int v = 1; v <= FACES; v++) {
            for (int k = 0; k < count[v]; k++) {
                sorted[index++] = v;
            }
        }
        return sorted;
    }
}
