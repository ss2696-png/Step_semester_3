package classes_objects.assigment_problems;

// Exam hall ticket used to compare shared references against separately created objects.
public class HallTicket {

    String studentName;
    int seatNumber;

    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}
