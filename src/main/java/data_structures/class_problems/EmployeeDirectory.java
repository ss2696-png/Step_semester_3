package data_structures.class_problems;

import java.util.HashMap;
import java.util.Map;

// Builds a HashMap from unsorted employee records so department lookups run in O(1) on average.
public class EmployeeDirectory {

    public static Map<String, String> buildLookup(String[][] records) {
        Map<String, String> lookup = new HashMap<>();
        if (records == null) {
            return lookup;
        }
        for (String[] record : records) {
            if (record != null && record.length == 2) {
                lookup.put(record[0], record[1]);
            }
        }
        return lookup;
    }

    public static String getDepartment(Map<String, String> lookup, String employeeId) {
        return lookup.getOrDefault(employeeId, "Unknown");
    }
}
