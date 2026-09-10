package arrays_methods.assigment_problems;

// Classifies the sample match grid and a jagged grid with different overs per match.
public class A4_MatchDayGridAnalyzerDemo {

    public static void main(String[] args) {
        int[][] runs = {
            {4, 6, 8},
            {10, 12, 14},
            {2, 3, 1}
        };
        System.out.println(MatchDayGridAnalyzer.classifyMatches(runs, 8));

        int[][] jagged = {
            {8},
            {6, 7, 9, 12, 2},
            {}
        };
        System.out.println(MatchDayGridAnalyzer.classifyMatches(jagged, 8));
    }
}
