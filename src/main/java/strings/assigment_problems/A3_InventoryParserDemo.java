package strings.assigment_problems;

// Parses valid and invalid sample inventory lines.
public class A3_InventoryParserDemo {

    public static void main(String[] args) {
        InventoryRecordParser parser = new InventoryRecordParser();
        parser.parseInventoryRecord("Wireless Mouse,WM-2201,150");
        parser.parseInventoryRecord("Wireless Mouse,150");
    }
}
