package classes_objects.assigment_problems;

// Creates four orders and reads the shared static count.
public class A5_OrderCounterDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            new Order();
        }
        System.out.println("Total orders: " + Order.totalOrders);
    }
}
