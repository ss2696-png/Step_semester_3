package strings.assigment_problems;

// Parses a warehouse inventory CSV line into a formatted record.
public class InventoryRecordParser {

    private static final int EXPECTED_FIELDS = 3;

    public void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");
        if (fields.length != EXPECTED_FIELDS) {
            System.out.println("Invalid Record");
            return;
        }
        System.out.println("Product: " + fields[0].trim() + " | SKU: " + fields[1].trim() + " | Qty: " + fields[2].trim());
    }
}
