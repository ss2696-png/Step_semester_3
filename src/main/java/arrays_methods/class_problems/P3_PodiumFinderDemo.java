package arrays_methods.class_problems;

import java.util.Arrays;

// Announces the podium for the sample scoreboard, including a tie for first.
public class P3_PodiumFinderDemo {

    public static void main(String[] args) {
        int[] scores = {45, 82, 79, 90, 33, 90, 61};
        System.out.println("Podium: " + Arrays.toString(PodiumFinder.findTopThreeScores(scores)));

        int[] ascending = {10, 20, 30, 40};
        System.out.println("Podium: " + Arrays.toString(PodiumFinder.findTopThreeScores(ascending)));
    }
}
