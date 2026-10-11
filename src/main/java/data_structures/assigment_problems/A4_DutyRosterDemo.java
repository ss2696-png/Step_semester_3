package data_structures.assigment_problems;

import java.util.Arrays;

// Runs the duty roster rotation samples.
public class A4_DutyRosterDemo {
    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(DutyRosterRotation.rotateRoster(names, 2)));
        System.out.println(Arrays.toString(DutyRosterRotation.rotateRoster(names, 7)));
    }
}
