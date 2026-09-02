package classes_objects.assigment_problems;

// Shows that two exam hall objects keep separate seat counts.
public class A2_ExamHallDemo {
    public static void main(String[] args) {
        ExamHall hallA = new ExamHall();
        ExamHall hallB = new ExamHall();
        hallA.hallName = "Block-3 Hall A";
        hallB.hallName = "Block-3 Hall B";

        for (int i = 0; i < 4; i++) {
            hallA.seatsFilled++;
        }

        System.out.println(hallA.hallName + " seatsFilled: " + hallA.seatsFilled);
        System.out.println(hallB.hallName + " seatsFilled: " + hallB.seatsFilled);
    }
}
