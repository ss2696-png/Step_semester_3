package arrays_methods.class_problems;

// Checks registration lists with and without a repeated team name.
public class P2_DuplicateTeamFinderDemo {

    public static void main(String[] args) {
        String[] withDuplicate = {"ByteForce", "CodeCrafters", "ByteForce"};
        String[] allUnique = {"ByteForce", "CodeCrafters", "NullPointers"};
        String[] caseDifferent = {"byteforce", "ByteForce"};

        System.out.println(DuplicateTeamFinder.findDuplicateTeam(withDuplicate));
        System.out.println(DuplicateTeamFinder.findDuplicateTeam(allUnique));
        System.out.println(DuplicateTeamFinder.findDuplicateTeam(caseDifferent));
    }
}
