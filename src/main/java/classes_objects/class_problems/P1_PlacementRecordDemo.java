package classes_objects.class_problems;

// Stores sample placement records in an array and prints each one.
public class P1_PlacementRecordDemo {

    public static void main(String[] args) {
        PlacementRecord[] records = {
            new PlacementRecord("Ravi", "TCS", 4.5),
            new PlacementRecord("Anitha", "Zoho", 6.2),
            new PlacementRecord("Karthik", "Infosys", 4.0)
        };
        for (PlacementRecord record : records) {
            record.printRecord();
        }
    }
}
