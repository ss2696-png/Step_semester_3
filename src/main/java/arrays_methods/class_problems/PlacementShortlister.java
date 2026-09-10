package arrays_methods.class_problems;

import java.util.Arrays;

// Shortlists eligible placement candidates with overloaded rules and ranks them using Arrays.sort.
public class PlacementShortlister {

    private static final double DIRECT_CGPA_CUTOFF = 7.0;
    private static final double BORDERLINE_CGPA_CUTOFF = 6.5;
    private static final int BORDERLINE_CODING_CUTOFF = 60;

    public static boolean isEligible(double cgpa) {
        return cgpa >= DIRECT_CGPA_CUTOFF;
    }

    public static boolean isEligible(double cgpa, int codingScore) {
        return isEligible(cgpa) || (cgpa >= BORDERLINE_CGPA_CUTOFF && codingScore >= BORDERLINE_CODING_CUTOFF);
    }

    public static String shortlistAndRank(Candidate[] candidates) {
        if (candidates == null) {
            return "No candidates shortlisted";
        }
        Candidate[] shortlisted = new Candidate[candidates.length];
        int count = 0;
        for (Candidate candidate : candidates) {
            if (candidate != null && isEligible(candidate.getCgpa(), candidate.getCodingScore())) {
                shortlisted[count++] = candidate;
            }
        }
        if (count == 0) {
            return "No candidates shortlisted";
        }
        shortlisted = Arrays.copyOf(shortlisted, count);
        Arrays.sort(shortlisted);

        StringBuilder ranking = new StringBuilder();
        for (int i = 0; i < shortlisted.length; i++) {
            if (i > 0) {
                ranking.append(" | ");
            }
            ranking.append(i + 1).append(". ").append(shortlisted[i].getName())
                    .append(" (").append(shortlisted[i].getCompositeScore()).append(")");
        }
        return ranking.toString();
    }
}
