package arrays_methods.assigment_problems;

// Validates lineups with and without a repeated player pick.
public class A2_DuplicatePickCheckerDemo {

    public static void main(String[] args) {
        System.out.println(DuplicatePickChecker.findDuplicatePick(new String[] {"Kohli", "Bumrah", "Kohli", "Rohit"}));
        System.out.println(DuplicatePickChecker.findDuplicatePick(new String[] {"Kohli", "Bumrah", "Rohit"}));
        System.out.println(DuplicatePickChecker.findDuplicatePick(new String[] {"Rohit", "rohit"}));
    }
}
