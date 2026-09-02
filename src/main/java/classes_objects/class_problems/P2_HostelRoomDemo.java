package classes_objects.class_problems;

// Shows that two room objects keep their occupied counts independently.
public class P2_HostelRoomDemo {
    public static void main(String[] args) {
        HostelRoom roomA = new HostelRoom();
        HostelRoom roomB = new HostelRoom();
        roomA.roomNo = "C-101";
        roomB.roomNo = "C-102";

        for (int i = 0; i < 3; i++) {
            roomA.occupied++;
        }

        System.out.println(roomA.roomNo + " occupied: " + roomA.occupied);
        System.out.println(roomB.roomNo + " occupied: " + roomB.occupied);
    }
}
