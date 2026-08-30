package fundamentals.assigment_problems;

// Analyses sample signal logs for stuck colours.
public class A3_TrafficSignalDemo {

    public static void main(String[] args) {
        TrafficSignalAnalyzer analyzer = new TrafficSignalAnalyzer();
        analyzer.findLongestStreak("RRGGGYRR");
        analyzer.findLongestStreak("RRRRYYGG");
    }
}
