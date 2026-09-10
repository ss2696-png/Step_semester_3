package arrays_methods.class_problems;

import java.util.Arrays;

// Runs the hackathon score curve example from the practice sheet.
public class P1_ScoreCurveBoosterDemo {

    public static void main(String[] args) {
        int[] scores = {70, 85, 60};
        System.out.println("Before curve: " + Arrays.toString(scores));
        ScoreCurveBooster.curveScores(scores, 10);
        System.out.println("After curve:  " + Arrays.toString(scores));

        int[] noBonus = {50, 40};
        ScoreCurveBooster.curveScores(noBonus, 0);
        System.out.println("Zero bonus:   " + Arrays.toString(noBonus));
    }
}
