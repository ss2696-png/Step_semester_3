package data_structures.class_problems;

import java.util.Map;

public class P4_EmployeeDirectoryDemo {
    public static void main(String[] args) {
        String[][] records = {
            {"E245", "Finance"},
            {"E110", "Engineering"},
            {"E390", "Marketing"},
            {"E101", "Engineering"}
        };
        Map<String, String> lookup = EmployeeDirectory.buildLookup(records);
        System.out.println(EmployeeDirectory.getDepartment(lookup, "E390"));
        System.out.println(EmployeeDirectory.getDepartment(lookup, "E999"));
        System.out.println("getDepartment: O(1) average, lookup space: O(n)");
    }
}
