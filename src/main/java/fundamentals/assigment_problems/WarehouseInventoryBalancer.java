package fundamentals.assigment_problems;

// Compares two warehouse sections and finds the highest stocked item.
public class WarehouseInventoryBalancer {

    public void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA.length != sectionB.length) {
            throw new IllegalArgumentException("Both sections must track the same number of items");
        }
        int totalA = 0;
        int totalB = 0;
        int highest = Integer.MIN_VALUE;
        char highestSection = 'A';
        int highestIndex = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                highestSection = 'A';
                highestIndex = i;
            }
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                highestSection = 'B';
                highestIndex = i;
            }
        }

        String status = totalA == totalB ? "Balanced" : "Not Balanced";
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB
                + " | Status: " + status + " | Highest Quantity: " + highest
                + " (Section " + highestSection + ", Item " + (highestIndex + 1) + ")");
    }
}
