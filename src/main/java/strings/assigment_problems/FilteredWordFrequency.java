package strings.assigment_problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Reports word frequencies in feedback text after dropping stop words.
public class FilteredWordFrequency {

    private static final String[] STOP_WORDS = {"the", "was", "and", "a", "is", "of", "in"};

    private boolean isStopWord(String word) {
        for (String stop : STOP_WORDS) {
            if (stop.equals(word)) {
                return true;
            }
        }
        return false;
    }

    public Map<String, Integer> countWords(String feedback) {
        String cleaned = feedback.toLowerCase().replace(".", "").replace(",", "").replace("!", "").replace("?", "").trim();
        Map<String, Integer> counts = new LinkedHashMap<>();
        if (cleaned.isEmpty()) {
            return counts;
        }
        for (String word : cleaned.split("\\s+")) {
            if (!isStopWord(word)) {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }
        return counts;
    }

    public void printFilteredWordFrequency(String feedback) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(countWords(feedback).entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
