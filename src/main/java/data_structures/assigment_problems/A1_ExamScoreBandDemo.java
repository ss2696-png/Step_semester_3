package data_structures.assigment_problems;

// Runs the exam score band samples.
public class A1_ExamScoreBandDemo {
    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(ExamScoreBandCounter.countInBand(scores, 42, 58));
        System.out.println(ExamScoreBandCounter.countInBand(scores, 90, 100));
    }
}
