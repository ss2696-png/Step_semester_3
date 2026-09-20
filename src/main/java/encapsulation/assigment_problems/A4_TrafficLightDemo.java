package encapsulation.assigment_problems;

// Cycles the traffic light through the order given in the assignment sheet.
public class A4_TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println(t.getId() + " getColor() -> " + t.getColor());
        for (int i = 0; i < 4; i++) {
            System.out.println("next() -> " + t.next());
        }
    }
}
