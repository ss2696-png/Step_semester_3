package arrays_methods.assigment_problems;

import java.util.Arrays;

// Boosts the sample lineup and shows an invalid captain pick being rejected.
public class A1_FantasyScoreMultiplierDemo {

    public static void main(String[] args) {
        double[] scores = {40, 55, 30, 62};
        System.out.println("Before: " + Arrays.toString(scores));
        FantasyScoreMultiplier.applyMultipliers(scores, 1, 3);
        System.out.println("After:  " + Arrays.toString(scores));

        try {
            FantasyScoreMultiplier.applyMultipliers(scores, 2, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
