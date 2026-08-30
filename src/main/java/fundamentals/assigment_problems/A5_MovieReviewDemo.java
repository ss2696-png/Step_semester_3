package fundamentals.assigment_problems;

// Profiles word lengths of a sample review.
public class A5_MovieReviewDemo {

    public static void main(String[] args) {
        MovieReviewProfiler profiler = new MovieReviewProfiler();
        profiler.classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}
