package fundamentals.assigment_problems;

// Finds the longest run of the same colour in a traffic signal log.
public class TrafficSignalAnalyzer {

    public void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Signal log is empty");
            return;
        }
        char bestColor = signalLog.charAt(0);
        int bestLength = 1;
        int currentLength = 1;
        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            if (currentLength > bestLength) {
                bestLength = currentLength;
                bestColor = signalLog.charAt(i);
            }
        }
        System.out.println("Longest Streak: '" + bestColor + "' repeated " + bestLength + " times");
    }
}
