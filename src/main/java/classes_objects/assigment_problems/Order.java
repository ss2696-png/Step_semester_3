package classes_objects.assigment_problems;

// Order that bumps a shared counter every time one is created.
public class Order {
    static int totalOrders = 0;

    public Order() {
        totalOrders++;
    }
}
