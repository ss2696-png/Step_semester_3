package fundamentals.class_problems;

import java.util.Random;

// Prints the wellness report for sample and randomly generated employees.
public class P3_BmiCalculatorDemo {

    public static void main(String[] args) {
        BmiCalculator calculator = new BmiCalculator();

        System.out.println("Sample employees:");
        calculator.printWellnessReport(new double[]{1.75, 1.60}, new double[]{70, 90});

        Random random = new Random();
        double[] heights = new double[10];
        double[] weights = new double[10];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 1.50 + random.nextInt(41) / 100.0;
            weights[i] = 45 + random.nextInt(56);
        }
        System.out.println();
        System.out.println("Department of 10 employees:");
        calculator.printWellnessReport(heights, weights);
    }
}
